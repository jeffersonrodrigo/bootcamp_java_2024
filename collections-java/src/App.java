public class App {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Comparando objetos
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

        // Obtendo o hashCode
        System.out.println("obj1 hashCode: " + obj1.hashCode());

        // Obtendo a representação em string
        System.out.println("obj1 toString: " + obj1.toString());
    }
}
