package View;

import Model.Toy;

public class Console implements View
 {
    @Override
    public void showPrize(Toy toy) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Выпал приз: ").append(toy.getName()).append(", ").append("вес: ").append(toy.getWeight());
        System.out.println(sb.toString());
    }
}
    
