Ejercicio 2
===========

En este caso tenemos un thread que est� pendiente de que cambie la variable keepRunning desde otro thread para acabar.

Sin embargo debido a optimizaciones que realiza la JVM el c�digo:

```java
while (keepRunning) {
            count++;
}
```

se ha tranforma internamente a:

```java
if (keepRunning) {
	for(;;) {
		count++
	}
}
```

que en un programa secuencial ser�a equivalente, pero no lo es en un programa multithread.

Para resolverlo utiliza el keywork volatile, que adem�s de propagar la visibilidad de la variable keepRunning tambi�n evitar� estas optimizaciones.