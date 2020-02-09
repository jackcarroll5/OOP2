import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by T00194823 on 19/09/2017.
 */
public class Problem5 {
    public static void main(String[] args) {

        int a = 1,b = 6,c = -16;
        double root1 = 0,root2 = 0;

                root1 = -b + Math.sqrt((b * b) - 4 * a * c) / (2 * a);

                root2 = -b - Math.sqrt((b * b) - 4 * a * c)  / (2 * a);

        System.out.println("The roots are " + root1 + " and " + root2);
    }
}
