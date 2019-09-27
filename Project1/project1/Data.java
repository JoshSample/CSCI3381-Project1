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
		ArrayList<String> riskFactors = new ArrayList<String>();
		if (aces.size() == 0) 
			riskFactors.add("Patient has no ACEs");
		if (aces.size() == 1)
			riskFactors.add("High potential for another ACE.");
		if (aces.size() > 1) {
			riskFactors.add("Smoking");
			riskFactors.add("Alcohol Abuse");
			riskFactors.add("Drug Abuse");
			riskFactors.add("Promiscuity");
			riskFactors.add("Severe Obesity");
			riskFactors.add("Depression");
			riskFactors.add("Heart Disease");
			riskFactors.add("Cancer");
			riskFactors.add("Chronic Lung Disease");
			riskFactors.add("Shortened Life Span");
		}
		if (aces.size() > 3) {
			riskFactors.add("700% increase in alcoholism");
			riskFactors.add("Increased risk of cancer");
			riskFactors.add("Increase in emphysema");
		}
		if (aces.size() > 6) {
			riskFactors.add("High risk of suicide");
		}
		return riskFactors;
	}
	
	// write to the file set during instantiation
	public void writeToFile() {
		
	}

	// write to the file indicated in parameter
	public void writeToFile(String fn) {
		
	}
	
	//Returns a string representation of the ACE patient and risk factors data manager
	public String toString() { 
		String toReturn = "";
		for (PatientADT p : patientList) {
			toReturn += p.toString() + "\n";
		}
		return toReturn;
	}
}
