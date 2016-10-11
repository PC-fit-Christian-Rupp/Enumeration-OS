//package EnumerationOperatingSystem;
import java.util.*;

public enum OperatingSystems{

    // WINDOWS Desktop Family
	XP ("XP", "5.1", OperatingSystemFamilies.WINDOWS),
	VISTA ("Vista", "6.0", OperatingSystemFamilies.WINDOWS),
	SEVEN ("7", "6.1", OperatingSystemFamilies.WINDOWS),
	EIGHT ("8", "6.2", OperatingSystemFamilies.WINDOWS),
	EIGHTONE ("8.1", "6.3", OperatingSystemFamilies.WINDOWS),
	TEN ("10", "10.0",OperatingSystemFamilies.WINDOWS),

	// WINDOWS Server Family
	TWOTHOUSANDTHREE ("2003", "5.3", OperatingSystemFamilies.WINDOWSSERVER),
	TWOTHOUSANDEIGHT ("2008", "6.0", OperatingSystemFamilies.WINDOWSSERVER),
	TWOTHOUSANDEIGHTR2 ("2008 R2", "6.1", OperatingSystemFamilies.WINDOWSSERVER),
	TWOTHOUSANDTWELVE ("2012", "6.2", OperatingSystemFamilies.WINDOWSSERVER),
	TWOTHOUSANDTWELVER2 ("2012 R2", "6.3", OperatingSystemFamilies.WINDOWSSERVER),

	// UBUNTU Desktop Family
	PRECISEPANGOLIN ("Precise Pangolin", "12.04.05", OperatingSystemFamilies.UBUNTU),
	QUANTALQUETZAL ("Quantal Quetzal", "12.10", OperatingSystemFamilies.UBUNTU),
	RAIRINGRINGTAIL ("Rairing Ringtail", "12.04", OperatingSystemFamilies.UBUNTU),
	SAUCYSALAMANDER ("Saucy Salamander", "13.04", OperatingSystemFamilies.UBUNTU),
	TRUSTYTAHR ("Trusty Tahr", "14.04.02", OperatingSystemFamilies.UBUNTU),
	UTOPICUNICORN ("Utopic Unicorn", "14.10", OperatingSystemFamilies.UBUNTU),
	VIVIDVERVET ("Vivid Veret", "15.04", OperatingSystemFamilies.UBUNTU),
	WILYWEREWOLF ("Wily Werewolf", "15.10", OperatingSystemFamilies.UBUNTU),
	XENIALXERUS ("Xenial Xerus", "16.04", OperatingSystemFamilies.UBUNTU), 

	// UBUNTU SERVER Family
	PRECISEPANGOLINSERVER ("Precise Pangolin", "12.04.05", OperatingSystemFamilies.UBUNTUSERVER),
	QUANTALQUETZALSERVER ("Quantal Quetzal", "12.10", OperatingSystemFamilies.UBUNTUSERVER),
	RAIRINGRINGTAILSERVER ("Rairing Ringtail", "12.04", OperatingSystemFamilies.UBUNTUSERVER),
	SAUCYSALAMANDERSERVER ("Saucy Salamander", "13.04", OperatingSystemFamilies.UBUNTUSERVER),
	TRUSTYTAHRSERVER ("Trusty Tahr", "14.04.02", OperatingSystemFamilies.UBUNTUSERVER),
	UTOPICUNICORNSERVER ("Utopic Unicorn", "14.10", OperatingSystemFamilies.UBUNTUSERVER),
	VIVIDVERVETSERVER ("Vivid Veret", "15.04", OperatingSystemFamilies.UBUNTUSERVER),
	WILYWEREWOLFSERVER ("Wily Werewolf", "15.10", OperatingSystemFamilies.UBUNTUSERVER),
	XENIALXERUSSERVER ("Xenial Xerus", "16.04", OperatingSystemFamilies.UBUNTUSERVER),	

