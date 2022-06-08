package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] speciesOfLeafyTree = {"Dąb", "Buk", "Klon", "Brzoza", "Jarząb", "Czeremcha", "Jabłoń", "Olcha", "Grab", "Topola", "Głóg", "Lipa", "Wierzba", "Wiąz", "Wiśnia", "Jesion"};
        String[] speciesOfConiferTree = {"Sosna pospolita", "Świerk pospolity", "Sosna limba", "Jałowiec pospolity", "Cis pospolity", "Sosna kosodrzewina", "Modrzew europejski", "Jodła pospolita"};

        List<Tree> forest = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0, k, j; i < 10; i++){
            k = rand.nextInt(2);

            if(k == 0){
                //0 - create LeafyTree
                j = rand.nextInt(speciesOfLeafyTree.length);
                forest.add(new LeafyTree(speciesOfLeafyTree[j]));

            }
            else{
                // 1 - create ConiferTree
                j = rand.nextInt(speciesOfConiferTree.length);
                forest.add(new ConiferTree(speciesOfConiferTree[j]));
            }
        }

        forest.forEach((n) -> n.Grow(1));
        forest.forEach(System.out::println);
    }
}
