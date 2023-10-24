public class MyHero extends Hero  {
    String nombre = "Dark";
    String apodo;
    String poder;
    String colorTraje;

    public MyHero(int salud, int energia, String nombre, String apodo, String poder, String colorTraje) {
        super(salud, energia);
        this.nombre = nombre;
        this.apodo = apodo;
        this.poder = poder;
        this.colorTraje = colorTraje;
    }

    public void volar(){
usarManos();

}

public void rayoLacer(){
    moverse();
}

public void rapidez(){
    usarPies();
    saltar();
}

public void superPoder(){
    System.out.println("Usando super poder");
        moverse();
    rapidez();
    setEnergia(getEnergia() - 1);
}

public void ataque(){
    System.out.println("Siendo atacado");
    setSalud(getSalud() - 15);
}
}
