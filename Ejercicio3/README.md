Ejercicio 3
===========
Tenemos el siguiente programa que gestiona una cafeter�a. Los clientes (Client, clase Runnable) acceden concurrentemente a la cafeter�a (CoffeeStore) y compran caf�, se lo toman y se van.

En la clase CoffeeStore llevamos la cuenta del n�mero de caf�s vendidos (variable soldCoffees).

En el ejemplo, 4 clientes entran a la vez y toman caf�. Sin embargo, si ejecutas varias veces el programa te dar�s cuenta que a veces la cuenta falla (a veces salen 3 cafes).

Arregla el programa mediante alg�n mecanismo de sincronizaci�n de los vistos en clase.