package entite;

public class employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return grossSalary += grossSalary * percentage /100.00;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f ", netSalary());
	}

}
