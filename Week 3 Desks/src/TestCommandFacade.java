
public class TestCommandFacade {

	public static void main(String[] args) {
		
		
		
		DeskMachineButton deskbutton = new DeskMachineButton();
		DeskCommand desk = new DeskCommand();
		DeskFacade  cf = new DeskFacade ();
		
		deskbutton.setCommand(new TurnOnMachine(desk));
		deskbutton.buttonPressed();
		cf.startMaking();
		
		deskbutton.setCommand(new TurnOffMachine(desk));
		deskbutton.buttonPressed();		
		cf.stopMaking();;
		

	}

}
