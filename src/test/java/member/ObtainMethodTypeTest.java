package member;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by hao.e.chen on 9/12/2017.
 */
public class ObtainMethodTypeTest {

    ObtainMethodType obtain;

    @Before
    public void setUp() {
        obtain = new ObtainMethodType();
    }

    @Test
    public void test() {
        Method[] methods = obtain.getClass().getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("m.getName()-" + m.getName());
            System.out.println("m.toString()-" + m.toString());
            System.out.println("m.toGenericString()-" + m.toGenericString());
            System.out.println("m.getReturnType()-" + m.getReturnType());
            System.out.println("m.getGenericReturnType()-" + m.getGenericReturnType());

            Type[] type = m.getParameterTypes();
            Type[] gtype = m.getGenericParameterTypes();
            for (int i = 0; i < type.length; i++) {
                System.out.println("getParameterTypes :" + type[i].getTypeName() + ":" + type[i]);
                System.out.println("getGenericParameterTypes :" + gtype[i].getTypeName() + ":" + gtype[i]);
            }

            Class<?>[] get = m.getExceptionTypes();
            Type[] et = m.getGenericExceptionTypes();
            for (int i = 0; i < get.length; i++) {
                System.out.println("getGenericExceptionTypes:" + get[i].getName() + ":" + get[i].getTypeName() + ":" + get[i]);
                System.out.println("getExceptionTypes:" + et[i].getTypeName() + ":" + get[i]);
            }
        }
    }

    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor[] constructors = obtain.getClass().getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getModifiers());
            System.out.println(constructor.getGenericParameterTypes());
            System.out.println(constructor.toGenericString());
        }
        Constructor con = obtain.getClass().getConstructor(String.class);
        ObtainMethodType test = (ObtainMethodType) con.newInstance("Charles");
        test.print();
    }
}