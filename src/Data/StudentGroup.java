package Data;

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
 * Класс StudentGroup хранит только информацию о группе студентов
 *
 */


public class StudentGroup<T extends UserInterface> {
    private String groupName;
    private ArrayList<T> group;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.group = new ArrayList<>();
    }

    public String getNameGroup() {
        return groupName;
    }

    public void setNameGroup(String nameGroup) {
        this.groupName = nameGroup;
    }

    public ArrayList<T> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<T> group) {
        this.group = group;
    }

    public void addStudent(T user) {
        group.add(user);
    }
    public void removeStudent(T user) {
        group.remove(user);
    }

}
