# Algorithms

## Search Algorithms
1. **binary search (non-recursive) -** an algorithm that searches an array by continuing to narrow the search boundaries by half until the element is found.
1. **binary search (recursive) -** an algorithm that recursively divides the search in half until the element is found.
1. **parallel search -** the linear search algorithm split into chunks run on multiple threads.

## Sorting Algorithms
1. **bubble sort -** a comparison-based algorithm that iteratively swaps pairs of elements until the array is sorted.
1. **insertion sort -** a comparison-based algorithm that inserts each eliminated of the unsorted portion of the array into the correct position in the sorted portion of the array.
1. **selection sort -** an algorithm that selects the smallest element of the unsorted portion of the array and places it in the last position of the sorted portion of the array.
1. **merge sort -** a divide and conquer algorithm that focuses on combining arrays that were presorted using recursion.
1. **quick sort -** another divide and conquer algorithm that focuses on recursively choosing pivot points and swapping elements so that smaller elements are left of the pivot point and larger elements are to the right.

## Other Algorithms
1. **Caesar Cipher** implementation of [Caesar Cipher](https://en.wikipedia.org/wiki/Caesar_cipher). It can encrypt/decrypt a string by passing it to the *crypt method* with a key (negative key for decryption). Each character of the plaintext is shifted by the key.
1. **FileCrawler** uses [Breadth First Search (BFS)](https://en.wikipedia.org/wiki/Breadth-first_search) to find the filepath in the subdirectory of several different starting points. BFS uses a Queue (see [Lists](https://github.com/kevgraham/java_algorithms#lists)) to check subdirectories in the order in which they are found.
1. **FlightRoutes.java** uses [Dijkstra's Algorithm](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm) to find the shortest set of AirAsia routes between two airports. The algorithm uses the [Haversine distance](https://en.wikipedia.org/wiki/Haversine_formula) in kilometers between the latitude and longitude of airports for its weights. The program uses data I cleaned from [https://openflights.org/](https://openflights.org/). The airport data is loaded from *airports.csv* into a hashmap (see [Hash Maps](https://github.com/kevgraham/java_algorithms#hash-maps)), which is used to retrieve the latitude and longitude when calculating route distances for the routes in *routes.cvs*. For the algorithm, Airports are nodes and Routes are edges.
1. **CreditCardValidator.java** has a *validate method* that returns a String indicating if the given number is AMEX, MASTERCARD, VISA or INVALID. The algorithm checks the leading digits for the card type and uses the [Luhn Algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm) to ensure the credit card number is valid.
