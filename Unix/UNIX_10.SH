echo Enter the file name
read file
a=`date|cut -b 1-11,25-28`
echo $a|tee -a $file
clear 
echo "\n"$file sucessfully created
echo "\n""Content of file is :"`cat $file`
