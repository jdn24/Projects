cd $1
echo "files in $1 directory"
ls $dirnm
for i in `ls $dirnm`
do
f=`echo $1/$i`
if [ -f $f ]
then
if [ `cat $f|head -1` = $2 ]
then
echo "Header matched in $f file"
echo "Data of the file is "
cat $f 
if [ `cat $f|wc -l` -lt 50 ]
then
echo $i is small sized
fi
if [ `cat $f|wc -l` -ge 50 -a `cat $f|wc -l` -lt 100 ]
then
echo $i is a medium sized
fi
if [ `cat $f|wc -l` -gt 100 ]
then
echo $i is large sized
fi
fi
fi
done
cd
