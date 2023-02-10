import javax.swing.JOptionPane

var mayor= 0
var texto = JOptionPane.showInputDialog("Ingresa la lista de numeros correspondiente")
var listaDeNumerosTexto= texto.split(",".toRegex()).toTypedArray()
var cantidad= listaDeNumerosTexto.size


var listaDeNumeros= IntArray(cantidad)
for(i in(0 until cantidad)){
    listaDeNumeros[i]= listaDeNumerosTexto[i].toInt()
}
listaDeNumeros.forEach {
    if (it>mayor){
        mayor=it
    }
}

JOptionPane.showMessageDialog(null, "El numero mayor es $mayor")