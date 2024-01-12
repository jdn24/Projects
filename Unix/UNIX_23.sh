if [ -e mydir ]
then
        echo "Directory : mydir exist"
else
        echo " Directory mydir does not exist: creating mydir"
        mkdir mydir
fi
for a in $*
do
        if [ -f $a ]
        then
                echo "$a"
        else
                echo "$a File does not exist  in current directory"
                echo " creating $a file in mydir"
                touch mydir/$a
        fi
        shift 1
done
