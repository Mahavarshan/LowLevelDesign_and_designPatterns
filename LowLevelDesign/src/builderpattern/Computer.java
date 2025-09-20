package builderpattern;

public class Computer {

	 	private String CPU;
	    private String RAM;
	    private String storage;
	    private boolean isGraphicsCardEnabled;

	    // Private constructor
	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	    }

	    // Static nested Builder class
	    public static class Builder {
	        private String CPU;
	        private String RAM;
	        private String storage;
	        private boolean isGraphicsCardEnabled;

	        // Builder methods for setting properties
	        public Builder setCPU(String CPU)
	        {
	            this.CPU = CPU;
	            return this; // return Builder for chaining
	        }

	        public Builder setRAM(String RAM) {
	            this.RAM = RAM;
	            return this;
	        }

	        public Builder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
	            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	            return this;
	        }

	        // Build method to return the final object
	        public Computer build() {
	            return new Computer(this);
	        }
	    }

	    // To print computer details
	    @Override
	    public String toString() {
	        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage 
	                + ", GraphicsCard=" + isGraphicsCardEnabled + "]";
	    }
}
