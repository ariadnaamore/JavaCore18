package homework2;

public class MyException extends RuntimeException {

	public MyException() {
		super();

	}

//Constructor
	public MyException(String message, Throwable cause) {
		super(message, cause);

	}

// Constructor with String only

	public MyException(String string) {

	}

}
