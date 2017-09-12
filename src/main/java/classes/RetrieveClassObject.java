package classes;

import pojo.SampleEnum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hao.e.chen on 9/7/2017.
 */
public class RetrieveClassObject {
    public static void main(String[] args) {
        System.out.println("Class get from enum object :" + SampleEnum.First.getClass());
        System.out.println("Class get from enum class :" + SampleEnum.class);
        byte[] bytes = new byte[1024];
        System.out.println("Class get from byte array :" + bytes.getClass());
        System.out.println("Class get from String array :" + String[].class);
        System.out.println("Class get from Array class :" + Arrays.class);
        System.out.println("Class get from byte class :" + byte.class);
        Set<String> s = new HashSet<>();
        System.out.println("Class get from set object :" + s.getClass());
    }
}
