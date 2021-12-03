public class StringReplacer implements StringTransformer{
    private char replacer;
    private char replacee;
    StringReplacer(char replacee, char replacer){
        this.replacee = replacee;
        this.replacer = replacer;
    }

    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder(drink.getText());
        for(int i = 0; i < str.length(); i++){
            if(this.replacee == (str.charAt(i))) str.setCharAt(i, replacer);
        }
        drink.setText(str.toString());
    }
}
