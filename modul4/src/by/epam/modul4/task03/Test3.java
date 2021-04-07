package by.epam.modul4.task03;


/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов),
 * Создайте массив из 10 элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
 * равные только 9 и 10. 
 */

public class Test3 {

	public static void main(String[] args) {

		Student[] st = { new Student("Ипатова А.П.", 14, new int[] { 9, 10, 9, 10, 9 }),
				new Student("Иванов И.В.", 13, new int[] { 6, 8, 10, 9, 7 }),
				new Student("Сидорова С.В.", 12, new int[] { 9, 9, 9, 9, 9 }),
				new Student("Ерошевич М.И.", 13, new int[] { 6, 9, 10, 9, 8 }),
				new Student("Иванова В.В.", 14, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Климович О.Н.", 14, new int[] { 7, 8, 9, 9, 7 }),
				new Student("Евсеенко О.А.", 13, new int[] { 10, 9, 10, 9, 9 }),
				new Student("Лобачева Е.В.", 13, new int[] { 6, 6, 5, 8, 9 }),
				new Student("Саленок О.Ф.", 14, new int[] { 10, 9, 10, 9, 10 }),
				new Student("Гапон А.И.", 13, new int[] { 6, 5, 6, 9, 7 }) };


		for (Student student : st) {
			int count = 0;
			for (int a : student.getRating()) {
				if (a >= 9) {
					count++;
				}
			}
			if (count == 5) {
				System.out.println(student.getName() +"-"+ " Номер группы: " + student.getGroupNumber());
			}
		}
	}
}
