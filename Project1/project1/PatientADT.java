package project1;
import java.util.ArrayList;

// Josh Sample

public interface PatientADT {
	
	public void setId (String i);  // sets the unique identifier of this patient
	public String getId (); // gets the unique identifier of this patient
	public void setName (String n);  // sets the name of this patient
	public String getName (); // gets the name of this patient	
	public void addACE (String a); //Adds an ACE to this patient, unless it already exists
	public void removeACE (String a); //Removes an ACE from this patient
	public ArrayList<String> getACEs (); // returns an arraylist of this patient's ACEs
	public String toString(); //Returns a string representation of this patient
}
