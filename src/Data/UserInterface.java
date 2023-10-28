package Data;
/**
 * Liskov substitution principle - принцип подстановки Лисков
 *
 * Требует возможности использования любых порожденных классов на месте родительских.
 * При этом они должны обладать тем же поведением, что и родительские классы, без внесения изменений.
 * Этот принцип гарантирует, что порожденный класс не изменяет определение типа родительского и его поведение.
 *
 * Интерфейс UserInterface можно использовать для любых экземпляров класса User (студент, учитель и т.п.)
 */

public interface UserInterface {
    String getName();

    void setName(String firstName);

    String getSurname();

    void setSurname(String secondName);

    String getPatronymic();

    void setPatronymic(String patronymic);

}
