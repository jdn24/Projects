flag=0
while [ $flag -eq 0 ]
do
echo “Enter name of your institute in capital letters”
read inst
if [ $inst = "AMITY" ]
then
echo “Correct Answer” 
flag=1
else
echo “Enter Again”
fi
done
