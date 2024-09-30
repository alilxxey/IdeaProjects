class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor[model=" + model + ", frequency=" + frequency + "GHz]";
    }
}

class Memory {
    private String type;
    private int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory[type=" + type + ", size=" + size + "GB]";
    }
}

class Monitor {
    private String resolution;
    private int size;

    public Monitor(String resolution, int size) {
        this.resolution = resolution;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor[resolution=" + resolution + ", size=" + size + " inches]";
    }
}

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer[" + processor + ", " + memory + ", " + monitor + "]";
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 3.8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080", 24);

        Computer computer = new Computer(processor, memory, monitor);
        System.out.println(computer);
    }
}
