package ru.oop.task2;


/**
 * Реализация для самоката.
 * Этот класс отвечает за управление автомобилем, включая получение его текущего местоположения
 * и перемещение к заданному месту назначения.
 */
class Scooter implements Transport {
    /**
     * Возвращает текущее местоположение самоката.
     */
    @Override
    public Position getCurrentPosition() {
        //TODO
        return null;
    }

    /**
     * Перемещает самокат к заданному месту назначения.
     *
     * @param person человек, который использует транспорт
     * @param destination место назначения, куда необходимо доехать
     * @return новое местоположение после попытки перемещения
     */
    @Override
    public Position driveTo(Person person, Position destination) {
        //TODO
        return null;
    }
}

