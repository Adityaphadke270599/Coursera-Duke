//code with comditional statements 
int f (int x, int y){
    if(x<y){
        System.out.println("x < y");
        return y + x;
    }
    else {
        System.out,orintln("x > y");
        if(x > 8){
            return y + 7;
        }
    }
    return x - 2;
}
int g(){
    int a = f(3, 4);
    int b = f(a, 5);5
    return b;
}
