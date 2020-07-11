fun count(word:String):Int
{
    var sum:Int=0;
    var i :Int=0;
   
    
    for (char in word)
    {
        
        if(char=='а' || char=='е' || char=='у'|| char=='ы'|| char=='о'|| char=='э' ||char=='я'|| char=='и'|| char=='ю'||
char=='ё')
        
        {
            sum++;
        }
            
        
        
        
    }
   
   return sum;
    
    
}

fun main (args:Array<String>)
{
    var g:Int;
    g = count("слово");
    println(g);
}
