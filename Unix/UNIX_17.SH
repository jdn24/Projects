for i in *
do
mv $i `echo $i|tr "[:lower:]" "[:upper:]"`
done
