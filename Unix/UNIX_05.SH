echo Enter a choice.
echo 1. Todays Date
echo 2. Process of user 
echo 3. List of files
echo 4. Quit to unix
read ch
case $ch in
1)date;;
2)ps;;
3)ls;;
4)exit;;
*)echo invalid Choice
;;
esac
