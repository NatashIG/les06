package by.epam.tr.les06my;

public class StudentMy {

	private String name;
	private String surname;
	private double[] marks;

	public StudentMy (String name, String surname, double[] marks ) {
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double getAvgStud() {

		if (marks.length == 0) {
			return 0;
		}
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		return sum / marks.length;
	}

}
