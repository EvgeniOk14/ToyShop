
import Presenter.Presenter;
import View.Console;
import View.View;


    public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Presenter presenter = new Presenter(view);


        presenter.addToy(1, "Робот", 50, 2);
        presenter.addToy(2, "Кукла", 30, 3);
        presenter.addToy(3, "Ракета", 10, 4);
        presenter.addToy(4, "Конструктор", 10, 1);


        presenter.updateWeight(1, 70);


        presenter.startRaffle();
    }
}