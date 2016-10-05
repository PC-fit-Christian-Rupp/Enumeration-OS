//package EnumerationOperatingSystem;

public class Test{
	
    private static int ClassesContent = 3;
    private static String ClassesToParse = "Bla Embedded bla";

    private static int CountFamilyItems = 15;
    private static int CountDesktopFamilies = 4;
    private static int CountServerFamilies = 4;
    private static int CountEmbeddedFamilies = 7;

	public static void main(String[] args){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Test Classes data!");
		if (TestOperatingSystemClasses(ClassesContent)) {System.out.println("Content Test!\t\t\tFINISHED");}
        else {System.out.println("Content test!\t\t\tFAILED");}
        if (TestOperatingSystemClassesParse(ClassesToParse, ClassesContent)){System.out.println("Parse Test!\t\t\tFINISHED");}
        else {System.out.println("Parse test!\t\t\tFAILED");}
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Test Family data!");
        if (TestOperatingSystemFamily(CountFamilyItems)) {System.out.println("Family Test!\t\t\tFINISHED");}
        else {System.out.println("Family test!\t\t\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.DESKTOP, CountDesktopFamilies)) {
            System.out.println("Get All Desktop Families Test!\tFINISHED");
        }
        else {System.out.println("Get All Desktop test!\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.SERVER, CountServerFamilies)) {
            System.out.println("Get All SERVER Families Test!\tFINISHED");
        }
        else {System.out.println("Get All SERVER test!\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.EMBEDDED, CountEmbeddedFamilies)) {
            System.out.println("Get All Embedded Families Test!\tFINISHED");
        }
        else {System.out.println("Get All Embedded test!\tFAILED");}
        System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static Boolean TestOperatingSystemClasses(int CountItems)
	{
        return (OperatingSystemClasses.values().length == CountItems);
	}

    public static Boolean TestOperatingSystemClassesParse(String StringToParse, int Value)
    {
        OperatingSystemClasses oSC = OperatingSystemClasses.DESKTOP;
        return ((oSC.parse(StringToParse)).GetNumericValue() == Value);
    }

    public static Boolean TestOperatingSystemFamily(int CountItems)
    {
        return (OperatingSystemFamily.values().length == CountItems);
    }

    public static Boolean TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses oClass, int CountItems){
        OperatingSystemFamily oSF = OperatingSystemFamily.WINDOWS;
        return (oSF.GetAllFamiliesToClass(oClass).size() == CountItems);
    }
	
}