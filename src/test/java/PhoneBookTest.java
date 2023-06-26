import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static ru.netology.PhoneBook.mapPhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook;


    @BeforeEach
    public void createMapPhoneBook() {
        phoneBook = new PhoneBook();
        mapPhoneBook.put("Petya", "89057422934");
        mapPhoneBook.put("Vasya", "89992342342");
        mapPhoneBook.put("Nina", "89992344444");
    }

    @AfterEach
    public void deleteMapPhoneBook() {
        phoneBook = null;
        mapPhoneBook.remove("Petya", "89057422934");
        mapPhoneBook.remove("Vasya", "89992342342");
        mapPhoneBook.remove("Nina", "89992344444");
    }

    @Test
    public void testAdd() {
        String newName = "Ira";
        String newNumber = "89108564723";
        int expected = mapPhoneBook.size() + 1;
        int result = phoneBook.add(newName, newNumber);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAddException() {

        String newName = "Petya";
        String newNumber = "89108564723";
        int expected = mapPhoneBook.size();
        int result = phoneBook.add(newName, newNumber);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {

        String newName = "Petya";
        String newNumber = "89057422934";
        String expected = newName;
        String result = phoneBook.findByNumber(newNumber);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumberNull() {

        String newNumber = "89108564723";

        String result = phoneBook.findByNumber(newNumber);
        Assertions.assertNull(result);
    }


}
