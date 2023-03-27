import javax.swing.JOptionPane;
public interface Ejercicio_basicos_DDR_28 {
    /**
     * @param args
     */
    public static void main(String[] args){
        String texto=JOptionPane.showInputDialog(null,"Insertar una frase","Insercion",JOptionPane.INFORMATION_MESSAGE);

        //Usando para almacenar el texto final 
        String texto_sin_espacios="";

        char caracterActual;

        //recorro el array
        for(int i=0;i<texto.length();i++){
            caracterActual=texto.charAt(i);
        
            //Cuando es un espacio no lo copia a la cadena
            if(caracterActual!= ' '){
                texto_sin_espacios+=String.valueOf(caracterActual);

            }

        }
         JOptionPane.showMessageDialog(null,"La frase tiene sin espacios es "+texto_sin_espacios,texto_sin_espacios, JOptionPane.INFORMATION_MESSAGE);
    }
    
}


