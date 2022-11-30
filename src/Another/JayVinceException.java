package Another;

public class JayVinceException extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Hello!";
    }
}
