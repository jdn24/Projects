echo "Enter the no. to compute it's factorial"
read num
i=1
fact=1
while test $i -le $num
do
fact=`expr $fact \* $i`
i=`expr $i + 1`
done
echo "Factorial of:$num is:$fact"
