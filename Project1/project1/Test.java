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
	}

}
