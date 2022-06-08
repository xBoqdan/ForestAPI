package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Tree {
    protected int _age;
    protected float _trunkWidth;
    protected float _height;
    protected boolean _isHealthy;
    protected boolean _isGivingFruitsNow;
    protected String _type;
    protected String _species;
    protected List<String> _typeOfBirdsLivingOnTheTree;

    public Tree(){
        //podczas sadzenia sadzonki drzewa, ma ono około 10cm wysokości i 1cm przekroju pnia, może na nim usiąść najwyżej mały wróbel
        this._age = 0;
        this._trunkWidth = 0.01F;
        this._height = 0.1F;
        this._isHealthy = true;
        this._isGivingFruitsNow = false;
        this._typeOfBirdsLivingOnTheTree = new ArrayList<>();
        _typeOfBirdsLivingOnTheTree.add("Mały Wróbelek");
    }

    public void Grow(float numberOfMeters){
        _height += numberOfMeters;
    }

    public abstract boolean _isSheddingLeavesForWinter();

    public String toString(){
        return "\nRodzaj: " + _type + "\nGatunek: " + _species + "\nWiek: " + _age + "\nWysokość: " + _height + " metra\nPrzekrój pnia: " + _trunkWidth + " metra\nJest zdrowe: " + _isHealthy + "\nCzy obecnie daje owoce: "
                + _isGivingFruitsNow + "\nPtaki żyjące na drzewie: " + _typeOfBirdsLivingOnTheTree.toString() + "\nZrzuca liście na zimę: " + _isSheddingLeavesForWinter();

    }

}
