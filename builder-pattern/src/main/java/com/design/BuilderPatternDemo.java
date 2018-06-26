package com.design;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("\nTotal Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nnon veg meal:");
        nonVegMeal.showItems();
        System.out.print("\nTotal Cost:" + nonVegMeal.getCost());
        StringBuffer s = new StringBuffer();
    }
}
