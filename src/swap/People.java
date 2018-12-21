package swap;

public class People implements Comparable<People>{
    public int ane;
    public String name;
    public int hight;
    public int weight;

    public People(int ane, String name, int hight, int weight) {
        this.ane = ane;
        this.name = name;
        this.hight = hight;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "ane=" + ane +
                ", name='" + name + '\'' +
                ", hight=" + hight +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if (o.ane > this.ane){
            return 1;
        } else if (o.ane < this.ane){
            return 2;
        }
        return 0;
    }
}
