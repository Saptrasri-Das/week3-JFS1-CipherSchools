import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.processing.SupportedAnnotationTypes;

public class test2 {
    public static void main(String[] args) {
        //map method
        //Map map method is used to map each element to its corressponding function
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        List<Integer> result = myList.stream().map(e -> e*e).collect(Collectors.toList());

        // myList : ordinary collection Object with no stream Support

        System.out.println(result);
        
        
    }
}
