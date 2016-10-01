Ejercicio1
==========

En este ejemplo incorrecto de productor/consumidor, el thread productor rápidamente llena el buffer con caracteres y entonces espera al consumidor que consuma algunos caracteres del buffer. El problema es que el productor espera dentro del monitor asociado con el buffer, evitando que el consumidor ejecute el método synchronized "get" en el buffer.

Ejecuta el código y observa como el productor se bloquea en una espera activa consumiendo ciclos de CPU a cascoporro en la llamada a buffer.put():
...
while(count == buffer.length) ;
...

mientras que el thread consumidor no puede entrar en el método buffer.get() por estar el lock del objeto Buffer ocupado por el thread productor.

Para resolver este ejercicio deberás usar los métodos wait() y notify(). Recuerda que:

el método wait() suspende el thread y temporalmente libera el "lock" obtenido por un método o sección synchronized.

el método notify() despierta un thread que este esperando el "lock" del objeto cualquier "thread" que esté esperando obtener el "lock" del objeto desde el que se llama.

Para solucionar el problema deberás utilizar estos métodos en los métodos get() y set() de la clase Buffer.
