//package EnumerationOperatingSystem;

public class Test{
	
    private static int ClassesContent = 3;
    private static String ClassesToParse = "Bla Embedded bla";

    private static int CountFamilyItems = 15;
    private static int CountDesktopFamilies = 4;
    private static int CountServerFamilies = 4;
    private static int CountEmbeddedFamilies = 7;
    private static String FamilyToParse = "bla OS X Server bla";
    private static String FamilyName = "OS X Server";

	public static void main(String[] args){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Test Classes data!");
		if (TestOperatingSystemClasses(ClassesContent)) {System.out.println("Content Test!\t\t\tFINISHED");}
        else {System.out.println("Content Test!\t\t\tFAILED");}
        if (TestOperatingSystemClassesParse(ClassesToParse, ClassesContent)){System.out.println("Parse Test!\t\t\tFINISHED");}
        else {System.out.println("Parse Test!\t\t\tFAILED");}
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Test Family data!");
        if (TestOperatingSystemFamily(CountFamilyItems)) {System.out.println("Family Test!\t\t\tFINISHED");}
        else {System.out.println("Family Test!\t\t\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.DESKTOP, CountDesktopFamilies)) {
            System.out.println("Get All Desktop Families Test!\tFINISHED");
        }
        else {System.out.println("Get All Desktop Test!\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.SERVER, CountServerFamilies)) {
            System.out.println("Get All SERVER Families Test!\tFINISHED");
        }
        else {System.out.println("Get All SERVER Test!\tFAILED");}
        if (TestOperatingSystemFamilyGetAllFamiliesToClass(OperatingSystemClasses.EMBEDDED, CountEmbeddedFamilies)) {
            System.out.println("Get All Embedded Families Test!\tFINISHED");
        }
        else {System.out.println("Get All Embedded test!\tFAILED");}
        if (TestOperatingSystemFamilyParse(FamilyToParse, FamilyName)) {
            System.out.println("Family Parse Test!\t\tFINISHED");
        }
        else {System.out.println("Family Parse Test!\t\tFAILED");}
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

    public static Boolean TestOperatingSystemFamilyParse(String StringToParse, String familyName)
    {
        OperatingSystemFamily oSF = OperatingSystemFamily.WINDOWS;
        return (oSF.parse(StringToParse).getFamilyName() == familyName);
    }
	
}