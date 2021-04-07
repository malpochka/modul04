package by.epam.modul4.task02;

public class Duck {
	private int size;
	private String name;

	public Duck() {
		this.size = 2;
		this.name = "Дино";

	}

	public Duck(int d, String duckName) {
		this.size = d;
		this.name = duckName;

	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public void setSize(int s) {
		this.size = s;
	}

	public void setName(String n) {
		this.name = n;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + size;
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
		Duck other = (Duck) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Duck [size=" + size + ", name=" + name + "]";
	}

}
