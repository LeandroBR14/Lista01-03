public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Digite o primeiro número a ser somado: ");
        numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número a ser somado: ");
        numero2 = teclado.nextDouble();
        double total = numero1 + numero2;
        System.out.println("O soma dos números é: " +total);
    }
}
