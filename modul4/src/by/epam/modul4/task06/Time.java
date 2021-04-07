package by.epam.modul4.task06;

public class Time {
	private int hour;
	private int minute;
	private int second;

	private static final Time instance = new Time();

	private Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	private Time() {

	}

	public static Time getInstance() {
		return instance;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;

	}

	public void scheckTime(Time time) {
		int a = 24;
		int b = 60;
		if (time.hour > a) {
			time.hour = time.hour - a;
		}
		if (time.minute > b) {
			time.minute = time.minute - b;
			time.hour++;
		}
		if (time.second > b) {
			time.second = time.second - b;
			time.minute++;
		}
	}

	public void changeTime(int x, int y, int z) {
		int a = 24;
		int b = 60;
		int h;
		int m;
		int s;

		h = this.hour + x;

		if (h > 24) {
			this.hour = this.hour + x - a;
		} else {
			this.hour = this.hour + x;
		}

		m = this.minute + y;

		if (m > 60) {
			this.minute = this.minute + y - b;
			this.hour++;
		} else {
			this.minute = this.minute + y;
		}

		s = this.second + z;

		if (s > 60) {
			this.second = this.second + z - b;
			this.minute++;
		} else {
			this.second = this.second + z;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
