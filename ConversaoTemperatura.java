import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        // Solicita ao usuário para digitar a temperatura em Celsius
        try ( // Criação de um objeto Scanner para leitura de dados
                Scanner sc = new Scanner(System.in)) {
            // Solicita ao usuário para digitar a temperatura em Celsius
            System.out.print("Digite a temperatura em Celsius (°C): ");
            double celsius = sc.nextDouble();
            // Calculando a temperatura em Fahrenheit
            double fahrenheit = (celsius * 9/5) + 32;
            // Calculando a temperatura em Kelvin
            double kelvin = celsius + 273.15;
            // Exibindo os resultados
            System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
            System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
            System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
            // Fechar o scanner
        }
    }
}
