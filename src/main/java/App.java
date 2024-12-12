public class App {
    public void addData(String data){
        System.out.println("data: "+data);
        if(data.equalsIgnoreCase(Constant.DATA_TYPE)){
            System.out.println("Hello");
        }else if(true){
            System.out.println("Welcome");
            System.out.println("Display");
        }else if(false){
            System.out.println("Display else block");
        }else{
            System.out.println("Committing from phase3");
        }
    }
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
