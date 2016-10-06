//package EnumerationOperatingSystem;
import java.util.*;

public enum OperatingSystems{

    // WINDOWS Desktop Family
	XP ("XP", "5.1", OperatingSystemFamily.WINDOWS),
	VISTA ("Vista", "6.0", OperatingSystemFamily.WINDOWS),
	SEVEN ("7", "6.1", OperatingSystemFamily.WINDOWS),
	EIGHT ("8", "6.2", OperatingSystemFamily.WINDOWS),
	EIGHTONE ("8.1", "6.3", OperatingSystemFamily.WINDOWS),
	TEN ("10", "10.0",OperatingSystemFamily.WINDOWS),

	// WINDOWS Server Family
	TWOTHOUSANDTHREE ("2003", "5.3", OperatingSystemFamily.WINDOWSSERVER),
	TWOTHOUSANDEIGHT ("2008", "6.0", OperatingSystemFamily.WINDOWSSERVER),
	TWOTHOUSANDEIGHTR2 ("2008 R2", "6.1", OperatingSystemFamily.WINDOWSSERVER),
	TWOTHOUSANDTWELVE ("2012", "6.2", OperatingSystemFamily.WINDOWSSERVER),
	TWOTHOUSANDTWELVER2 ("2012 R2", "6.3", OperatingSystemFamily.WINDOWSSERVER),

	// UBUNTU Desktop Family
	PRECISEPANGOLIN ("Precise Pangolin", "12.04.05", OperatingSystemFamily.UBUNTU),
	QUANTALQUETZAL ("Quantal Quetzal", "12.10", OperatingSystemFamily.UBUNTU),
	RAIRINGRINGTAIL ("Rairing Ringtail", "12.04", OperatingSystemFamily.UBUNTU),
	SAUCYSALAMANDER ("Saucy Salamander", "13.04", OperatingSystemFamily.UBUNTU),
	TRUSTYTAHR ("Trusty Tahr", "14.04.02", OperatingSystemFamily.UBUNTU),
	UTOPICUNICORN ("Utopic Unicorn", "14.10", OperatingSystemFamily.UBUNTU),
	VIVIDVERVET ("Vivid Veret", "15.04", OperatingSystemFamily.UBUNTU),
	WILYWEREWOLF ("Wily Werewolf", "15.10", OperatingSystemFamily.UBUNTU),
	XENIALXERUS ("Xenial Xerus", "16.04", OperatingSystemFamily.UBUNTU), 

	// UBUNTU SERVER Family
	PRECISEPANGOLINSERVER ("Precise Pangolin", "12.04.05", OperatingSystemFamily.UBUNTUSERVER),
	QUANTALQUETZALSERVER ("Quantal Quetzal", "12.10", OperatingSystemFamily.UBUNTUSERVER),
	RAIRINGRINGTAILSERVER ("Rairing Ringtail", "12.04", OperatingSystemFamily.UBUNTUSERVER),
	SAUCYSALAMANDERSERVER ("Saucy Salamander", "13.04", OperatingSystemFamily.UBUNTUSERVER),
	TRUSTYTAHRSERVER ("Trusty Tahr", "14.04.02", OperatingSystemFamily.UBUNTUSERVER),
	UTOPICUNICORNSERVER ("Utopic Unicorn", "14.10", OperatingSystemFamily.UBUNTUSERVER),
	VIVIDVERVETSERVER ("Vivid Veret", "15.04", OperatingSystemFamily.UBUNTUSERVER),
	WILYWEREWOLFSERVER ("Wily Werewolf", "15.10", OperatingSystemFamily.UBUNTUSERVER),
	XENIALXERUSSERVER ("Xenial Xerus", "16.04", OperatingSystemFamily.UBUNTUSERVER),	

