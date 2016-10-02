from enum import Enum
import osClasses
import re

class osFamily(Enum):

	WINDOWS = ("WINDOWS", osClasses.osClasses.DESKTOP)
	WINDOWSSERVER = ("WINDOWS SERVER", osClasses.osClasses.SERVER)
	UBUNTU = ("Ubuntu", osClasses.osClasses.DESKTOP)
	UBUNTUSERVER = ("Ubuntu Server", osClasses.osClasses.SERVER)
	LINUX = ("Linux", osClasses.osClasses.DESKTOP)
	LINUXSERVER =  ("Linux Server", osClasses.osClasses.SERVER)
	MAC = ("OS X", osClasses.osClasses.DESKTOP)
	MACSERVER = ("OS X Server", osClasses.osClasses.SERVER)
	IOS = ("iOS", osClasses.osClasses.EMBEDDED)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family

	def getAllClasses(self, classes):
		ret = []
		for i in osFamily:
			if i.osclass == classes:
				ret.append(i)
		return ret

	def parse(self, string):
		lst = self.getAllClasses(osClasses.osClasses.DESKTOP.parse(string))
		for i in lst:
			a = 0
			lst2 = i.family.split(' ')
			for j in lst2:
				if (string.lower()).find(j.lower()) >= 0:
					a += 1
			if a == len(lst2):
				return i


