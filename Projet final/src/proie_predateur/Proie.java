package proie_predateur;


import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;
import fr.emse.fayol.maqit.simulator.components.Orientation;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class Proie extends GridTurtlebot {

	public Proie(int id, String name, int field, int debug, int[] pos, int r, int c) {
		super(id, name, field, debug, pos, r, c);
		// TODO Auto-generated constructor stub
	}


	SimProperties sp;
	int [] pos = this.getLocation();
	GridManagement env = new GridManagement(sp.seed,rows,columns,sp.debug);
	Agent pred = new Agent (id,name,field,debug,pos,sp.rows,sp.columns);
	
	
	@Override
	public void move(int arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
