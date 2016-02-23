import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by waryong on 15. 9. 30..
 */
@FunctionalInterface
public interface BufferdReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
