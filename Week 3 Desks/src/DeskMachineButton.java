
public class DeskMachineButton {
	
	CommandDesk button;
	
	
	public DeskMachineButton() {}
	
	
	public void setCommand(CommandDesk command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.execute();
	}

}
