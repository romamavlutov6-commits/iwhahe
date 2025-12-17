package practice24.ТASK2;

public class Client {
    public void sit(Chair chair) {
        chair.sit();
    }

    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        client.sit(factory.createVictorianChair());
        client.sit(factory.createFunctionalChair());
        client.sit(factory.createMagicChair());
    }
}