class CPU {
    double price;

    
    CPU(double price) {
        this.price = price;
    }

    
    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.noOfCores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Information:");
            System.out.println("No of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    
    class RAM {
        int memory; 
        String manufacturer;
        Processor processor; 
        RAM(int memory, String manufacturer, Processor processor) {
            this.memory = memory;
            this.manufacturer = manufacturer;
            this.processor = processor;
        }

        void displayProcessorInfo() {
            System.out.println("Processor information of RAM:");
            processor.display(); 
        }

        void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(50000);

        
        CPU.Processor processor = cpu.new Processor(8, "Intel");

        
        CPU.RAM ram = cpu.new RAM(16, "Corsair", processor);

         
        ram.displayProcessorInfo();
    }
}
