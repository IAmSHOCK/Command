public class StringTransformerGroupTest {
    @Test
    public void transformerGroup() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        StringTransformerGroup tg = new
                StringTransformerGroup(transformers);
        tg.execute(drink);
        assertEquals("dCbA-DcBa", drink.getText());
    }
}
