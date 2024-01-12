for i in *
do
if [ -f $i ]
then
   if [ -s $i ]
   then
      echo “File $i is not empty”
   else
      echo “File $i is empty”
      rm -i $i
   fi
else
echo “$i is not a file”
fi
done
