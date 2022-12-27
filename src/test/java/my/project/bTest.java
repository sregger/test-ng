package my.project;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class bTest 
{
 @BeforeClass
 public void setUp() {
    System.out.println("Setup " + this.getClass().getSimpleName());
 }

 @Test
 public void bTest1() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void bTest2() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void bTest3() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void bTest4() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void bTest5() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void bTest6() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
