import java.util.Random;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */

public class MyApp
{
    public static void main(String[] args)
    {
        // Random RandomSignals = new Random();
        // String[] signals = {"green", "yellow", "red"};
        // String signal = signals[RandomSignals.nextInt(signals.length)];
        //System.out.println("Traffic light: " + signal);
        System.out.println("present speed: " + RobotWalk(signal, 20));
    }

    public static double RobotWalk(String signal, double speed)
    {
        if (signal == "green")
        {
        }
        else
        {
            if(signal == "yellow")
            {
                speed = speed * 1.2;
            }
            else        
            {
                speed = 0;
            }
        }
        return speed;
    }
}