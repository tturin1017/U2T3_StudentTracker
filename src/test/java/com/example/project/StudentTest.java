package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class TipCalculatorTest {
    @Test
    void testGetFirstName(){
        Student s = new Student("John", "Doe", 2025);
        String expectedOutput = "John";
        String studentOutput = s.getFirstName();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetLastName(){
        Student s = new Student("John", "Doe", 2025);
        String expectedOutput = "Doe";
        String studentOutput = s.getLastName();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetHighestTestScore(){
        Student s = new Student("John", "Doe", 2025);
        double expectedOutput = 0.0;
        double studentOutput = s.getHighestTestScore();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSetGradYear(){
        Student s = new Student("John", "Doe", 2025);
        s.setGradYear(2027);
        int expectedOutput=2027;
        int studentOutput=s.getGradYear();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSAddTestScore(){
        Student s = new Student("John", "Doe", 2025);
        int test1 = s.addTestScore(91.5);
        int test2 = s.addTestScore(95.6);
        List<Double> expectedOutput = new ArrayList<Double>();
        expectedOutput.add(2.0); // number of tests
        expectedOutput.add(95.6); //highest score test
        List<Double> studentOutput = new ArrayList<Double>();
        studentOutput.add(s.getTestScoreCount());
        studentOutput.add(s.getHighestTestScore());
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testAverageTestScore(){
        Student s = new Student("John", "Doe", 2025);
        s.setGradYear(2027);
        int expectedOutput=2027;
        int studentOutput=s.getGradYear();
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testIsPassing(){
        Student s = new Student("John", "Doe", 2025);
        s.setGradYear(2027);
        int expectedOutput=2027;
        int studentOutput=s.getGradYear();
        assertEquals(expectedOutput,studentOutput);
    }







  
    
}
