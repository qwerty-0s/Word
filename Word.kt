function countparts(a:String)
{
 var sum:Int=0;
 for(char in a)
 {
   if(char=='а'||char=='е'||char=='ё'||char=='и'||char=='о'||char=='у'||char=='ы'||char='э'||char=='ю'||char=='я')
   {
     sum++;
   }
 }
 return sum;
}

function main(args:Array<String>)
{
  countparts("программа");
}
