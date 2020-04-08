
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315040 김선민, 2017315038 이수정) 
 * @version (2020.04.07)
 */
import java.util.Random;
public class MyApp
{
//    public String signal;
//    public double speed = 1;
   
    public double speed = 1;
    public void RobotWalk(double speed)
    {
        Random sRandom = new Random();
        String[] s = {"green", "yellow", "red"};
        int signal = sRandom.nextInt(s.length);
        if (signal == 0){
            if(signal == 1){
                speed = speed * 1.2;
            }
        }
        else{
            speed = 0;
        }
        return speed;
    }
     public static void main(String[] args)
    {
        System.out.print();
    }
}
