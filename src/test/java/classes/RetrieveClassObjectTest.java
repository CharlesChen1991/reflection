package classes;

import org.junit.Test;
import pojo.SamplePojo;

import static org.junit.Assert.assertEquals;

/**
 * Created by hao.e.chen on 9/7/2017.
 */
public class RetrieveClassObjectTest {
    @Test
    public void getClassSamples() throws ClassNotFoundException {
        SamplePojo sample = new SamplePojo();
        Class classFromGetClass = sample.getClass();
        Class classFromDotClass = SamplePojo.class;
        Class classFromForName = Class.forName("pojo.SamplePojo");
        assertEquals(classFromDotClass, classFromForName);
        assertEquals(classFromGetClass, classFromForName);
    }
}