//the following code is 392 question in leetcode. it's speed is 7 ms, faster than 8.05% of Java online submissions for Is Subsequence.
class isSubsequence {
    public boolean Solution(String s, String t) {
        int v=0;
        
        
        for(int i=0; i<=s.length()-1;i++){
        
            for(int j=v; j<=t.length()-1;j++){
                if(s.charAt(i)==t.charAt(j)){
                    if(i==s.length()-1){
                        return true;
                    }
                    v=j+1;
                    break;
                }
                else if(j==t.length()-1){
                    return false;
                }
                
                
                
                else{continue;}
            
        }
    }
        if(s.length()==0){
            return true;
        }
        return false;
        
}
}
