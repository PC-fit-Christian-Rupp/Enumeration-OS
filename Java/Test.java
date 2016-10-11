//package EnumerationOperatingSystem;

public class Test{
	
    private static int ClassesContent = /*CLASSCOUNT:START*/3/*CLASSCOUNT:END*/;
    private static String ClassesToParse = "Bla Embedded bla";

    private static int CountFamilyItems = 15;
    private static int CountDesktopFamilies = 4;
    private static int CountServerFamilies = 4;
    private static int CountEmbeddedFamilies = 7;
    private static String FamilyToParse = "bla OS X Server bla";
    private static String FamilyName = "OS X Server";
    
    private static int CountOperatingSystems = 122;
    private static int CountDesktopSystems = 59;
    private static int CountServerSystems = 57;
    private static int CountEmbeddedSystems = 6;
    private static int CountWindowsSystems = 6;
    private static int CountWindowsServerSystems = 5;
    private static int CountUbuntuSystems = 9;
    private static int CountUbuntuServerSystems = 9;
    private static int CountLinuxSystems = 30;
    private static int CountLinuxServerSystems = 30;
    private static int CountMacDesctopSytems = 13;
    private static int CountMacServerSystems = 12;
    private static int CountiOSSystems = 3;
    private static int CounttvOSSystems = 1;
    private static int CountwatchOSSystems = 2; 

