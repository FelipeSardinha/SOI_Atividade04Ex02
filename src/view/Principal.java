package view;
import java.util.concurrent.Semaphore;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		Thread carro1 = new Threads("baixo", semaforo, 1);
		Thread carro2 = new Threads("cima", semaforo, 2);
		Thread carro3 = new Threads("direita", semaforo, 3);
		Thread carro4 = new Threads("esquerda", semaforo, 4);
		carro1.start();
		carro2.start();
		carro3.start();
		carro4.start();
	}
}