a=`date +%A`
echo "\n" Welcome Shiva
echo "\n" Today is $a
echo Your tasks for today is as follows
case $a in 
Monday)
echo Complete Unix Assignments
;;
Tuesday)
echo Take print outs of Unix programs
;;
Wednesday)
echo Get your Unix practical file properly arranged
;;
Thursday)
echo Get your Unix file checked
;;
Friday)
echo Get advance bookings for a movie
;;
Saturday)echo Go out for movie
;;
Sunday)Sunday is a fun day
;;
esac
