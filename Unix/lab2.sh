r=1
while test $r -le 5
do
count=0
c=1
while test $c -le $r
do
printf $count
count=`expr $count + 1`
c=`expr $c + 1`
done
echo "\n"
r=`expr $r + 1`
done
