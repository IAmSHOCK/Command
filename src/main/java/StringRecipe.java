import java.util.List;

public class StringRecipe{
    private List<StringTransformer> list;
    StringRecipe(List<StringTransformer> transformers){
        this.list = transformers;
    }
    public void mix(StringDrink drink) {
        for(int i = 0; i < list.size(); i++){
            list.get(i).execute(drink);
        }
    }
}
