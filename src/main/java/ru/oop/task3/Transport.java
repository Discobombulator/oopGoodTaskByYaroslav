package ru.oop.task3;

/**
 * Интерфейс для транспорта
 */
interface Transport {
    Position getCurrentPosition();
    Position moveTo(Person person, Position destination);
}