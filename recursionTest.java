/**
 * Sample recursion 1
 */
public int recurCountx(int startNum,int endNum)
{
    if(startNum < endNum)
    {
        System.out.println(startNum);
        startNum += 1;
        
        return recurCountx(startNum,endNum);
    }
    return 0;
}

/**
 * Sample recursion 2
 * Get smallest value or the number you type in
 */
public int recurCountx2small(int position,int valx)
{
    Integer[] listx = new Integer[5];
    listx[0] = 20;
    listx[1] = 10;
    listx[2] = 4;
    listx[3] = 30;
    listx[4] = 40;
    int smallestValue = valx;
    
    if(position != listx.length)
    {
        System.out.println(listx[position]);
        
        smallestValue = Math.min(valx,listx[position]);
        
        return recurCountx2small(position+1,smallestValue);
    }
    
    return smallestValue;
}

/**
 * Sample recursion 3
 * Get biggest value or the number you type in
 */
public int recurCountx2big(int position,int valx)
{
    Integer[] listx = new Integer[5];
    listx[0] = 20;
    listx[1] = 10;
    listx[2] = 4;
    listx[3] = 30;
    listx[4] = 40;
    int smallestValue = valx;
    
    if(position != listx.length)
    {
        System.out.println(listx[position]);
        
        smallestValue = Math.max(valx,listx[position]);
        
        return recurCountx2big(position+1,smallestValue);
    }
    
    return smallestValue;
}
