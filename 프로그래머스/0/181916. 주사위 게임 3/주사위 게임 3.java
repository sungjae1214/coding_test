class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b && a==c && a==d) answer = 1111*a;
        
        else if(a==b && a==d) answer = (10*a+c)*(10*a+c);
        else if(a==b && a==c) answer = (10*a+d)*(10*a+d);
        else if(a==c && a==d) answer = (10*a+b)*(10*a+b);
        else if(b==c && b==d) answer = (10*b+a)*(10*b+a);
        else if(b==c && b==a) answer = (10*b+d)*(10*b+d);
        else if(b==d && b==a) answer = (10*b+c)*(10*b+c);
        else if(c==d && c==a) answer = (10*c+b)*(10*c+b);
        else if(c==d && c==b) answer = (10*c+a)*(10*c+a);
        else if(c==a && c==b) answer = (10*c+d)*(10*c+d);
        else if(d==a && d==b) answer = (10*d+c)*(10*d+c);
        else if(d==b && d==c) answer = (10*d+a)*(10*d+a);
        else if(d==c && d==a) answer = (10*d+b)*(10*d+b);
        
        else if(a==c && b==d && a>b) answer = (a+b)*(a-b);
        else if(a==c && b==d && a<b) answer = (a+b)*(b-a);
        else if(a==d && b==c && a>b) answer = (a+b)*(a-b);
        else if(a==d && b==c && a<b) answer = (a+b)*(b-a);
        else if(a==b && c==d && a>c) answer = (a+c)*(a-c);
        else if(a==b && c==d && a<c) answer = (a+c)*(c-a);
        
        else if(c==d) answer = (a*b);
        else if(b==d) answer = (a*c);
        else if(b==c) answer = (a*d);
        else if(a==d) answer = (b*c);
        else if(a==c) answer = (b*d);
        else if(a==b) answer = (c*d);
        
        else if(a<b && b<c && c<d || a<b && b<d && d<c || a<c && c<d && d<b || a<c && c<b && b<d || a<d && d<b && b<c || a<d && d<c && c<b) answer = a;
        
        else if(b<c && c<d && d<a || b<c && c<a && a<d || b<d && d<a && a<c || b<d && d<c && c<a || b<a && a<c && c<d || b<a && a<d && d<c) answer = b;
        
        else if(c<d && d<a && a<b || c<d && d<b && b<a || c<a && a<b && b<d || c<a && a<d && d<b || c<b && b<d && d<a || c<b && b<a && a<d) answer = c;
        
        else if(d<a && a<b && b<c || d<a && a<c && c<b || d<b && b<c && c<a || d<b && b<a && a<c || d<c && c<a && a<b || d<c && c<b && b<a) answer = d;
        
        return answer;
    }
}