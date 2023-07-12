package entities;

import java.util.Arrays;

public class  Puntos {
    private int[] p1=new int[2],p2=new int[2];

    public int[] getP1() {
        return p1;
    }

    public void setP1(int[] p1) {
        this.p1 = p1;
    }

    public int[] getP2() {
        return p2;
    }

    public void setP2(int[] p2) {
        this.p2 = p2;
    }


    @Override
    public String toString() {
        return "Puntos{" +
                "p1=" + Arrays.toString(p1) +
                ", p2=" + Arrays.toString(p2) +
                '}';
    }
}
