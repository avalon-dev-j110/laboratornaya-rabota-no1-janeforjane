package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {

        Person ivanov = new Person("Ivan","Ivanovich",null, "Ivanov",1234 );

//*
        ivanov.getPass().getRegAdd().setCity("Moscow");
        ivanov.getPass().getRegAdd().setStreet("Lenina st");
        ivanov.getPass().getRegAdd().setHouseNumber(10);
        ivanov.getPass().getRegAdd().setFlatNumber(21);

        System.out.println(ivanov.getFullName());
        System.out.println(ivanov.getAddress());


        Person smith = new Person("John", null, "Edvard","Smith", 4321);

        smith.getPass().getRegAdd().setCity("New-York");
        smith.getPass().getRegAdd().setStreet("Main st");
        smith.getPass().getRegAdd().setHouseNumber(16);
        smith.getPass().getRegAdd().setFlatNumber(211);

        System.out.println(smith.getFullName());
        System.out.println(smith.getAddress());

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
