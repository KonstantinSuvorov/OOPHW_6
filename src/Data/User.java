package Data;
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
 * Класс User хранит информацию только о фамилии, имени и отчестве студента
 *
 */

public class User implements UserInterface {
    protected String name;
    protected String surname;
    protected String patronymic;

    public User(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return  name + ' ' +
                patronymic + ' ' +
                surname + ' ';
    }
}

