if test $# -ne 3
then
echo "Invalid no. of arguments"
else
grep $1 $2 | cat > $3
if test -s $3
then
echo "Pattern found" 
cat $3
else
echo “Pattern not found”
fi
fi
