from enum import Enum
impor osClasses.py

class osFamily(Enum):
	WINDOWS = ("WINDOWS", osClasses.DESKTOP)

	def __init__(self, family, osClass):
		self.osclass = osClass
		self.family = family
