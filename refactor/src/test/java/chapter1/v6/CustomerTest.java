package chapter1.v6;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void statement() {
        Customer customer = new Customer("John");
        String title = "Titanic";
        int priceCode = 2;
        int _daysRented = 7;
        Movie movie = new Movie(title, priceCode);
        Rental rental = new Rental(movie, _daysRented);
        customer.addRental(rental);
        String statement = customer.statement();
		System.out.println(statement);
		System.out.println();
		String htmlStatement = customer.htmlStatement();
		System.out.println(htmlStatement);
    }


}
