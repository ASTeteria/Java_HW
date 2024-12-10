package HW3_1;


import lombok.Data;

import lombok.ToString;

@Data

@ToString(callSuper = true)
public class Workstation extends Laptop {
    private boolean hasDedicatedGPU;
    private int gpuMemory;
}