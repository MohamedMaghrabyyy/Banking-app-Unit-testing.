package com.example.testingcourseproject;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
       AccountTest.class, Admin.class,TransactionTest.class,
        ClientTest.class


})

public class TestSuite {

}