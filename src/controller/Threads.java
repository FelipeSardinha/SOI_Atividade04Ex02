package controller;
import java.util.concurrent.Semaphore;
public class Threads extends Thread{
	private String direcao;
	private int numCarro;
	Semaphore semaforo;
	public Threads(String direcao, Semaphore semaforo, int numCarro){
		this.direcao = direcao;
		this.semaforo = semaforo;
		this.numCarro = numCarro;	
	}
	
	public void run() {
		try {
			sleep(1000);
			semaforo.acquire();
			passaCruzamento();
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	public void passaCruzamento() {
		System.out.println("O carro " + numCarro + " atravessou o semaforo em direçao a " + direcao);
	}	
}