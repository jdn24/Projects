echo "Enter number of times you want to print"
read num2
num=1
while test $num -le $num2
do
echo "Welcome to UNIX"
num=`expr $num + 1 `
done
