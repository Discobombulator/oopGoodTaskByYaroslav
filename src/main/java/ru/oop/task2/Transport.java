package ru.oop.task2;

/**
 * Интерфейс для транспорта
*/
interface Transport {
    Position getCurrentPosition();
    Position driveTo(Person person, Position destination);
}