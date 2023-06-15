package Model;

import java.util.Comparator;
import java.util.PriorityQueue;


public class UpdateWeight
{
    private PriorityQueue toyQueue;
    private Toy toy;
    private  int toyId;
    private int weight;

    public UpdateWeight(int toyId, int weight)
    {
        this.toyId = toyId;
        this.weight = weight;
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }



    public void updateWeight(int toyId, int weight) {
        int clampedWeight = Math.min(weight, 100);
        for (Object item : toyQueue) {
            if (toy.getId() == toyId) {
                toy.setWeight(clampedWeight);
                break;
            }
        }
    }

}
