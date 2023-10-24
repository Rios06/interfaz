
public class Main {
    public static void main(String[] args) {
        MyHero Dark = new MyHero(100, 50, "Dark", "The dark", "Invisibilidad", "Negro");


        Dark.rayoLacer();
        Dark.rapidez();
        Dark.superPoder();
        Dark.ataque();
        Dark.ataque();
        System.out.println("Apodo: " + Dark.apodo + " ,Poder: " + Dark.poder + " ,Color traje: " + Dark.colorTraje);
        System.out.println("Salud restante: " + Dark.getSalud());
        System.out.println("Energía restante: " + Dark.getEnergia());
    }
}