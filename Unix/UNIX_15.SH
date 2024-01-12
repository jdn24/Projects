km=$1
mt=`expr $km \* 1000`
echo "1.) km to dm"
echo "2 ) km to cm"
echo Enter your choice
read num
case $num in
1)dm=`expr $km \* 10000`
echo $km in meters is :$mt and in decimeters is : $dm;;
2)cm=`expr $km \* 100000`
echo $km in meters is :$mt and in centimeters is : $cm
;;
esac
