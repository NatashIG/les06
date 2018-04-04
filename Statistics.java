package by.epam.tr.les06my;

import java.util.Random;

public class Statistics {

	public static void main(String[] args) {

		Random rand = new Random();
		StudentMy[] array = new StudentMy[10]; //StudentMy[] array = new StudentMy[11]; a student with the excellent marks included
		

		for (int i = 0; i < 10; i++) {
			double[] marks = new double[5];

			for (int x = 0; x < 5; x++) {
				marks[x] = rand.nextInt(4)+1;
			}

			StudentMy sm = new StudentMy("Student","" + i, marks);
						
			System.out.println (sm.getName() + " " + sm.getSurname() + " avg: "+ sm.getAvgStud());
			array[i] = sm;

		}
		
		//StudentMy sm = new StudentMy("Student Looser","" , new double [] {5,5,5,5,5}); // a student with the excellent marks is added to the group :)
		//array[10] = sm;
		
		GroupMy group = new GroupMy(array);
		System.out.println ("Group avg: "+ group.getAvgMark());
		System.out.println ("Worst Studensts: "+ group.WorstMarkStud());
		System.out.println ("Best Students: "+ group.BestMarkStud());
	}

	
}
