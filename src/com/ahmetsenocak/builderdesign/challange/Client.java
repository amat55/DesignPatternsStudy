package com.ahmetsenocak.builderdesign.challange;

public class Client {
    public static void main(String[] args) {
        System.out.println("Meal Challenge");

        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegBuilder = new nonVegMealBuilder();

        //Veg Meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total cost: " + vegMeal.getCost());

        //Non Veg Meal
        director.construct(nonVegBuilder);
        Meal nonVegMeal = nonVegBuilder.getMeal();
        System.out.println("\nNon Veg Meal");
        nonVegMeal.showItem();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
