package builderpattern;

public class Driver {

	public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);
    }
}
