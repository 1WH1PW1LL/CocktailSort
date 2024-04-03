# CocktailSort
This is the cocktail sort. In this example it will sort an array of integers. It runs with the speed of n in the best case scenario and n^2 in the worst case scenario. The cocktail sort is an adaptation of the bubblesort, where the compiler sorts left to right then right to left in one cycle as compared to the usual left to right in one cycle.

## Kill
The boolean checker is what causes the loop to break. It checks if the array is already sorted and can be returned. By default it is set to being false in this example. If the array needs to be sorted the loop will sort it and set checker to true. When checker is true, the compiler knows that there may be more sorting to do and will continue sorting the array. When checker is false the while loop breaks and the array is returned.    
