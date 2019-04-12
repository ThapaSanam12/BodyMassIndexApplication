package com.e.bodymassindexapplication;

public class BMI_Sanam {
    private double height,weight;

    public BMI_Sanam(double height,double weight){
        this.height=height;
        this.weight=weight;

    }
    public double calculate(){
        return weight / (height/100 * height/100);
    }
}
