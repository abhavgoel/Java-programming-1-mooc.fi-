public class Archive {
    private String name;
    private String identifier;
    
    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        if(!(obj instanceof Archive)) {
            return false;
        }

        Archive compared = (Archive)obj;
        return this.identifier.equals(compared.getIdentifier());

    }
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
