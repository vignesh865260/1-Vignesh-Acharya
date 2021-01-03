import ch.aplu.robotsim.*;
public class Square {
    
    Square(){
        
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.setSpeed(100);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        Tools.delay(2000);
        robot.exit();
        
    }
    
    public static void main(String[] args){
        new Square();
    }
    
}
