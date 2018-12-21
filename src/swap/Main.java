package swap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * java排序方法。。。都没效果
 */
public class Main {
    public static void main(String[] args) {
        People p1 = new People(1, "json", 2, 5);
        People p2 = new People(5, "json", 2, 5);
        People p3 = new People(2, "json", 2, 5);
        People p4 = new People(4, "json", 2, 5);
        People p5 = new People(3, "json", 2, 5);

        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        peoples.add(p4);
        peoples.add(p5);

        System.out.println("排序前");
        for (People people : peoples) {
            System.out.print(people.ane);
        }
        System.out.println();
        for (int i = 0; i < peoples.size() - 1; i++) {
            for (int j = 0; j < peoples.size() - 1 - i; j++) {
                if (peoples.get(j).ane > peoples.get(j + 1).ane) {
                    People temp = peoples.get(j);
                    peoples.set(j, peoples.get(j + 1));
                    peoples.set(j + 1, temp);
                }
            }
        }

        System.out.println("排序后");
        for (People people : peoples) {
            System.out.print(people.ane);
        }
    }
}
