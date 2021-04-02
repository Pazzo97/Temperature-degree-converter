package com.pazzo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        char inputType;
        char outputType;
        float inputValue;
        float returnValue;


        System.out.print("Input type(F/C/K): ");
        inputType = scanner.next().charAt(0);

        System.out.print("Output type(F/C/K): ");
        outputType = scanner.next().charAt(0);

        System.out.print("Temperature: ");
        inputValue = scanner.nextFloat();


        switch (inputType) {

            case 'F':
                inputValue = fToC(inputValue);
                break;

            case 'C':
                break;

            case 'K':
                inputValue = fToC(kToF(inputValue));
                break;

            default:
                System.exit(1);
        }


        switch (outputType) {

            case 'F':
                inputValue = kToF(cToK(inputValue));
                break;

            case 'C':
                break;

            case 'K':
                inputValue = cToK(inputValue);
                break;

            default:
                System.exit(1);

        }


        System.out.println(inputValue);

    }

    public static float fToC(float fValue) {

        return ((fValue - 32.0f) * 5.0f) / 9.0f;

    }

    public static float kToF(float kValue) {

        return (((kValue - 273.15f) * 9.0f) / 5.0f) + 32.0f;

    }

    public static float cToK(float cValue) {

        return cValue + 273.15f;

    }

}
