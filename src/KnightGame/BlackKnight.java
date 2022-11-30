package KnightGame;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BlackKnight implements Comparable<BlackKnight> {
    private static Integer arms = 2;
    private static Integer legs = 2;
    private static Integer head = 1;
    private static Boolean alive = true;
    private String name;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;
    public static BlackKnight[] allKnights = new BlackKnight[10];




    public static void main(String[] args){
        System.out.println("Please enter the name of the BlackKnight");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        BlackKnight knight = new BlackKnight(nameInput);
        allKnights[0] = knight;
        BlackKnight.numOfAliveKnights++;

        allKnights[0].strike();
        System.out.println(allKnights[0].toString());

    }

    public BlackKnight(String name){
        this.name = name;
    }


    public static void cutOffArm() {
        if (arms == 1) {
            System.out.println("You have no more arms! But legs are there!");
            arms--;
        } else if (arms == 2) {
            System.out.println("It's OK! One arm left! 2 legs left!");
            System.out.println(arms);
            arms--;
            System.out.println(arms);
        } else {
            System.out.println("There is no more arms, I'm cutting your first leg");
            cutOffLeg();
        }
    }



    public static void cutOffLeg(){
        if(legs == 2){
            System.out.println("Beware! 1 leg is left only!");
            legs--;
        } else if (legs == 1){
            System.out.println("You have no more arms and legs! Beware! Only head is there...");
            legs--;
        } else {
            System.out.println("There is no more arms and legs, I'm cutting your HEAD!");
            cutOffHead();
        }
    }

    public static void cutOffHead(){
        if(head == 1){
            System.out.println("Say goodbye to your head! HA-HA!!!");
            head--;
            alive = false;
            numOfDeadKnights++;
            numOfAliveKnights--;
        } else {
            System.out.println("You have no more arms and legs! Beware! Only head is there...");
        }
    }

    public static void strike() {
        if (alive) {
            cutOffArm();
        } else {
            System.out.println("He is already dead...");
        }
    }

    @Override
    public String toString(){
        return "BlackKnight { " +
                "\nname: " + name +
                "\narms: " + arms +
                "\nlegs: " + legs +
                "\nhead: " + head +
                "\nalive: " + alive + "}";
    }

    public String getName(){
        return this.name;
    }

    public static Integer getArms() {
        return arms;
    }

    public static Integer getLegs() {
        return legs;
    }

    public static Integer getHead() {
        return head;
    }

    public static Boolean getAlive() {
        return alive;
    }

    @Override
    public boolean equals (Object o){
        if(this == o) return true; //check for self
        if(o == null || getClass() != o.getClass()) return false;
        BlackKnight knight = (BlackKnight) o;

        return (arms == knight.getArms()) &&
                (legs == knight.getLegs()) &&
                (head == knight.getHead()) &&
                (alive == knight.getAlive()) &&
                (name.toLowerCase().equals(knight.getName().toLowerCase()));
    }

    @Override
    public int hashCode(){
        int result = 31 * (name.toLowerCase().hashCode() +
                ((Integer) arms).hashCode() +
                ((Integer) legs).hashCode() +
                ((Integer) head).hashCode() +
                ((Boolean) alive).hashCode());

        return result;
    }

    @Override
    public int compareTo(BlackKnight knight){
        return this.name.charAt(0) - knight.getName().charAt(0);

    }




    // actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
}
