package ru.childnov;

import java.util.Date;
public class PersonSergeyChildinov implements Greeting{
    private static PersonSergeyChildinov instance;
    private String lastName = "Чильдинов";
    private String firstName = "Сергей";
    private String secondName = "Михайлович";
    private Date dateBirth = new Date(75, 8, 24);

    private String bestHobby = "Чтение старинных книг";

    private String city = "Санкт-Петербург";

    public  static PersonSergeyChildinov getInstance() {
        if (instance == null) {
            instance = new PersonSergeyChildinov();
        }
        return instance;
    }

    private PersonSergeyChildinov() {

    }

    public String getBestHobby() {
        return bestHobby;
    }

    public String getFullName() {
        return lastName + " " + firstName + " "+ secondName;
    }

    public String getCity() {
        return city;
    }

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
