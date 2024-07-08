
package ejercicio1;

public class ejercicio1 {
    private String titular;
    private double cantidad;
    //constructor 1
    public ejercicio1(String titular, double cantidad){
        this.titular= titular;
        this.cantidad= cantidad;
        
    }
    //constructor 2
    public ejercicio1(String titular){
        this.titular= titular;
        this.cantidad= 0;
    }
    public String getTitular(){
        return titular;      
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public Double getCantidad(){
        return cantidad;
    }
    public void  setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad){
        if(cantidad == 0){
            this.cantidad += cantidad ;
        }
        }
     public void retirar (double cantidad){
         if(this.cantidad - cantidad >= 0){
             this.cantidad-= cantidad;
         
         }else{
             this.cantidad=0;
         }
     }
    @Override
  public String toString(){
      return "cuenta " + "titular = " + titular + " cantidad: " + cantidad;
  }
 public static void main(String[] args) {
       ejercicio1 ejercicio = new ejercicio1("josue",500);
       ejercicio.ingresar(500);
       System.out.println("ingresa 500:" + ejercicio);
       
       ejercicio.retirar(500);
        System.out.println("retira 500:" + ejercicio);
        
    }
}
  

