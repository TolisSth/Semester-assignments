#Να γράψετε πρόγραµµα σε γλώσσα Python, που να διαβάζει το µήκος της ακτίνας r ενός κύκλου και να τυπώνει τη διάµετρο, την περίμετρο και το εµβαδόν αυτού του κύκλου.
#(Βοήθεια: Η διάµετρος του κύκλου δίνεται από τον τύπο d=2*r, η περίµετρος από τον τύπο p=2*π*r (όπου π≈3,14) και το εµβαδόν από τον τύπο Ε=π*r2.) 
# Υπόδειξη: να χρησιμοποιήσετε την εξωτερική βιβλιοθήκη math:(36 μονάδες)
#Author: Apostolos Halis tolishalis@gmail.com 2023
import math 

r = int(input("Ray of the circle: "))

#Diameter 
diameter = 2 * r 

#perimeter 
perimeter = 2 * math.pi * r

#Area 
area = math.pi * pow(r,2)

#printing out info 
print(diameter, perimeter, area)