package com.company;

public class ConiferTree extends Tree{
    protected int _numberOfNeedles;

    public ConiferTree(String _species){
        this._species = _species;
        this._numberOfNeedles = 0;
        this._type = "Iglaste";
    }

    @Override
    public boolean _isSheddingLeavesForWinter(){
        //tylko modrzew zrzuca igły na zimę
        return !this._species.equals("Modrzew europejski");
    }

    @Override
    public String toString(){
        return super.toString() + "\nIlość igieł: " + _numberOfNeedles + "\n";
    }
}
