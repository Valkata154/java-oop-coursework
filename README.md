# Introduction

You are supplied with a Java library containing weather data recorded at
different locations in the UK during the year 2015. A Second Java library is
provided that allows geographic coordinates to be plotted on a world map.
You are required to write code to answer questions about the data and output
the correct answers.

# Section 2

Answers or partial answers are provided for some of the questions to
enable you to gain confidence in your approach.
Questions 6 – 10 must be implemented using an Object Oriented design
that uses aggregation between WeatherStation and WeatherReading, as
detailed below.

Your object-oriented model should be implemented using two classes.

• WeatherStation

• WeatherReading

Each WeatherStation should maintain a list of WeatherReadings obtained at
that location. All fields contained in the data should be stored in the
appropriate class. You are free to implement whatever additional classes that
you feel necessary. For example a collection of WeatherStation objects can
be maintained in your main method or you can encapsulate these in another
class if you wish. 

6) Which weather station has the fewest weather readings? Output the Id,
name, coordinates and number of readings of the weather station to the
system console. Plot the location using the MapGui class supplied.

7) What was the highest temperature recorded at
EDINBURGH/GOGARBANK (3166)?
Output the temperature, Year, Month, Date and Hour that the maximum
temperature was recorded to the console.
Plot the Weather Station on a map using the MapGui class supplied.

8) What were the minimum, maximum and mean temperatures recorded at
11 AM during July 2015 for the weather station named " AVIEMORE
(3063)”. Print the answer to the console. In addition, plot the location of
this weather station on a map using the MapGUI class supplied.

9) How many weather stations recorded a temperature of 30 degrees or
over? Print the number to the console. Plot the location(s) on a map using
the supplied MapGUI class.

10) What weather station had the most variation between minimum and
maximum temperatures. Print out the ID, name,
latitude, longitude, and minimum and maximum temperatures to the
console. Plot the weather station on a map using the supplied MapGUI
class.

# Section 3

Questions 11 – 15 must be implemented using an Object Oriented
design that uses aggregation and inheritance as specified below.
Additionally for some questions, screenshots are required as detailed below.
Your code should still output the answer to the system console.
Your model should be implemented using three classes.

• WeatherStation

• WeatherReading

• Postcode

Your classes WeatherStation and Postcode MUST both extend Coordinate
which is a class included in the JMapViewer package. You will need to
override the constructor Coordinate (double lat, double lon) in
your subclasses.

Each WeatherStation should maintain a list of WeatherReadings obtained at
that location. All fields contained in the data should be stored in the
appropriate class. You are free to implement whatever additional classes that
you feel necessary. 

11) How many postcodes are within a 10KM radius of AONACH MOR
(3041)? Print the answer to the system console and plot these locations on
a map using the supplied MapGUI class.

12) Which location sustained a wind speed of more than 50 MPH for the most
consecutive readings? The data supplied is given in chronological order.
Print the location and the number of consecutive readings to the console
and plot the location on a map using the supplied MapGUI class.

13) What was the difference in mean temperature during January between
BLACKPOOL (3318) and EDINBURGH/GOGARBANK (3166)? Print the
answer to the system console and plot these locations on a map using the
supplied MapGUI class.

14) Which is the most isolated G postcode? This is calculated as the postcode
with the largest distance to its closest neighbour. Use the g.csv file
supplied for this task. Output the postcode and location to the console and
plot the location using the supplied MapGui class.

15) Which G postcode is the most densely populated*? This is determined
as the postcode with the most neighbouring postcodes within a 0.3KM
radius (<=). Use the g.csv file supplied for this task. Output the postcode,
number of neighbours and location to the console and plot the location
using the supplied MapGui class.
