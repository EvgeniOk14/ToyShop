import java.util.Comparator;
import java.util.PriorityQueue;



import Model.Toy;
import Model.CreateToy;
import Model.Service;
import Presenter.Presenter;
import View.Console;
import View.View;

import java.security.Provider;
import java.util.Comparator;
import java.util.PriorityQueue;

        public class Main
        {

            public static void main(String[] args)
            {
                Service service = new Service();
                View view = new Console();
                PriorityQueue<Toy> toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
                Presenter pr = new Presenter(service, view, toyQueue);
                view.startProgram();
            }
        }

