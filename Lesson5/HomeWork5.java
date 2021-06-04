package ru.margo.lesson5;
/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4. Создать массив из 5 сотрудников.
        Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                                  30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",300000,41);
        arr[1] = new Employee("Koshkina Yana", "Software tester", "koshkina@mailbox.com", "892312314",150000,30);
        arr[2] = new Employee("Malinina Nadezhda", "Graphic designer", "malinina@mailbox.com", "892312315",100000,33);
        arr[3] = new Employee("Letnikova Dina", "Programmer", "letnikova@mailbox.com", "892312316",500000,29);
        arr[4] = new Employee("Berezhnoi Sergei", "Game developer", "berezhnoi@mailbox.com", "892312317",300000,48);
        for (Employee employee : arr){
            if (employee.getAge()>40)
                employee.printInConsole();
        }
    }
}
