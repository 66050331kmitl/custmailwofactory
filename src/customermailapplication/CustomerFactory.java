package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        return switch (type) {
            case "Regular" -> new RegularCustomer();
            case "Mountain" -> new MountainCustomer();
            case "Delinquent" -> new DelinquentCustomer();
            default -> null;
        };
    }
}
