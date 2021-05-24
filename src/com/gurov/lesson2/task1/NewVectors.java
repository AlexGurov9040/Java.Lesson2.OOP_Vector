package com.gurov.lesson2.task1;
import java.util.Scanner;

public class NewVectors {

    public static void main(String[] args) {

        NewVectors app = new NewVectors();
        app.startVectors();//application start in method startVector
    }

    public static void startVectors(){

        try{
            System.out.println("Enter the number of vectors from 1 to 10");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n < 1 || n > 10){
                throw new Exception("Wrong! The possible number of vectors is from 1 to 10.");
            }
            Vector[] masVector = Vector.MasVectorGen(n);
            System.out.println("Received vectors:");
            for (int i=0;i<n;i++){
                System.out.println(i+1+" Vector: "+masVector[i].DisplayVector());//output of the received vectors
            }
            try{
                System.out.println("Enter the numbers of any 2-th vectors (from 1 to "+n+")");
                int firstVector = in.nextInt();
                int secondVector = in.nextInt();
                if (firstVector < 1 || firstVector > n || secondVector < 1 || secondVector > n){
                    throw new Exception("Wrong! The vector numbers you entered are not in the list.");
                }
                System.out.printf("Length of the %d vector: %.3f\n",firstVector,masVector[firstVector-1].VectorLength());
                System.out.printf("Length of the %d vector: %.3f\n",secondVector,masVector[secondVector-1].VectorLength());
                System.out.printf("Scalar multiplication of %d and %d vectors: %d\n",firstVector,secondVector,masVector[firstVector-1].ScalarMultiplication(masVector[secondVector-1]));
                System.out.printf("Vector multiplication of %d and %d vectors: %s\n",firstVector,secondVector,(masVector[firstVector-1].VectorMultiplication(masVector[secondVector-1])).DisplayVector());
                System.out.printf("The angle between vectors %d and %d: %.3f\n",firstVector,secondVector,masVector[firstVector-1].AngleBetweenVectors(masVector[secondVector-1]));
                System.out.printf("Adding vectors %d and %d: %s\n",firstVector,secondVector,(masVector[firstVector-1].AddingVectors(masVector[secondVector-1])).DisplayVector());
                System.out.printf("Subtracting vectors %d and %d: %s\n",firstVector,secondVector,(masVector[firstVector-1].SubtractingVectors(masVector[secondVector-1])).DisplayVector());
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}