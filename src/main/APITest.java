package main;

import java.util.LinkedList;

import org.eclipse.jdt.core.dom.ASTNode;

import objects.Query;
import objects.ResultTree;

public class APITest {

	public static void main(String args[])
	{
		// test the API functions -- count the number of try statements in a java source file
		
		if (args.length != 1)
		{
			System.out.println("Syntax: API java-file-name");			
			System.exit(0);
		}
		
		ASTNode astRoot = API.parseJava(args[0]);
		
		Query query = API.parseQuery("select ({TryStatement} t) {}");
		
		LinkedList <ResultTree> results = API.executeQueryOnAST(query, astRoot);
		
		System.out.println(args[0] + " has " + results.size() + " try statements!");		
	}	
}
