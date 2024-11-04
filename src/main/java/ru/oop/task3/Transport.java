package ru.oop.task3;

/**
 * Интерфейс для транспорта
*/
interface Transport extends Positioned {
    Position driveTo(Person person, Position destination);
}