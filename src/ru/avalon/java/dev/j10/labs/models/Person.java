package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private Passport pass;

    public Passport getPass() {
        return pass;
    }

//    public void setPass(Passport pass) {
//        this.pass = pass;
//    }

    public Person (String name, String lastName, int passNumber){
        pass = new Passport(name, lastName, passNumber);

    }

    public Person () {
        pass = new Passport();
    }

    public Person (String name){
        pass = new Passport(name);
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */



    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
//        String fullName;

        if (pass.getSecondName () != null){

            char secondName = pass.getSecondName().charAt(0);

            String fullName = pass.getName() + " " + secondName + ". " + pass.getLastName();

            return fullName;
        }
        else {

            String fullName = pass.getName() + " " + pass.getMiddleName() + " " + pass.getLastName();
            return fullName;
        }

        //        String fullName = pass.getName() +" "+ pass.getLastName();

//        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        Address address = pass.getRegAdd();

        return address.getCity() + " " + address.getStreet() + " " + address.getHouseNumber() + " " + address.getFlatNumber();
    }
}