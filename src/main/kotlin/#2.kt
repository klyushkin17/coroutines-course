package org.example

/*
///CoroutineContext///
Каждая корутина реализоуется в определенном контексте
CoroutineScope == Map<<Key<Element>>, <Element>>

Контексты можно объединять:
Context1(Job, Dispatcher) + Context2(Name, Job) = SumContext(Name, Job, Dispatcher)

При передае контекства в coroutine-builder он не созадется, а объединяется с контекстом Scope


Job - выполняемая в фоне задача, получается как результат создания корутины через lunch()
val job: Job = launch{}
При вызове корутины через async возвращается тип Differed, который являетс расширенным Job

Жизненый цикл Job
New -> Active -> Completing -> Completed
          |
       Cancelling -> Cancelled

Каждая Job может иметь родительскую Job, тем самым связываясь в иерархическую структуру, связывая корутины
При отмене родителся Job, так же отменяются дочерние Job
При отмене дочерних Job, так же отменяются родительские Job

При использовании SuperviserJob при отмене одной корутины остальные не отменяются

Методы в Job:
-cancel() - отмена Job
-invokeOnCompletion - позволяет выполнить callback по окончании Job
-join() - простановка корутины
-start() - запуск корутины


CoroutineDispatcher - отвечает за то, на каком потоке или потоках будет выполняться корутина
Виды диспетчеров:
-Default - используется по стандарту для интенсивных операци. Количество используемых потоков равно количеству ядер
НО не меньше 2-х
-Main - работа на главном потоке
-IO - подходит для операций ввода-вывода
-Unconfined - не привязана к определенному потоку

CoroutineExceptionHandler - обработчик исключений, происходящих в корутиах
fun main() {

}*/
