public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink) {
        String str = drink.getText();
        StringBuilder newStr = new StringBuilder(str);
         drink.setText(newStr.reverse().toString());
    }
}
