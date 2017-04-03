package com.wirelesssoft.object;

/**
 * @author HP
 *
 */
public class GamePercentage {
	

	private String name;
	
	private int Loses;
	
	private int Wins;
	
	public GamePercentage(String name){
		this.name = name;
	}
	
	
	//---------------------------
	//logica q implemmta el porcentaje
	//--------------------------
	
	public String getPorcenaje(){
		if ((Wins+Loses) == 0){
			return "N/A";
		}
		return  name + " 	:	" + String.valueOf( (double) ((double)(1*Wins)/(Wins+Loses))*100 ) + "%";
	}
	
	
	//------------------------
	//Getters and Settes
	//------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLoses() {
		return Loses;
	}

	public void setLoses(int loses) {
		Loses = loses;
	}

	public int getWins() {
		return Wins;
	}

	public void setWins(int wins) {
		Wins = wins;
	}
	
}
