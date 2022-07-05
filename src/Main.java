import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> goodsNames = new ArrayList();
        goodsNames.add("guitar");
        goodsNames.add("drums");
        goodsNames.add("keyboard");
        
        for(String goodsName : goodsNames) {
            System.out.println(goodsName);
        }
    }
}