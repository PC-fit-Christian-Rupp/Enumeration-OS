from enum import Enum
import osFamily

class ops(Enum):
	
	# WINDOWS Desktop Family
	XP = ("XP", 5.1, osFamily.osFamily.WINDOWS)
	VISTA = ("Vista", 6.0, osFamily.osFamily.WINDOWS)
	SEVEN = ("7", 6.1, osFamily.osFamily.WINDOWS)
	EIGHT = ("8", 6.2, osFamily.osFamily.WINDOWS)
	EIGHTONE = ("8.1", 6.3, osFamily.osFamily.WINDOWS)

	# WINDOWS Server Family
	TWOTHOUSANDTHREE = ("2003", 5.3, osFamily.osFamily.WINDOWSSERVER)
	TWOTHOUSANDEIGHT = ("2008", 6.0, osFamily.osFamily.WINDOWSSERVER)
	TWOTHOUSANDEIGHTR2 = ("2008 R2", 6.1, osFamily.osFamily.WINDOWSSERVER)
	TWOTHOUSANDWTWELVE = ("2012", 6.2, osFamily.osFamily.WINDOWSSERVER)

	# UBUNTU Desktop Family
	PRECISEPANGOLIN = ("Precise Pangolin", 12.0405, osFamily.osFamily.UBUNTU)
	QUANTALQUETZAL = ("Quantal Quetzal", 12.10, osFamily.osFamily.UBUNTU)
	RAIRINGRINGTAIL = ("Rairing Ringtail", 12.04, osFamily.osFamily.UBUNTU)
	SAUCYSALAMANDER = ("Saucy Salamander", 13.04, osFamily.osFamily.UBUNTU)
	TRUSTYTAHR = ("Trusty Tahr", 14.0402, osFamily.osFamily.UBUNTU)
	UTOPICUNICORN = ("Utopic Unicorn", 14.10, osFamily.osFamily.UBUNTU)
	VIVIDVERVET = ("Vivid Veret", 15.04, osFamily.osFamily.UBUNTU)

	# UBUNTU SERVER Family
	PRECISEPANGOLINSERVER = ("Precise Pangolin", 12.0405, osFamily.osFamily.UBUNTUSERVER)
	QUANTALQUETZALSERVER = ("Quantal Quetzal", 12.10, osFamily.osFamily.UBUNTUSERVER)
	RAIRINGRINGTAILSERVER = ("Rairing Ringtail", 12.04, osFamily.osFamily.UBUNTUSERVER)
	SAUCYSALAMANDERSERVER = ("Saucy Salamander", 13.04, osFamily.osFamily.UBUNTUSERVER)
	TRUSTYTAHRSERVER = ("Trusty Tahr", 14.0402, osFamily.osFamily.UBUNTUSERVER)
	UTOPICUNICORNSERVER = ("Utopic Unicorn", 14.10, osFamily.osFamily.UBUNTUSERVER)
	VIVIDVERVETSERVER = ("Vivid Veret", 15.04, osFamily.osFamily.UBUNTUSERVER)

	def getAllClasses(self):
		pass

	def getAllFamily(self):
		pass

	def toString(self):
		if self.family.family == osFamily.osFamily.WINDOWS.family or self.family.family == osFamily.osFamily.WINDOWSSERVER.family:
			return (self.family.family + ' ' + self.os)

	def __init__(self, os, version, family):
		self.os = os
		self.version = version
		self.family = family
