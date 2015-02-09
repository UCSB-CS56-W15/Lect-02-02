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
	this.setName(name); 
	this.setPerm(perm);
    }

    /**
       Set the Student's perm number. 
       @param perm perm number e.g. 1234567
     */

    public void setPerm(int perm) {
	if (perm < MIN_PERM || perm > MAX_PERM) {
	    throw 
		new IllegalArgumentException("Perm number out of range.");
	}
	this.perm = perm;
    }

    /**
       Set the Student's name
       @param name Student's name, e.g. "Fred Gaucho"
     */

    public void setName(String name) {
	this.name = name;
    }


    /**
       perm number of student, e.g. 1234567
     */
    public int getPerm() { return this.perm; }

    /**
       Student name, e.g. "Fred Gaucho"
     */
    public String getName() { return this.name; }


    /**
       Convert to String in format [1234567,"Fred Gaucho"]
     */

    public String toString() {
	return "[" + this.perm + ",\"" + this.name + "\"]" ;
    }
    
}
