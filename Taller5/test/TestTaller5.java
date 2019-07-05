import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class TestTaller5 {
    
    Taller5 calc;
    
    public TestTaller5() {
    }
    
    @BeforeClass
    public static void Before() {
        System.out.println("Before");
    }
    
    @AfterClass
    public static void After() {
        System.out.println("After");
    }
    
    @Before
    public void setUp() {
    System.out.println("Mensaje Before");
        calc =new Taller5();

    }
    
    @After
    public void tearDown() {
        System.out.println("Mensaje After");
        calc.clear();

    }

    @Test
    public void testsuma(){
        System.out.println("test suma");
        int resultado=calc.suma(3, 2);
        int esperado=5;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testanssuma(){
        System.out.println("test anssuma");
        calc.suma(3, 2);
        int resultado=calc.ans();
        int esperado=5;
        assertEquals(esperado, resultado);
    }

}