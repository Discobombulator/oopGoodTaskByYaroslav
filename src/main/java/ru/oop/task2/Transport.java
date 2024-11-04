package ru.oop.task2;

/**
 * Интерфейс для транспорта
*/
interface Transport {
    Position getCurrentPosition();
    Position moveTo(Person person, Position destination);
}