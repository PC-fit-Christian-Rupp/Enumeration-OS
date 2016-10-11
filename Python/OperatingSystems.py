from enum import Enum
import OperatingSystemFamilies
import re

class OperatingSystems(Enum):
	
	# WINDOWS Desktop Family
	XP = ("XP", '5.1', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)
	VISTA = ("Vista", '6.0', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)
	SEVEN = ("7", '6.1', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)
	EIGHT = ("8", '6.2', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)
	EIGHTONE = ("8.1", '6.3', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)
	TEN = ("10", '10.0',OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS)

	# WINDOWS Server Family
	TWOTHOUSANDTHREE = ("2003", '5.3', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER)
	TWOTHOUSANDEIGHT = ("2008", '6.0', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER)
	TWOTHOUSANDEIGHTR2 = ("2008 R2", '6.1', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER)
	TWOTHOUSANDTWELVE = ("2012", '6.2', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER)
	TWOTHOUSANDTWELVER2 = ("2012 R2", '6.3', OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER)

	# UBUNTU Desktop Family
	PRECISEPANGOLIN = ("Precise Pangolin", '12.04.05', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	QUANTALQUETZAL = ("Quantal Quetzal", '12.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	RAIRINGRINGTAIL = ("Rairing Ringtail", '12.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	SAUCYSALAMANDER = ("Saucy Salamander", '13.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	TRUSTYTAHR = ("Trusty Tahr", '14.04.02', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	UTOPICUNICORN = ("Utopic Unicorn", '14.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	VIVIDVERVET = ("Vivid Veret", '15.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	WILYWEREWOLF = ("Wily Werewolf", '15.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU)
	XENIALXERUS = ("Xenial Xerus", '16.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU) 

	# UBUNTU SERVER Family
	PRECISEPANGOLINSERVER = ("Precise Pangolin", '12.04.05', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	QUANTALQUETZALSERVER = ("Quantal Quetzal", '12.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	RAIRINGRINGTAILSERVER = ("Rairing Ringtail", '12.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	SAUCYSALAMANDERSERVER = ("Saucy Salamander", '13.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	TRUSTYTAHRSERVER = ("Trusty Tahr", '14.04.02', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	UTOPICUNICORNSERVER = ("Utopic Unicorn", '14.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	VIVIDVERVETSERVER = ("Vivid Veret", '15.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	WILYWEREWOLFSERVER = ("Wily Werewolf", '15.10', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)
	XENIALXERUSSERVER = ("Xenial Xerus", '16.04', OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER)	

	# LINUX Kernel Family Desktop
	TWOFOUR = ("Kernel", '2.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	TWOFIVE = ("Kernel", '2.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	TWOSIX = ("Kernel", '2.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREE = ("Kernel", '3.0', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEONE = ("Kernel", '3.1', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREETWO = ("Kernel", '3.2', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREETHREE = ("Kernel", '3.3', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEFOUR = ("Kernel", '3.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEFIVE = ("Kernel", '3.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREESIX = ("Kernel", '3.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREESEVEN = ("Kernel", '3.7', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEEIGHT = ("Kernel", '3.8', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREENINE = ("Kernel", '3.9', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREETEN = ("Kernel", '3.10', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEELEVEN = ("Kernel", '3.11', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREETWELVE = ("Kernel", '3.12', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREETHIRTEEN = ("Kernel", '3.13', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEFOURTEEN = ("Kernel", '3.14', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEFIVTEEN = ("Kernel", '3.15', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREESIXTEEN = ("Kernel", '3.16', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREEEIGHTEEN =  ("Kernel", '3.18', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	THREENINETEEN = ("Kernel", '3.19', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOUR = ("Kernel", '4.0', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURONE = ("Kernel", '4.1', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURTWO = ("Kernel", '4.2', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURTHREE = ("Kernel", '4.3', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURFOUR = ("Kernel", '4.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURFIVE = ("Kernel", '4.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURSIX = ("Kernel", '4.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)
	FOURSEVEN = ("Kernel", '4.7', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)	
	FOUREIGHT = ("Kernel", '4.8', OperatingSystemFamilies.OperatingSystemFamilies.LINUX)

	# LINUX Kernel Family SERVER
	TWOFOURSERVER = ("Kernel", '2.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	TWOFIVESERVER = ("Kernel", '2.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	TWOSIXSERVER = ("Kernel", '2.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREESERVER = ("Kernel", '3.0', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEONESERVER = ("Kernel", '3.1', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREETWOSERVER = ("Kernel", '3.2', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREETHREESERVER = ("Kernel", '3.3', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEFOURSERVER = ("Kernel", '3.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEFIVESERVER = ("Kernel", '3.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREESIXSERVER = ("Kernel", '3.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREESEVENSERVER = ("Kernel", '3.7', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEEIGHTSERVER = ("Kernel", '3.8', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREENINESERVER = ("Kernel", '3.9', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREETENSERVER = ("Kernel", '3.10', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEELEVENSERVER = ("Kernel", '3.11', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREETWELVESERVER = ("Kernel", '3.12', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREETHIRTEENSERVER = ("Kernel", '3.13', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEFOURTEENSERVER = ("Kernel", '3.14', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEFIVTEENSERVER = ("Kernel", '3.15', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREESIXTEENSERVER = ("Kernel", '3.16', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREEEIGHTEENSERVER =  ("Kernel", '3.18', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	THREENINETEENSERVER = ("Kernel", '3.19', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURSERVER = ("Kernel", '4.0', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURONESERVER = ("Kernel", '4.1', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER) 
	FOURTWOSERVER = ("Kernel", '4.2', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURTHREESERVER = ("Kernel", '4.3', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURFOURSERVER = ("Kernel", '4.4', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURFIVESERVER = ("Kernel", '4.5', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURSIXSERVER = ("Kernel", '4.6', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)
	FOURSEVENSERVER = ("Kernel", '4.7', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)	
	FOUREIGHTSERVER = ("Kernel", '4.8', OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER)

	# MAC Desktop Family
	CHEETAH = ("Cheetah", '10.0', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	PUMA = ("Puma", '10.1', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	JAGUAR = ("Jaguar", '10.2', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	PANTHER = ("Panther", '10.3', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	TIGER = ("Tiger", '10.4', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	LEOPARD = ("Leopard", '10.5', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	SNOWLEOPARD = ("Snow Leopard", '10.6', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	LION = ("Lion", '10.7', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	MOUNTAINLION = ("Mountain Lion", '10.8', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	MAVERICKS = ("Mavericks", '10.9', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	YOSEMITE = ("Yosemite", '10.10', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	ELCAPITAN = ("El Capitan", '10.11', OperatingSystemFamilies.OperatingSystemFamilies.MAC)
	SIERRA = ("Sierra", '10.12', OperatingSystemFamilies.OperatingSystemFamilies.MAC)

	# MAC Server Family
	CHEETAHSERVER = ("Cheetah", '10.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	PUMASERVER = ("Puma", '10.1', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	JAGUARSERVER = ("Jaguar", '10.2', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	PANTHERSERVER = ("Panther", '10.3', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	TIGERSERVER = ("Tiger", '10.4', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	LEOPARDSERVER = ("Leopard", '10.5', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	SNOWLEOPARDSERVER = ("Snow Leopard", '10.6', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	OSXSERVERONE = ("1.0", '1.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	OSXSERVERTWO = ("2.0", '2.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	OSXSERVERTHREE = ("3.0", '3.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	OSXSERVERFOUR = ("4.0", '4.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)
	OSXSERVERFIVE = ("5.0", '5.0', OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER)

	# MAC iOS Family
	IOSEIGHT = ("iOS 8", '8.0', OperatingSystemFamilies.OperatingSystemFamilies.IOS) 
	IOSNINE = ("iOS 9", '9.0', OperatingSystemFamilies.OperatingSystemFamilies.IOS)
	IOSTEN = ("iOS 10", '10.0', OperatingSystemFamilies.OperatingSystemFamilies.IOS)

	# MAC tvOS Family
	TVOSNINE = ("tvOS 9", '9.0', OperatingSystemFamilies.OperatingSystemFamilies.TVOS)

	# MAC watchOS Family
	WATCHOSONE = ("watchOS 1", '1.0', OperatingSystemFamilies.OperatingSystemFamilies.WATCHOS)
	WATCHOSTWO = ("watchOS 2", '2.0', OperatingSystemFamilies.OperatingSystemFamilies.WATCHOS)

	def parse(self, string):
		classes = OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER.parse(string)
		lst = self.getAllFamily(classes)
		if classes.family == OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS.family or classes.family == OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER.family:
			for i in lst:
				if not('R2' in string.split(' ')):
					for j in string.split(' '):
						if j.lower()==i.os.lower():
							return i
				else:
					return OperatingSystems.TWOTHOUSANDEIGHTR2
		elif classes.family == OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU.family or classes.family == OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER.family or classes.family == OperatingSystemFamilies.OperatingSystemFamilies.MAC.family or classes.family == OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER.family:
			for i in lst:
				a=0
				for j in i.os.split(' '):
					if (string.lower()).find(j.lower())>=0:
						a += 1
				if a == len(i.os.split(' ')):
					return i
		for i in lst:
			if (string.lower()).find(i.version.lower())>=0:
				return i

	def versionToFloat(self):
		lst = self.version.split('.')
		a=0
		ret = ''
		for i in lst:
			if a==0:
				ret = i+'.'
				a+=1
			else:
				ret = ret + i
		return float(ret)

	def getAllClasses(self, classes):
		ret = []
		if classes == None:
			return OperatingSystems
		for i in OperatingSystems:
			if i.family.osclass.name == classes.name:
				ret.append(i)
		return ret

	def getAllFamily(self, family):
		ret = []
		if family == None:
			return OperatingSystems
		for i in OperatingSystems:
			if i.family.family == family.family:
				ret.append(i)
		return ret

	def toString(self):
		if self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.WINDOWS.family or self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.WINDOWSSERVER.family:
			return (self.family.family + ' ' + self.os)
		elif self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.UBUNTU.family or self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.UBUNTUSERVER.family:
			return (self.family.family + ' ' + self.version)
		elif self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.LINUX.family or self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.LINUXSERVER.family:
			return self.family.family + ' ' + self.os + ' ' + self.version
		elif self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.MAC.family:
			if self.versionToFloat() < 10.8:
				return 'MAC '+ self.family.family + ' ' + self.version
			else:
				return self.family.family + ' ' + self.version
		elif self.family.family == OperatingSystemFamilies.OperatingSystemFamilies.MACSERVER.family:
			if self == OperatingSystems.CHEETAHSERVER or self == OperatingSystems.PUMASERVER or self == OperatingSystems.JAGUARSERVER or self == OperatingSystems.PANTHERSERVER or self == OperatingSystems.TIGERSERVER or self ==  OperatingSystems.LEOPARDSERVER or self == OperatingSystems.SNOWLEOPARDSERVER:
				return 'MAC '+ self.family.family + ' ' + self.version
			else:
				return self.family.family + ' ' + self.os
		else:
			return self.os
				
	def __init__(self, os, version, family):
		self.os = os
		self.version = version
		self.family = family
