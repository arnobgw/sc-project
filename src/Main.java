public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to movie rental system");
        long startTime = System.nanoTime();
        Customer customer = new Customer("Abul");
        customer.addRental(new Rental(new Movie("Horror", new ChildrenPrice()), 5));
        System.out.println(customer.statement());
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) + " nanoseconds");
    }
}
