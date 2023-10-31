// Общий интерфейс для всех типов автобусов
interface Bus {
    val brand: String
    val year: Int
    val Capacity: Int
    fun start()
    fun stop()
}

// Класс для городского автобуса
class CityBus(override val brand: String, override val year: Int, override val Capacity: Int) : Bus {
    override fun start() {
        println("Городской автобус $brand ($year года) начал движение.")
    }

    override fun stop() {
        println("Городской автобус $brand ($year года) остановился.")
    }

    fun openDoors() {
        println("Двери городского автобуса $brand открыты.")
    }
}

// Класс для междугороднего автобуса
class InterCityBus(override val brand: String, override val year: Int, override val Capacity: Int) : Bus {
    override fun start() {
        println("Междугородний автобус $brand ($year года) начал движение.")
    }

    override fun stop() {
        println("Междугородний автобус $brand ($year года) остановился.")
    }

    fun announcePrice(price: Int) {
        println("Стоимость проезда в автобусе $brand: $price рублей.")
    }

}

// Класс для станции техобслуживания
class BusStation {
    fun serviceBus(bus: Bus) {
        println("Началось техобслуживание автобуса марки ${bus.brand}")
    }
}

fun main() {
    val cityBus = CityBus("КамАЗ-6282", 2019, 56)
    val interCityBus = InterCityBus("ЛиАЗ-4292", 2017, 75)

    val station = BusStation()

    // Демонстрация работы с городским автобусом
    cityBus.start()
    cityBus.stop()
    cityBus.openDoors()
    station.serviceBus(cityBus)

    // Демонстрация работы с междугородним автобусом
    interCityBus.start()
    interCityBus.announcePrice(89)
    interCityBus.stop()
    station.serviceBus(interCityBus)
}
