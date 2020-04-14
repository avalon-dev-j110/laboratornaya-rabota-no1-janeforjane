package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.util.Date;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String name;
    private String lastName;
    private int passNumber;
    private String middleName;
    private String secondName;
    private Date birthDate;
    private Date issueDate;
    private String docAgency;
    private Address regAdd;
    private Address resAdd;

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Address getRegAdd() {
//        если regAdd = null, то создать Address и вернуть regAdd
        if (regAdd == null) {
            regAdd = new Address();
        }
        return regAdd;
    }

    public void setRegAdd(Address regAdd) {
        this.regAdd = regAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Passport(String name, String middleName, String secondName, String lastName, int passNumber) {
        this.name = name;
        this.middleName = middleName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.passNumber = passNumber;
    }


    public String getFullName(Passport pass) {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
//        String fullName;
//        *
        if (pass.getSecondName() == null && pass.getMiddleName() == null) {

            String fullName = pass.getName() + " . " + pass.getLastName();

            return fullName;
        }

        else if (pass.getSecondName() != null) {

            char secondName = pass.getSecondName().charAt(0);

            String fullName = pass.getName() + " " + secondName + ". " + pass.getLastName();

            return fullName;
        } else {

            String fullName = pass.getName() + " " + pass.getMiddleName() + " " + pass.getLastName();
            return fullName;
        }
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

}
