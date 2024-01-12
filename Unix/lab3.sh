a=` date +%A `
echo Today is $a
case $a in
Monday) echo "You have to attend a meeting"
;;
Tuesday) echo "You have to lecture a course today"
;;
Wednesday) echo "You have to visit head office"
;;
Thursday) echo "You have to meet the boss"
;;
Friday) echo "Today is off"
;;
Saturday) echo "Visit family"
;;
Sunday) echo "Go to the gym"
;;
esac
