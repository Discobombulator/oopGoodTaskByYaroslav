package ru.oop.task2;

/**
 * Интерфейс для транспорта
*/
interface Transport  extends Positioned {
    Position driveTo(Person person, Position destination);
}