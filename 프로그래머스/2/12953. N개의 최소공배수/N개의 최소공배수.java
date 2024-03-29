class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    public int gcb(int a, int b){
        if(a % b ==0){
            return b;
        }
        return gcb(b , a % b);
    }
    
    public int lcm(int a, int b){
        return (a * b / gcb(a,b));
    }
}