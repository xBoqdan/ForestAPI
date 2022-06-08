package com.company;

public class LeafyTree extends Tree{
    protected int _numberOfLeaves;

    public LeafyTree(String _species){
        this._species = _species;
        this._numberOfLeaves = 0;
        this._type = "Liściaste";
    }

    @Override
    public boolean _isSheddingLeavesForWinter(){
        return true;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIlość liści: " + _numberOfLeaves + "\n";
    }

}
