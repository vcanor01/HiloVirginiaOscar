package ejercicioHilos;


public class Starter {

	public static void main(String[] args) {
		World world=new World(new WorldViewConsle());
		world.makeHistory();
		
	}

}
