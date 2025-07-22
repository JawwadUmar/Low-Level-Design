package CreationalDesignPattern.BuilderDesignPattern;

public class House {
    private String foundation;
    private String roof;
    private String structure;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private boolean hasGarage;


    private House(HouseBuilder houseBuilder){
        this.foundation = houseBuilder.foundation;
        this.roof = houseBuilder.roof;
        this.structure = houseBuilder.structure;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarden = houseBuilder.hasGarden;
        this.hasGarage = houseBuilder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", roof='" + roof + '\'' +
                ", structure='" + structure + '\'' +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }


    //Too many params in a constructor is a problem
    //foundation, roof and structure need to be necessarily set while others are by default false

    public static class HouseBuilder{
        private String foundation;
        private String roof;
        private String structure;
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private boolean hasGarage;

        public HouseBuilder(String foundation, String roof, String structure){
            this.foundation = foundation;
            this.roof = roof;
            this.structure = structure;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage){
            this.hasGarage = hasGarage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
