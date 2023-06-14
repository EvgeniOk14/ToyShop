package Modul;

import java.util.*;

public class DrowPrize
{
    private PriorityQueue<Toy> toyQueue;

    public DrowPrize(PriorityQueue<Toy> toyQueue)
    {
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }

    public Toy drawPrise()
    {
        Random random = new Random();
        List<Toy> availableToys = new ArrayList<>();

        for (Toy toy : toyQueue)
        {
            if (toy.getQuantity() > 0)
            {
                availableToys.add(toy);
            }
        }

        if (availableToys.isEmpty())
        {
            return null;
        }

        int totalWeight = availableToys.stream().mapToInt(Toy::getWeight).sum();
        int randomNumber = random.nextInt(totalWeight);

        int accumulatedWeight = 0;
        for (Toy toy : availableToys)
        {
            accumulatedWeight += toy.getWeight();
            if (randomNumber < accumulatedWeight)
            {
                return toy;
            }
        }

        return null;
    }
}

