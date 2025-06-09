import examples.*;
import processor.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutionLogger.process(new InfoClass());

        InfoReader.read();
    }
}
