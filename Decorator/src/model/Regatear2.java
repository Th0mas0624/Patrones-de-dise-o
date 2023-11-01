package model;

public class Regatear2 extends Decorador{

	public Regatear2(IComponent ic) {
		// TODO Auto-generated constructor stub
		super(ic);
	}
	
	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		super.operacion();
		System.out.println("Regatear al ival especial");
	}
	
}
