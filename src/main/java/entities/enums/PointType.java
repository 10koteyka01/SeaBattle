package entities.enums;

/**
 * Тип точки
 *
 * Пустая
 * Ранен - подбитая палуба
 * Мимо
 * Часть корабля - не подбитая палуба
 */
public enum PointType {
    EMPTY,
    CRASHED,
    PAST,
    SHIPS_PART
}
