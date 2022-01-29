public class TurnOffMachine implements CommandDesk {
	
	DeskCommand desks;
	public TurnOffMachine(DeskCommand desks)
	{
		this.desks=desks;
	}
	public void execute()
	{
		desks.turnOffMachine();;
	}

}