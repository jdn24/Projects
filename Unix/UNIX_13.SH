echo Enter a no.
read num
sum=0
while true
do
if test `expr $num % 10` -gt 0
then
temp=`expr $num % 10`
sum=`expr $sum + $temp`
num=`expr $num / 10`
else
echo $sum
exit
fi
done