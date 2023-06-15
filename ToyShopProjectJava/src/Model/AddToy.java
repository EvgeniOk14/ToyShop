package Model;
import java.util.Comparator;
import java.util.PriorityQueue;

    public class AddToy
    {
        private int id;
        private String name;
        private int weight;
        private int quantity;
        private PriorityQueue<Toy> toyQueue;

        public AddToy(int id, String name, int weight, int quantity, PriorityQueue<Toy> toyQueue )
        {
            this.id = id;
            this.name = name;
            this.weight = weight;
            this.quantity = quantity;
            this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
        }


        public void addToy(int id, String name, int weight, int quantity)
        {
            int encreasedWeight = Math.min(weight, 100);
            Toy toy = new Toy(id, name, encreasedWeight, quantity);
            toyQueue.add(toy);
        }
    }


