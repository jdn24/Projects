if [ -d $1 ]
then
echo Its a directory
elif [ -f $1 ]
then
echo file exist
if [ -r $1 ]
then
echo file has read permission
echo the contents are...
cat $1
else 
File dont have read permission
fi
if [ -w $1 ]
then
echo "\n"File have write permission
cat >> $1
else
echo you do not have write permission
fi
if [ -x $1 ]
then
echo "You have execute permission"
else
echo "you do not have Execute permission"
fi
else
echo Nothing exist by this name
fi
