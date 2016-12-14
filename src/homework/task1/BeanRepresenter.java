package homework.task1;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.reflect.Field;

public class BeanRepresenter{
    public <T> void printFildClasses(T classes) throws IllegalAccessException {
        Class clazz = classes.getClass();
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(clazz.getSimpleName());
        System.out.println("+---------------------+");
        for (Field field : fields) {
            //if (field.isAnnotationPresent(Ignore.class)) {
            //    continue;
            //} else {
            field.setAccessible(true);
            System.out.printf("|%10s | %5s   |\n",field.getName(),field.get(classes));
            System.out.println("+---------------------˥");
        //}
        }
    }
}


