cd $1
mkdir tmp
echo “Directory created tmp”
for i in *
do
if [ -f $i ]
then
tmp=`ls -l $i|cut -f5 -d" "`
echo $tmp
if [ $tmp -gt 50 ]
then
ln $i tmp/$i
fi
fi
done
ls -lS tmp
echo Total number of such files is : `ls tmp|wc -w` 
#rm -r tmp
