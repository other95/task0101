package ru.childnov;

import java.util.Date;
public class PersonSergeyChildinov implements Greeting{
    private static PersonSergeyChildinov instance;
    private final String lastName = "Чильдинов";
    private final String firstName = "Сергей";
    private final String secondName = "Михайлович";
    private final Date dateBirth = new Date(75, 8, 24);

    private final String bestHobby = "Чтение старинных книг";

    private final String city = "Санкт-Петербург";

    /***
     * Возвращает экземпляр класса PersonSergeyChildinov
     * @return
     */
    public  static PersonSergeyChildinov getInstance() {
        if (instance == null) {
            instance = new PersonSergeyChildinov();
        }
        return instance;
    }

    private PersonSergeyChildinov() {

    }

    /***
     * Возвращает хобби
     * @return
     */
    public String getBestHobby() {
        return bestHobby;
    }

    /***
     * Возвращает полное имя
     * @return
     */
    public String getFullName() {
        return lastName + " " + firstName + " "+ secondName;
    }

    /***
     * Возвращает город
      * @return
     */
    public String getCity() {
        return city;
    }

    /***
     * Возвращает возраст
     * @return
     */
    public int getAge() {
        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - dateBirth.getTime();
        long msDays = 24 * 60 * 60 * 1000;

        int age = (int) (msTimeDistance/msDays/365);
        return age;
    }

    @Override
    public String toString() {
        return "Имя : "+ getFullName()+
                "\n Город : "+ getCity() +
                "\n Возраст (приблизительно) : " + getAge() +
                "\n Хобби : " + getBestHobby();
    }
}
