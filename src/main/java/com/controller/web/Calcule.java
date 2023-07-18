package com.controller.web;

public class Calcule {
public int somme(int x , int y)
{
return x+y;	
}
public int produit(int x , int y)
{
return x*y;	
}
public double fact(int x )
{
int f=1;
for(int i =2;i<=x;i++)
	f*=i;
return f;
}
public int pgcd(int x,int y)
{
while(x!=y)
{
if(x>y)
	x=x-y;
else 
	y=y-x;
}
return x;
}
}
