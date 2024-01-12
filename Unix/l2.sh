if test $# -ne 2
then
echo "Invalid no. of arg"
else
word=`grep $1 $2`
if `echo word | wc -c` -eq 1
then
echo "pattern not found"
else
grep $1 $2
echo "pattern found"
fi
fi
