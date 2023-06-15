package Model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Service
{
    private int toyId;
    private int weight;
    private String name;
    private int quantity;
    private PriorityQueue<Toy> toyQueue;
    private UpdateWeight updateWeigth;
    private CreateToy createToy;
    private StartLottery startLotery;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




    public void setUpdateWeight(UpdateWeight updateWeight)
    {
        this.updateWeigth = updateWeight;
    }
    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setToyQueue(PriorityQueue<Toy> toyQueue) {
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }

    public void setCreateToy(CreateToy createToy)
    {
        this.createToy = createToy;
    }
    public void setStartLotery(int id, String name, int weight, int quantity, PriorityQueue<Toy> toyQueue)
    {
        this.startLotery = startLotery;
    }


    public void serviceUpdateWeight()
    {
        updateWeigth.updateWeight(toyId, weight);
    }

    public void serviceCreateToy()
    {
        createToy.createToy();
    }
    public void serviceStartLottery()
    {
        startLotery.startShuffle(toyQueue);
    }
}