	// LINUX Kernel Family Desktop
	TWOFOUR ("Kernel", "2.4", OperatingSystemFamilies.LINUX),
	TWOFIVE ("Kernel", "2.5", OperatingSystemFamilies.LINUX),
	TWOSIX ("Kernel", "2.6", OperatingSystemFamilies.LINUX),
	THREE ("Kernel", "3.0", OperatingSystemFamilies.LINUX),
	THREEONE ("Kernel", "3.1", OperatingSystemFamilies.LINUX),
	THREETWO ("Kernel", "3.2", OperatingSystemFamilies.LINUX),
	THREETHREE ("Kernel", "3.3", OperatingSystemFamilies.LINUX),
	THREEFOUR ("Kernel", "3.4", OperatingSystemFamilies.LINUX),
	THREEFIVE ("Kernel", "3.5", OperatingSystemFamilies.LINUX),
	THREESIX ("Kernel", "3.6", OperatingSystemFamilies.LINUX),
	THREESEVEN ("Kernel", "3.7", OperatingSystemFamilies.LINUX),
	THREEEIGHT ("Kernel", "3.8", OperatingSystemFamilies.LINUX),
	THREENINE ("Kernel", "3.9", OperatingSystemFamilies.LINUX),
	THREETEN ("Kernel", "3.10", OperatingSystemFamilies.LINUX),
	THREEELEVEN ("Kernel", "3.11", OperatingSystemFamilies.LINUX),
	THREETWELVE ("Kernel", "3.12", OperatingSystemFamilies.LINUX),
	THREETHIRTEEN ("Kernel", "3.13", OperatingSystemFamilies.LINUX),
	THREEFOURTEEN ("Kernel", "3.14", OperatingSystemFamilies.LINUX),
	THREEFIVTEEN ("Kernel", "3.15", OperatingSystemFamilies.LINUX),
	THREESIXTEEN ("Kernel", "3.16", OperatingSystemFamilies.LINUX),
	THREEEIGHTEEN  ("Kernel", "3.18", OperatingSystemFamilies.LINUX),
	THREENINETEEN ("Kernel", "3.19", OperatingSystemFamilies.LINUX),
	FOUR ("Kernel", "4.0", OperatingSystemFamilies.LINUX),
	FOURONE ("Kernel", "4.1", OperatingSystemFamilies.LINUX),
	FOURTWO ("Kernel", "4.2", OperatingSystemFamilies.LINUX),
	FOURTHREE ("Kernel", "4.3", OperatingSystemFamilies.LINUX),
	FOURFOUR ("Kernel", "4.4", OperatingSystemFamilies.LINUX),
	FOURFIVE ("Kernel", "4.5", OperatingSystemFamilies.LINUX),
	FOURSIX ("Kernel", "4.6", OperatingSystemFamilies.LINUX),
	FOURSEVEN ("Kernel", "4.7", OperatingSystemFamilies.LINUX),	
	FOUREIGHT ("Kernel", "4.8", OperatingSystemFamilies.LINUX),

