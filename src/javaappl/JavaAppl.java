/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappl;

import java.util.*;

/**
 * @author akozhemyakin
 */
public class JavaAppl {

    public static void main(String[] args) {
//        // TODO code application logic here
//        int m[] = new int[]{11, 3, 5, 77};
//        Arrays.sort(m);
//        System.out.println(Arrays.toString(m));

//        add to array and output entered values:

//        int z[] = new int[0];
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            int q = scanner.nextInt();
//            int a1[] = new int[z.length + 1];
//            for (int i = 0; i < z.length; i++) {
//                a1[i] = z[i];
//            }
//            a1[a1.length - 1] = q;
//            z = a1;
//            System.out.println(Arrays.toString(z));
//        }

//        2 approach (works fsater) - add to array and output entered values:
//        ArrayList<Integer> arr = new ArrayList();
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int q = scanner.nextInt();
//            arr.add(q);
//            System.out.println(arr);
//        }

//       Count chars in string:
        String s = "Some String here 109283 dasjk  hi.x;";
        Map<Character, Integer> cnt = new TreeMap<Character, Integer>(); //HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cnt.containsKey(c)) {
                cnt.put(c, 1);
            } else {
                int oldCnt = cnt.get(c);
                cnt.put(c, oldCnt + 1);
            }
        }
        System.out.println(cnt);
    }

}
