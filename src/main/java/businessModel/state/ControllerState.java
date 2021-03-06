package businessModel.state;

import businessModel.MicroController;
import businessModel.Program;

public interface ControllerState {

	void load(MicroController micro, Program program);

	void start(MicroController micro);

	void execute(MicroController micro);

	void step(MicroController micro);

	void stop(MicroController micro);

	void stepBack(MicroController microController);

}
