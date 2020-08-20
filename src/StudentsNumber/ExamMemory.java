package StudentsNumber;


import java.util.Scanner;

public class ExamMemory {
    static Scanner console = new Scanner(System.in);

    // THIS CLASS GOING TO SAVE NUMBER AND HOLD THEM
    // 9 MINUTES 
    private float[] scores;



    public void getExamData(){
        System.out.println("HOW MANNY STUDENTS TOOK THE EXAM ");
        scores = new float[console.nextInt()];
        for( int i = 1 ;i < scores.length ;i++ ){
            System.out.println("SCORE FOR STUDENT" + (i) +": ");
            scores[i] = console.nextFloat();
        }
    }

    public void showStats(){
        if (scores.length >0){

            System.out.println("-------------------------");
            System.out.println("STUDENTS " + " \t\t" + "SCORES" );
            for(int i = 0 ; i <scores.length ; i++ )
                System.out.println((i+1) + "\t\t" + scores[i]);
            System.out.println("MINSCORE  " +  findMin());
            System.out.println( "MAX SCORE IS"+ findMax());
            System.out.println();
            double mean = computeMean();
            System.out.println(mean + " MEAN ");
        }
        else
            System.out.println("NO STUDENTS SYCJ AS ");
    }

    public float findMin(){
        Float minScore = scores[0];
        for(int i = 0 ; i <scores.length ; i++){
            if(scores[i] <minScore)
                minScore = scores[i];

        }
        return minScore;
    }

    public float findMax(){
        Float maxScore = scores[0];
        for(int i = 0 ; i<scores.length ; i++){
            if (scores[i] >maxScore)
                maxScore = scores[i];
        }
        return maxScore;
    }

    public double computeMean(){
        double sum = 0;
        for (int i = 0 ; i < scores.length ; i++)
            sum = sum +scores[i];

        return sum / (double)scores.length;
    }

    public double computeStandardDev(){return 0;}

}
