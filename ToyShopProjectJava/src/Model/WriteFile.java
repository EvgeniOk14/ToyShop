package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile
 {
   public void writePrizesToFile(List<Toy> prizes) {
        try (FileWriter writer = new FileWriter("prizes.txt")) {
            for (Toy toy : prizes) {
                writer.write("Игрушка: " + toy.getName() + ", вес: " + toy.getWeight() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}
