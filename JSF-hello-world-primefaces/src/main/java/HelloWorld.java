import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloWorld {

    private boolean display = Boolean.TRUE;
    private boolean displaypart = Boolean.TRUE;
    
    
    public String showGreeting() {
        return "Hello world !!";
    }
    
    public boolean shouldDisplay(){
    	System.out.println("Should display ? "+this.display);
    	return this.display ;
    }
    
    public void toggleDisplay(){
    	System.out.println("[before]toggle display ... "+this.display);
    	this.display = !this.display;
    	System.out.println("[after]toggle display ... "+this.display);
    }
    
    public String showPart() {
        return "world !!";
    }
    
    public boolean shouldDisplayPart(){
    	System.out.println("Should display part ? "+this.displaypart);
    	return this.displaypart ;
    }
    
    public void toggleDisplayPart(){
    	System.out.println("[before]toggle display part ... "+this.displaypart);
    	this.displaypart = !this.displaypart;
    	System.out.println("[after]toggle display part ... "+this.displaypart);
    }
    
    
}
