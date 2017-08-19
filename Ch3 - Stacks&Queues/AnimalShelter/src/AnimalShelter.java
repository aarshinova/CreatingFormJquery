import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Cat> catList = new LinkedList<>();
    private LinkedList<Dog> dogList = new LinkedList<>();
    private int order = 0;

    public void enqueque(Animal animal){
        animal.setOrder(++order);
        if (animal instanceof Dog)
            dogList.addLast((Dog) animal);
        if (animal instanceof Cat)
            catList.addLast((Cat)animal);
    }

    public Animal dequeueAnimal(){
        if (catList.size()==0){
            dogList.getFirst();
        }
        else if (dogList.size()==0){
            catList.getFirst();
        }

        int orderCat = catList.peek().getOrder();
        int orderDog = dogList.peek().getOrder();

        if (orderCat > orderDog){
            return dequequeDog();
        }else {
            return  dequequeCat();
        }
    }

    public Dog dequequeDog(){
        Dog newDog = null;
        if (dogList.size()!=0){
            newDog = dogList.poll();
        }
        return newDog;
    }

    public Cat dequequeCat(){
        Cat newCat = null;
        if (catList.size()!=0){
            newCat = catList.poll();
        }
        return newCat;
    }


}
