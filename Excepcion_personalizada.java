/*
Ejemplo de Excepciones personalizadas, el ejemplo se basa en verificar una contraseña
para esta se creo una excepcion propia para poder hacer la verificacion la cual se llama PassException





*/
import javax.swing.JOptionPane;
public class Excepcion_personalizada {// clase principal donde se ejectan todos los algoritmos
    public static void main(String args[]){
        
        String pass,repass; //
        //usuario=JOptionPane.showInputDialog("inserte el nombre de usuario");
          JOptionPane.showMessageDialog(null,"Intoduzca la contraseña con un numero de caracteres mayor a 7");
       

        pass=JOptionPane.showInputDialog("inserte la contraseña");
        repass=JOptionPane.showInputDialog("inserte la contraseña de nuevo para verificar");
        Validacion validacion=new Validacion();
        
        
        // se realiza la capturacion de las excepciones lanzadas
        try{
        
        validacion.verifacadoPassword(pass,repass);
        
        
        
        
        
        }catch(PassException e){
            System.out.println("El usuario no se puede registrar ya que " + e.getMessage());
            JOptionPane.showMessageDialog(null,"El usuario no se puede registrar ya que  " + e.getMessage());
            
        
        
        }
        
               
        
       
    
    
    }
    
}

//creacion de la clase personalizada llamada passexception
class PassException extends Exception{
    
    
    //public static final long serialVersionUID=700L;
    public PassException(String mensaje){
        super(mensaje);
        
    
    }
    


}



class Validacion{// clase de validacion 
    
    
    public void verifacadoPassword(String pass, String repass) throws PassException{// en este metodo se lanza una exceptcion para ser capturada 
        if(pass.equals(repass)==false){
        
            throw new PassException("el tamaño de la contraseña no coincide con la verficacion ");// se envia una excepcion en este punto de tipoPassException
            
        
        }
         if(pass.length()<7){
         throw new PassException("la contraseña no cumple con el tamaño correcto");//se envia una exception en este punto de tipo PassException
         
         }
    
    
    }
    





}