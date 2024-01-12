char=y
while [ $char = "y" ]
do
ls
df -t
sleep 30
who
echo"Want to continue\(y/n\)?"
read char 
done