import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class Homework5_1 {
    public static void main(String[] args) {
        String phoneBook = "Владимир Владимиров - 12345\n" +
                "Олег Олегов - 6789\n" +
                "Антон Антонов - 13579\n" +
                "Кирилл Кириллов - 24680\n" +
                "Георгий Георгиев - 08642\n" +
                "Олег Олегов - 483726\n" +
                "Семён Семёнов - 97531";
        String[] phoneBookArr = phoneBook.split("\n");
        PhoneBook phoneBookNew = new PhoneBook();
        for (int i = 0; i < phoneBookArr.length; i++) {
            phoneBookNew.addPhoneNote(phoneBookArr[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию контакта");
        System.out.println(phoneBookNew.findByName(scanner.nextLine()));


    }
}
