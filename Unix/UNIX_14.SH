echo "Enter the Countdown time."
read n
clear 
while [ $n -ge 0 ]
do
echo $n
sleep 1
n=`expr $n - 1`
done
echo Count down timer stopped