	public static void main(String[] args){

        PrintLine();

        System.out.println("Test Classes data!");
		if (TestOperatingSystemClasses(ClassesContent)) {System.out.println("Content Test!\t\t\t\t\tFINISHED");}
        else {System.out.println("Content Test!\t\t\t\t\tFAILED");}
        if (TestOperatingSystemClassesParse(ClassesToParse, ClassesContent)){System.out.println("Parse Test!\t\t\t\t\tFINISHED");}
        else {System.out.println("Parse Test!\t\t\t\t\tFAILED");}

        PrintLine();

        System.out.println("Test Family data!");
        if (TestOperatingSystemFamilies(CountFamilyItems)) {System.out.println("Family Test!\t\t\t\t\tFINISHED");}
        else {System.out.println("Family Test!\t\t\t\t\tFAILED");}
        if (TestOperatingSystemFamiliesGetAllFamiliesToClass(OperatingSystemClasses.DESKTOP, CountDesktopFamilies)) {
            System.out.println("Get All Desktop Families Test!\t\t\tFINISHED");
        }
        else {System.out.println("Get All Desktop Test!\t\t\tFAILED");}
        if (TestOperatingSystemFamiliesGetAllFamiliesToClass(OperatingSystemClasses.SERVER, CountServerFamilies)) {
            System.out.println("Get All SERVER Families Test!\t\t\tFINISHED");
        }
        else {System.out.println("Get All SERVER Test!\t\t\tFAILED");}
        if (TestOperatingSystemFamiliesGetAllFamiliesToClass(OperatingSystemClasses.EMBEDDED, CountEmbeddedFamilies)) {
            System.out.println("Get All Embedded Families Test!\t\t\tFINISHED");
        }
        else {System.out.println("Get All Embedded test!\t\t\tFAILED");}
        if (TestOperatingSystemFamiliesParse(FamilyToParse, FamilyName)) {
            System.out.println("Family Parse Test!\t\t\t\tFINISHED");
        }
        else {System.out.println("Family Parse Test!\t\t\t\tFAILED");}

        PrintLine();

        System.out.println("Test Operating System Data");
        if (TestOperatingSystems(CountOperatingSystems)) {System.out.println("Operating Systems Test!\t\t\t\tFINISHED");}
        else {System.out.println("Operating Systems Test!\t\t\t\tFAILED");}
        if (TestOperatingSystemsVersionToFloat(OperatingSystems.JAGUAR, 10.2) 
            && TestOperatingSystemsVersionToFloat(OperatingSystems.PRECISEPANGOLINSERVER, 12.0405)) {
            System.out.println("Operating Systems Version To Float Test!\tFINISHED");}
        else {System.out.println("Operating Systems Version To Float Test!\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToClass(OperatingSystemClasses.DESKTOP, CountDesktopSystems)) {
            System.out.println("Desktop Operating System Test!\t\t\tFINISHED");
        }
        else {System.out.println("Desktop Operating System Test!\t\t\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToClass(OperatingSystemClasses.SERVER, CountServerSystems)) {
            System.out.println("Server Operating System Test!\t\t\tFINISHED");
        }
        else {System.out.println("Server Operating System Test!\t\t\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToClass(OperatingSystemClasses.EMBEDDED, CountEmbeddedSystems)) {
            System.out.println("Embedded Operating System Test!\t\t\tFINISHED");
        }
        else {System.out.println("Embedded Operating System Test!\t\t\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToFamily(OperatingSystemFamilies.WINDOWS, CountWindowsSystems)) {
            System.out.println("Windows Operating System Test!\t\t\tFINISHED");
        }
        else{System.out.println("Windows Operating System Test!\t\t\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToFamily(OperatingSystemFamilies.WINDOWSSERVER, CountWindowsServerSystems)) {
            System.out.println("Windows Server Operating System Test!\t\tFINISHED");
        }
        else{System.out.println("Windows Server Operating System Test!\t\tFAILED");}
        if (TestOperatingSystemsGetAllOperatingSystemsToFamily(OperatingSystemFamilies.UBUNTU, CountUbuntuSystems)) {
            System.out.println("Ubuntu Operating System Test!\t\t\tFINISHED");
        }
        else{System.out.println("Ubuntu Operating System Test!\t\t\tFAILED");}
        if (TestOperatingSystemsToString(OperatingSystems.XP, "WINDOWS XP")){
            System.out.println("Windows To String Test!\t\t\t\tFINISHED");
        }
        else{System.out.println("Windows To String Test!\t\t\t\tFAILED");}
        if (TestOperatingSystemsToString(OperatingSystems.TRUSTYTAHR, "Ubuntu 14.04.02")){
            System.out.println("Ubuntu To String Test!\t\t\t\tFINISHED");
        }
        else{System.out.println("Ubuntu To String Test!\t\t\t\tFAILED");}
        if (TestOperatingSystemsToString(OperatingSystems.TIGER, "MAC OS X 10.4")){
            System.out.println("MAC To String Test!\t\t\t\tFINISHED");
        }
        else{System.out.println("MAC To String Test!\t\t\t\tFAILED");}
        if (TestOperatingSystemsToString(OperatingSystems.TIGERSERVER, "MAC OS X Server 10.4")){
            System.out.println("MAC Server To String Test!\t\t\tFINISHED");
        }
        else{System.out.println("MAC Server To String Test!\t\t\tFAILED");}
        if (TestOperatingSystemsToString(OperatingSystems.IOSEIGHT, "iOS 8")){
            System.out.println("Default To String Test!\t\t\t\tFINISHED");
        }
        else{System.out.println("Default To String Test!\t\t\t\tFAILED");}
        PrintLine();
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

    public static Boolean TestOperatingSystemFamilies(int CountItems)
    {
        return (OperatingSystemFamilies.values().length == CountItems);
    }

    public static Boolean TestOperatingSystemFamiliesGetAllFamiliesToClass(OperatingSystemClasses oClass, int CountItems){
        OperatingSystemFamilies oSF = OperatingSystemFamilies.WINDOWS;
        return (oSF.GetAllFamiliesToClass(oClass).size() == CountItems);
    }

    public static Boolean TestOperatingSystemFamiliesParse(String StringToParse, String familyName)
    {
        OperatingSystemFamilies oSF = OperatingSystemFamilies.WINDOWS;
        return (oSF.parse(StringToParse).getFamilyName() == familyName);
    }

    public static Boolean TestOperatingSystems(int CountItems){
        return (OperatingSystems.values().length == CountItems);
    }

    public static Boolean TestOperatingSystemsVersionToFloat(OperatingSystems OS, Double AssertValue)
    {
        return (OS.versionToFloat().equals(AssertValue));
    }

    public static Boolean TestOperatingSystemsGetAllOperatingSystemsToClass(OperatingSystemClasses oClass, int CountItems){
        OperatingSystems os = OperatingSystems.CHEETAH;
        return (os.GetAllOperatingSystemsToClass(oClass).size() == CountItems);
    }

    public static Boolean TestOperatingSystemsGetAllOperatingSystemsToFamily(OperatingSystemFamilies oFamily, int CountItems){
        OperatingSystems os = OperatingSystems.CHEETAH;
        return (os.GetAllOperatingSystemsToFamily(oFamily).size() == CountItems);
    }

    public static Boolean TestOperatingSystemsToString(OperatingSystems OS, String strResult){
        return (OS.toString().equals(strResult));
    }

    public static void PrintLine(){
        System.out.println("-------------------------------------------------------------------------------");
    }
	
}