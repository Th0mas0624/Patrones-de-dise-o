class ObjetoConcreto implements Prototype {

    private String descripcion;

    public ObjetoConcreto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public Prototype clone() {
        return new ObjetoConcreto(this.descripcion);
    }
}