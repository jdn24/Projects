echo Enter the series length
read num
x=0
y=1
if test $num -eq 1
then 
echo "Fibonacci series is"
echo $x
else if test $num -eq 2
then 
echo "Fibonacci series is"
echo "$x"
echo "$y"
else
echo "Fibonacci series is"
echo "$x"
echo "$y"
i=3
while test $i -le $num
do
temp=`expr $y + $x`
x=$y
y=$temp
echo $y
i=`expr $i + 1`
done
fi
fi
