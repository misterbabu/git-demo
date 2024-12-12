public class App {
    public void addData(String data){
        System.out.println("data: "+data);
        if(data.equalsIgnoreCase(Constant.DATA_TYPE)){
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
            System.out.println("Display");
        }
    }
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
