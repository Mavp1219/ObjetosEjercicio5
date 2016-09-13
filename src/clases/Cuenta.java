/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Cuenta {
    private int n_cuenta;
    private String n_dentificacion;
    private double Saldo;

    public Cuenta(int n_cuenta, String n_dentificacion, double Saldo) {
        this.n_cuenta = n_cuenta;
        this.n_dentificacion = n_dentificacion;
        this.Saldo = Saldo;
    }
    
  

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String getN_dentificacion() {
        return n_dentificacion;
    }

    public void setN_dentificacion(String n_dentificacion) {
        this.n_dentificacion = n_dentificacion;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    
   public void ActulizarSaldo(double ian){
        double aux, aux2;
        aux = this.getSaldo()*(ian/365);
        aux2 = this.getSaldo() + aux;
        this.setSaldo(aux2);
    }
    
   public void Ingresar(double ingreso){
       double aux;
       aux=this.getSaldo()+ingreso;
       this.setSaldo(aux);
   }
   
   public void Retirar(double egreso){
       double aux;
       aux = this.getSaldo() - egreso;
       this.setSaldo(aux);
       
   }
   
   public String Mostrar(){
       String aux;
       aux = "No. de la cuenta: "+this.getN_cuenta()+"\n"
           + "No. de Identificación: "+this.getN_dentificacion()+"\n"
           + "Saldo Actual: "+this.getSaldo();
        return aux;
   }
    
    
    
    
}
