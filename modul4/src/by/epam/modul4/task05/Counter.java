package by.epam.modul4.task05;

public class Counter {
	int min;
	int max;
	int count;

	public Counter() {
		this.min = 0;
		this.max = 20;
		this.count = 0;
	}

	public Counter(int m, int ma, int c) {
		this.min = m;
		this.max = ma;
		this.count = c;

		if (min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if (count < min) {
			count = min;
		}
		if (count > max) {
			count = min;
		}
	}

	public Counter(int minimum, int maximum) {
		this.min = minimum;
		this.max = maximum;
		if (max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int presentValue() {
		return count;
	}
	
	public void inc() {
		count++;
		if (count > max) {
			count = max;
		}
	}
	
	public void dec() {
		count--;
		if (count < min) {
			count = min;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [min=" + min + ", max=" + max + ", count=" + count + "]";
	}
	
}
