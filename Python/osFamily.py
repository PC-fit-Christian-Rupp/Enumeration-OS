from enum import Enum
import osClasses

class osFamily(Enum):
	WINDOWS = ("WINDOWS", osClasses.osClasses.DESKTOP)
	WINDOWSSERVER = ("WINDOWS SERVER", osClasses.osClasses.SERVER)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family

	def parse(self, string):
		pass
