package businessModel.instructions;

import businessModel.MicroController;

public abstract class Instruction {

	public void execute(MicroController micro) {
		micro.updateIP();
		micro.updateAmounRegExecuted();
	}

}
