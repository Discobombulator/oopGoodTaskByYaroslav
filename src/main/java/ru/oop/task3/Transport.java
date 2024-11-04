package ru.oop.task3;

/**
 * Интерфейс для транспорта
 */
interface Transport {
    Position getCurrentPosition();
    Position driveTo(Person person, Position destination);
}