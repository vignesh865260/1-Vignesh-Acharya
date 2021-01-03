import ch.aplu.robotsim.*;
public class TorchFollower {
    
    TorchFollower(){
        LegoRobot robot = new LegoRobot();
        LightSensor lsfr = new LightSensor(SensorPort.S1, true);
        LightSensor lsfl = new LightSensor(SensorPort.S2, true);
        LightSensor lsrr = new LightSensor(SensorPort.S3, true);
        LightSensor lsrl = new LightSensor(SensorPort.S4, true);
        
        Gear gear = new Gear();
        robot.addPart(gear);
        robot.addPart(lsfr);
        robot.addPart(lsfl);
        robot.addPart(lsrr);
        robot.addPart(lsrl);
        
        gear.setSpeed(25);
        gear.forward();
        double s = 0.02;
        
        while(!robot.isEscapeHit()){
            int vfr = lsfr.getValue();
            int vfl = lsfl.getValue();
            int vrr = lsrr.getValue();
            int vrl = lsrl.getValue();
            
            double d = 1.0*(vfl-vfr) / (vfl+vfr);
            
            if(vrl+vrr > vfl+vfr){
                gear.left();
            }else if(d >-s && d< s){
                gear.forward();
            }else{
                if(d >=s){
                    gear.leftArc(0.05);
                }else{
                    gear.rightArc(0.05);
                }     
            }
            Tools.delay(100);
        }
          robot.exit();
    }
    
    public static void main(String[] args){
        TorchFollower tf = new TorchFollower();
    }
    static{
        RobotContext.useTorch(1,150,250,100);
    }
}
