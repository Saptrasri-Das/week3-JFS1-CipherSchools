import java.util.*;
class streamm {
    public static void change(String m) {
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args) {

        //forEach - this method helps us in accessing all the elements of a given collection and call a common method on all elements.
        //stream is wrapper around your data source so that we can do the bulk processing conveniently and fast/

        ArrayList<String> lang = new ArrayList<String>();

        lang.add("java");
        lang.add("C#");
        lang.add("python");
        lang.add("PHP");

        //lang.forEach(System.out::println);

        lang.forEach(streamm::change);

        for(String t : lang) {
            change(t);
        }

        change(lang.get(0));
        change(lang.get(1));
        change(lang.get(2));
        change(lang.get(3));
        //lang.forEach(class::method)
    }
}