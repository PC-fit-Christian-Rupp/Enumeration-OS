from enum import Enum
import re

class OperatingSystemClasses(Enum):
    	
	#ENUM:START
	DESKTOP = 1
	SERVER = 2
	EMBEDDED = 3
	#ENUM:END

	def parse(self, string):
		for j in OperatingSystemClasses:
			if (string.lower()).find(j.name.lower())>=0:
				return j
		return OperatingSystemClasses.DESKTOP

