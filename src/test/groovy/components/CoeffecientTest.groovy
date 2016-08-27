package components

import spock.lang.Specification
import spock.lang.Unroll

class CoeffecientTest extends Specification {

    @Unroll
    def "adding values #val1 and #val2 creates a new coefficient with a value of #result"() {
        given:
            Coeffecient coeffecient1 = new Coeffecient(value: val1)
            Coeffecient coeffecient2 = new Coeffecient(value: val2)

        expect:
            result as Double == Coeffecient.add(coeffecient1, coeffecient2).value

        where:
            val1 | val2 | result
            0    | 0    | 0
            -1   | -1   | -2
            1    | -1   | 0
            1    | 1    | 2
            -1   | 1    | 0
    }

    @Unroll
    def "subtracting values #val1 and #val2 creates a new coefficient with a value of #result"() {
        given:
            Coeffecient coeffecient1 = new Coeffecient(value: val1)
            Coeffecient coeffecient2 = new Coeffecient(value: val2)

        expect:
            result as Double == Coeffecient.subtract(coeffecient1, coeffecient2).value

        where:
            val1 | val2 | result
            0    | 0    | 0
            -1   | -1   | 0
            1    | -1   | 2
            1    | 1    | 0
            -1   | 1    | -2
    }

    @Unroll
    def "multiplying values #val1 and #val2 creates a new coefficient with a value of #result"() {
        given:
            Coeffecient coeffecient1 = new Coeffecient(value: val1)
            Coeffecient coeffecient2 = new Coeffecient(value: val2)

        expect:
            result as Double == Coeffecient.multiply(coeffecient1, coeffecient2).value

        where:
            val1 | val2 | result
            0    | 0    | 0
            -1   | -1   | 1
            1    | -1   | -1
            1    | 1    | 1
            -1   | 1    | -1
    }

    @Unroll
    def "dividing values #val1 and #val2 creates a new coefficient with a value of #result"() {
        given:
            Coeffecient coeffecient1 = new Coeffecient(value: val1)
            Coeffecient coeffecient2 = new Coeffecient(value: val2)

        expect:
            result as Double == Coeffecient.divide(coeffecient1, coeffecient2).value

        where:
            val1 | val2 | result
            0    | 0    | Double.NaN
            1    | 0    | Double.POSITIVE_INFINITY
            -1   | 0    | Double.NEGATIVE_INFINITY
            -1   | -1   | 1
            1    | -1   | -1
            -1   | 1    | -1
            1    | 1    | 1
    }

    @Unroll
    def "power for values #val1 and #val2 creates a new coefficient with a value of #result"() {
        given:
            Coeffecient coeffecient1 = new Coeffecient(value: val1)
            Double value = val2

        expect:
            result as Double == Coeffecient.power(coeffecient1, value).value

        where:
            val1 | val2 || result
            0    | -1   || Double.POSITIVE_INFINITY
            -1   | 0    || 1
            1    | 0    || 1
            -2   | 0    || 1
            2    | 0    || 1
            1    | -1   || 1
            2    | -1   || 0.5
            1    | 1    || 1
            1    | 2    || 1
            2    | 1    || 2
            2    | 2    || 4
            -1   | 2    || 1
            -2   | 2    || 4
    }|

    @Unroll
    def "toString for coefficient with value #val gives result #result"() {
        given:
            Coeffecient coeffecient = new Coeffecient(value: val)

        expect:
            result == coeffecient.toString()

        where:
            val                      || result
            0                        || "0.0"
            -1                       || "-1.0"
            1                        || "1.0"
            1.5                      || "1.5"
            -1.5                     || "-1.5"
            Double.POSITIVE_INFINITY || "Infinity"
            Double.NEGATIVE_INFINITY || "-Infinity"
    }|
}
