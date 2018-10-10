package com.codingnomads.other;

/**
 * 1. **FlightRoutes.java** uses [Dijkstra's Algorithm](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm) to find the shortest set of AirAsia routes between two airports.
 * The algorithm uses the [Haversine distance](https://en.wikipedia.org/wiki/Haversine_formula) in kilometers between the latitude and longitude of airports for its weights.
 * The program uses data I cleaned from [https://openflights.org/](https://openflights.org/). The airport data is loaded from *airports.csv* into a hashmap (see [Hash Maps](https://github.com/kevgraham/java_algorithms#hash-maps)), which is used to retrieve the latitude and longitude when calculating route distances for the routes in *routes.cvs*.
 * For the algorithm, Airports are nodes and Routes are edges.
 */
public class FlightRoutes {
}
