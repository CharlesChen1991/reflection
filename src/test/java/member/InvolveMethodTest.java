package member;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
public class InvolveMethodTest {
    InvolveMethod involve;

    @Before
    public void setUp() {
        involve = new InvolveMethod();
    }

    @Test
    public void testStatic() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = involve.getClass().getMethod("staticSayHello");
        m.invoke(null);
    }

    @Test
    public void testParam() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = involve.getClass().getMethod("hello", String.class);
        System.out.println(m.toGenericString());
        m.invoke(involve, "Charels");
    }

    @Test
    public void testPrivate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m = involve.getClass().getDeclaredMethod("privateHello");
        m.setAccessible(true);
        m.invoke(involve);
    }

    @Test
    public void testException() throws NoSuchMethodException, IllegalAccessException {
        Method m = involve.getClass().getDeclaredMethod("exception");
        m.setAccessible(true);
        try {
            m.invoke(involve);
        } catch (InvocationTargetException e) {
            System.out.println(e.getCause());
        }
    }
}