infile=$1
propfile=$2
outfile=$3

if [ -f "$outfile" ]
then
	echo "$outfile exist hence please delete the file and proceed execute the batch"
else
	while read line
	do
	string=$line
	if [[ $string == *"[["*  &&  $string == *"]]"* ]]; then
		some_var= echo $line | grep -o \[\[[a-zA-Z.0-9]*\]\] | sed 's/\[\[//g' | sed 's/\]\]//g'
		echo $some_var
		a=${line%[[*}
		echo $a
		b=${line#*]]}
		echo $b
		. $propfile
		${some_var}
		c=$a${some_var}$b
		echo $c >> "$outfile"
	else
		echo $line >> "$outfile"	
	fi
	done < "$infile"
fi