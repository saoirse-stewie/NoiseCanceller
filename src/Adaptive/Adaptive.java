package Adaptive;

/**
 * Created by g00238234 on 01/03/2016.
 */
public class Adaptive {
    double[] filterArray;
    double[] dataArray;
    double feedback;

    public Adaptive(int filterlength, double feedback_gain)
    {
        filterArray = new double[filterlength];
        dataArray = new double[filterlength];
        this.feedback = feedback_gain;
    }
    AdaptiveResult adapt(double rawData, double target)
    {
        flowLine(dataArray,rawData);
        double output = dotProduct(filterArray, dataArray);

        double err = output - target;
        for(int ctr =0; ctr<filterArray.length;ctr++)
        {
            filterArray[ctr] -= err*dataArray[ctr]*feedback;
        }
        return new AdaptiveResult(filterArray,output,err);
    }
    void flowLine(double[] line,double val){
        for(int cnt = 0;cnt < (line.length - 1);cnt++){
            line[cnt] = line[cnt+1];
        }//end for loop
        line[line.length - 1] = val;
    }//end flowLine
    double dotProduct(double [] v1, double [] v2)
    {
        double result =0;
        if((v1.length) <= (v2.length))
        {
            for(int cnt=0;cnt<v1.length;cnt++)
            {
                result += v1[cnt]*v2[cnt];
            }
            return result;
        }else
        {
            for(int cnt=0;cnt<v2.length;cnt++)
            {
                result += v1[cnt]*v2[cnt];
            }
            return result;
        }

    }


}
class AdaptiveResult{
    public double[] filterArray;
    public double output;
    public double err;

    public AdaptiveResult(double[] filterArray, double output, double err)
    {
        this.filterArray = filterArray;
        this.err = err;
        this.output = output;
    }
}