	// LINUX Kernel Family SERVER
	TWOFOURSERVER ("Kernel", "2.4", OperatingSystemFamilies.LINUXSERVER),
	TWOFIVESERVER ("Kernel", "2.5", OperatingSystemFamilies.LINUXSERVER),
	TWOSIXSERVER ("Kernel", "2.6", OperatingSystemFamilies.LINUXSERVER),
	THREESERVER ("Kernel", "3.0", OperatingSystemFamilies.LINUXSERVER),
	THREEONESERVER ("Kernel", "3.1", OperatingSystemFamilies.LINUXSERVER),
	THREETWOSERVER ("Kernel", "3.2", OperatingSystemFamilies.LINUXSERVER),
	THREETHREESERVER ("Kernel", "3.3", OperatingSystemFamilies.LINUXSERVER),
	THREEFOURSERVER ("Kernel", "3.4", OperatingSystemFamilies.LINUXSERVER),
	THREEFIVESERVER ("Kernel", "3.5", OperatingSystemFamilies.LINUXSERVER),
	THREESIXSERVER ("Kernel", "3.6", OperatingSystemFamilies.LINUXSERVER),
	THREESEVENSERVER ("Kernel", "3.7", OperatingSystemFamilies.LINUXSERVER),
	THREEEIGHTSERVER ("Kernel", "3.8", OperatingSystemFamilies.LINUXSERVER),
	THREENINESERVER ("Kernel", "3.9", OperatingSystemFamilies.LINUXSERVER),
	THREETENSERVER ("Kernel", "3.10", OperatingSystemFamilies.LINUXSERVER),
	THREEELEVENSERVER ("Kernel", "3.11", OperatingSystemFamilies.LINUXSERVER),
	THREETWELVESERVER ("Kernel", "3.12", OperatingSystemFamilies.LINUXSERVER),
	THREETHIRTEENSERVER ("Kernel", "3.13", OperatingSystemFamilies.LINUXSERVER),
	THREEFOURTEENSERVER ("Kernel", "3.14", OperatingSystemFamilies.LINUXSERVER),
	THREEFIVTEENSERVER ("Kernel", "3.15", OperatingSystemFamilies.LINUXSERVER),
	THREESIXTEENSERVER ("Kernel", "3.16", OperatingSystemFamilies.LINUXSERVER),
	THREEEIGHTEENSERVER  ("Kernel", "3.18", OperatingSystemFamilies.LINUXSERVER),
	THREENINETEENSERVER ("Kernel", "3.19", OperatingSystemFamilies.LINUXSERVER),
	FOURSERVER ("Kernel", "4.0", OperatingSystemFamilies.LINUXSERVER),
	FOURONESERVER ("Kernel", "4.1", OperatingSystemFamilies.LINUXSERVER), 
	FOURTWOSERVER ("Kernel", "4.2", OperatingSystemFamilies.LINUXSERVER),
	FOURTHREESERVER ("Kernel", "4.3", OperatingSystemFamilies.LINUXSERVER),
	FOURFOURSERVER ("Kernel", "4.4", OperatingSystemFamilies.LINUXSERVER),
	FOURFIVESERVER ("Kernel", "4.5", OperatingSystemFamilies.LINUXSERVER),
	FOURSIXSERVER ("Kernel", "4.6", OperatingSystemFamilies.LINUXSERVER),
	FOURSEVENSERVER ("Kernel", "4.7", OperatingSystemFamilies.LINUXSERVER),	
	FOUREIGHTSERVER ("Kernel", "4.8", OperatingSystemFamilies.LINUXSERVER),

	// MAC Desktop Family
	CHEETAH ("Cheetah", "10.0", OperatingSystemFamilies.MAC),
	PUMA ("Puma", "10.1", OperatingSystemFamilies.MAC),
	JAGUAR ("Jaguar", "10.2", OperatingSystemFamilies.MAC),
	PANTHER ("Panther", "10.3", OperatingSystemFamilies.MAC),
	TIGER ("Tiger", "10.4", OperatingSystemFamilies.MAC),
	LEOPARD ("Leopard", "10.5", OperatingSystemFamilies.MAC),
	SNOWLEOPARD ("Snow Leopard", "10.6", OperatingSystemFamilies.MAC),
	LION ("Lion", "10.7", OperatingSystemFamilies.MAC),
	MOUNTAINLION ("Mountain Lion", "10.8", OperatingSystemFamilies.MAC),
	MAVERICKS ("Mavericks", "10.9", OperatingSystemFamilies.MAC),
	YOSEMITE ("Yosemite", "10.10", OperatingSystemFamilies.MAC),
	ELCAPITAN ("El Capitan", "10.11", OperatingSystemFamilies.MAC),
	SIERRA ("Sierra", "10.12", OperatingSystemFamilies.MAC),

	// MAC Server Family
	CHEETAHSERVER ("Cheetah", "10.0", OperatingSystemFamilies.MACSERVER),
	PUMASERVER ("Puma", "10.1", OperatingSystemFamilies.MACSERVER),
	JAGUARSERVER ("Jaguar", "10.2", OperatingSystemFamilies.MACSERVER),
	PANTHERSERVER ("Panther", "10.3", OperatingSystemFamilies.MACSERVER),
	TIGERSERVER ("Tiger", "10.4", OperatingSystemFamilies.MACSERVER),
	LEOPARDSERVER ("Leopard", "10.5", OperatingSystemFamilies.MACSERVER),
	SNOWLEOPARDSERVER ("Snow Leopard", "10.6", OperatingSystemFamilies.MACSERVER),
	OSXSERVERONE ("1.0", "1.0", OperatingSystemFamilies.MACSERVER),
	OSXSERVERTWO ("2.0", "2.0", OperatingSystemFamilies.MACSERVER),
	OSXSERVERTHREE ("3.0", "3.0", OperatingSystemFamilies.MACSERVER),
	OSXSERVERFOUR ("4.0", "4.0", OperatingSystemFamilies.MACSERVER),
	OSXSERVERFIVE ("5.0", "5.0", OperatingSystemFamilies.MACSERVER),

