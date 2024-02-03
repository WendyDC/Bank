package co.com.bank.model.customer.exception;

public class CustomerNotFound extends RuntimeException{
        public CustomerNotFound() {
                super("Cliente no existe.");
        }
}
