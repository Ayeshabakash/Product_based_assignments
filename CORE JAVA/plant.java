class Plant {
    private String name;
    private String species;
    public Plant(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void printDetails() {
        System.out.println("Name: " + name + ", Species: " + species);
    }
    public static void main(String[] args) {
        Plant plant1 = new Plant("Mangifera", "indica");
        Plant plant2 = new Plant("Solanum", "tuberosum");
        System.out.println("Initial Details:");
        plant1.printDetails();
        plant2.printDetails();
        plant1.setName("Lactuca");
        plant1.setSpecies("sativa");
        plant2.setName("Curcuma");
        plant2.setSpecies("longa");
        System.out.println("\nUpdated Details:");
        plant1.printDetails();
        plant2.printDetails();
    }
}
