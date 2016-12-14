package homework.task2;

import java.lang.reflect.Field;

public class CloneCreator<T> {
    public T cloneObject(T obj) throws InstantiationException, IllegalAccessException{
        Class<T> clazz = (Class<T>)obj.getClass();
        T newObj = clazz.newInstance();
        System.out.println(clazz.getSimpleName());
        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields){
            field.setAccessible(true);
            field.set(newObj, field.get(obj));
            System.out.println(field.getName()+"  "+field.get(obj));
        }
        return newObj;
    }
}
