package member;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
public class FieldValueGetSetTest {
    FieldValueGetSet testObj;

    @Before
    public void setUp() {
        testObj = new FieldValueGetSet();
    }

    @Test
    public void testFieldGetNSet() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(testObj.toString());
        Field chaptersField = testObj.getClass().getDeclaredField("characters");
        String[] newChars = {"Queen", "King"};
        chaptersField.set(testObj, newChars);
        System.out.println(testObj.toString());
    }
}