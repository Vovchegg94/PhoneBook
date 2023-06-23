import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookTest {

    Map<String, String> mapPhoneBook;


    @BeforeEach
    public void createMapPhoneBook() {
        mapPhoneBook = new HashMap<>();
        mapPhoneBook.put("Petya","89057422934");
        mapPhoneBook.put("Vasya","89992342342");
        mapPhoneBook.put("Nina","89992344444");
    }

    @AfterEach
    public void deleteMapPhoneBook() {
        mapPhoneBook = null;
    }
@Test
    public void testAdd(){
    PhoneBook phoneBook=new PhoneBook();
String newName="Ira";
String newNumber="89108564723";
int expected=mapPhoneBook.size()+1;
int result=phoneBook.add(newName,newNumber);
    Assertions.assertEquals(expected,result);
    }



}
