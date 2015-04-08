from enum import Enum
import osClasses
import re

class osFamily(Enum):
	WINDOWS = ("WINDOWS", osClasses.osClasses.DESKTOP)
	WINDOWSSERVER = ("WINDOWS SERVER", osClasses.osClasses.SERVER)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family

	def parse(self, string):
		if re.search(osFamily.WINDOWSSERVER.family.partition(" ")[0], string, re.IGNORECASE) & re.seach(osFamily.WINDOWSSERVER.family.partition(" ")[1], string, re.IGNORECASE):
			return osFamily.WINDOWSSERVER
		elif re.search(osFamily.WINDOWS.family, string, re.IGNORECASE):
			return osFamily.WINDOWS
		else:
			pass
