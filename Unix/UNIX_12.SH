if [ -f $1 -a -f $2 ]
then
if diff $1$2
then
cat $1
echo "\n"
cat $2
echo "\n" Contents are same Second file is being delete
rm $2
else
echo "\n" Contents are different
fi
else
echo "\n" File does not exist
fi