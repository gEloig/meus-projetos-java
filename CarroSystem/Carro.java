public class Carro {
    String marca;
    String modelo;
    int ano;
    String status;

    public Carro(String marca, String modelo, int ano, String status) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getStatus() {
        return status;
    }

    public void exibirCarrosVendidos(Carro[] carros) {
        System.out.println("##### LISTA DE CARROS VENDIDOS #####");
        for (Carro carro : carros) {
            if (carro.getStatus().equalsIgnoreCase("Vendido")) {
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Status: " + carro.getStatus());
                System.out.println("________________________________");
            }
        }
    }

    public void exibirCarrosDisponiveis(Carro[] carros) {
        System.out.println("##### LISTA DE CARROS DISPONÍVEIS #####");
        for (Carro carro : carros) {
            if (carro.getStatus().equalsIgnoreCase("Disponível")) {
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Status: " + carro.getStatus());
                System.out.println("________________________________");
            }
        }
    }
}