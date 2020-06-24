package ru.student1.task1.builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.setComputerCase("CompCase");
        computerBuilder.setCoolingSystem("CoolSys");
        computerBuilder.setCPU("CPU");
        computerBuilder.setGPU("GPU");
        computerBuilder.setMainMemory("MainMem");
        computerBuilder.setPSU("PSU");
        computerBuilder.setRAM("RAM");

        Computer computer = computerBuilder.build();
        System.out.println(computer);
    }
}
