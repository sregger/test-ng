package my.project;

import org.testng.annotations.*;
import java.lang.Thread;

/**
 * Unit test for simple App.
 */
public class cTest 
{
 @BeforeClass
 public void setUp() {
    System.out.println("Setup " + this.getClass().getSimpleName());
 }

 @Test
 public void cTest1() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void cTest2() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void cTest3() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

 @Test
 public void cTest4() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void cTest5() {
   System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }
 
 @Test
 public void cTest6() {
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
 }

}
