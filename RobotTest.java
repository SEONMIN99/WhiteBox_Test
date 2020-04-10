
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */

public class RobotTest
{
    public static void main(String[] args)
    {
        System.out.println("Traffic light: " + "녹색");
        System.out.println("present speed: " + Robot.RobotWalk("녹색", 20));
        
        System.out.println("Traffic light: " + "노란색");
        System.out.println("present speed: " + Robot.RobotWalk("노란색", 20));
        
        System.out.println("Traffic light: " + "빨간색");
        System.out.println("present speed: " + Robot.RobotWalk("빨간색", 20));
    }
}