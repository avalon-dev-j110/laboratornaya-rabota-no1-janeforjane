/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

 public class Address {

     private String street;
     private String city;
     private int houseNumber;
     private int flatNumber;

     public String getStreet() {
         return street;
     }

     public void setStreet(String street) {
         this.street = street;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public int getHouseNumber() {
         return houseNumber;
     }

     public void setHouseNumber(int houseNumber) {
         this.houseNumber = houseNumber;
     }

     public int getFlatNumber() {
         return flatNumber;
     }

     public void setFlatNumber(int flatNumber) {
         this.flatNumber = flatNumber;
     }
 }