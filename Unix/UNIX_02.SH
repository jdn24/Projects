if test $# -ne 2
then
echo "Invalid no. of arguments"
else
word=`grep $1 $2`
if test ` $word|wc -c ` -eq 1
then
echo "Pattern not found"
else
grep $1 $2
echo “Pattern Found”
fi
fi
