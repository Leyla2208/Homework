package homework1;

import java.util.ArrayList;
import java.util.List;

public class homework4 {
    public static void main(String[] args) {
        Human Micheal= new Human("John","Brus",1970,105,new Human("Jane","Brus",1970),new Human("Anna", "Brus", 1970),new Pet("dog","Rock", 5,75, new String[]{"eat", "drink", "sleep"}));
        Human mother1= new Human("Jane","Brus",1970,110, new Human(),new Human(),new Pet());
        Human father1= new Human("Anna", "Brus", 1970,90,new Human(), new Human(),new Pet());
        Pet pet=new Pet("dog","Boni", 5, 75,new String[]{"eat","sleep","drink"});
        List<Pet> PetList = new ArrayList<>();
        PetList.add(pet);
        for(Pet pet1:PetList ){
            System.out.println(pet1.toString());
        }
        List<Human> HumanList = new ArrayList<>();
        HumanList.add(Micheal);
        for(Human human:HumanList ){
            System.out.println(human.toString());
        }
        // 1
        Human Leyla= new Human("Leyla","Mammadova",2001,105,new Human("Wovket","Mammadova",1978),new Human(),new Pet("cat","Mur", 3,60, new String[]{"eat", "play", "sleep"}));
        Human Elman= new Human("Elman","Mammadov",1967,107,new Human(),new Human("Adil","Mammadov",1941),new Pet("cat","Mur", 3,60, new String[]{"eat", "play", "sleep"}));
        Human Wovket= new Human("Wovket","Mammadova",1978,110,new Human(),new Human("Oktay", "Ibrahimov",1942),new Pet("cat","Mur", 3,60, new String[]{"eat", "play", "sleep"}));
        List<Human> HumanList0= new ArrayList<>();
        HumanList0.add(Leyla);
        for(Human human0:HumanList0){
            System.out.println(human0);
        }
        List<Human> HumanList1= new ArrayList<>();
        HumanList1.add(Elman);
        for(Human human1:HumanList1){
            System.out.println(human1);
        }
        List<Human> HumanList2= new ArrayList<>();
        HumanList2.add(Wovket);
        for(Human human2:HumanList2){
            System.out.println(human2);
        }
        //2
        Human Jane = new Human ("Jane","Anderson",1983);
        Human Bryce= new Human("Bryce", "Anderson",1980);
        Human Alice= new Human ("Alice","Anderson",2007,85,new Human("Jane","Anderson",1983), new Human("Bryce", "Anderson",1980),new Pet("dog","Barsik",2,45,new String[]{"jumping","sleeping","eating"}));
        Pet Alice_pet= new Pet("dog","Barsik",2,45,new String[]{"jumping","sleeping","eating"});

        Alice.greetPet();
        Alice.describePet();
        Alice.feedPet(false);
        Alice_pet.eat();
        Alice_pet.foul();
        Alice_pet.respond();
        // apply toString() method
        List<Pet> PetList1 = new ArrayList<>();
        PetList1.add(Alice_pet);
        for(Pet pet2:PetList1 ){
            System.out.println(pet2.toString());
        }
        List<Human> HumanList3 = new ArrayList<>();
        HumanList3.add(Alice);
        for(Human human3:HumanList3 ){
            System.out.println(human3.toString());
        }
    }
}

