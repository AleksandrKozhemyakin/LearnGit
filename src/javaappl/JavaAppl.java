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

        ArrayList<Person> persons = new ArrayList<Person>();
        Person pA = new Person();
        pA.name = "Alex";
        pA.age = 18;
        pA.male = true;
        pA.print();

        Person pB = new Person();
        pB.name = "Mary";
        pB.age = 18;
        pB.male = false;
        pB.print();

        persons.add(pA);
        persons.add(pB);
        Collections.sort(persons);
        System.out.println(persons.toString());

        TaxPayer pT = new TaxPayer();
        pT.name = "Tester";
        pT.age = 50;
        pT.male = true;
        pT.salary = 10000;
        pT.savings = -100;
        pT.print();

//        \/---OLD code---\/
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
//        int m[] = new int[]{12, 33, 10, 1, 2, 33, 22, 12, 7, 6, 7, 77, 7};
//        Map<Integer, Integer> cnt = new TreeMap<Integer, Integer>();
//        for (int i = 0; i < m.length; i++) {
//            int z = m[i];
//            if (!cnt.containsKey(z)) {
//                cnt.put(z, 1);
//            } else {
//                cnt.put(z, cnt.get(z) + 1);
//            }
//        }
//        System.out.println(cnt);
//        for (Integer t : cnt.keySet()) {
//            for (int n=0;n<cnt.get(t);n++){
//                System.out.print(t);
//            }
//            System.out.print("   ");

    }

}
