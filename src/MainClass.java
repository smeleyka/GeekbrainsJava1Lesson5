import java.util.AbstractCollection;

/**
 * Created by admin on 07.04.2017.
 */
public class MainClass {
    static Person[] persArray = new Person[5];

    public static void main(String[] args) {
        persArray[0] = new Person("Иванов Иван", "Инженер", "ivan@gmai.com", "+79516610355", 31500, 43);
        persArray[1] = new Person("Кузнецов Алексей", "Бухгалтер", "kuz@gmai.com", "+7950555262", 27000, 41);
        persArray[2] = new Person("Николаев Петр", "Юрист", "nikpetr@gmai.com", "+79216542587", 45000, 35);
        persArray[3] = new Person("Шишкин Василий", "Диспетчер", "shishvas@gmai.com", "+79656542187", 32000, 50);
        persArray[4] = new Person("Толстой Николай", "Программист", "tolstnikolay@gmai.com", "+79702583614", 36500, 38);
        ageSort(41);
    }

    public static void ageSort(int age) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > age) persArray[i].info();
        }
    }
}
