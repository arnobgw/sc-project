public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to movie rental system");
        long startTime = System.nanoTime();
        Customer customer = new Customer("Abul");
        Movie movie = new Movie("Horror", 2);
        Rental rental = new Rental(movie, 5);
        customer.addRental(rental);
        System.out.println(customer.statement());
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) + " nanoseconds");
    }
}
