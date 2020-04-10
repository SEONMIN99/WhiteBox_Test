
/**
 * 로봇 보행속도를 변경하는 메소드
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */
public class Robot
{
     static double RobotWalk(String signal, double speed)
    {
        if (signal == "녹색")
        {
        }
        else
        {
            if(signal == "노란색")
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
