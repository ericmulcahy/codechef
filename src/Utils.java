import java.util.Collection;
import java.util.HashMap;

/**
 * todo: class description goes here
 * <p/>
 * Created on 9/20/13 at 12:03 PM by @author emulcahy
 */
public class Utils {
    public static void main(String[] args) {

    }

    private class CustomMultimap<K, V extends Collection> extends HashMap<K, V> {

    }

    private static int IntPower(int x, int y) {
        if (y == 0) return 1;
        int product = x;
        for (int i=1; i<y; i++) {
            product *= x;
        }
        return x;
    }
}
