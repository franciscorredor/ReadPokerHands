/**
 * 
 */
package com.wirelesssoft.main;

import java.util.Scanner;

import com.wirelesssoft.object.GamePercentage;

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
		
		GamePercentage g1 = new GamePercentage("1 Ganer	01 Franco");
		GamePercentage g2 = new GamePercentage("2 Gamer 02 Izq	");
		GamePercentage g3 = new GamePercentage("3 Gamer 03 LEFT	");
		GamePercentage g4 = new GamePercentage("4 Gamer 04 CENT");
		GamePercentage g5 = new GamePercentage("5 Gamer 05 Der	1");
		GamePercentage g6 = new GamePercentage("6 Gamer 06 LAST	");
		
		
        while (true) {

            System.out.print("--> ");
            String input = scanner.nextLine();
            
            Integer entrada = null;
            
            try{entrada = Integer.parseInt(input);
            }catch (NumberFormatException nfe){entrada = 999;System.out.println("---");}
            
            
            switch (entrada) {
			case 1:
				 g1.setWins(g1.getWins()+1);
				 g2.setLoses(g2.getLoses()+1);
				 g3.setLoses(g3.getLoses()+1);
				 g4.setLoses(g4.getLoses()+1);
				 g5.setLoses(g5.getLoses()+1);
				 g6.setLoses(g6.getLoses()+1);
				break;
			case 2:
				 g1.setLoses(g1.getLoses()+1);
				 g2.setWins(g2.getWins()+1);
				 g3.setLoses(g3.getLoses()+1);
				 g4.setLoses(g4.getLoses()+1);
				 g5.setLoses(g5.getLoses()+1);
				 g6.setLoses(g6.getLoses()+1);
				break;	
			case 3:
				 g1.setLoses(g1.getLoses()+1);
				 g2.setLoses(g2.getLoses()+1);
				 g3.setWins(g3.getWins()+1);
				 g4.setLoses(g4.getLoses()+1);
				 g5.setLoses(g5.getLoses()+1);
				 g6.setLoses(g6.getLoses()+1);
				break;	
			case 4:
				 g1.setLoses(g1.getLoses()+1);
				 g2.setLoses(g2.getLoses()+1);
				 g3.setLoses(g3.getLoses()+1);
				 g4.setWins(g4.getWins()+1);
				 g5.setLoses(g5.getLoses()+1);
				 g6.setLoses(g6.getLoses()+1);
				break;
			case 5:
				 g1.setLoses(g1.getLoses()+1);
				 g2.setLoses(g2.getLoses()+1);
				 g3.setLoses(g3.getLoses()+1);
				 g4.setLoses(g4.getLoses()+1);
				 g5.setWins(g5.getWins()+1);
				 g6.setLoses(g6.getLoses()+1);
				break;
			case 6:
				 g1.setLoses(g1.getLoses()+1);
				 g2.setLoses(g2.getLoses()+1);
				 g3.setLoses(g3.getLoses()+1);
				 g4.setLoses(g4.getLoses()+1);
				 g5.setLoses(g5.getLoses()+1);
				 g6.setWins(g6.getWins()+1);
				break;
			case 9:
				 g1.setLoses(0);
				 g2.setLoses(0);
				 g3.setLoses(0);
				 g4.setLoses(0);
				 g5.setLoses(0);
				 g6.setLoses(0);
				 g1.setWins(0);				 
				 g2.setWins(0);
				 g3.setWins(0);
				 g4.setWins(0);				 
				 g5.setWins(0);
				 g6.setWins(0);
				break;
			default:
				System.out.println("No hay atividad....");
				break;
			} 

            
            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            //System.out.println("input : " + input);
            //System.out.println("-----------\n");
            System.out.println(g1.getPorcenaje());
            System.out.println(g2.getPorcenaje());
            System.out.println(g3.getPorcenaje());
            System.out.println(g4.getPorcenaje());
            System.out.println(g5.getPorcenaje());
            System.out.println(g6.getPorcenaje());
        }

        scanner.close();
	}

}
