import Controller.GroupController;
import Data.User;
import Data.UserComparator;
import Data.UserInterface;
import View.View;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        GroupController<User> groupController = new GroupController<>();

        User student1 = new User("Сeргей", "Иванович", "Иванов");
        User student2 = new User("Петр", "Петрович", "Власов");
        User student3 = new User("Сергей", "Иванович", "Власов");
        User student4 = new User("Александр", "Петрович", "Власов");
        User student5 = new User("Петр", "Николаевич", "Николаев");

        groupController.createGroup("2107");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);
        groupController.addStudentToGroup(student4);
        groupController.addStudentToGroup(student5);

        UserComparator<UserInterface> comparator = new UserComparator<>();
        TreeSet<UserInterface> sortedGroup = new TreeSet<>(comparator);

        for (User user : groupController.getGroup().getGroup()) {
            sortedGroup.add(user);
        }
        System.out.println(sortedGroup);

        View view = new View(groupController);
        view.showStudents();
    }
}
