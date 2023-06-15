package Model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UpdateWeight
{
    private int toyId;
    private int weight;
    private PriorityQueue<Toy> toyQueue;

    public UpdateWeight(int toyId, int weight, PriorityQueue<Toy> toyQueue)
    {
        this.toyId = toyId;
        this.weight = weight;
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }

    public void updateWeight(int toyId, int weight)
    {
        int encreasedWeight = Math.min(weight, 100);
        for (Toy toy : toyQueue)
        {
            if (toy.getId() == toyId)
            {
                toy.setWeight(encreasedWeight);
                break;
            }
        }
    }
}
