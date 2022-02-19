package pt.ulusofona.cm.kotlin.challenge.models

class Bicicleta(identificador : String) : Veiculo(identificador) {
    var identificador2 = identificador

    override fun requerCarta(): Boolean {
        return false
    }

    override fun toString(): String {
        return "Bicicleta $identificador2| Veiculo | $this.identificador | $this.posicao | $this.dataDeAquisicao"
    }

}

//<Posicao | x:1483198325 | y:253202883>
//<Posicao | x:1483198325 | y:253202883>