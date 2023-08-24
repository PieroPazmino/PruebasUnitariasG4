package junitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee worker;
	private Employee supervisor;
	private Employee manager;
	private Employee workerEUR;
	
	@Before
	public void setup() {
		worker = new Employee(1000, "USD", 10, EmployeeType.Worker);
		supervisor = new Employee(1500, "USD", 15, EmployeeType.Supervisor);
		manager = new Employee(2000, "USD", 20, EmployeeType.Manager);
		workerEUR = new Employee(1000, "EUR", 5, EmployeeType.Worker);
		
	}
	
	//Prueba de tipo Worker, de mes impar y currency USD
	@Test
	public void testEmployeeWorkerMesImparUSD() {
		float expected = (float) (1000 + (386.0 / 12*2));
		float actual = worker.cs();
		assertEquals(expected, actual);
		
		}
	
	//Prueba de tipo Supervisor, de mes impar y currendy USD
	@Test
	public void testEmployeeSupervisorMesImparUSD() {
		float expected = (float) ((1500 +(15*0.35F)) + (386.0 / 12*2));
		float actual = supervisor.cs();
		assertEquals(expected, actual);
		
		}
	
	//Prueba de tipo Manager, de mes impar y currency USD
	@Test
	public void testEmployeeManagerMesImparUSD() {
		float expected = (float) ((2000 +(20*0.7F)) + (386.0 / 12*2));
		float actual = manager.cs();
		assertEquals(expected, actual);
		
		}
	
	//Prueba de tipo Worker, de mes par y currency USD
	@Test
	public void testEmployeeWorkerMesParUSD() {
		float expected = 1000;
		float actual = worker.cs();
		assertEquals(expected, actual);
		
		}
	
	//Prueba de tipo Worker, de mes par y currency EUR
	@Test
	public void testEmployeeWorkerEURMesParEUR() {
		float expected = (float) (1000*0.95);
		float actual = workerEUR.cs();
		assertEquals(expected, actual);
		
		}
	

	@Test
	public void testCs() {
		fail("Not yet implemented");

	}

	@Test
	public void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