	// MAC iOS Family
	IOSEIGHT ("iOS 8", "8.0", OperatingSystemFamilies.IOS), 
	IOSNINE ("iOS 9", "9.0", OperatingSystemFamilies.IOS),
	IOSTEN ("iOS 10", "10.0", OperatingSystemFamilies.IOS),

	// MAC tvOS Family
	TVOSNINE ("tvOS 9", "9.0", OperatingSystemFamilies.TVOS),

	// MAC watchOS Family
	WATCHOSONE ("watchOS 1", "1.0", OperatingSystemFamilies.WATCHOS),
	WATCHOSTWO ("watchOS 2", "2.0", OperatingSystemFamilies.WATCHOS);

    private String SystemName;
    private String VersionNumber;
    private OperatingSystemFamilies osFamily;

    OperatingSystems(String SystemName, String VersionNumber, OperatingSystemFamilies osFamily){
        this.SystemName = SystemName;
        this.VersionNumber = VersionNumber;
        this.osFamily = osFamily;
    }

    public String GetSystemName(){
        return SystemName;
    }

    public String GetVersionNumber(){
        return VersionNumber;
    }

    public OperatingSystemFamilies GetOperatingSystemFamilies(){
        return osFamily;
    }

    public Double versionToFloat(){
        int Counter = 0;
        String normalizedVersionString = "";
        
        for (String part : VersionNumber.split("\\."))
        {
            if (Counter == 0) {
                normalizedVersionString = part + ".";
                Counter += 1;
            } 
            else{
                normalizedVersionString = normalizedVersionString + part;
            }
        }
        return Double.parseDouble(normalizedVersionString);
    }

    public List<OperatingSystems> GetAllOperatingSystemsToClass(OperatingSystemClasses oClassToSearch){
        List<OperatingSystems> oReturnList = new ArrayList<OperatingSystems>();
        for (OperatingSystems OperatingSystem: OperatingSystems.values())
        {
            if (OperatingSystem.GetOperatingSystemFamilies().GetOClasses() == oClassToSearch){oReturnList.add(OperatingSystem);}
        }
        return oReturnList;
    }

    public List<OperatingSystems> GetAllOperatingSystemsToFamily(OperatingSystemFamilies oFamilyToSearch){
        List<OperatingSystems> oReturnList = new ArrayList<OperatingSystems>();
        for (OperatingSystems OperatingSystem: OperatingSystems.values())
        {
            if (OperatingSystem.GetOperatingSystemFamilies() == oFamilyToSearch){oReturnList.add(OperatingSystem);}
        }
        return oReturnList;
    }

    public OperatingSystems parse(String stringToParse){
		OperatingSystemFamilies oFamily = OperatingSystemFamilies.MACSERVER.parse(stringToParse);
        List<OperatingSystems> oList = GetAllOperatingSystemsToFamily(oFamily);
		// TODO WINDOWS Case
		// TODO UBUNTU Case
        return null;
    }

    public String toString(){
        if (this.osFamily == OperatingSystemFamilies.WINDOWS || this.osFamily == OperatingSystemFamilies.WINDOWSSERVER){
			return (this.osFamily.getFamilyName() + " " + this.SystemName);
		}
		else if(this.osFamily == OperatingSystemFamilies.UBUNTU || this.osFamily == OperatingSystemFamilies.UBUNTUSERVER){
			return (this.osFamily.getFamilyName() + " " + this.VersionNumber);
		}
		else if(this.osFamily == OperatingSystemFamilies.MAC){
			if (this.versionToFloat() < 10.8){
				return ("MAC " + this.osFamily.getFamilyName() + " " + this.VersionNumber);
			}
			else{
				return (this.osFamily.getFamilyName() + " " + this.VersionNumber);
			}
		}
		else if(this.osFamily == OperatingSystemFamilies.MACSERVER){
			if (this == CHEETAHSERVER || this == PUMASERVER || this == JAGUARSERVER || this == PANTHERSERVER || this == TIGERSERVER || this == LEOPARDSERVER || this == SNOWLEOPARDSERVER){
				return ("MAC " + this.osFamily.getFamilyName() + " " + this.VersionNumber);
			}
			else{
				return (this.osFamily.getFamilyName() + " " + this.SystemName);
			}
		}
		else{
			return this.SystemName;
		}
    }
}