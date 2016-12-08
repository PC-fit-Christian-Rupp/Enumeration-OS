//package EnumerationOperatingSystem;

public enum OperatingSystemClasses {

    //CONTENT
    DESKTOP(1),
    SERVER(2),
    EMBEDDED(3);
    //CONTENT

    private int numericValue;

    OperatingSystemClasses(int numericValue){
        this.numericValue = numericValue;
    }

    public OperatingSystemClasses parse(String stringToParse){
        for (OperatingSystemClasses oSC:OperatingSystemClasses.values())
        {
            if (stringToParse.toLowerCase().contains(oSC.name().toLowerCase()))
            {
            	return oSC;
            }
        }
        return OperatingSystemClasses.DESKTOP;
    
    }

    public int GetNumericValue(){
        return this.numericValue;
    }
}