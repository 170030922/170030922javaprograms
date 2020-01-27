import java.util.*;
import java.io.*;
class Maxnum_array{
public static void main(String args[])
{
int n,i,j;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int a[][]=new int[n][n];
for(i=0;i<n;i++){
for(j=0;j<n;j++){
a[i][j]=sc.nextInt();
}
}
int max=a[0][0];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
}
}
}
System.out.println(max);
}
}
