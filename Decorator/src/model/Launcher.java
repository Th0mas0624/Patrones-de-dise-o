package model;

public class Launcher {

	public static void main(String[] args) {
		Futbolista lio = new Futbolista();
		
		Regatear regate = new Regatear(lio);
		Tapar tapar = new Tapar(regate);
		Regatear2 r2 = new Regatear2(tapar);
		
		r2.operacion();
	}
}
