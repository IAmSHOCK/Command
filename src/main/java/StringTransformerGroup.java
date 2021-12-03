import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> list;

    public StringTransformerGroup(List<StringTransformer> transformers){
        this.list = transformers;
    }

    public void execute(StringDrink drink) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).execute(drink);
        }
    }
}
