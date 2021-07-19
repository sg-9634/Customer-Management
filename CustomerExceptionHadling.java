package custom_exception;


@SuppressWarnings("serial")
public class CustomerExceptionHadling extends Exception{

	public CustomerExceptionHadling(String mesg) {
		super(mesg);
	}
}
