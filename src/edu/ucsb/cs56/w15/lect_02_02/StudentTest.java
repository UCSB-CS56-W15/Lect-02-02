package edu.ucsb.cs56.w15.lect_02_02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;

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


    @Test
    public void testToString() {
        Student s = new Student("Fred Gaucho",1234567);
	assertEquals("[1234567,\"Fred Gaucho\"]",s.toString());

    }

    @Test
    public void testEqualsEqualPermsUnequalNames() {

        Student s = new Student("Fred Gaucho",1234567);
        Student t = new Student("Fredrick Gaucho",1234567);

	org.junit.Assert.assertTrue(s.equals(t));

    }



} // class StudentTest
