import solid.open_close.*;

import java.util.Scanner;

public class Main {
    private static void showPaymentMenu() {
        System.out.println("1- cash\n2- Credit card\n3- Vodafone cash\n4- Orange cash\n5- Fawery");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showPaymentMenu();
        int option = scanner.nextInt();
        PaymentMethod paymentMethod = new CashPayment();

        paymentMethod = switch (option) {
            case 1 -> new CashPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new VodafoneCash();
            case 4 -> new OrangeCash();
            case 5 -> new Fawery();
            default -> paymentMethod;
        };

        paymentMethod.pay();
    }
}

// AiModel // chat with ai

// Chat gpt
// gemini
// github copilot


