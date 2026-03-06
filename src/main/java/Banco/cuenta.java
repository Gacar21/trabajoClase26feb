package Banco;

public class cuenta {
    // float o int = los cajeros solo dejan retirar enteros, pero si desde el celular hace una transaccion, en el cajero
    // al mostrar el saldo final: no sera entero el numero, puede que haya hecho movimientos desde la app
    // por eso deje el float :D
    private float saldo;

    public cuenta(){
        this.saldo = 0;
    }

    public cuenta (float montoInicial){
        if (montoInicial > 0){
            this.saldo = montoInicial;
        }else {
            System.out.println("El monto ingresado no puede ser menor que cero");
        }
    }

    public void depositarSaldo( float monto){
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Deposito cargado correctamente. su saldo actual es: " + this.saldo);
        }else {
        System.out.println("El deposito ingresado no puede ser menor o igual que cero");
        }
    }

    public boolean retirarSaldo (float monto){
        if (monto >0 && monto <= this.saldo){
            this.saldo -= monto;
            System.out.println("Retiro de dinero exitoso. su saldo actual es: " + this.saldo);
            return true;
        }else{
            System.out.println("Saldo insuficiente o valor invalido");
            return false;
        }
    }
    public float getSaldo(){
        return this.saldo;
    }

}
