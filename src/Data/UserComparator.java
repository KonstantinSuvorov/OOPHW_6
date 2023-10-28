package Data;

import java.util.Comparator;
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
 * Класс UserComparator выполняет только одну функцию - сранение двух объектов
 *
 * Interface segregation principle - Принцип Разделения интерфейса
 * Клиенты не должны реализовывать интерфейсы, которые они не используют.
 *
 * Класс UserComparator имплементирует только нужный интерфейс
 *
 */

public class UserComparator<T extends UserInterface> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
