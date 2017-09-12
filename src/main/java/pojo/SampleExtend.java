package pojo;

/**
 * Created by hao.e.chen on 9/7/2017.
 */
public class SampleExtend<T> extends SampleImplement<T> {
    public void sayHello() {
        System.out.println("hello from SampleExtend");
    }
}
