package by.epam.modul4.task05;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном
 * диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произовльными значениями. Счетчик имеет методы
 * увеличения и уменьшения состояния и методы позволяющие получить его текущее состояние.Написать код, демонстрирующий все
 * возможности класса. */

public class Test5 {

	public static void main(String[] args) {
		
		Counter a = new Counter();
		Counter b = new Counter(1, 10, 5);
		Counter c = new Counter(3, 8, 1);
		Counter d = new Counter(8, 5);

		System.out.println("a: " + a.presentValue());
		System.out.println("b: " + b.presentValue());
		System.out.println("c: " + c.presentValue());
		System.out.println("d: " + d.presentValue());
		System.out.println("==============Увеличенное значение=================");
		
		for (int i = 0; i < 10; ++i) {
			a.inc();
			b.inc();
			c.inc();
			d.inc();
		}
		System.out.println("a: " + a.presentValue());
		System.out.println("b: " + b.presentValue());
		System.out.println("c: " + c.presentValue());
		System.out.println("d: " + d.presentValue());
		System.out.println("==============Уменьшенное значение=================");
		
		for (int i = 0; i < 10; ++i) {
			a.dec();
			b.dec();
			c.dec();
			d.dec();
		}
		System.out.println("a: " + a.presentValue());
		System.out.println("b: " + b.presentValue());
		System.out.println("c: " + c.presentValue());
		System.out.println("d: " + d.presentValue());
	}

}
