public class App {
    public void addData(String data){
        System.out.println("data: "+data);
        if(data.equalsIgnoreCase(Constant.DATA_TYPE)){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
