
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths; 

public class RecipeSearch {
    public static void readAndAddRecipesFromFile(String file, ArrayList<Recipe> recipes) {
        
        try {
            Scanner fileRead = new Scanner(Paths.get(file));
            while(fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                if(!line.isEmpty()) {
                    String recipeName = line;
                    // System.out.println(recipeName);
                    int recipeTime = Integer.valueOf(fileRead.nextLine());
                    // System.out.println(recipeTime);
                    ArrayList<String> recipeIngredients = new ArrayList<>();
                    String ingr = fileRead.nextLine();

                    if(!ingr.isEmpty()) {
                        recipeIngredients.add(ingr);
                    }
                    while(fileRead.hasNextLine() ) {
                        String ingredient = fileRead.nextLine();
                        if(!ingredient.isEmpty()) {
                            recipeIngredients.add(ingredient);
                            // System.out.println(ingredient);
                        }
                        else break;
                    }
                    Recipe recipe = new Recipe(recipeName, recipeTime, recipeIngredients);
                    // System.out.println(recipeName);
                    // System.out.println(recipeTime);
                    // for(String str:recipeIngredients) {
                    //     System.out.println(str);
                    // }
                    // System.out.println();
                    recipes.add(recipe);
                }
            }
        } catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
    public static void UserInterface(Scanner scanner) {
        System.out.println("File to read:");
        String file = scanner.nextLine();
        ArrayList<Recipe>recipes = new ArrayList<>();
        readAndAddRecipesFromFile(file, recipes);

        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while(true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            } else if(command.equals("list")) {
                System.out.println("Recipes: ");
                for(Recipe r: recipes) {
                    System.out.println(r);
                }
            } else if(command.equals("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("Recipes: ");
                for(Recipe r : recipes) {
                    if(r.getName().contains(word)) {
                        System.out.println(r);
                    }
                }
            } else if(command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes: ");
                for(Recipe r : recipes) {
                    if(r.getCookingTime() <=maxCookingTime) {
                        System.out.println(r);
                    }
                }
            } else if(command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingr = scanner.nextLine();
                System.out.println("Recipes: ");

                for(Recipe r : recipes) {
                    if(r.getIngredients().contains(ingr)){ 
                        System.out.println(r);
                    }
                }
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface(scanner);
       
        



    }

}
