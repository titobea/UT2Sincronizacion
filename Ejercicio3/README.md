Ejercicio 3
===========
Tenemos el siguiente programa que gestiona una cafetería. Los clientes (Client, clase Runnable) acceden concurrentemente a la cafetería (CoffeeStore) y compran café, se lo toman y se van.

En la clase CoffeeStore llevamos la cuenta del número de cafés vendidos (variable soldCoffees).

En el ejemplo 4 clientes entran a la vez y toman café. Sin embargo, si ejecutas varias veces el programa te darás cuenta que a veces la cuenta falla (a veces salen 3 cafes).

Arregla el programa mediante algún mecanismo de sincronización de los vistos en clase.