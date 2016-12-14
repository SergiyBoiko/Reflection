import homework.task1.*;
import homework.classes.*;
import homework.task2.CloneCreator;
import homework.task3.BeanComparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //Task 1
        BeanRepresenter p = new BeanRepresenter();
        p.printFildClasses(new Cat("Black",3,4,35));
        System.out.println();
        p.printFildClasses( new Car("Black",190,"Sedan","RX-7"));
        System.out.println();
        p.printFildClasses(new Human(190,"male",22,75));

        //Task 2
        CloneCreator<Car> car = new CloneCreator<>();
        car.cloneObject(new Car("Black",190,"Sedan","RX-7"));

        //Task 3
        BeanComparator eqavls = new BeanComparator();
        eqavls.equalsValueField(new Car("Black",190,"Cype","RX-8"),new Car("Black",190,"Sedan","RX-7"));
    }
}
