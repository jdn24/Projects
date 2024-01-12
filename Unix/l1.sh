read a
read b
word=`grep $a $b`
if test `echo $word | wc -c` -eq 1
then
echo "Pattern not found"
else
grep $a $b
fi
