fun count()
{
    var word:String;
    var sum:Int=0;
    var i :Int=0;
    word = readLine()!!;
    
    for (char in word)
    {
        
        if(char=='а' || char=='е' || char=='у'|| char=='ы'|| char=='о'|| char=='э' ||char=='я'|| char=='и'|| char=='ю'||
char=='ё')
        
        {
            sum++;
        }
            
        
        i++;
        
    }
    
    println(sum);
    
}



fun main (args:Array<String>)
{
    count();
}
