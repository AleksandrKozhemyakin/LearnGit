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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        int m[] = new int[]{11, 3, 5, 77};
//        Arrays.sort(m);
//        System.out.println(Arrays.toString(m));

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
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        while (scanner.hasNext()) {
//            arr.add(scanner.nextInt());
//            System.out.println(arr);
//        }
        String s = "Some string to count chars in it kljsdlf : , ;xz osdir".toLowerCase();
        Map<Character, Integer> cnt = new TreeMap<Character, Integer>(); //HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cnt.containsKey(c)) {
                cnt.put(c, 1);
            } else {
                int oldInt = cnt.get(c);
                cnt.put(c,oldInt+1);
            }
        }
        System.out.println(cnt);
    }

}
