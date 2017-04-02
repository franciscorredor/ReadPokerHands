/**
 * 
 */
package com.wirelesssoft.main;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class TakePorcentajeGamers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter something : ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

        scanner.close();
	}

}
