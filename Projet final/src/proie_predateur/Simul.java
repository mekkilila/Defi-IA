package proie_predateur;

import fr.emse.fayol.maqit.simulator.SimFactory;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;
import fr.emse.fayol.maqit.simulator.environment.GridEnvironment;
import fr.emse.fayol.maqit.simulator.components.Obstacle;
import fr.emse.fayol.maqit.simulator.components.Turtlebot;
import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;

public class Simul extends SimFactory {
	
	public Simul(SimProperties sp, GridManagement environment) {
		super(sp,environment);
	}

	GridEnvironment grid = new GridEnvironment(environment.getRows(),environment.getColumns());
	String name = "schoon";
	int field = 2;
	
	public void schedule() {
		for (Agent bot : (Agent) lrobot) {
			bot.getPerception();
			int [] place = bot.pos;
			int content = grid.getCellContent(place[0],place[1]);
			bot.move(sp.step);
			int [] nv_place = bot.getLocation();
			this.updateEnvironment(place, nv_place, content);
		}
	}

	@Override
	public void createObstacle(int[] color) {
		// TODO Auto-generated method stub
		int[] place = this.environment.getPlace();
		Obstacle obs = new Obstacle(idObstacle, place);
		addNewComponent(obs);
		lobstacle.add(obs);
		environment.addComponent(place, idObstacle, color);
	}

			
	@Override
	public void createTurtlebot() {
		// TODO Auto-generated method stub
		int[] place = this.environment.getPlace();
		Agent bot = new Agent(idRobot,name,field,0,place,environment.getRows(),environment.getColumns());
		addNewComponent(bot);
		lrobot.add(bot);
		environment.addComponent(place, idRobot);
	}

	@Override
	public void createTurtlebot(int[] color) {
		// TODO Auto-generated method stub
		int[] place = this.environment.getPlace();
		Agent bot = new Agent(idRobot,name,field,0,place,environment.getRows(),environment.getColumns());
		addNewComponent(bot);
		lrobot.add(bot);
		environment.addComponent(place, idRobot,color);
	}

	@Override
	public void createObstacle() {
		// TODO Auto-generated method stub
		int[] place = this.environment.getPlace();
		Obstacle obs = new Obstacle(idObstacle, place);
		addNewComponent(obs);
		environment.addComponent(place, idObstacle);
	}
	
}
