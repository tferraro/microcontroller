package businessModel.state;

import businessModel.MicroController;
import businessModel.Program;

public enum LoadState implements ControllerState {
	INSTANCE;

	@Override
	public void load(MicroController micro, Program program) {
		micro.loadProgram(program);
	}

	@Override
	public void start(MicroController micro) {
		micro.clearMicro();
		micro.setState(StartState.INSTANCE);
	}

}
