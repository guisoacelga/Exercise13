import java.util.Arrays;

public class RecipeApp {


    public static void main(String[] args) {
        Recipe TallarinesConSalsa = new Recipe();
        TallarinesConSalsa.amountOfPeople = 2;
        TallarinesConSalsa.ingredientsNames = new String[]{"pasta", "tomato sauce", "meat", "oregano", "garlic"};
        TallarinesConSalsa.ingredientsQuantityPrice = new double[][]{{1, 1.99}, {2, 2.05}, {400, 8}, {1, 0.5}, {1, 1}};

        System.out.println("Es alergico a la pasta? " + TallarinesConSalsa.allergic("pasta"));

        System.out.println("Es libre de lactosa? " + TallarinesConSalsa.lactoseFree());
        TallarinesConSalsa.ingredientsNames = new String[]{"pasta", "tomato sauce", "meat", "oregano", "cheese"};
        System.out.println("Es libre de lactosa? " + TallarinesConSalsa.lactoseFree());

        //imprime el arreglo 2d
        for (int i = 0; i < TallarinesConSalsa.ingredientsQuantityPrice.length ; i++) {
            System.out.println(Arrays.toString(TallarinesConSalsa.ingredientsQuantityPrice[i]));
        }

        System.out.println("Cuál es la suma del costo de los ingredientes? " + TallarinesConSalsa.costs());
        System.out.println("Cuál es el costo de los ingredientes por persona? " + TallarinesConSalsa.costsPerPerson());
        System.out.println("Y cuánto costaría en total si fuesen 4 personas? " );
        TallarinesConSalsa.changePersons(4);
        for (int i = 0; i < TallarinesConSalsa.ingredientsQuantityPrice.length ; i++) {
            System.out.println(Arrays.toString(TallarinesConSalsa.ingredientsQuantityPrice[i]));
        }
        System.out.println("Cuál es la suma del costo de los ingredientes? " + TallarinesConSalsa.costs());





    }


}
