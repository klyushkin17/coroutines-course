package org.example

/*
///CoroutineScope - жизненный цикл корутины///

.launch() и .async() являются расширениями к типеу CoroutineScope
.runBlocking() блокирует поток, с которого запускается корутина

Structured concurrency - механизм, предоставляющий иерархическую структуру для организоации работы корутин

Принципы работы Scope:
1) Scope знает про все корутины, запущенные внутри него. Данные корутины хранятся как ссылка.
2) Scope может может отменить выполнение всех дочерних coroutine, если возникнет error
3) Scope ожидает выполнения всех дочерних корутин внутри него

CoroutineScope VS CoroutineContext
CoroutineScope является оберткой над CoroutineContext

CoroutineContext - набор параметров для выполнения корутниы
CoroutineScope преданзначен для объединения корутины и передает Job, который будет родителем всех корутин в Scope

GlobalScope не привязан к какой-либо Job. Все корутины, созданные в рамках GlobalScope будут работать до окончания
работы всех корутин или до окончания работы процесса.

Использование GlobalScope нежелательно, лучше создать собственные Scope:
- Используя CoroutineScope(Job() + Dispatchers.Default)
- Используя suspend функцию coroutineScope, в которой корутины могут выфполняться параллельно

CoroutineScope внутри корутины:
Каждрая корутина внутри себя передает CoroutineScope, что позволяет вызывать другие корутины внутри себя самой

withContext - функция, позволяющая сменить контекст для блока программ в корутине

fun main() {

}*/
