package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KG_PER_POUNDS = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        System.out.print("Enter your weight in pounds(lbs): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches(inch): ");
        double height = input.nextDouble();

        //Converting values to metric system
        double weightInKilograms =  weight * KG_PER_POUNDS;
        double heightInMeters = height * METER_PER_INCH;

        //Computing BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("You BMI is: " + NumberFormat.getInstance().format(bmi));
        if(bmi<18.5)
            System.out.println("You are Underweight!");
        else if(bmi<25)
            System.out.println("You are Normal");
        else if(bmi<30)
            System.out.println("You are Overweight!");
        else
            System.out.println("You are Obese!!!");
    }
}
