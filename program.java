import java.util.Arrays;
import java.util.List;

class test1 {

    static void Converter(int arg) {
        System.out.println(Math.abs(arg));
    }

    void doAction() {
        List<Integer> numbers = Arrays.asList(5,-3,6,7,8,-9,2);
        numbers.forEach(test1::Converter);
    }
}
public class program {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.doAction();
    }
}
