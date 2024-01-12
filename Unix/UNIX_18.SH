echo Before "\n"
ls -l
mkdir UnixPrograms cprograms
for var in `ls`
do
if [[ "$var" = *.SH ]]
then
echo "\n File $var is moved to UNIX files directory"
mv $var UnixPrograms
fi
if [[ $var = *.c ]]
then
echo"\n File $var is moved to cprograms directory"
mv $var cprograms
fi
done
cd UnixPrograms
echo "\n Files in UnixPrograms"
ls -l
cd ..
cd cprograms
echo "\n Files in cprograms"
echo "\n After\n"
ls -l:
