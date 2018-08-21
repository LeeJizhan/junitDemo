/**
 * Created by Asus- on 2018/8/21.
 */
public class SumR {

    public int sum(int R) {
        if (R < 1) return 1;
        else return sum(R - 1) * R;
    }

}
