//package are_same;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class AreSame {
//
//    public static boolean comp(int[] a, int[] b) {
//        if (a.length == 0 || b.length == 0) {
//            return false;
//        }
//        if (a.length > b.length) {
//            return false;
//        }
//
//        boolean result = true;
//        List<Integer> list = Arrays.stream(b).boxed().collect(Collectors.toList());
//        for (int i : a) {
//            int mult = i*i;
//            boolean tresult = false;
//            for (Integer j : list) {
//                if (j == mult){
//                    tresult = true;
//                    list.remove(j);
//                }
//            }
//            if (!tresult){
//                result = false;
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] a = new int[]{2, 2, 4};
//        int[] b = new int[]{4,2 , 16};
//        System.out.println(AreSame.comp(a, b));
//    }
//}
