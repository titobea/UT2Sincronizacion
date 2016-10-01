Ejercicio1
==========

En este ejemplo incorrecto de productor/consumidor, el thread productor rápidamente llena el buffer con caracteres y entonces espera de forma activa al consumidor para que consuma algunos caracteres del buffer. El problema es que el productor espera dentro del monitor asociado con el buffer, evitando que el consumidor ejecute el método synchronized "get" en el buffer.

Ejecuta el código y observa como el productor se bloquea en una espera activa consumiendo ciclos de CPU a cascoporro en la llamada a buffer.put():

```java
while(count == buffer.length) ;
```

Mientras tanto el thread consumidor no puede entrar en el método buffer.get() por estar el monitor del objeto Buffer ocupado por el thread productor.

Para resolver este ejercicio deberás usar los métodos wait() y notify(). Recuerda que:

el método o.wait() suspende el thread y temporalmente libera el monitor del objeto "o" obtenido por un método o sección synchronized.

el método o.notify() despierta un thread que este esperando a obtener el monitor del objeto "o".

Para solucionar el problema deberás utilizar estos métodos en los métodos get() y set() de la clase Buffer.

Para ello el productor deberá esperar cuando ya no pueda llenar más el buffer y deberá notificar al consumidor después de añadir un nuevo elemento en el buffer.
Por el otro lado el consumidor deberá esperar cuando el buffer esté vacío y deberá notificar al productor después de consumir un elemento del buffer.
