from enum import Enum
import OperatingSystemClasses
import re

class OperatingSystemFamilies(Enum):

	WINDOWS = ("WINDOWS", OperatingSystemClasses.OperatingSystemClasses.DESKTOP)
	WINDOWSSERVER = ("WINDOWS SERVER", OperatingSystemClasses.OperatingSystemClasses.SERVER)
	WINDOWSMOBILE = ("WINDOWS Mobile", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	WINDOWSPHONE = ("WINDOWS Phone", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	WINDOWSTENMOBILE = ("WINDOWS 10 Mobile", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	UBUNTU = ("Ubuntu", OperatingSystemClasses.OperatingSystemClasses.DESKTOP)
	UBUNTUSERVER = ("Ubuntu Server", OperatingSystemClasses.OperatingSystemClasses.SERVER)
	LINUX = ("Linux", OperatingSystemClasses.OperatingSystemClasses.DESKTOP)
	LINUXSERVER =  ("Linux Server", OperatingSystemClasses.OperatingSystemClasses.SERVER)
	MAC = ("OS X", OperatingSystemClasses.OperatingSystemClasses.DESKTOP)
	MACSERVER = ("OS X Server", OperatingSystemClasses.OperatingSystemClasses.SERVER)
	IOS = ("iOS", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	TVOS = ("tvOS", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	WATCHOS = ("watchOS", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)
	ANDROID = ("Android", OperatingSystemClasses.OperatingSystemClasses.EMBEDDED)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family

	def getAllClasses(self, classes):
		ret = []
		if classes == None:
			return OperatingSystemFamilies
		for i in OperatingSystemFamilies:
			if i.osclass == classes:
				ret.append(i)
		return ret

	def parse(self, string):
    	oClassInStr = OperatingSystemClasses.OperatingSystemClasses.DESKTOP.parse(string)
		lst = self.getAllClasses(oClassInStr)
		#lst = selfw.getAllClasses(OperatingSystemClasses.OperatingSystemClasses.DESKTOP.parse(string))
		iLengthOfObjectName = 0 
		for i in lst:
    		if len(i.family) > 0:
    			if (string.lower().find(i.family.lower())) >= 0:
    				oFamilyFound = i
					iLengthOfObjectName = len(i.family)
			#a = 0
			#lst2 = i.family.split(' ')
			#for j in lst2:
			#	if (string.lower()).find(j.lower()) >= 0:
			#		a += 1
			#if a == len(lst2):
			#	return i


