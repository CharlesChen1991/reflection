package member;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
public class ObtainMethodType {
    private String member;

    public ObtainMethodType() {

    }

    public ObtainMethodType(String a) {
        member = a;
    }

    private ObtainMethodType(String a, boolean b) {

    }

    <E extends RuntimeException> void genericThrow(boolean test) throws E {
    }

    public void print() {
        System.out.println("hi:" + member);
    }
}
