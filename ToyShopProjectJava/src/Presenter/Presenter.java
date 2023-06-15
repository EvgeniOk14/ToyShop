package Presenter;

import Model.Toy;
import Model.Service;
import View.View;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Presenter
{
    private Service service;
    private View view;
    private PriorityQueue<Toy> toyQueue;

    public Presenter(Service service, View view, PriorityQueue<Toy> toyQueue) {
        this.service = service;
        this.view = view;
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
    }

    public void setToyQueue(PriorityQueue<Toy> toyQueue) {
        this.toyQueue = toyQueue;
    }

    public void setService(Service service)
    {
        this.service = service;
    }
    public void setView(View view)
    {
        this.view = view;
    }
    public void setToyQueueo(PriorityQueue<Toy> toyQueue)
    {
        this.toyQueue = toyQueue;
    }

    public void PresenterUpdateWeight()
    {

        service.serviceUpdateWeight();
    }

    public void presenterCreateToy()
    {
        service.serviceCreateToy();
    }
    public void PresenterStartLottery()
    {
        service.serviceStartLottery();
    }
}
