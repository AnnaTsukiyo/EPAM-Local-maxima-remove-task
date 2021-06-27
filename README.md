# Local maxima remove
Implement [com.epam.rd.autotasks.arrays.LocalMaximaRemove](src/main/java/com/epam/rd/autotasks/arrays/LocalMaximaRemove.java) method:
<br><b>removeLocalMaxima(int[] array)</b> - returns a copy of a given array with all local maxima removed in it.
The original array must not be changed.

<b>Local maximum</b> is an element that is bigger that any of its neighbour elements.
<br>You should remove elements that are local maxima in the original array.

- The size of given array is guaranteed to be more than 1.
- Given array is guaranteed not to be null.
- If the array does not have any local maxima, then you should return its copy without changes.

<i>Solution may contain usage of java.util.Arrays.* methods.</i>

Class [com.epam.rd.autotasks.arrays.LocalMaximaRemove](src/main/java/com/epam/rd/autotasks/arrays/LocalMaximaRemove.java)
 contains <b>public static void main(String[] args)</b>. 
 <br>You may use it to check your solution.
 
 Example:
 <br>Input array:
 <br>`[18, 1, 3, 6, 7, -5]`
 <br>Output array:
 <br>`[1, 3, 6, -5]`