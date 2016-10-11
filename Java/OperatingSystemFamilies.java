//package EnumerationOperatingSystem;
import java.util.*;

public enum OperatingSystemFamilies{
    
    WINDOWS ("WINDOWS", OperatingSystemClasses.DESKTOP),
	WINDOWSSERVER ("WINDOWS SERVER", OperatingSystemClasses.SERVER),
	WINDOWSMOBILE ("WINDOWS Mobile", OperatingSystemClasses.EMBEDDED),
	WINDOWSPHONE ("WINDOWS Phone", OperatingSystemClasses.EMBEDDED),
	WINDOWSTENMOBILE ("WINDOWS 10 Mobile", OperatingSystemClasses.EMBEDDED),
	UBUNTU ("Ubuntu", OperatingSystemClasses.DESKTOP),
	UBUNTUSERVER ("Ubuntu Server", OperatingSystemClasses.SERVER),
	LINUX ("Linux", OperatingSystemClasses.DESKTOP),
	LINUXSERVER ("Linux Server", OperatingSystemClasses.SERVER),
	MAC ("OS X", OperatingSystemClasses.DESKTOP),
	MACSERVER ("OS X Server", OperatingSystemClasses.SERVER),
	IOS ("iOS", OperatingSystemClasses.EMBEDDED),
	TVOS ("tvOS", OperatingSystemClasses.EMBEDDED),
	WATCHOS ("watchOS", OperatingSystemClasses.EMBEDDED),
	ANDROID ("Android", OperatingSystemClasses.EMBEDDED);

    private String familyName;
    private OperatingSystemClasses oClasses;

    OperatingSystemFamilies(String familyName, OperatingSystemClasses oClasses){
        this.familyName = familyName;
        this.oClasses = oClasses;
    }

    public List<OperatingSystemFamilies> GetAllFamiliesToClass(OperatingSystemClasses oClassToSearch){
        List<OperatingSystemFamilies> oReturnList = new ArrayList<OperatingSystemFamilies>();
        for (OperatingSystemFamilies OSF: OperatingSystemFamilies.values())
        {
            if (OSF.GetOClasses() == oClassToSearch){oReturnList.add(OSF);}
        }
        return oReturnList;
    }

    public OperatingSystemFamilies parse(String stringToParse){
        List<OperatingSystemFamilies> oList = GetAllFamiliesToClass(OperatingSystemClasses.DESKTOP.parse(stringToParse));
        for (OperatingSystemFamilies oItem:oList)
        {
            int partsOfStringFound = 0;
            for (String part:oItem.getFamilyName().split(" "))
            {
                if (stringToParse.toLowerCase().contains(part.toLowerCase())){partsOfStringFound+=1;}
            }
            if (partsOfStringFound==oItem.getFamilyName().split(" ").length){return oItem;}
        }
        return null;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public OperatingSystemClasses GetOClasses(){
        return this.oClasses;
    }
}