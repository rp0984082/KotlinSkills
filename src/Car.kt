// Car class with a constructor and init block
class Car(val name: String, val year: Int) {
    init {
        println("Car added: $name ($year)")
    }

    fun getCarInfo(): String {
        return "$name ($year)"
    }
}

// Function to format car names properly
fun formatCarName(name: String?): String {
    return name?.trim()?.capitalize() ?: "Unknown Car"
}

fun main() {
    val cars = mutableListOf<Car>()

    while (true) {
        println("\nCar List")
        println("1. Add a car")
        println("2. View all cars")
        println("3. Remove duplicates")
        println("4. Exit\n")
        print("Choose an option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter car name: ")
                val carName = formatCarName(readLine())

                print("Enter car year: ")
                val carYear = readLine()?.toIntOrNull() ?: 0

                if (carYear > 0) {
                    cars.add(Car(carName, carYear))
                } else {
                    println("Invalid year. Car not added.")
                }
            }

            2 -> {
                if (cars.isEmpty()) {
                    println("No cars in the list.")
                } else {
                    println("Cars in your collection:")
                    for (car in cars) {
                        println(car.getCarInfo())
                    }
                }
            }

            3 -> {
                val uniqueCars = cars.toSet() // Convert to Set to remove duplicates
                cars.clear()
                cars.addAll(uniqueCars)
                println("Duplicates removed.")
            }

            4 -> {
                println("Exiting program.")
                break
            }

            else -> println("Invalid option, try again.")
        }
    }
}
