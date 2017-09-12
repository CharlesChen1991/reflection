package pojo;

/**
 * Created by hao.e.chen on 9/7/2017.
 */
public class SampleImplement<T extends Object> implements SampleInterface {
    @Override
    public Class getType() {
        return this.getClass();
    }
}
