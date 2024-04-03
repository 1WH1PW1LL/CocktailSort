import java.util.Arrays;

public class CocktailShaker {
    public static void main(String[] args) {
        int[] input = {3,4,2,5,6,1,7};
        System.out.println(Arrays.toString(cocktailShakerSort(input)));
    }

    public static int[] cocktailShakerSort(int[] input)
    {
        boolean checker = true;
        int start = 0;
        int end = input.length;

        while(checker == true)
        {
            for(int i = start; i < end-1; i++)
            {
                if(input[i] > input[i+1])
                {
                    int storage = input[i];
                    input[i] = input[i+1];
                    input[i+1] = storage;
                    checker = true;
                }
            }

            if(!checker)
            {
                break;
            }

            checker = true;

            end = end-1;

            for(int i = end - 1; i >= start; i--)
            {
                if(input[i] > input[i+1])
                {
                    int storage = input[i];
                    input[i] = input[i+1];
                    input[i+1] = storage;
                    checker = true;
                }
            }

            if(checker == false)
            {
                break;
            }

            start = start +1;
        }

        return input;
    }
}
