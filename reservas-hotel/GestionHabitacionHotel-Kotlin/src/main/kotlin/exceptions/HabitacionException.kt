package exceptions

sealed class HabitacionException(message: String): RuntimeException(message)
class HabitacionNotFound(message: String): HabitacionException(message)
class HabitacionBadRequest(message: String): HabitacionException(message)
class RoomNotEmpty(message: String): HabitacionException(message)
class RoomCannotBeEmpty(message: String): HabitacionException(message)
class RoomCannorBeFormalize(message: String): HabitacionException(message)
