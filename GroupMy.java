package by.epam.tr.les06my;

public class GroupMy {

	private StudentMy[] arr;

	
	public GroupMy(StudentMy[] arr) {
		this.arr = arr;
	}

	public double getAvgMark() {
		if (arr.length == 0) {
			return 0;
		}

		double sum = 0;
		for (StudentMy st : arr) {
			sum += st.getAvgStud();
		}

		return sum / arr.length;
	}

	public int WorstMarkStud() {
		int numberWorstStud = 0;
		for (StudentMy st : arr) {
			if(st.getAvgStud() <= 2) {
				numberWorstStud++;
			}
		}
		return numberWorstStud;
		
	}
	
	public int BestMarkStud() {
		int numberBestStud = 0;
		for (StudentMy st : arr) {
			if(st.getAvgStud() == 5) {
				numberBestStud++;
			}
		}
		return numberBestStud;
		
	}
}
