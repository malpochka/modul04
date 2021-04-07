package by.epam.modul4.task06;

/* Составьте описание класса для представления времени. Предусмотрите возможности установки времени и 
 * изменения его отдельных полей(час, минута,секунда). с проверкой допустимости вводимых значений.
 *  В случае недопустимых значений полейустанавливается в значении 0.
 *   Создать методы изменения времени на заданное количество часов, минут, секунд */

public class TimeMain {

	public static void main(String[] args) {

		Time.getInstance().setHour(25);
		Time.getInstance().setMinute(62);
		Time.getInstance().setSecond(20);

		Time.getInstance().scheckTime(Time.getInstance());

		System.out.println(Time.getInstance());

		Time.getInstance().changeTime(2, 35, 35);

		System.out.println(Time.getInstance());
	}
}
