//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Resident re1 = new Resident(1);
        Person v1 = new Visitor(2);
        Person v2 = new Visitor(2);
        re1.approve(v1);
        re1.reject(v2);
    }
}