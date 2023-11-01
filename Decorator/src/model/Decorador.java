package model;

public abstract class Decorador implements IComponent{
	private IComponent component;
	
	public Decorador(IComponent ic) {
		this.component = ic;
	}
	@Override
	public void operacion() {
		this.component.operacion();
		
	}
}
