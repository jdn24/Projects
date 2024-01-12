cd $1
for var in `ls`
do
if test -f $var 
then
a=`echo $$`
mv $var $var.$a
fi
done
echo "\n" File name changed:"\n"
ls -l
cd ..
