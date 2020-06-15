Will be solving some Coding challenges in Java (based on codewars-kata's). 

Might also create a handy cheat-sheet of frequenly used Java methods.

1. Convert String to Char array: 
	```
	char[] ch = StringArray.toCharArray();
	```
2. Convert a characet to Uppercase: 
	```
	Character.toUpperCase(ch);
	```
3. You can also append an empty string using += same as Python, but avoid it and try using Sringbuilder:
	```
	StringBuilder bld = new StringBuilder();
  	for (int i = 0; i < arrayOfStrings.length; ++i) {
    	bld.append(arrayOfStrings[i]);
  	}
  	return bld.toString();
	```

4. Sort an array: 
	```
	Arrays.sort(args);
	```
5. Convert string to lower-case: 
	```
	string_value.toLowerCase();
	```
6. Dictionaries in Java are hash-maps:
	```
	HashMap<Character, Integer> hm = new HashMap<>();
	```
7. For-looping through HashMaps to get key/values: 
	```
	import java.util.HashMap;
	import java.util.Map;
	for(final Map.Entry entry: counter.entrySet()){
		// or whatever you want to do		
		if((int)entry.getValue() >= 2) duplicates += 1;
	}
	```

