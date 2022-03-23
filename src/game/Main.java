package game;

public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("Prathmesh","Ak-47",200);
		
		player.damageByGun1();
		player.damageByGun1();
		player.heal();
		
		Player2 betterPlayer= new Player2("Google","Machine Gun",100,true);
		}

}
