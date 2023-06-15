package Model;
import View.Console;
import View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StartLottery
{
    private int id;
    private String name;
    private int weight;
    private  int quantity;
    private PriorityQueue<Toy> toyQueue;

    public StartLottery(int id, String name, int weight, int quantity, PriorityQueue<Toy> toyQueue)
    {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.toyQueue = toyQueue;
    }

    public static void startShuffle(PriorityQueue<Toy> toyQueue)
    {
        List<Toy> prizes = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            DrowPrize drPr = new DrowPrize(toyQueue);
            Toy prize = drPr.drowPrize();
            if (prize == null)
            {
                break;
            }

            prizes.add(prize);
            prize.decreaseQuantity();
            View v = new Console();
            System.out.println(prize.toString());
        }
        WritePrizeToFile wr = new WritePrizeToFile();
        wr.writePrizesToFile(prizes);
    }
}

