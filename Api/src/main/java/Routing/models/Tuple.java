package Routing.models;

import java.util.Comparator;

public class Tuple {
    public Employee e;
    public Point p;
    public double distFromBusStop;

    public Tuple(Employee e, Point p, double distFromBusStop) {
        this.e = e;
        this.p = p;
        this.distFromBusStop = distFromBusStop;
    }

    public static Comparator<Tuple> TupleComparator = new Comparator<Tuple>() {

        public int compare(Tuple t1, Tuple t2) {
            double dist1 = t1.distFromBusStop;
            double dist2 = t2.distFromBusStop;
            if (dist1 > dist2)
                return 1;
            if (dist2 > dist1)
                return -1;
            else
                return 0;
        }
    };
}