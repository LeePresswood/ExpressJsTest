package components

class Coeffecient {
    public Double value

    public static Coeffecient add(Coeffecient coeffecient1, Coeffecient coeffecient2){
        return new Coeffecient(value: coeffecient1.value + coeffecient2.value)
    }

    public static Coeffecient subtract(Coeffecient coeffecient1, Coeffecient coeffecient2){
        return new Coeffecient(value: coeffecient1.value - coeffecient2.value)
    }

    public static Coeffecient multiply(Coeffecient coeffecient1, Coeffecient coeffecient2){
        return new Coeffecient(value: coeffecient1.value * coeffecient2.value)
    }

    public static Coeffecient divide(Coeffecient coeffecient1, Coeffecient coeffecient2){
        return new Coeffecient(value: coeffecient1.value / coeffecient2.value)
    }

    public static Coeffecient power(Coeffecient coeffecient1, Double power){
        return new Coeffecient(value: coeffecient1.value ** power)
    }

    @Override
    String toString() {
        return value
    }
}
