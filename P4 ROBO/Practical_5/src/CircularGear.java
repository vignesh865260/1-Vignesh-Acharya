import ch.aplu.robotsim.*;
public class CircularGear {
    
    CircularGear(){
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.forward(200);
        gear.setSpeed(20);
        gear.leftArc(0.2,7000);
        gear.forward(200);
        gear.leftArc(0.2,7000);
        gear.forward(200);
        gear.leftArc(0.2,7000);
        gear.forward(200);
        gear.leftArc(0.2,7000);
        gear.forward(200);
        robot.exit();
    }
    
    public static void main(String[] args){
       CircularGear m = new CircularGear();
       NxtContext.setStartPosition(250, 200);
       NxtContext.setStartDirection(90);
    }
    
}
