import java.util.HashSet;
import java.util.Set;
/*Processor.java
*Created on 2018年3月25日
*/

public class Processor {
	private String name;
	private Set<String> W=new HashSet<>();
	private Set<String> previous=new HashSet<>();
	private String decision;
	private String state;
	public Processor(String n, String i){
		this.name=n;
		this.W.add(i);
		this.state="well";
		this.previous=this.W;
	}
	
	 public String getName(){
		 return name;
	 }
	
	public void addElement(String element){
		this.W.add(element);
	}
	
	public Set<String> getSet(){
		return W;
	}
	
	public int getSize(){
		return W.size();
	}
	
	public String getDecision(){
		return decision;
	}
	
	public void setDecision(String d){
		this.decision=d;
	}
	
	public String toString(){
		return name+": "+decision;
	}
	
	public boolean workWell(){
		if(this.state.equals("broken")){
			return false;
		}else{
			return true;
		}
	}
	
	public void setState(){
		this.state="broken";
	}
	
	public void setPrevious(){
		this.previous.addAll(this.W);
	}
	
	public Set<String> getPrevious(){
		return previous;
	}
	
}
