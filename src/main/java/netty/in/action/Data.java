package netty.in.action;

/**
 * Created by spark on 17-7-31.
 */
public class Data {
    private int n;
    private int m;

    public Data(int n, int m) {
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return "Data{" +
                "n=" + n +
                ", m=" + m +
                '}';
    }
}
