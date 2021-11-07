class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate(): Int { 
        speed = speed + 5
        return speed
    }
    fun decelerate(): Int {
        speed = speed - 5
        if (speed < 0){
            speed = 0
        }
        return speed
    }
}
