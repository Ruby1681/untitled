package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //echo();
        City Seattle = new City(30,20);
        //System.out.println(Seattle.popDensity(30, 20));
       City Portland = new City(30,20);
       Portland.plague();
       System.out.println(Portland.population);
       //System.out.println(Seattle.popDensity(30, 20));
        System.out.println("test");

    }
    public static void echo() {
        Scanner asdf = new Scanner(System.in);
        String line = asdf.nextLine();
        System.out.println(line);
    }
    public static class City{
        double population;
        int size;

        public City(int population, int size){
            this.population = population;
            this.size = size;

        }

        public void plague(){
            population = population*2/3;
        }
        public double popDensity( int population, int size){
            double populationDensity = population*1.0/size;
            System.out.println(populationDensity);
            return populationDensity;
        }
        public void annex(City city){
            this.population = this.population+city.population;
        }
    }
}

