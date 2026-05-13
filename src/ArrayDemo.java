public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrname = new int[10];
        arrname[0]=12;
        arrname[1]=10;
        arrname[4]=11;
        /*arrname[8]=9;
        System.out.println(arrname[5]);

        int[] arr1={14,78,56,656,656,768909,345465,218,9};
        System.out.println(arr1[8]);*/
        //  //game score
        int[] gamesScore ={10000000,700,600,4000};
        int highestScore1stplace =gamesScore[0];
        int highestScoreNot1stpalce =gamesScore[0];
        int minumumScore=gamesScore[0];
        for(int highscore:gamesScore){
            if(highscore>highestScore1stplace&&highscore==highestScore1stplace){
                highestScore1stplace=highscore;
                System.out.println("this is the highest and present in first" + highestScore1stplace);
            }
            if(highscore>highestScoreNot1stpalce){
                highestScoreNot1stpalce=highscore;


            }
            if(highscore<minumumScore){
               minumumScore=highscore;

            }

        }
        System.out.println("this is highest " +highestScoreNot1stpalce);
        System.out.println("this is the minimum" +minumumScore);


    }


}
