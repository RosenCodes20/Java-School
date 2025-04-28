package glava04;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Име на фирмата: ");
        String companyName = scanner.nextLine();

        System.out.print("Адрес на фирмата: ");
        String companyAddress = scanner.nextLine();

        System.out.print("Телефонен номер на фирмата: ");
        String companyPhone = scanner.nextLine();

        System.out.print("Факс номер на фирмата: ");
        String companyFax = scanner.nextLine();

        System.out.print("Уеб сайт на фирмата: ");
        String companyWebsite = scanner.nextLine();

        System.out.print("Име на мениджъра: ");
        String managerFirstName = scanner.nextLine();

        System.out.print("Фамилия на мениджъра: ");
        String managerLastName = scanner.nextLine();

        System.out.print("Телефонен номер на мениджъра: ");
        String managerPhone = scanner.nextLine();

        System.out.println();
        System.out.printf("%s%n", companyName);
        System.out.printf("Адрес: %-30s Тел: %s%n", companyAddress, companyPhone);
        System.out.printf("Факс: %-31s Уеб сайт: %s%n", companyFax, companyWebsite);
        System.out.println();
        System.out.printf("Мениджър: %s %s%n", managerFirstName, managerLastName);
        System.out.printf("Телефон на мениджъра: %s%n", managerPhone);
    }
}
