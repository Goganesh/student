package ru.student1.task1.builder;

public class Computer {
    private final String RAM;
    private final String mainMemory;
    private final String CPU;
    private final String PSU;
    private final String GPU;
    private final String computerCase;
    private final String coolingSystem;

    public Computer(String RAM, String mainMemory, String CPU, String PSU, String GPU, String computerCase, String coolingSystem) {
        this.RAM = RAM;
        this.mainMemory = mainMemory;
        this.CPU = CPU;
        this.PSU = PSU;
        this.GPU = GPU;
        this.computerCase = computerCase;
        this.coolingSystem = coolingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", mainMemory='" + mainMemory + '\'' +
                ", CPU='" + CPU + '\'' +
                ", PSU='" + PSU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", computerCase='" + computerCase + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                '}';
    }

    public String getRAM() {
        return RAM;
    }

    public String getMainMemory() {
        return mainMemory;
    }

    public String getCPU() {
        return CPU;
    }

    public String getPSU() {
        return PSU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }
}
