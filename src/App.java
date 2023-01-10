public class App {
    public static void main(String[] args) throws Exception {
        int entrada = 1;
        int saida = 5;
        String piramide = "";

        for (int i = entrada; i <= saida; i++) {
            for (int j = 0; j < i; j++) {
                piramide = piramide + i;
            }
            System.out.println(piramide);
            piramide = "";
        }
    }
}
