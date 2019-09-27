package project1;

// Josh Sample

public class Test {

	public static void main(String[] args) {
		// Testing Patient
		PatientADT p1 = new Patient("1234", "Mark");
		System.out.println(p1);
		p1.setId("12");
		p1.setName("James");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		p1.addACE("Physical Abuse");
		p1.addACE("Emotional Abuse");
		p1.addACE("Sexual Abuse");
		p1.removeACE("Physical Abuse");
		System.out.println(p1.getACEs());
		// Testing Data
		System.out.println();
		AceDataManagerADT myData = new Data();
		PatientADT p2 = new Patient("345", "Steve");
		p2.addACE("Physical Abuse");
		myData.addPatient(p1);
		myData.addPatient(p2);
		System.out.println(myData.getRiskFactors(p1.getACEs()));
		System.out.println(myData.getRiskFactors(p2.getACEs()));
		System.out.println(myData.getPatient("12"));
		System.out.println(myData.getPatient("3"));
		System.out.println(myData.toString());
	}

}