	// LINUX Kernel Family Desktop
	TWOFOUR ("Kernel", "2.4", OperatingSystemFamily.LINUX),
	TWOFIVE ("Kernel", "2.5", OperatingSystemFamily.LINUX),
	TWOSIX ("Kernel", "2.6", OperatingSystemFamily.LINUX),
	THREE ("Kernel", "3.0", OperatingSystemFamily.LINUX),
	THREEONE ("Kernel", "3.1", OperatingSystemFamily.LINUX),
	THREETWO ("Kernel", "3.2", OperatingSystemFamily.LINUX),
	THREETHREE ("Kernel", "3.3", OperatingSystemFamily.LINUX),
	THREEFOUR ("Kernel", "3.4", OperatingSystemFamily.LINUX),
	THREEFIVE ("Kernel", "3.5", OperatingSystemFamily.LINUX),
	THREESIX ("Kernel", "3.6", OperatingSystemFamily.LINUX),
	THREESEVEN ("Kernel", "3.7", OperatingSystemFamily.LINUX),
	THREEEIGHT ("Kernel", "3.8", OperatingSystemFamily.LINUX),
	THREENINE ("Kernel", "3.9", OperatingSystemFamily.LINUX),
	THREETEN ("Kernel", "3.10", OperatingSystemFamily.LINUX),
	THREEELEVEN ("Kernel", "3.11", OperatingSystemFamily.LINUX),
	THREETWELVE ("Kernel", "3.12", OperatingSystemFamily.LINUX),
	THREETHIRTEEN ("Kernel", "3.13", OperatingSystemFamily.LINUX),
	THREEFOURTEEN ("Kernel", "3.14", OperatingSystemFamily.LINUX),
	THREEFIVTEEN ("Kernel", "3.15", OperatingSystemFamily.LINUX),
	THREESIXTEEN ("Kernel", "3.16", OperatingSystemFamily.LINUX),
	THREEEIGHTEEN  ("Kernel", "3.18", OperatingSystemFamily.LINUX),
	THREENINETEEN ("Kernel", "3.19", OperatingSystemFamily.LINUX),
	FOUR ("Kernel", "4.0", OperatingSystemFamily.LINUX),
	FOURONE ("Kernel", "4.1", OperatingSystemFamily.LINUX),
	FOURTWO ("Kernel", "4.2", OperatingSystemFamily.LINUX),
	FOURTHREE ("Kernel", "4.3", OperatingSystemFamily.LINUX),
	FOURFOUR ("Kernel", "4.4", OperatingSystemFamily.LINUX),
	FOURFIVE ("Kernel", "4.5", OperatingSystemFamily.LINUX),
	FOURSIX ("Kernel", "4.6", OperatingSystemFamily.LINUX),
	FOURSEVEN ("Kernel", "4.7", OperatingSystemFamily.LINUX),	
	FOUREIGHT ("Kernel", "4.8", OperatingSystemFamily.LINUX),

	// LINUX Kernel Family SERVER
	TWOFOURSERVER ("Kernel", "2.4", OperatingSystemFamily.LINUXSERVER),
	TWOFIVESERVER ("Kernel", "2.5", OperatingSystemFamily.LINUXSERVER),
	TWOSIXSERVER ("Kernel", "2.6", OperatingSystemFamily.LINUXSERVER),
	THREESERVER ("Kernel", "3.0", OperatingSystemFamily.LINUXSERVER),
	THREEONESERVER ("Kernel", "3.1", OperatingSystemFamily.LINUXSERVER),
	THREETWOSERVER ("Kernel", "3.2", OperatingSystemFamily.LINUXSERVER),
	THREETHREESERVER ("Kernel", "3.3", OperatingSystemFamily.LINUXSERVER),
	THREEFOURSERVER ("Kernel", "3.4", OperatingSystemFamily.LINUXSERVER),
	THREEFIVESERVER ("Kernel", "3.5", OperatingSystemFamily.LINUXSERVER),
	THREESIXSERVER ("Kernel", "3.6", OperatingSystemFamily.LINUXSERVER),
	THREESEVENSERVER ("Kernel", "3.7", OperatingSystemFamily.LINUXSERVER),
	THREEEIGHTSERVER ("Kernel", "3.8", OperatingSystemFamily.LINUXSERVER),
	THREENINESERVER ("Kernel", "3.9", OperatingSystemFamily.LINUXSERVER),
	THREETENSERVER ("Kernel", "3.10", OperatingSystemFamily.LINUXSERVER),
	THREEELEVENSERVER ("Kernel", "3.11", OperatingSystemFamily.LINUXSERVER),
	THREETWELVESERVER ("Kernel", "3.12", OperatingSystemFamily.LINUXSERVER),
	THREETHIRTEENSERVER ("Kernel", "3.13", OperatingSystemFamily.LINUXSERVER),
	THREEFOURTEENSERVER ("Kernel", "3.14", OperatingSystemFamily.LINUXSERVER),
	THREEFIVTEENSERVER ("Kernel", "3.15", OperatingSystemFamily.LINUXSERVER),
	THREESIXTEENSERVER ("Kernel", "3.16", OperatingSystemFamily.LINUXSERVER),
	THREEEIGHTEENSERVER  ("Kernel", "3.18", OperatingSystemFamily.LINUXSERVER),
	THREENINETEENSERVER ("Kernel", "3.19", OperatingSystemFamily.LINUXSERVER),
	FOURSERVER ("Kernel", "4.0", OperatingSystemFamily.LINUXSERVER),
	FOURONESERVER ("Kernel", "4.1", OperatingSystemFamily.LINUXSERVER), 
	FOURTWOSERVER ("Kernel", "4.2", OperatingSystemFamily.LINUXSERVER),
	FOURTHREESERVER ("Kernel", "4.3", OperatingSystemFamily.LINUXSERVER),
	FOURFOURSERVER ("Kernel", "4.4", OperatingSystemFamily.LINUXSERVER),
	FOURFIVESERVER ("Kernel", "4.5", OperatingSystemFamily.LINUXSERVER),
	FOURSIXSERVER ("Kernel", "4.6", OperatingSystemFamily.LINUXSERVER),
	FOURSEVENSERVER ("Kernel", "4.7", OperatingSystemFamily.LINUXSERVER),	
	FOUREIGHTSERVER ("Kernel", "4.8", OperatingSystemFamily.LINUXSERVER),

