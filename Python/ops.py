from enum import Enum
import osFamily

class ops(Enum):
	
	# WINDOWS Desktop Family
	XP = ("XP", 5.1, osFamily.osFamily.WINDOWS)
	VISTA = ("Vista", 6.0, osFamily.osFamily.WINDOWS)
	SEVEN = ("7", 6.1, osFamily.osFamily.WINDOWS)
	EIGHT = ("8", 6.2, osFamily.osFamily.WINDOWS)
	EIGHTONE = ("8.1", 6.3, osFamily.osFamily.WINDOWS)

	def getAllClasses(self):
		pass

	def getAllFamily(self):
		pass

	def __init__(self, os, version, family):
		self.os = os
		self.version = version
		self.family = family
