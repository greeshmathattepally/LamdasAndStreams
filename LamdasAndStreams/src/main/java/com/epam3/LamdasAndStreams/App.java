package com.epam3.LamdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int[] ar= {1,2,3,4,5,6};
       Average avg=new Average();
       System.out.println(avg.averageOfList(ar));
       
       filterList f=new filterList();
       String[] s= {"abc","Abc","asdg","oinn","ads","aefg"};
       ArrayList<String> l=f.filterListStartingWithLengthThreeAndStartingWithA(s,(String str)->(str.length()==3 && str.charAt(0)=='a'));
       System.out.println(l);
       
       
       String[] a={"aba","AbcbA","asdg","oiio","ada","aefg","abcba"};
       List<String> p= Arrays.asList(a);
       List<String> pal=App.filterPalindromes((p),(String str)->(Predicates.isPalindrome(str)));
       System.out.println(pal);
    }
    private static List<String> filterPalindromes(List<String> p, Predicate<String> predicate) {
		// TODO Auto-generated method stub
    	ArrayList<String> l=new ArrayList<String>();
    	for(String s: p)
    	{
    		if(predicate.test(s)) l.add(s);
    	}
		return l;
	}
	
}
