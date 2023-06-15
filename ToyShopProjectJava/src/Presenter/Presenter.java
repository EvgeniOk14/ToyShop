package Presenter;

import Model.Toy;
import Model.UpdateWeight;
import Model.WriteFile;
import View.View;
import java.util.*;




public class Presenter 
{
    private View view;
    private PriorityQueue<Toy> toyQueue;

    public Presenter(View view) 
    {
        this.view = view;
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }

    public void addToy(int id, String name, int weight, int quantity)
    {
        int clampedWeight = Math.min(weight, 100);
        Toy toy = new Toy(id, name, clampedWeight, quantity);
        toyQueue.add(toy);
    }


    public void startRaffle()
    {
        List<Toy> prizes = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            Toy prize = drawPrize();
            if (prize == null)
            {
                break;
            }

            prizes.add(prize);
            prize.decreaseQuantity();
            view.showPrize(prize);
        }
        WriteFile writeFile = new WriteFile();
        writeFile.writePrizesToFile(prizes);
    }

    private Toy drawPrize()
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
     public void presenterUpdateWeight(int toyId, int weight)
     {
         UpdateWeight updateWeight = new UpdateWeight(toyId, weight);
         updateWeight.updateWeight(toyId,weight);
     }

}