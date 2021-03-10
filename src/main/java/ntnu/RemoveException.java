package ntnu;

/**
 * RemoveException class. Exception that get thrown around in the program if thrown in methods.
 */
public class RemoveException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * The RemoveExceptions text of what the problem is.
     * @param text
     */
    public RemoveException(String text){
        super(text);
    }
}
