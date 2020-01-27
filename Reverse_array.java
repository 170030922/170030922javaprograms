import java.util.*;
import java.io.*;
class Reverse_array{
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
for(i=n-1;i>=0;i--){
for(j=n-1;j>=0;j--){
System.out.println(a[i][j]);
}
}
}
}