package model;

public class PersonalModel {

    private final String [] personsGroup = {"Everton Lima", "Malu Muniz Lima", "Andrea Muniz Lima", "Edwin Lima", "Beta Lima", "Geba","Queliton"};
    public String personPrincipal = "Everton Pereira Oliveira Lima";
    public String personRandom() { return personsGroup[randomIndex()];}
    private int randomIndex() { return (int)(Math.random() * personsGroup.length);}
}
