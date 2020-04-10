
/**
 * 여기에 Robot 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
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
