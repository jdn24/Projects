char=y
while [ $char = "y" ]
do
ls
df -t
sleep 30
who
echo "Want to continue?"
read char
done
