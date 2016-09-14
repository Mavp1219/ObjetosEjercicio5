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
    
     private long n_cuenta;
    private long n_identificacion;
    private double  saldo;

    public Cuenta(long n_cuenta, long n_identificacion, double saldo) {
        this.n_cuenta = n_cuenta;
        this.n_identificacion = n_identificacion;
        this.saldo = saldo;
    }
    
    
     public Cuenta(long n_cuenta, long n_identifacion){
        this.n_cuenta=n_cuenta;
        this.n_identificacion=n_identifacion;
        this.saldo=0;
    }
    

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public long getN_identificacion() {
        return n_identificacion;
    }

    public void setN_identificacion(long n_identificacion) {
        this.n_identificacion = n_identificacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

 

    public void ActualizarSaldo(double interes){
        double aux, aux2;
        aux = this.getSaldo() * (interes / 365);
        aux2 = this.getSaldo() + aux;
        this.setSaldo(aux2);
    }
    
    public void IngresarSaldo(double ingreso){
        double aux;
        aux = this.getSaldo() + ingreso;
        this.setSaldo(aux);
    }
    
    public void RetirarSaldo(double egreso){
         double aux;
         aux = this.getSaldo() - egreso;
         this.setSaldo(aux);
    }
    
    public String Mostrar(){
        String aux;
        aux = "El número de su cuenta es: " +this.getN_cuenta()+"\n"+
              "El número de su identificaión es: " +this.getN_identificacion()+"\n"+
              "El saldo actual de su cuenta es: " +this.getSaldo();
        return aux;
    }


}