package my.project;

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

 @Test
 public void zSlowTest() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void aTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void aATest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void alphabeticTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void aFastTest() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void aSlowTest() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
