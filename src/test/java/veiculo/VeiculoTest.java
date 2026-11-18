package veiculo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Veiculo veiculo = new Veiculo("ABC1D23", "Onix", new Motor("Flex", 82), "Prata");

        Veiculo veiculoClone = veiculo.clone();
        veiculoClone.setPlaca("XYZ9E87");
        veiculoClone.setCor("Preto");
        veiculoClone.getMotor().setPotencia(116);

        assertEquals("Veiculo{placa='ABC1D23', modelo='Onix', motor=Motor{tipo='Flex', potencia=82}, cor='Prata'}", veiculo.toString());
        assertEquals("Veiculo{placa='XYZ9E87', modelo='Onix', motor=Motor{tipo='Flex', potencia=116}, cor='Preto'}", veiculoClone.toString());
    }

    @Test
    void deveCriarCloneComoNovoObjeto() throws CloneNotSupportedException {
        Veiculo veiculo = new Veiculo("ABC1D23", "Onix", new Motor("Flex", 82), "Prata");

        Veiculo veiculoClone = veiculo.clone();

        assertNotSame(veiculo, veiculoClone);
        assertEquals(veiculo.toString(), veiculoClone.toString());
    }

    @Test
    void deveClonarTambemOMotor() throws CloneNotSupportedException {
        Veiculo veiculo = new Veiculo("ABC1D23", "Onix", new Motor("Flex", 82), "Prata");

        Veiculo veiculoClone = veiculo.clone();

        assertNotSame(veiculo.getMotor(), veiculoClone.getMotor());
    }

    @Test
    void naoDeveAlterarCloneAoAlterarOriginal() throws CloneNotSupportedException {
        Veiculo veiculo = new Veiculo("ABC1D23", "Onix", new Motor("Flex", 82), "Prata");

        Veiculo veiculoClone = veiculo.clone();
        veiculo.getMotor().setTipo("Elétrico");

        assertEquals("Motor{tipo='Flex', potencia=82}", veiculoClone.getMotor().toString());
    }

}
