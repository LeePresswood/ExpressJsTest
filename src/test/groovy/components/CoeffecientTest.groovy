package components

import spock.lang.Specification

class CoeffecientTest extends Specification {

    def "adding values #val1 and #val2 creates a new coefficient with a value of #result"(){
        when:
            Coeffecient coeffecient1 = new Coeffecient()
            Coeffecient coeffecient2 = new Coeffecient()

        then:
            result = Coeffecient.add(coeffecient1, coeffecient2).value

        where:
            val1 | val2 | result
        
    }
}
