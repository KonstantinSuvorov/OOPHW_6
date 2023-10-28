package Controller;

import Data.StudentGroup;
import Data.User;

import java.util.ArrayList;
/**
 * Single responsibility principle - Принцип единственной ответственности
 *
 * Каждый класс должен иметь только одну ответственность,
 * которая должна быть инкапсулирована в этом классе, что обеспечивает:
 * - тестируемость;
 * - читаемость;
 * - короткое и понятное описание класса;
 * - простоту сопровождения
 *
 * Класс GroupController отвечает за операции только с группой студентов
 *
 */

public class GroupController<T extends User> {
    private StudentGroup<T> group;
    public void createGroup(String groupName) {
        this.group = new StudentGroup<>(groupName);
    }

    public void initializeStudents(ArrayList<T> students){
        this.group.setGroup(students);
    }

    public void loadGroup(StudentGroup<T> group){
        this.group = group;
    }

    public void addStudentToGroup(T student) {
        group.addStudent(student);
    }

    public void removeStudentFromGroup(T student) {
        group.removeStudent(student);
    }

    public StudentGroup<T> getGroup() {
        return group;
    }
}
