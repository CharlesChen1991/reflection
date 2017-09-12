package member;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
public class InvolveMethod {
    public static String staticSayHello() {
        System.out.println("Hello static");
        return "Hello static";
    }

    public String hello(String name) {
        System.out.println("hello : " + name);
        return "hello";
    }

    public String hello(String name, String name2) {
        System.out.println("hello : " + name + "and" + name2);
        return "hello";
    }

    private String privateHello() {
        System.out.println("hello private");
        return "say hello private";
    }

    private String exception() throws Exception {
        throw new Exception("exception test");
    }
}
