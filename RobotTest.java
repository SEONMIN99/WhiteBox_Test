
/**
 * RobotWalk를 test하는 메소드
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */

public class RobotTest
{
    public static void main(String[] args)
    {
        System.out.println("Statement Coverage test");
        System.out.println("신호: 녹색, " + "속도:" + Robot.RobotWalk("녹색", 20));
        System.out.println("신호: 노란색, " + "속도:" + Robot.RobotWalk("노란색", 20));
        System.out.println("신호: 빨간색, " + "속도:" + Robot.RobotWalk("빨간색", 20));
        
        System.out.println("Decision Coverage test");
        System.out.println("신호: 노란색, " + "속도:" + Robot.RobotWalk("노란색", 20));
        System.out.println("신호: 빨간색, " + "속도:" + Robot.RobotWalk("빨간색", 20));
    }
}