from enum import Enum
import re

class osClasses(Enum):
	DESKTOP = 1
	SERVER = 2
	EMBEDDED = 3

	def parse(self, string):
		for j in osClasses:
			if (string.lower()).find(j.name.lower())>=0:
				return j
		return osClasses.DESKTOP

