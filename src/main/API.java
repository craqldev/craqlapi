package main;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

import objects.DirectoryTree;
import objects.Query;
import objects.ResultTree;
import objects.TreeHandler;
import query.QueryHandler;
import query.QueryLanguageLexer;
import query.QueryLanguageParser;

public class API {
	
	public static ASTNode parseJava(String pathToJavaFile)
	{
		TreeHandler treeHandler = new TreeHandler();
		
		treeHandler.origin = new File(pathToJavaFile);
		
		try
		{
			treeHandler.GenerateInitialTree();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		return treeHandler.root;
	}
	
	public static Query parseQuery(String queryText)
	{
		if (QueryHandler.queries != null) QueryHandler.queries.clear();
		CharStream cs = new ANTLRStringStream(queryText);

		QueryLanguageLexer lexer = new QueryLanguageLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		QueryLanguageParser parser = new QueryLanguageParser(tokens);
		
		CommonTree tree = null;
		try 
		{
			tree = (CommonTree)parser.startrule().getTree();
		}
		catch (RecognitionException re)
		{
			re.printStackTrace();
			System.exit(0);
		}

		// uncomment this to print out the query parse tree (useful if it doesn't parse properly)
		//QueryHandler.reallySimplePrintTree(tree, 4);
		
		// Note -- strangely, this simplePrintTree is where the QueryBuilder gets executed
		QueryHandler.simplePrintTree(tree, 4);

		return QueryHandler.queries.getFirst();
	}
	
	public static LinkedList<ResultTree> executeQueryOnAST(Query query, ASTNode tree)
	{
		ResultTree rt = new ResultTree(tree);
		LinkedList <ResultTree> lrt = new LinkedList <ResultTree> ();
		lrt.add(rt);
		return QueryHandler.executeQuery(query,  null, lrt,  null,  false);
	}
}
