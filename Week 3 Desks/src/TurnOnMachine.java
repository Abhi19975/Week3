
public class TurnOnMachine implements CommandDesk {
	
	DeskCommand desks;
	public TurnOnMachine(DeskCommand desks)
	{
		this.desks=desks;
	}
	public void execute()
	{
		desks.turnOnMachine();
	}

}
