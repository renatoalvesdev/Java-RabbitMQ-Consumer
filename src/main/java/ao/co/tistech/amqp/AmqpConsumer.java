package ao.co.tistech.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
