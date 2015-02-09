package edu.ucsb.cs56.w15.lect_02_02;

public class Student {

    private String name;
    private int perm;

    public static int MIN_PERM = 0;
    public static int MAX_PERM = 9999999;

    /**
       @param name Student's name, e.g. "Fred Gaucho"
       @param perm perm number e.g. 1234567
     */

    public Student(String name, int perm) {
	// this.name = name; this.perm = perm;
    }

    /**
       Set the Student's perm number. 
       @param perm perm number e.g. 1234567
     */

    public void setPerm(int perm) {
	/*if (perm < MIN_PERM || perm > MAX_PERM) {
	    throw 
		new IllegalArgumentException("Perm number out of range.");
	}
	*/
	
    }

    /**
       Set the Student's name
       @param name Student's name, e.g. "Fred Gaucho"
     */

    public void setName(String name) {
	// STUB!!  TODO: FIXME
    }


    /**
       perm number of student, e.g. 1234567
     */
    public int getPerm() { return -42; }

    /**
       Student name, e.g. "Fred Gaucho"
     */
    public String getName() { return "STUB! You sucka!"; }

    
}
