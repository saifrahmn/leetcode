/* 
    the following code takes a huge amount of time to execute. 
    Hence the code is flawed.
*/
public class trappingwater {
    public static int solution(int[] height){
        int v=-1,grt=0;
        int j=0,p=0,sum=0,count=0;
        
        //first to find greatest number
        for(int i=0;i<=height.length-1;i++){
            if(v<height[i]){
                v=height[i];
                j=i;
                grt= i;
            }
        }
        //to find the mid
        int mid=(height.length-1)/2;
        //to find the second greatest number
        
        if(mid<j){
            while(height[j]!=0){
                count=0;
                v=-1;
                int sub=0;
                for(int i=0;i<j;i++){
                    if(v<height[i]){
                        v=height[i];
                       
                        p=i;//p here is the 2nd largest number from the left side
                    }

                }
                //loop to get the sum of the gap
                for(int i=p+1;i<j;i++){
                    count++;
                    sub=sub+height[i];
                }
                j=p;
                sum = sum + height[p]*count - sub;

            }
            j = grt; 
            while(j!=0){
                count=0;
                v=-1;
                int sub=0;
                for(int i=j;i<height.length-1;i++){
                    if(v<height[i]){
                        v=height[i];
                    
                        p=i;//p here is the 2nd largest number from the right side
                    }

                }
                //loop to get the sum of the gap
                for(int i=p+1;i<height.length-1;i++){
                    count++;
                    sub=sub+height[i];
                }
                j=p;
                sum = sum + height[p]*count - sub;
            
                }
            }
        else{
            while(height[j]!=0){
                count=0;
                v=-1;
                int sub=0;
                for(int i=j;i<height.length-1;i++){
                    if(v<height[i]){
                        v=height[i];
                       
                        p=i;//p here is the 2nd largest number from the right side
                    }

                }
                //loop to get the sum of the gap
                for(int i=p+1;i<height.length-1;i++){
                    count++;
                    sub=sub+height[i];
                }
                j=p;
                sum = sum + height[p]*count - sub;

            }
            j = grt;
            while(height[j]!=0){
                count=0;
                v=-1;
                int sub=0;
                for(int i=0;i<j;i++){
                    if(v<height[i]){
                        v=height[i];
                       
                        p=i;//p here is the 2nd largest number from the left side
                    }

                }
                //loop to get the sum of the gap
                for(int i=p+1;i<j;i++){
                    count++;
                    sub=sub+height[i];
                }
                j=p;
                sum = sum + height[p]*count - sub;

            }
        }

        return sum;
    }
    public static void main (String args[]){
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution(height));
    }
}