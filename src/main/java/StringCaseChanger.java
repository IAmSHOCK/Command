public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink) {
        String str = drink.getText();
        StringBuilder newStr = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) newStr.setCharAt(i, Character.toUpperCase(ch));
            else newStr.setCharAt(i, Character.toLowerCase(ch));
        }
        drink.setText(newStr.toString());
    }
}
