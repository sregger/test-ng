package ie.gannons;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 @BeforeClass
 public void setUp() {
    System.out.println("Setup " + this.getClass().getSimpleName());
 }

 @Test(groups = { "slow" })
 public void zSlowTest() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void aTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void aATest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test(groups = { "fast" })
 public void alphabeticTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test(groups = { "fast" })
 public void aFastTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test(groups = { "slow" })
 public void aSlowTest() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
