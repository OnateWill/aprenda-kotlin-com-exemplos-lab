enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nomeCompleto: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
        if (usuario in inscritos){
            println("Matricula negada, usuário já está inscrito")
        } else {
            inscritos.add(usuario)
            println("Usuário Matriculado")
        }
        
    }
}

fun main() {
    
    val curso1 = ConteudoEducacional(nome = "introdução à Linguagem de Programação Kotlin", duracao = 120)
    val curso2 = ConteudoEducacional(nome = "Estruturas de Controle de Fluxo e Coleções em Kotlin", duracao = 120)
    val curso3 = ConteudoEducacional(nome = "Orientação a Objetos e Tipos de Classes na Prática com Kotlin", duracao = 120)
    var conteudo = mutableListOf(curso1, curso2, curso3)
    //------------------------------------------------------------------------------------------------------------------------
    val kotlin = Formacao(nome = "Kotlin Experience", conteudos = conteudo)
    //------------------------------------------------------------------------------------------------------------------------
    val paloma = Usuario("Paloma M Santos")
    val william = Usuario("William R C Onate")
    //------------------------------------------------------------------------------------------------------------------------
    
    println(kotlin.matricular(paloma))
    println(kotlin.matricular(paloma))
    println(kotlin.matricular(william))
   
}
