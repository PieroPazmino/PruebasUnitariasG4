package Testing;

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test;

class test {
	// TS1 Ingresando el valor 386 dado que es un empleado de tipo Worker
	@Test
	public void testCalculateYear() {
		Employee worker = new Employee(1000, "USD",1,EmployeeType.Worker);
		float output = worker.CalculateYearBonus();
		Assertions.assertEquals(output,386);
	}
	// TS2 comprobando la salida del m�todo cuando es llamado por un trabajador de tipo supervisor 
	@Test
	public void testCalculateYear1() {
		Employee supervisor = new Employee(1000, "USD",1,EmployeeType.Supervisor);
		float output = supervisor.CalculateYearBonus();
		Assertions.assertEquals(output, 1193);
	} 
	// TS3 comprobando la salida del m�todo cuando es llamado por un empleado de tipo Manager
	@Test
	public void testCalculateYear2() {
			Employee Manager = new Employee(1000, "USD",1,EmployeeType.Manager);
			float output = Manager.CalculateYearBonus();
			Assertions.assertEquals(output,1386);
	}
	// TS4 comprobando la salida del m�todo cuando el tipo de moneda es diferente de USD
	@Test
	public void testCalculateYear3() {
			Employee worker = new Employee(1000,"EUR",1, EmployeeType.Supervisor);
			float output = worker.CalculateYearBonus();
			Assertions.assertEquals(output,1143);
		
	}
	
	
	

	

}
