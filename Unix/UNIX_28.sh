echo “Set the password first”
read password
i=0
while [ $i -lt 3 ]
do
echo “Enter password”
read p
if [ $p = $password ]
then
echo “Correct Password”
i=3
else
echo “Wrong password”
i=`expr $i + 1`
fi
done
