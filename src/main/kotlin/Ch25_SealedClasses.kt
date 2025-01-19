import javax.sound.midi.MetaMessage

//Sealed Classes restrict class hierarchies
//All subclasses must be defined in the same file

sealed class ScreenUiState{

    object Loading: ScreenUiState()
    data class Success(var data: SomeData): ScreenUiState()
    data class Error(val errMessage: String): ScreenUiState()
}

data class SomeData(val name: String)

fun main() {
    updateUI(state = ScreenUiState.Loading)
    //some delay
    Thread.sleep(1000)
    updateUI(state = ScreenUiState.Success(SomeData("Test")))
}

fun updateUI(state: ScreenUiState){
    when(state){

        is ScreenUiState.Loading -> {
            println("Loading")
        }

        is ScreenUiState.Success -> {
            println(state.data)
        }

        is ScreenUiState.Error -> {
            println(state.errMessage)
        }

    }
}