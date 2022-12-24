package ie.gannons;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class aaTest 
{
 @BeforeClass
 public void setUp() throws InterruptedException {
    System.out.println("Setup " + this.getClass().getSimpleName());
    Thread.sleep(5000);
 }

 @Test(groups = { "slow" })
 public void aaTest1() throws InterruptedException {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    Thread.sleep(5000);
 }

 @Test(groups = { "fast" })
 public void aaTest2() throws InterruptedException {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
   Thread.sleep(5000);
 }

 @Test(groups = { "fast" })
 public void aaTest3() throws InterruptedException {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
   Thread.sleep(5000);
 }

 @Test(groups = { "fast" })
 public void aaTest4() throws InterruptedException {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
   Thread.sleep(5000);
 }
 
 @Test(groups = { "fast" })
 public void aaTest5() throws InterruptedException {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
   Thread.sleep(5000);
 }
 
 @Test(groups = { "slow" })
 public void aaTest6() throws InterruptedException {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    Thread.sleep(5000);
 }

}
