/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappl;

import javax.xml.xpath.XPathException;
import java.util.*;
import java.io.*;

/**
 * @author akozhemyakin
 */

public class JavaAppl {
    static int compare(File f1, File f2) throws IOException {
        try(FileInputStream fis1 = new FileInputStream(f1);
            FileInputStream fis2 = new FileInputStream(f2);){

                while (true) {
                    int b1 = fis1.read();
                    int b2 = fis2.read();
                    if (b1 == -1 && b2 == -1) {
                        return 0;
                    }
                    if (b1 != b2) return b1 - b2;
                }
            }
        }

    public static void main(String[] args) throws IOException {
        File dirname = new File("C:\\TEMP");
        File[] files = dirname.listFiles(new FileFilter() {
            @Override
            public boolean accept(File dirname) {
                return dirname.isFile();
            }
        });
        for (int i = 0; i < files.length; i++) {
            for (int j = i + 1; j < files.length; j++) {
                if (compare(files[i], files[j]) == 0)
                    System.out.println("Files " + files[i] + " and " + files[j] + " are identical");
            }
        }
    }
}

//    String dirname = "C:\\Temp\\";
//    String extentionfilter = "txt";
//    File f = new File(dirname);
//        if (f.isDirectory()) {
//                System.out.println("Каталог: " + dirname);
//                FilenameFilter only = new OnlyExt(extentionfilter);
//                String s[] = f.list(only);
//                for (int i = 0; i < s.length; i++) {
//        System.out.println(s[i]);
//        }
//        } else {
//        System.out.println(dirname + " is not a directory!");
//        }


//
//        try (InputStream f = new FileInputStream(folder + filename)
//        ){
//            File fi = new File(folder + filename);
//            if(!fi.isDirectory()){
//                System.out.println("length of File = " + fi.length());
//                System.out.println(Arrays.asList(f.list()));
//            }
//            while (true) {
//                int c = f.read();
//                if (c == -1) break;
//                System.out.print((char) c);
//            }
//        } catch (IOException e) {
//            System.out.println("ERROR!!! - Check file " + (folder + filename));
//        }
//    }


//        public static void main(String[] arg) throws IOException{
//            BufferedReader reader = new BufferedReader(new FileReader("input.txt")); //входной файл
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); //выходной файл
//            StringBuffer sb = new StringBuffer();//буфер для входного текста
//            StringBuffer rez = new StringBuffer();//буфер для обработанного текста
//            int startPos = 0, endPos = 0, i = 0;
//
//            while (true){//цикл для вычитывания файла
//                String buffer = reader.readLine();
//                if (buffer == null){
//                    break;
//                }
//                sb.append(buffer + "\n");//заполняем буфер вычитанным текстом
//            }
//
//            while (i < sb.length()){//начало обработки
//                if(Character.isDigit(sb.charAt(i))){//если символ число
//                    startPos = i;
//                    while (Character.isDigit(sb.charAt(i))){
//                        i++;
//                    }
//                    endPos = i;
//                    rez.append("(" + sb.toString().substring(startPos, endPos) + ")");//заполняем выходной буфер
//                }
//                else{
//                    rez.append(sb.charAt(i));//если символ не число
//                }
//                i++;
//            }
//            writer.write(rez.toString());//пишем в файл обработанный текст
//            System.out.println(rez.toString());
//            writer.flush();//закрываем потоки i/o, лучше бы все это запихнуть в try/finally
//            writer.close();
//            reader.close();
//        }
//    }


//        \/---OLD code---\/
//        ArrayList<Person> persons = new ArrayList<Person>();
//        Person pA = new Person();
//        pA.name = "Alex";
//        pA.age = 18;
//        pA.male = true;
//        pA.print();
//
//        Person pB = new Person();
//        pB.name = "Mary";
//        pB.age = 18;
//        pB.male = false;
//        pB.print();
//
//        persons.add(pA);
//        persons.add(pB);
//        Collections.sort(persons);
//        System.out.println(persons.toString());
//
//        TaxPayer pT = new TaxPayer();
//        pT.name = "Tester";
//        pT.age = 50;
//        pT.male = true;
//        pT.salary = 10000;
//        pT.savings = -100;
//        pT.print();
//
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




