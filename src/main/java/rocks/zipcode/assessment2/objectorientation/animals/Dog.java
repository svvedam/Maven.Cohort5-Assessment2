package rocks.zipcode.assessment2.objectorientation.animals;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you completed the `Animal` class before attempting this class
 */
public class Dog extends Animal implements Woofer{
    public String speak() {
        StringBuilder sbr = new StringBuilder();
        sbr.append("Woof!");
        sbr.append("\n");
        sbr.append("Woof!");

        return sbr.toString();
    }
}
