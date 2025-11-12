import java.util.ArrayList;

public class TesteFormas {
    public static void main(String[] args) {
        ArrayList<FormaBidimensional> formas2D = new ArrayList<>();
        ArrayList<FormaTridimensional> formas3D = new ArrayList<>();

        formas2D.add(new Quadrado(4));
        formas2D.add(new Retangulo(5, 3));
        formas2D.add(new Circulo(2));

        formas3D.add(new Cubo(3));

        System.out.println("Formas 2D ");
        for (FormaBidimensional f : formas2D) {
            System.out.println(f.getNome() +
                    " | Área: " + f.calcularArea() +
                    " | Perímetro: " + f.calcularPerimetro());
        }

        System.out.println("\n Formas 3D ");
        for (FormaTridimensional f : formas3D) {
            System.out.println(f.getNome() +
                    " | Área: " + f.calcularArea() +
                    " | Volume: " + f.calcularVolume());
        }
    }
}
