Ejercicio1
==========

En este ejemplo incorrecto de productor/consumidor, el thread productor r�pidamente llena el buffer con caracteres y entonces espera de forma activa al consumidor para que consuma algunos caracteres del buffer. El problema es que el productor espera dentro del monitor asociado con el buffer, evitando que el consumidor ejecute el m�todo synchronized "get" en el buffer.

Ejecuta el c�digo y observa como el productor se bloquea en una espera activa consumiendo ciclos de CPU a cascoporro en la llamada a buffer.put():

```java
while(count == buffer.length) ;
```

Mientras tanto el thread consumidor no puede entrar en el m�todo buffer.get() por estar el monitor del objeto Buffer ocupado por el thread productor.

Para resolver este ejercicio deber�s usar los m�todos wait() y notify(). Recuerda que:

el m�todo o.wait() suspende el thread y temporalmente libera el monitor del objeto "o" obtenido por un m�todo o secci�n synchronized.

el m�todo o.notify() despierta un thread que este esperando a obtener el monitor del objeto "o".

Para solucionar el problema deber�s utilizar estos m�todos en los m�todos get() y set() de la clase Buffer.

Para ello el productor deber� esperar cuando ya no pueda llenar m�s el buffer y deber� notificar al consumidor despu�s de a�adir un nuevo elemento en el buffer.
Por el otro lado el consumidor deber� esperar cuando el buffer est� vac�o y deber� notificar al productor despu�s de consumir un elemento del buffer.
