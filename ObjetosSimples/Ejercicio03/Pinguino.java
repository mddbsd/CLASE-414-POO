public class Pinguino extends Ave {

  public Pinguino() {}

  public Pinguino(Sexo s, String n) {
    super(s, n);
  }

  public void vuela() {
    System.out.println("Soy un pingüino, no puedo volar");
  }

  public void programa() {
    System.out.println("Soy un pingüino programador, estoy programando en Java");
  }

  public void nada() {
    System.out.println("Estoy nadando");
  }
}
