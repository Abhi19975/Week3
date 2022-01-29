
public class DeskFacade {
	
	
	private Machine machine;
	private AssembleParts assemble;
	
	public DeskFacade()
	{
		machine = new Machine();
		assemble = new AssembleParts();
	}
	
	public void startMaking()
	{
		machine.on();
		assemble.start();
	}
	
	public void stopMaking()
	{
		assemble.completed();
		machine.off();
	}
	
	

}
