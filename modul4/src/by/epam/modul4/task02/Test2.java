package by.epam.modul4.task02;
/*Создайте класс Test2 двумя переменными.Добавьте конструктор с вхоными параметрами.Добавьте конструктор, инициализируйте
 * члены класса по умолчанию.Добавтье set-и get- методы для полей экземпляра класса. */


public class Test2 {

	public static void main(String[] args) {

		Duck duck = new Duck();
		Duck duck2 = new Duck(15, "Глаша");

		duck.setSize(33);
		duck.setName("Даша");

		System.out.println(duck);
		System.out.println(duck2);
		System.out.println(duck.getSize() + " " + duck.getName());

	}
}
