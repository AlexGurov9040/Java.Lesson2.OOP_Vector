package com.gurov.lesson2.task1;

public class Vector {

    private int x;
    private int y;
    private int z;

    Vector(int x,int y,int z){

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] MasVectorGen(int n){
        Vector[] masVector = new Vector[n];
        for (int i=0;i<n;i++){
            masVector[i] = new Vector(-10+(int)Math.round(Math.random()*20),-10+(int)Math.round(Math.random()*20),-10+(int)Math.round(Math.random()*20));
        }
        return masVector;
    }

    public String DisplayVector(){

        return "x="+x+" y="+y+" z="+z;
    }

    public float VectorLength(){

        return (float)Math.sqrt(x*x+y*y+z*z);
    }

    public int ScalarMultiplication(Vector vector){

        return x* vector.x+y* vector.y+z* vector.z;
    }

    public Vector VectorMultiplication(Vector vector){

        return new Vector(y* vector.z-z* vector.y,z* vector.x-x* vector.z,x* vector.y-y* vector.x);
    }

    public float AngleBetweenVectors(Vector vector){

        return (float)ScalarMultiplication(vector)/(Math.abs(VectorLength())*Math.abs(vector.VectorLength()));
    }

    public Vector AddingVectors(Vector vector){

        return new Vector(x+ vector.x,y+ vector.y,z+ vector.z);
    }

    public Vector SubtractingVectors(Vector vector){

        return new Vector(x- vector.x,y- vector.y,z- vector.z);
    }
}
