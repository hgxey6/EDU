package objectMethods;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            Car original = new Car(45, "Fire");
            Car clone = (Car) original.clone();
            // hashCode()
            System.out.println("Original hash code: " + original.hashCode());
            System.out.println("Clone hash code: " + clone.hashCode());
            // toString()
            System.out.println(original);
            System.out.println(clone);
            // equals()
            System.out.println("Equals original and clone: " + original.equals(clone));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
