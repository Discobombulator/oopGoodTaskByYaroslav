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
     * Возвращает текущее местоположение автобуса.
     *
     * @return текущее местоположение автобуса в виде объекта Position.
     */
    @Override
    public Position getCurrentPosition() {
        //TODO
        return null;
    }

    /**
     * Перемещает автобус к заданному месту назначения.
     *
     * @param person человек, который использует транспорт
     * @param destination место назначения, куда необходимо доехать
     * @return новое местоположение после попытки перемещения
     */
    @Override
    public Position moveTo(Person person, Position destination) {
        //TODO
        return null;
    }
}