	// MAC Desktop Family
	CHEETAH ("Cheetah", "10.0", OperatingSystemFamily.MAC),
	PUMA ("Puma", "10.1", OperatingSystemFamily.MAC),
	JAGUAR ("Jaguar", "10.2", OperatingSystemFamily.MAC),
	PANTHER ("Panther", "10.3", OperatingSystemFamily.MAC),
	TIGER ("Tiger", "10.4", OperatingSystemFamily.MAC),
	LEOPARD ("Leopard", "10.5", OperatingSystemFamily.MAC),
	SNOWLEOPARD ("Snow Leopard", "10.6", OperatingSystemFamily.MAC),
	LION ("Lion", "10.7", OperatingSystemFamily.MAC),
	MOUNTAINLION ("Mountain Lion", "10.8", OperatingSystemFamily.MAC),
	MAVERICKS ("Mavericks", "10.9", OperatingSystemFamily.MAC),
	YOSEMITE ("Yosemite", "10.10", OperatingSystemFamily.MAC),
	ELCAPITAN ("El Capitan", "10.11", OperatingSystemFamily.MAC),
	SIERRA ("Sierra", "10.12", OperatingSystemFamily.MAC),

	// MAC Server Family
	CHEETAHSERVER ("Cheetah", "10.0", OperatingSystemFamily.MACSERVER),
	PUMASERVER ("Puma", "10.1", OperatingSystemFamily.MACSERVER),
	JAGUARSERVER ("Jaguar", "10.2", OperatingSystemFamily.MACSERVER),
	PANTHERSERVER ("Panther", "10.3", OperatingSystemFamily.MACSERVER),
	TIGERSERVER ("Tiger", "10.4", OperatingSystemFamily.MACSERVER),
	LEOPARDSERVER ("Leopard", "10.5", OperatingSystemFamily.MACSERVER),
	SNOWLEOPARDSERVER ("Snow Leopard", "10.6", OperatingSystemFamily.MACSERVER),
	OSXSERVERONE ("1.0", "1.0", OperatingSystemFamily.MACSERVER),
	OSXSERVERTWO ("2.0", "2.0", OperatingSystemFamily.MACSERVER),
	OSXSERVERTHREE ("3.0", "3.0", OperatingSystemFamily.MACSERVER),
	OSXSERVERFOUR ("4.0", "4.0", OperatingSystemFamily.MACSERVER),
	OSXSERVERFIVE ("5.0", "5.0", OperatingSystemFamily.MACSERVER),

	// MAC iOS Family
	IOSEIGHT ("8.0", "8.0", OperatingSystemFamily.IOS), 
	IOSNINE ("9.0", "9.0", OperatingSystemFamily.IOS),
	IOSTEN ("10.0", "10.0", OperatingSystemFamily.IOS),

	// MAC tvOS Family
	TVOSNINE ("9.0", "9.0", OperatingSystemFamily.TVOS),

	// MAC watchOS Family
	WATCHOSONE ("1.0", "1.0", OperatingSystemFamily.WATCHOS),
	WATCHOSTWO ("2.0", "2.0", OperatingSystemFamily.WATCHOS);

    private String SystemName;
    private String VersionNumber;
    private OperatingSystemFamily osFamily;

    OperatingSystems(String SystemName, String VersionNumber, OperatingSystemFamily osFamily){
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

    public OperatingSystemFamily GetOperatingSystemFamily(){
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
            if (OperatingSystem.GetOperatingSystemFamily().GetOClasses() == oClassToSearch){oReturnList.add(OperatingSystem);}
        }
        return oReturnList;
    }

    public List<OperatingSystems> GetAllOperatingSystemsToFamily(OperatingSystemFamily oFamilyToSearch){
        List<OperatingSystems> oReturnList = new ArrayList<OperatingSystems>();
        for (OperatingSystems OperatingSystem: OperatingSystems.values())
        {
            if (OperatingSystem.GetOperatingSystemFamily() == oFamilyToSearch){oReturnList.add(OperatingSystem);}
        }
        return oReturnList;
    }

    public OperatingSystems parse(String stringToParse){
        // TODO
        return null;
    }

    public String toString(){
        return null;
    }
}