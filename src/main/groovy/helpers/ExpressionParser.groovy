package helpers

import components.Coeffecient

class ExpressionParser {
    public static Map getParts(String expression){
        Coeffecient coeffecient = getCoefficient(expression)

        expression.chars.eachWithIndex { char currentCharacter, int index ->

        }

        [:]
    }

    public static double getCoefficient(String expression){
        double currentCoefficient = 1

        StringBuilder nextBuffer = new StringBuilder()

        expression.chars.eachWithIndex { char currentCharacter, int index ->
            if(Character.isDigit(currentCharacter) || currentCharacter == "."){
                nextBuffer.append(currentCharacter)
            }
            else{

            }
        }

        return currentCoefficient
    }
}
