package project1;

import java.util.ArrayList;

// Josh Sample

public class Data implements AceDataManagerADT {

	private ArrayList<PatientADT> patientList;
	
	public Data() {
		patientList = new ArrayList<PatientADT>();
	}
	
	//Adds a new patient to the data set
	public void addPatient(PatientADT p) { 
		patientList.add(p);
	}

	//returns the patient with the given identifier null if the patient is not in the data set
	public PatientADT getPatient(String id) { 
		for (int i = 0; i < patientList.size(); i++) {
			PatientADT p = patientList.get(i);
			if (p.getId() == id)
				return p;
		}
		return null;
	}
	
	// returns an arraylist containing all of the risk factors associated with the input list of ACEs
	public ArrayList<String> getRiskFactors(ArrayList<String> aces) { 

		return null;
	}
	
	// write to the file set during instantiation
	public void writeToFile() {
		
	}

	// write to the file indicated in parameter
	public void writeToFile(String fn) {
		
	}
	
	//Returns a string representation of the ACE patient and risk factors data manager
	public String toString() { 
	
		return null;
	}
}
