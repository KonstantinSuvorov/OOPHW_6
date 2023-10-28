package View;

import Controller.GroupController;
import Data.User;
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
 * Класс View отвечает только за вывод информации.
 *
 */

public class View {
    private GroupController<User> groupController = new GroupController<>();

    public View(GroupController<User> groupController) {
        this.groupController = groupController;
    }

     public void showStudents() {
         String show;
         show = "Группа " + groupController.getGroup().getNameGroup() + ":" + "\nCтуденты: \n";
         for (User user : groupController.getGroup().getGroup()
         ) {
             show += "\t\t" + user + "\n";
         }
         System.out.println(show);
     }
}
