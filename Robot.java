
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */
public class Robot
{
     static double RobotWalk(String signal, double speed)
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
