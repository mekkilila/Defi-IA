package proie_pred;

import fr.emse.fayol.maqit.simulator.configuration.IniFile;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		IniFile file = new IniFile("test.ini");
		SimProperties sp = new SimProperties(file);
		sp.simulationParams();
		sp.displayParams();
		System.out.println(sp.nbobstacle);		
		GridManagement env = new GridManagement(1234,10,10,"test",1,2,10,10,0);
		
		Simul simulation = new Simul(sp, env);
		

	}

}
