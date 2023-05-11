package proie_predateur;

import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;
import fr.emse.fayol.maqit.simulator.components.Orientation;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class Agent extends GridTurtlebot {

	public Agent(int id,String name,int field,int debug, int[] pos, int r, int c) {
		super(id,name,field,debug,pos,r,c);
	}
	
	
	SimProperties sp;
	int [] pos = this.getLocation();
	GridManagement env = new GridManagement(sp.seed,rows,columns,sp.debug);
	Agent pred = new Agent (id,name,field,debug,pos,sp.rows,sp.columns);
	
	@Override
	public void move(int step) {
		// TODO Auto-generated method stub
		if ((pred.orientation == Orientation.up)&&(env.validPosition(pos[0]-step,pos[1]))){
			this.setX(pos[0]-step);
		}
		if ((pred.orientation == Orientation.down)&&(env.validPosition(pos[0]+step,pos[1]))){
			this.setX(pos[0]+step);
		}
		if ((pred.orientation == Orientation.left)&&(env.validPosition(pos[0],pos[1]-step))){
			this.setY(pos[1]-step);
		}
		if ((pred.orientation == Orientation.right)&&(env.validPosition(pos[0],pos[1]+step))){
			this.setY(pos[1]+step);
		}
	}

}
