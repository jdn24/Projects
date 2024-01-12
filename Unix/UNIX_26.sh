echo Enter First number 
read n1
echo Enter Second number 
read n2
if [ $n1 -lt $n2 ]
then
i=$n1
else
i=$n2
fi
flag=0
while [ $flag -eq 0 ]
do
if [ `expr $n1 % $i` -eq 0 -a `expr $n2 % $i` -eq 0 ]
then
echo GCD of $n1 and $n2 is $i
flag=1
fi
i=`expr $i - 1`
done
