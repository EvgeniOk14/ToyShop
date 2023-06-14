package Modul;

public class Toy
{
private int id;
private String name;
private int weight;
private int quantity;

public Toy(int id, String name, int weight, int quantity)
        {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        }

public int getId()
        {
        return id;
        }

public String getName()
        {
        return name;
        }

public int getWeight()
        {
        return weight;
        }

public int getQuantity()
        {
        return quantity;
        }

public void setId(int id)
        {
        this.id = id;
        }

public void setName(String name)
        {
        this.name = name;
        }

public void setWeight(int weight)
        {
        this.weight = weight;
        }

public void setQuantity(int fallingRate)
        {
        this.quantity = quantity;
        }

public void decreaseQuantity()
        {
        if (quantity > 0)
        {
        quantity--;
        }
        }

@Override
public String toString()
        {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(id).append(name).append(weight).append(quantity);
        return sb.toString();
        }
        }


