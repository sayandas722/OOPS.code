public class reverse_words_in_a_string{
    public static void main(String[] args)
    {
        String s="I am programmer ";
        char p[]=rev(s.toCharArray());
        System.out.println(p);
    }
    public static char[] rev(char s[])
    {
        int i=0;
        for (int j=0;j<s.length;j++)
        {
            if(s[j]==' ')
            {
                reverse(s,i,j);
                i=j+1;
            }
        }
        reverse(s,i,s.length-1);
        reverse(s,0,s.length-1);
        return s;
    }
    public static void reverse(char str[],int i,int j)
    {
        char temp;
        while(i<=j)
        {
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
}