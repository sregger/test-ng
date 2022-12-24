package ie.gannons;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class aaTest 
{
 @BeforeClass
 public void setUp() {
    System.out.println("Setup " + this.getClass().getSimpleName());
 }

 @Test(groups = { "slow" })
 public void aaTest1() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void aaTest2() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void aaTest3() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void aaTest4() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test(groups = { "fast" })
 public void aaTest5() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test(groups = { "slow" })
 public void aaTest6() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
