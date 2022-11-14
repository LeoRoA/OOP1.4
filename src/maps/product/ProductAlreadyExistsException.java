package maps.product;

public class ProductAlreadyExistsException extends RuntimeException{
    public ProductAlreadyExistsException() {
    }

    public ProductAlreadyExistsException(String message) {
        super(message);
    }
}
