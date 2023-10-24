public class Hero implements Actividad {
    private int salud;
   private int energia;

    public Hero(int salud, int energia) {
        this.salud = salud;
        this.energia = energia;
    }

    @Override
    public void usarManos() {
        System.out.println("Usando manos");
    }

    @Override
    public void usarPies() {
        System.out.println("Moviendo los pies rapidamente");
    }

    @Override
    public void moverse() {
        System.out.println("Moviendo cuerpo ");
    }

    @Override
    public void saltar() {
        System.out.println("Saltando velozmente");
    }

    @Override
    public void hablar() {
        System.out.println("Hablando");
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
