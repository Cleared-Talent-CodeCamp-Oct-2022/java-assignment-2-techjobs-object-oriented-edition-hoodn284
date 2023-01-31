package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job testJob = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"),new PositionType("Entry level"),new CoreCompetency("A.I") );
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testJob.getId(),job1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
    Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Product tester", productTester.getName());
    assertTrue(productTester.getEmployer() instanceof Employer);
    assertTrue(productTester.getLocation().getValue() instanceof String);
    assertTrue(productTester.getPositionType().getValue() instanceof String);
    assertTrue(productTester.getCoreCompetency().getValue() instanceof String);
    assertEquals("ACME",productTester.getEmployer().getValue());
    assertEquals("Desert",productTester.getLocation().getValue());
    assertEquals("Quality control",productTester.getPositionType().getValue());
    assertEquals("Persistence",productTester.getCoreCompetency().getValue());
    assertTrue(productTester instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
    Job testJobA = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"),new PositionType("Entry level"),new CoreCompetency("A.I") );
    Job testJobB = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"),new PositionType("Entry Level"), new CoreCompetency("A.I."));
    assertFalse(testJobA.equals(testJobB));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job testToString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Id: 1\n" +
            "Name: Product tester\n" +
            "Employer: ACME\n" +
            "Location: Desert\n" +
            "PositionType: Quality control\n" +
            "CoreCompetency: Persistence",testToString.toString());

    }
    @Test
    public void testToStringHandlesEmptyField(){
    Job testToString = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Id: 1\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "PositionType: Quality control\n" +
                "CoreCompetency: Persistence",testToString.toString());
   }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {

    }


    }
