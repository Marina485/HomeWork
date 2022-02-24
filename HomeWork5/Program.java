package ru.marina;

/**
 * Java 1. Homework #5
 *
 * @autor Marina Terekhova
 * @version 24.02.2022
 */

public class Program {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Сидоров Иван Васильевич", "Управляющий", "sidorov@mail.ru", "+79001581318", 80000, 41);
        staff[1] = new Employee("Петрова Наталья Семеновна", "Бухгалтер", "petrova@mail.ru", "+79001581319", 75000, 53);
        staff[2] = new Employee("Иванов Петр Сергевич", "Слесарь", "ivanov@mail.ru", "+79001581320", 60000, 38);
        staff[3] = new Employee("Цой Виктор Робертович", "Кочегар", "zoi@mail.ru", "+79001581321", 30000, 22);
        staff[4] = new Employee("Зайка Елена Ивановна", "Повар", "zayka@mail.ru", "+79001581322", 50000, 23);
        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < staff.length; i ++) {
            if (staff[i].getAge() > 40) {
                System.out.println(staff[i].toString());
            }
        }
    }
}
