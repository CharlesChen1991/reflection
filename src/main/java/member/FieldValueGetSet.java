package member;

import java.util.Arrays;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
enum Tweedle {
    DEE, DUM
}

public class FieldValueGetSet {
    public long chapters = 0;
    public String[] characters = {"Alice", "White Rabbit"};
    public Tweedle twin = Tweedle.DEE;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FieldValueGetSet{");
        sb.append("chapters=").append(chapters);
        sb.append(", characters=").append(characters == null ? "null" : Arrays.asList(characters).toString());
        sb.append(", twin=").append(twin);
        sb.append('}');
        return sb.toString();
    }
}
