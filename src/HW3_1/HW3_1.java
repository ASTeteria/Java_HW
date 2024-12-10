package HW3_1;

public class HW3_1 {
    public static void main(String[] args) {

        PC pc = new PC();
        pc.setProcessor("Intel i5");
        pc.setRam(12);
        pc.setStorage(600);
        System.out.println(pc);

        Laptop laptop = new Laptop();
        laptop.setProcessor("Intel i3");
        laptop.setRam(16);
        laptop.setStorage(1024);
        laptop.setScreenSize(15);
        laptop.setHasTouchScreen(true);
        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook();
        ultrabook.setProcessor("Intel i7");
        ultrabook.setRam(16);
        ultrabook.setStorage(1000);
        ultrabook.setScreenSize(14);
        ultrabook.setHasTouchScreen(false);
        ultrabook.setWeight(0.800);
        ultrabook.setBatteryLife(8);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation();
        workstation.setProcessor("AMD Ryzen 6");
        workstation.setRam(6);
        workstation.setStorage(128);
        workstation.setScreenSize(17);
        workstation.setHasTouchScreen(false);
        workstation.setHasDedicatedGPU(true);
        workstation.setGpuMemory(3);
        System.out.println(workstation);
    }
}