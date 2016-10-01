Ejercicio 2
===========

En este caso tenemos un thread que está pendiente de que cambie la variable keepRunning desde otro thread para acabar.

Sin embargo debido a optimizaciones que realiza la JVM el código:

'''java
while (keepRunning) {
            count++;
}
'''

se ha tranforma internamente a:

'''java
if (keepRunning) {
	for(;;) {
		count++
	}
}
'''

que en un programa secuencial sería equivalente, pero no lo es en un programa multithread.

Para resolverlo utiliza el keywork volatile, que además de propagar la visibilidad de la variable keepRunning también evitará estas optimizaciones.