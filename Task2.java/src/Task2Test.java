import static org.junit.Assert.*;
import org.junit.Test;

class Task2test {
    @Test
    void test() {
        String string = "Goodbye";
        assertTrue(string.length()==7);
        assertTrue(string.charAt(1)==('o'));
        assertTrue(string.substring(1,5).equals("oy"));
        assertTrue(string.indexOf('d')==3);
    }

}