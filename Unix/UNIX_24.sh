if [ `expr $# % 2` -ne 0 ]
then
echo "Enter even number of parameters"
else
numfiles=$#
echo "number of files given $numfiles"
while [ $numfiles -ne 0 ]
do
temp1=$1
echo "$temp1"
shift 1
#i=`expr $i + 1`
#numfiles=`expr $numfiles - 1`
temp2=$1
echo "$temp2"
#i=`expr $i + 1`
numfiles=`expr $numfiles - 2`
shift 1
cp $temp1 $temp2
echo "content of file $temp1"
cat $temp1
echo "Content of file $temp2"
cat $temp2
done
fi
