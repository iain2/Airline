import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("Barry", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Barry", person.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, person.getNumberOfBags());
    }
}
