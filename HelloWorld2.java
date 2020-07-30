
public class HelloWorld2{
    public void runHello(){
        FileResource f;
        f = new FileResource("file.txt");
        for(String line : f.lines()){
            System.out.println(line);
        }
    }
    public static void main(String[] args){
        HelloWorld hw = new HelloWorld2();
        hw.runHello();
    }
}
