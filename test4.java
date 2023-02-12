import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test4 {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(12,-44,19,21,-55,77);
        // // lets write filter to extract Negative Numbers only
        // //criteria : num < 0
        // List<Integer> result = numbers.stream().filter(e->e<0).collect(Collectors.toList());
        // System.out.println(result);

        Object obj = 10;
        System.out.println(obj.getClass().getSimpleName());


        List<Object> myList = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);
        List<Object> result = myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
        System.out.println(result);
        myList.forEach(m-> {
            System.out.println(m+"->"+m.getClass().getSimpleName());
        });

        int totalIntegers =(int)myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println("Total Integer" +totalIntegers);

        List<String> colors = Arrays.asList("red","green","orange");

        List<String> result2 = colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList()) ;
        System.out.println(result2 );
    }
}
