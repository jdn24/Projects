fn=$1
shift
for i in $*
do
grep $i $fn
done
