package homework.task3;

import java.lang.reflect.Field;

public class BeanComparator {
    public <T> void equalsValueField(T objA, T objB) throws IllegalAccessException, NoSuchFieldException {
        if(objA.getClass() != objB.getClass()){
            System.out.println("  A           B               Match");
            System.out.println(objA.getClass().getSimpleName()+"         "+objB.getClass().getSimpleName()+"         "+"Can't eqvals");
            return;
            }
        System.out.println("Field          A          B          Match");
        for(Field objAField : objA.getClass().getDeclaredFields()){
            Field objBField = objB.getClass().getDeclaredField(objAField.getName());
            objAField.setAccessible(true);
            objBField.setAccessible(true);
            Object objAFieldValue = objAField.get(objA);
            Object objBFieldValue = objBField.get(objB);
            String meaningMatch = "\uF0FB";
            if(objAFieldValue.equals(objBFieldValue)){
                meaningMatch = "\uF0FC";
            }
            System.out.printf("%-15s%-11s%-11s%s\n",objAField.getName(),objAFieldValue,objBFieldValue,meaningMatch);
        }
    }
}
