package pojo;

/**
 * Created by hao.e.chen on 9/7/2017.
 */
public enum SampleEnum {
    First("firstEnum"), Double("doubleEnum");

    private SampleEnum(String name) {
        this.enumName = name;
    }

    String enumName;
}
