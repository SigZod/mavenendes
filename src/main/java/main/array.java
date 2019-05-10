package main;
public class array {
        public static void main(String[] args) {
            int [] array2 = {1,2,3,4,5};
            int aux;

            for (int i =0;i<array2.length;i++){
                aux=array2[i];
                array2[i]=array2[array2.length-1-i];
                System.out.println(array2[i]);

            }
        }
    }
