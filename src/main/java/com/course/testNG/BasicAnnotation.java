package com.course.testNG;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("the first method");
    }
    @Test
    public void testCase2(){
        System.out.println("the second method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("before");
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("after");
    }
}
