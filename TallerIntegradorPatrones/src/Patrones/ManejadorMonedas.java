/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

/**
 *
 * @author CltControl
 */
public class ManejadorMonedas {
    protected int monto;
    protected double denominacion;

    public ManejadorMonedas(int monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }

    public int getMonto(){ return monto; }
    public double getDenominacion(){ return denominacion; }
    public void setMonto(int monto){ this.monto = monto; }

    public boolean retirar(int monto){
        // Implementar
        //IMPLEMENTADO
        if (this.monto>=monto && (monto % denominacion)==0 ){
            this.monto=this.monto-monto;
            return true;
        }
        return false;
    }
    public boolean depositar(int monto, int denominacion){
        // Implementar
        //IMPLEMENTADO
        if((monto % denominacion)==0 && this.denominacion== denominacion){
            this.monto = this.monto + monto;
        }
        return false;
    }
}
