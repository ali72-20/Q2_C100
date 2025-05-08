import solid.depndancy_inversions.*;

public class Main {
    private static void showPaymentMenu() {
        System.out.println("1- cash\n2- Credit card\n3- Vodafone cash\n4- Orange cash\n5- Fawery");
    }

    public static void main(String[] args) {
        Repo repo = new Repo(new LocalDataBase2(), new RemoteDataBase2());

    }
}

// AiModel // chat with ai

// Chat gpt
// gemini
// github copilot


