package ie.gannons;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class aTest 
{
 @BeforeClass
 public void setUp() throws InterruptedException {
    System.out.println("Setup " + this.getClass().getSimpleName());
 }

 @Test
 public void aTest1() throws InterruptedException {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
