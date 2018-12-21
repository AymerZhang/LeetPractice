package swap;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        if (o1.ane > o2.ane){
            return 1;
        } else if (o1.ane < o2.ane){
            return 2;
        }
        return 0;
    }
}
