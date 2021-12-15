import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class EmmettBickerScratch{

	//I do not know what I am doing, nor how to link these motors to the actual motors but I'm
	//Praying it magically works with plugging it in

	public static void runCommand()
	{

	//TalonSRX(int channel) -> Channel ID, assign channel ID1?
	WPI_TalonSRX talon = new WPI_TalonSRX(1);
	//CANSparkMax​(int deviceID, CANSparkMaxLowLevel.MotorType type)
	CANSparkMax spark = new CANSparkMax(1, MotorType.kBrushless);

	//Set speed of the PWM to 200 
	talon.set(200.0);
	
	//Talon gets
	System.out.println("Position: " +talon.getPosition());
	System.out.println("Raw: " +talon.getRaw());
	System.out.println("Raw Bounds: " + talon.getRawBounds());
	System.out.println("Speed: " +talon.getSpeed());
	System.out.println("Channel: " +talon.getChannel());
	System.out.println("SmartDashBoardType: " + talon.getSmartDashboardType());
	System.out.println("Table: " + talon.getTable());
	System.out.println("Expiration: " + talon.getExpiration());
	System.out.println("Description: " + talon.getDescription());
	talon.disable();

	System.out.print("\n\n\n");

	//CANSparkMax
	//set​(double speed)
	spark.set(200.0);
	
	//double	get()	Common interface for getting the current set speed of a speed controller
	System.out.println("Speed: " + spark.get());
	// No desc
	System.out.println("Applied Output: " + spark.getAppliedOutput());
	System.out.println("Bus Voltage: " + spark.getBusVoltage());
	//Get the configured closed loop ramp rate This is the maximum rate at which the motor controller's output is allowed to change.
	System.out.println("Closed Loop Ramp Rate: " + spark.getClosedLoopRampRate());
	System.out.println("Inverted: " +spark.getInverted());
	//Get the configured open loop ramp rate This is the maximum rate at which the motor controller's output is allowed to change.
	System.out.println("Open Loop Ramp Rate: " + spark.getOpenLoopRampRate());
	System.out.println("MotorTemp: " + spark.getMotorTemperature());
	System.out.println("Output Current(?): " + spark.getOutputCurrent());
	System.out.println("Description: " + spark.getDescription());


	}


}
