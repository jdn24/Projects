echo "Enter the number"
read num
echo "Enter power"
read p 
powr=$p
result=1
while [ $p -ge 1 ]
do
result=`expr $result \* $num`
p=`expr $p - 1`
done
echo "$num raised to the power $powr is $result"
