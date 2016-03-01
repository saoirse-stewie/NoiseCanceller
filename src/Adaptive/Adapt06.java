package Adaptive;

/**
 * Created by g00238234 on 01/03/2016.
 */
public class Adapt06 {

    public static void main(String[] args)
    {
        double feedback = 0.0002;
        int iterations = 1000;
        int filterlength = 2;

        new Adapt06().process(feedback, iterations,filterlength);

    }
    void process(double feedback, int iterations, int filterlength)
    {
        Adaptive a = new Adaptive(filterlength,feedback);
       // PlotALot05 plotObj = new PlotALot05(
              //  "Time Series",460,155,25,5,4,4);



    }
}
