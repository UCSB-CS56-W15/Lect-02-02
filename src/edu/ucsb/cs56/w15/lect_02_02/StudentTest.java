package edu.ucsb.cs56.w15.lect_02_02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * The test class StudentTest, to test the Student class
 *
 * @author Phill Conrad
 * @version CS56, 15W, lecture 02/09
 * @see Student
 */

public class StudentTest 
{
    // TODO: Fix javadoc comment @see tag cross-reference

    /**
       test 2 constructor from PolynomialTest
       @see Student#Student()

    */
   
    @Test public void testConstructor()
    {
        Student s = new Student("Fred Gaucho",1234567);
        assertEquals("Fred Gaucho",s.getName());
	assertEquals(1234567,s.getPerm()); 
    }


    @Test(expected=IllegalArgumentException.class)
    public void testConstructorPermNumberTooLow()
    {
        Student s = new Student("Fred Gaucho",-1);
    }

} // class StudentTest
