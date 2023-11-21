package com.teachmeskills.homework.lesson7.task1;

import com.teachmeskills.homework.lesson7.task1.position.Accountant;
import com.teachmeskills.homework.lesson7.task1.position.ChiefExecutiveOfficer;
import com.teachmeskills.homework.lesson7.task1.position.IPosition;
import com.teachmeskills.homework.lesson7.task1.position.Worker;

import java.util.Scanner;

public class PositionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code of the position: ");
        String positionCode = scanner.nextLine();

        IPosition position;

        switch (positionCode){
            case "CEO":
                position = new ChiefExecutiveOfficer();
                break;
            case "W":
                position = new Worker();
                break;
            case "A":
                position = new Accountant();
                break;
            default:
                System.out.println("No such position");
                return;
        }

        position.displayPosition();
    }
}
