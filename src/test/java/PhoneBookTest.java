import org.junit.jupiter.api.*;
import ru.netology.PhoneBook;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.PhoneBook.mapPhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook;
    List<String> testList;
    @BeforeEach
    public void createMapPhoneBook() {

        phoneBook = new PhoneBook();
        mapPhoneBook.put("Petya", "89057422934");
        mapPhoneBook.put("Vasya", "89992342342");
        mapPhoneBook.put("Nina", "89992344444");
    }

    @AfterEach
    public void deleteMapPhoneBook() {
        testList=null;
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
        assertEquals(expected, result);
    }

    @Test
    public void testAddException() {

        String newName = "Petya";
        String newNumber = "89108564723";
        int expected = mapPhoneBook.size();
        int result = phoneBook.add(newName, newNumber);
        assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {

        String newName = "Petya";
        String newNumber = "89057422934";
        String expected = newName;
        String result = phoneBook.findByNumber(newNumber);
        assertEquals(expected, result);
    }

    @Test
    public void testFindByNumberNull() {

        String newNumber = "89999999999";

        String result = phoneBook.findByNumber(newNumber);
        Assertions.assertNull(result);
    }

    @Test
    public void testFindByName() {

        String newName = "Petya";
        String newNumber = "89057422934";
        String expected = newNumber;
        String result = phoneBook.findByName(newName);
        assertEquals(expected, result);
    }

    @Test
    public void testFindByNameNull() {
        System.out.println();
        String newName = "Kolya";
        String result = phoneBook.findByName(newName);
        Assertions.assertNull(result);
    }

    @Test
    public void testPrintAllNames() {
        testList = Arrays.asList("Ira", "Nina", "Petya","Vasya");
        List<String> result = phoneBook.printAllNames(mapPhoneBook);
        assertEquals(testList, result);
    }

}


