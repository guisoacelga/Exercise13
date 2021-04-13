package DogHostel;

public class DogHotel {

    //return a String[] with the names of dogs that cannot tolerate the food
   public static String[] dogAllergy(Dog[] dogNames, String[] ingredients){
       String [] alergicos ={};
        for (int i = 0; i < dogNames.length; i++) {

            for (int j = 0; j < dogNames[i].allergies.length; j++) {

                for (int k = 0; k < ingredients.length; k++) {

                    if(dogNames[i].allergies[j].equalsIgnoreCase(ingredients[k])){
                        System.out.println(dogNames[i].name + " es alergico  a " + ingredients[k]);
                    }


                }
            }

        }

        return alergicos;

   }
}
