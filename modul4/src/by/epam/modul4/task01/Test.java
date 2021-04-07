package by.epam.modul4.task01;

/*Создайте класс Test1 двумя переменными.Добавьте метод вывода на экран и метод изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольше значение
 * из этих дыух переменных. */

public class Test {

	public static void main(String[] args) {

		Test1 t = new Test1();

		System.out.println(t);

		t.summ();
		t.change();
		t.max();

		System.out.println(t);

		t.setX(5);
		t.setY(6);
		System.out.println(t);

		t.change();
		System.out.println(t);

		t.setX(2);
		t.setY(7);
		System.out.println(t);

	}
}
