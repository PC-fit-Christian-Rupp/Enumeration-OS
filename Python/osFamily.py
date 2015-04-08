from enum import Enum
import osClasses
import re

class osFamily(Enum):

	WINDOWS = ("WINDOWS", osClasses.osClasses.DESKTOP)
	WINDOWSSERVER = ("WINDOWS SERVER", osClasses.osClasses.SERVER)
	UBUNTU = ("Ubuntu", osClasses.osClasses.DESKTOP)
	UBUNTUSERVER = ("Ubuntu Server", osClasses.osClasses.SERVER)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family

	def parse(self, string):
		if re.search(osFamily.WINDOWSSERVER.family.partition(" ")[0], string, re.IGNORECASE) and re.seach(osFamily.WINDOWSSERVER.family.partition(" ")[1], string, re.IGNORECASE):
			return osFamily.WINDOWSSERVER
		elif re.search(osFamily.WINDOWS.family, string, re.IGNORECASE):
			return osFamily.WINDOWS
		elif re.search(osFamily.UBUNTUSERVER.family.partition(" ")[0], string, re.IGNORECASE) and re.search(osFamily.UBUNTUSERVER.family.partition(" ")[1], string, re.IGNORECASE):
			return osFamily.UBUNTUSERVER
		elif re.search(osFamily.UBUNTU.family, string, re.IGNORECASE):
			return os.Family.UBUNTU
		else:
			pass
