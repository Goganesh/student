package ru.student1.task1.builder;

public class ComputerBuilder {
    private String RAM;
    private String mainMemory;
    private String CPU;
    private String PSU;
    private String GPU;
    private String computerCase;
    private String coolingSystem;

    public Computer build(){
        Computer computer = new Computer(RAM, mainMemory, CPU, PSU, GPU, computerCase, coolingSystem);
        return computer;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getMainMemory() {
        return mainMemory;
    }

    public void setMainMemory(String mainMemory) {
        this.mainMemory = mainMemory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getPSU() {
        return PSU;
    }

    public void setPSU(String PSU) {
        this.PSU = PSU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
}
