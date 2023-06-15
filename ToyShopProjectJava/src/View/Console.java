package View;

import Model.Service;
import Model.Toy;
import Presenter.Presenter;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Console implements View
{
    private Presenter presenter;
    private Service service;
    private View view;
    private PriorityQueue<Toy> toyQueue;

    public  Console()
    {
        this.presenter = presenter;
        this.service = service;
        this.view = view;
        this.toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());;
    }

    

    public void setService(Service service) {
        this.service = service;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setToyQueue(PriorityQueue<Toy> toyQueue) {
        this.toyQueue = toyQueue;
    }

    public void startProgram()
    {
        consoleCreateToy();
        consoleUpdateWeight();
        consoleStartLottery();

    }


    @Override
    public void setPresenter(Presenter presenter)
    {
        this.presenter = presenter;
    }


    public  void consoleCreateToy()
    {
        Presenter presenter = new Presenter(service, view, toyQueue);
        presenter.presenterCreateToy();
    }

    public void consoleUpdateWeight()
    {
        Presenter presenter = new Presenter(service, view, toyQueue);
        presenter.PresenterUpdateWeight();
    }

    public void consoleStartLottery()
    {
        Presenter presenter = new Presenter(service, view, toyQueue);
        presenter.PresenterStartLottery();
    }
}

