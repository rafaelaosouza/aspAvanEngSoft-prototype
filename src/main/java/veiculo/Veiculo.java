package veiculo;

public class Veiculo implements Cloneable {
    private String placa;
    private String modelo;
    private Motor motor;
    private String cor;

    public Veiculo(String placa, String modelo, Motor motor, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Veiculo clone() throws CloneNotSupportedException {
        Veiculo veiculoClone = (Veiculo) super.clone();
        veiculoClone.motor = (Motor) veiculoClone.motor.clone();
        return veiculoClone;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", cor='" + cor + '\'' +
                '}';
    }
}
