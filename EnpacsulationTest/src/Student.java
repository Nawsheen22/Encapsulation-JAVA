
public class Student {
	
	private String name;
	private String ID;
	private String Program;
	private String Major;
	
	
   void	setName(String Name){
		this.name=Name;
		
	}
	void setID(String ID) {
		
		this.ID=ID;
		}
	 
	void setprogram(String Program) {
		
		this.Program=Program;
	}
	void setmajor(String Major) {
		
		this.Major=Major;
	}
	
	
   String getName() {
	   
	   return name;// variable 
	   
   }
	String getID() {
		
		return ID;
	}
	String getprogram () {
		
		return Program;
		
	}
	
	String getmajor() {
		
		return Major;
	}
	

}
