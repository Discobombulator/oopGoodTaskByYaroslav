package ru.oop.task3;

/**
 * Реализация для автобуса.
 * Этот класс отвечает за управление автобусом, включая получение его текущего местоположения
 * и перемещение к заданному месту назначения.
 */
    class Bus implements Transport {
    /**
     * Конструктор для создания автобуса с заданным номером маршрута.
     *
     * @param routeNumber номер маршрута автобуса
     */
    public Bus(String routeNumber) {
        //TODO
    }
    /**
     * Перемещает автобус к заданному месту назначения.
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

    /**
     * Возвращает текущее местоположение автобуса.
     *
     * @return текущее местоположение автобуса в виде объекта Position.
     */
    @Override
    public Position getPosition() {
        return null;
    }
}
