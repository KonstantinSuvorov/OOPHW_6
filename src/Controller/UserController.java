package Controller;

import Data.User;
import Data.UserInterface;
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
 * Класс UserController отвечает за операции только с одним студентом
 *
 */

public class UserController <T extends UserInterface>{
    private T user;
    public void loadStudent(T student){
        this.user = student;
    }

    public void createStudent(String name, String surname, String patronymic){
        this.user = (T) new User(name, patronymic, surname);
    }
    public void changeName(String name, String lName, String pName){
        this.user.setName(name);
        this.user.setPatronymic(pName);
        this.user.setSurname(lName);
    }

    public T getUser() {
        return user;
    }
}
