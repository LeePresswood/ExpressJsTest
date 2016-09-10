package components

class Variable {
    String label
    Double power

    @Override
    String toString() {
        "($label^$power)"
    }
}
