echo Before
ls *.txt
for i in `ls *.txt`
do
echo $i|cut -f1 -d"."
mv $i `echo $i|cut -f1 -d"."`.doc
done
echo After
ls *.doc
