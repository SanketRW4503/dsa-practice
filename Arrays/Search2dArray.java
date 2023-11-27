
public class Search2dArray{

    public static void main(String[] args) {


        int [][] arr={{1,2,3},{4,5,6},{7,8,9,55}};
        
        int target=55;

        boolean ans= linearSearch(arr,target);
        System.out.println(ans);

    }

    static boolean linearSearch(int[][] arr,int target){


        for(int rows=0;rows!=arr.length;rows++){
            for(int cols =0;cols!=arr[rows].length;cols++){
                if(arr[rows][cols]==target){
                    return true;
                }
            }
        }

        return false;
    }

}