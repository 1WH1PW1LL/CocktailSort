# CocktailSort
This is the cocktail sort. In this example it will sort an array of integers. It runs with the speed of n in the best case scenario and n^2 in the worst case scenario. The cocktail sort is an adaptation of the bubblesort, where the compiler sorts left to right then right to left in one cycle as compared to the usual left to right in one cycle.

## Kill
The boolean checker is what causes the loop to break. It checks if the array is already sorted and can be returned. By default it is set to being false in this example. If the array needs to be sorted the loop will sort it and set checker to true. When checker is true, the compiler knows that there may be more sorting to do and will continue sorting the array. When checker is false the while loop breaks and the array is returned.  

## BubbleSort
The classic sort algorithm is used. 
if(input[i] > input[i+1])
{
    int storage = input[i];
    input[i] = input[i+1];
    input[i+1] = storage;
    checker = true;
}

The forloop type, however, varies based on weather we are going left to right or right to left.
### Left to Right
In the left to right for loop:
for(int i = start; i < end-1; i++)
the greatest number is sorted to the rightmost position in the array at the end of the loop.
The bubblesort will keep checking and bumping the greatest number one place to the right until it occupies the rightmost position no matter where the greatest number is positioned in the array.
### Right to Left
In the right to left for loop:
for(int i = end - 1; i >= start; i--)
the least number is sorted to the leftmost position in the array when the loop ends. 
The bubblesort will keep checking and bumping the least number one place to the left until it occupies the leftmost position no matter where the least number is positioned in the array.

## Effectiveness
In the interest of speed we want to make the compiler have to have to bubblesort the least amount of elements possible. This means the compiler shouldn't bubblesort elements that it has already sorted. Since we know that the extremities of the array have been sorted we can tell the compiler to exclude them from the bubblesort by including
end = end-1;
start = start +1;
These lines of code decrease the end value by one and increase the start value by 1, meaning that the bubblesort will have to check two less elements every cycle. 
