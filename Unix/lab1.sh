echo Enter a choice
echo "a) Users who are logged in"
echo "b) List of files in current directory"
echo "c) List of processes of user"
echo "d) Today's date"
echo "e) Quit to Unix"
read ch
case $ch in
a) users
;;
b)ls
;;
c)ps
;;
d)date
;;
e)exit
;;
*)echo Invalid Choice
;;
esac
