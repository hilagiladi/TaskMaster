public class ResourceRequirements {
    private int cpuCores;
    private int memoryGB;
    // Additional resource parameters as needed

    // Constructors, getters, and setters

    public ResourceRequirements(int cpuCores, int memoryGB) {
        this.cpuCores = cpuCores;
        this.memoryGB = memoryGB;
    }

    public ResourceRequirements(ResourceRequirements other) {
         this(other.cpuCores, other.memoryGB);
    }


    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }



    // Other methods as needed
}

