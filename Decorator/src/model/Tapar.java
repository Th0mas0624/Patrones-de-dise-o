package model;

public class Tapar extends Decorador{

	public Tapar(IComponent ic) {
		// TODO Auto-generated constructor stub
		super(ic);
	}
	
	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		super.operacion();
		System.out.println("Tapar ");
	}
}
