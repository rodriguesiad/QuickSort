package application;

import ordenacao.ArrayTins;

public class Laboratorio{

    public static void main(String[] args) {

        //Testando com uma classe do java
        ArrayTins<Integer> array = new ArrayTins<>();

        for(Integer i=9; i>=0; i--){
            array.add(i);
        }

        System.out.println("Array de Inteiros: \n"+array);
        array.sort();
        System.out.println(array);

        //Testando com uma classe criada e que implementa o Comparable
        ArrayTins<Diva> arrayDivas = new ArrayTins<>();

        arrayDivas.add(new Diva("Lana Del Rey", 37));
        arrayDivas.add(new Diva("Kali Uchis", 28));
        arrayDivas.add(new Diva("Melanie Martinez", 27));

        System.out.println("Array de divas: \n"+arrayDivas);
        arrayDivas.sort();
        System.out.println(arrayDivas);

    }

}