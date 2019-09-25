package project1;

import java.util.ArrayList;

// Josh Sample

public class Patient implements PatientADT {

	private String id;
	private String name;
	private ArrayList<String> ace = new ArrayList<String>();
	
	public Patient() {
		id = "Not Set";
		name = "Not Set";
	}
	
	public Patient(String i, String n) {
		id = i;
		name = n;
	}
	
	public void setId(String i) {  // sets the unique identifier of this patient
		id = i;
	}

	public String getId() {  // gets the unique identifier of this patient
		return id;
	}

	public void setName(String n) { // sets the name of this patient
		name = n;
	}

	public String getName() { // gets the name of this patient
		return name;
	}

	public void addACE(String a) { //Adds an ACE to this patient, unless it already exists
		if (this.ace.contains(a) == false) {
			this.ace.add(a);
		}
		else
			System.out.println("This patient already has this ACE.");
	}

	public void removeACE(String a) { //Removes an ACE from this patient
		if (this.ace.contains(a) == false) {
			System.out.println("This patient does not have " + a);
		}
		else {
			this.ace.remove(a);
		}
		
	}

	public ArrayList<String> getACEs() { // returns an arraylist of this patient's ACEs
		return ace;
	}
	
	public String toString() { //Returns a string representation of this patient
		return name+"("+id+")";
	}

}
