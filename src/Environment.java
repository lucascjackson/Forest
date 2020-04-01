import java.util.ArrayList;
import java.util.List;

public class Environment {

	public List<Visual> visuals; 
	
	public Environment() {
		
		visuals = new ArrayList<Visual>(); 
	}
	
	public void addVisual(Visual visual) {
		visuals.add(visual);
		
		
	}	
}
