package query;

// $ANTLR 3.4 C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2018-06-12 15:06:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "AST_CHILD", "ATTRIBUTE", "ATTRIBUTES", "BIN_OP", "BLOCK_STATEMENTS", "BOOL_EXP", "CALLQUERY", "CHAIN_ID", "COLON", "COMMA", "COMPOUND_ADD", "COMP_ADD", "CONTAINS", "COUNT", "DEPTH", "DIRECTLY", "DIVIDE", "DQOUTE", "ELSE", "ELSE_BLOCK", "EPSILON", "EQUALS", "ESC_SEQ", "EXPONENT", "FILTER", "FILTER_QUERY", "FIRSTCHILD", "FLOAT", "FOR_QUERY", "FUNCTION", "GT", "GTE", "HAS", "HEX_DIGIT", "ID", "IF", "IF_STATEMENT", "IN", "INCR", "INCREMENT", "INMOST", "INTEGER", "IN_CLAUSE", "IS", "ISNODETYPE", "ISPARENT", "LEFT_BRACKET", "LEFT_PAREN", "LEFT_SQ_BRACKET", "LIMITATION", "LIMITATION_CLAUSE", "LINENUMBER", "LINE_COMMENT", "LOGIC_EQUALS", "LOGIC_OP", "LT", "LTE", "MAP", "MAPGET", "MAX", "METHODBINDING", "MIN", "MINUS", "NESTED", "NEXTNODE", "NODE", "NODETYPE", "NODE_CHAIN", "NODE_CHAIN_OP", "NODE_NAME", "NODE_TYPE", "NOT", "NOT_EQUAL", "OCTAL_ESC", "OR", "OUTMOST", "PERIOD", "PLUS", "PRINT", "PROPERTY", "QUERIES", "QUERY", "QUERY_NAME", "REPEATER", "RESERVED_TYPES", "RIGHT_BRACKET", "RIGHT_PAREN", "RIGHT_SQ_BRACKET", "SELECT", "SELECT_QUERY", "SEMICOLON", "SET", "SET_TABLE", "SPACE", "STAR", "STATEMENT", "STATEMENTS", "STRING", "TABLE", "UNICODE_ESC", "VAR", "VAR_ASSIGN", "VAR_NAME", "VAR_STMT", "WHERE", "WHERE_BLOCK", "WHILE", "WHILE_STATEMENT", "WITH", "WITH_CLAUSE"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AS=5;
    public static final int AST_CHILD=6;
    public static final int ATTRIBUTE=7;
    public static final int ATTRIBUTES=8;
    public static final int BIN_OP=9;
    public static final int BLOCK_STATEMENTS=10;
    public static final int BOOL_EXP=11;
    public static final int CALLQUERY=12;
    public static final int CHAIN_ID=13;
    public static final int COLON=14;
    public static final int COMMA=15;
    public static final int COMPOUND_ADD=16;
    public static final int COMP_ADD=17;
    public static final int CONTAINS=18;
    public static final int COUNT=19;
    public static final int DEPTH=20;
    public static final int DIRECTLY=21;
    public static final int DIVIDE=22;
    public static final int DQOUTE=23;
    public static final int ELSE=24;
    public static final int ELSE_BLOCK=25;
    public static final int EPSILON=26;
    public static final int EQUALS=27;
    public static final int ESC_SEQ=28;
    public static final int EXPONENT=29;
    public static final int FILTER=30;
    public static final int FILTER_QUERY=31;
    public static final int FIRSTCHILD=32;
    public static final int FLOAT=33;
    public static final int FOR_QUERY=34;
    public static final int FUNCTION=35;
    public static final int GT=36;
    public static final int GTE=37;
    public static final int HAS=38;
    public static final int HEX_DIGIT=39;
    public static final int ID=40;
    public static final int IF=41;
    public static final int IF_STATEMENT=42;
    public static final int IN=43;
    public static final int INCR=44;
    public static final int INCREMENT=45;
    public static final int INMOST=46;
    public static final int INTEGER=47;
    public static final int IN_CLAUSE=48;
    public static final int IS=49;
    public static final int ISNODETYPE=50;
    public static final int ISPARENT=51;
    public static final int LEFT_BRACKET=52;
    public static final int LEFT_PAREN=53;
    public static final int LEFT_SQ_BRACKET=54;
    public static final int LIMITATION=55;
    public static final int LIMITATION_CLAUSE=56;
    public static final int LINENUMBER=57;
    public static final int LINE_COMMENT=58;
    public static final int LOGIC_EQUALS=59;
    public static final int LOGIC_OP=60;
    public static final int LT=61;
    public static final int LTE=62;
    public static final int MAP=63;
    public static final int MAPGET=64;
    public static final int MAX=65;
    public static final int METHODBINDING=66;
    public static final int MIN=67;
    public static final int MINUS=68;
    public static final int NESTED=69;
    public static final int NEXTNODE=70;
    public static final int NODE=71;
    public static final int NODETYPE=72;
    public static final int NODE_CHAIN=73;
    public static final int NODE_CHAIN_OP=74;
    public static final int NODE_NAME=75;
    public static final int NODE_TYPE=76;
    public static final int NOT=77;
    public static final int NOT_EQUAL=78;
    public static final int OCTAL_ESC=79;
    public static final int OR=80;
    public static final int OUTMOST=81;
    public static final int PERIOD=82;
    public static final int PLUS=83;
    public static final int PRINT=84;
    public static final int PROPERTY=85;
    public static final int QUERIES=86;
    public static final int QUERY=87;
    public static final int QUERY_NAME=88;
    public static final int REPEATER=89;
    public static final int RESERVED_TYPES=90;
    public static final int RIGHT_BRACKET=91;
    public static final int RIGHT_PAREN=92;
    public static final int RIGHT_SQ_BRACKET=93;
    public static final int SELECT=94;
    public static final int SELECT_QUERY=95;
    public static final int SEMICOLON=96;
    public static final int SET=97;
    public static final int SET_TABLE=98;
    public static final int SPACE=99;
    public static final int STAR=100;
    public static final int STATEMENT=101;
    public static final int STATEMENTS=102;
    public static final int STRING=103;
    public static final int TABLE=104;
    public static final int UNICODE_ESC=105;
    public static final int VAR=106;
    public static final int VAR_ASSIGN=107;
    public static final int VAR_NAME=108;
    public static final int VAR_STMT=109;
    public static final int WHERE=110;
    public static final int WHERE_BLOCK=111;
    public static final int WHILE=112;
    public static final int WHILE_STATEMENT=113;
    public static final int WITH=114;
    public static final int WITH_CLAUSE=115;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QueryLanguageParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLanguageParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return QueryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g"; }


    public static class startrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startrule"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:1: startrule : queries -> ^( QUERIES queries ) ;
    public final QueryLanguageParser.startrule_return startrule() throws RecognitionException {
        QueryLanguageParser.startrule_return retval = new QueryLanguageParser.startrule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.queries_return queries1 =null;


        RewriteRuleSubtreeStream stream_queries=new RewriteRuleSubtreeStream(adaptor,"rule queries");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:2: ( queries -> ^( QUERIES queries ) )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:4: queries
            {
            pushFollow(FOLLOW_queries_in_startrule332);
            queries1=queries();

            state._fsp--;

            stream_queries.add(queries1.getTree());

            // AST REWRITE
            // elements: queries
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:12: -> ^( QUERIES queries )
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:15: ^( QUERIES queries )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(QUERIES, "QUERIES")
                , root_1);

                adaptor.addChild(root_1, stream_queries.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "startrule"


    public static class queries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queries"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:1: queries : ( blockquery )* ;
    public final QueryLanguageParser.queries_return queries() throws RecognitionException {
        QueryLanguageParser.queries_return retval = new QueryLanguageParser.queries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.blockquery_return blockquery2 =null;



        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:9: ( ( blockquery )* )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:11: ( blockquery )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:11: ( blockquery )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EPSILON||LA1_0==ID||LA1_0==LEFT_BRACKET||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:11: blockquery
            	    {
            	    pushFollow(FOLLOW_blockquery_in_queries350);
            	    blockquery2=blockquery();

            	    state._fsp--;

            	    adaptor.addChild(root_0, blockquery2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "queries"


    public static class blockquery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockquery"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:62:1: blockquery : query ;
    public final QueryLanguageParser.blockquery_return blockquery() throws RecognitionException {
        QueryLanguageParser.blockquery_return retval = new QueryLanguageParser.blockquery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.query_return query3 =null;



        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:2: ( query )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:6: query
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_query_in_blockquery369);
            query3=query();

            state._fsp--;

            adaptor.addChild(root_0, query3.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockquery"


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:1: query : ( query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) | stat_statements -> ^( STATEMENTS stat_statements ) | EPSILON );
    public final QueryLanguageParser.query_return query() throws RecognitionException {
        QueryLanguageParser.query_return retval = new QueryLanguageParser.query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;
        Token FILTER9=null;
        Token ID10=null;
        Token EPSILON13=null;
        QueryLanguageParser.query_name_return query_name4 =null;

        QueryLanguageParser.select_query_return select_query5 =null;

        QueryLanguageParser.print_stmt_return print_stmt6 =null;

        QueryLanguageParser.query_name_return query_name7 =null;

        QueryLanguageParser.print_stmt_return print_stmt11 =null;

        QueryLanguageParser.stat_statements_return stat_statements12 =null;


        Object ID8_tree=null;
        Object FILTER9_tree=null;
        Object ID10_tree=null;
        Object EPSILON13_tree=null;
        RewriteRuleTokenStream stream_FILTER=new RewriteRuleTokenStream(adaptor,"token FILTER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_select_query=new RewriteRuleSubtreeStream(adaptor,"rule select_query");
        RewriteRuleSubtreeStream stream_query_name=new RewriteRuleSubtreeStream(adaptor,"rule query_name");
        RewriteRuleSubtreeStream stream_print_stmt=new RewriteRuleSubtreeStream(adaptor,"rule print_stmt");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:7: ( query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) | stat_statements -> ^( STATEMENTS stat_statements ) | EPSILON )
            int alt2=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==COLON) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==SELECT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==ID) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else if ( (LA2_1==FILTER) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case SELECT:
                {
                alt2=1;
                }
                break;
            case LEFT_BRACKET:
                {
                alt2=3;
                }
                break;
            case EPSILON:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:9: query_name select_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query380);
                    query_name4=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name4.getTree());

                    pushFollow(FOLLOW_select_query_in_query382);
                    select_query5=select_query();

                    state._fsp--;

                    stream_select_query.add(select_query5.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query384);
                    print_stmt6=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt6.getTree());

                    // AST REWRITE
                    // elements: select_query, query_name, print_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:44: -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:47: ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:55: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:80: ^( SELECT_QUERY select_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_QUERY, "SELECT_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_select_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:109: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:117: ( print_stmt )?
                        if ( stream_print_stmt.hasNext() ) {
                            adaptor.addChild(root_2, stream_print_stmt.nextTree());

                        }
                        stream_print_stmt.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:4: query_name ID FILTER ID print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query415);
                    query_name7=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name7.getTree());

                    ID8=(Token)match(input,ID,FOLLOW_ID_in_query417);  
                    stream_ID.add(ID8);


                    FILTER9=(Token)match(input,FILTER,FOLLOW_FILTER_in_query419);  
                    stream_FILTER.add(FILTER9);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_query421);  
                    stream_ID.add(ID10);


                    pushFollow(FOLLOW_print_stmt_in_query423);
                    print_stmt11=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt11.getTree());

                    // AST REWRITE
                    // elements: ID, FILTER, query_name, print_stmt, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:42: ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:75: ^( FILTER_QUERY ID FILTER ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILTER_QUERY, "FILTER_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_FILTER.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:112: ( print_stmt )?
                        if ( stream_print_stmt.hasNext() ) {
                            adaptor.addChild(root_2, stream_print_stmt.nextTree());

                        }
                        stream_print_stmt.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:4: stat_statements
                    {
                    pushFollow(FOLLOW_stat_statements_in_query458);
                    stat_statements12=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements12.getTree());

                    // AST REWRITE
                    // elements: stat_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:20: -> ^( STATEMENTS stat_statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:23: ^( STATEMENTS stat_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_1);

                        adaptor.addChild(root_1, stream_stat_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:10: EPSILON
                    {
                    root_0 = (Object)adaptor.nil();


                    EPSILON13=(Token)match(input,EPSILON,FOLLOW_EPSILON_in_query477); 
                    EPSILON13_tree = 
                    (Object)adaptor.create(EPSILON13)
                    ;
                    adaptor.addChild(root_0, EPSILON13_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class query_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query_name"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:1: query_name : ( ID COLON -> ID | -> EPSILON );
    public final QueryLanguageParser.query_name_return query_name() throws RecognitionException {
        QueryLanguageParser.query_name_return retval = new QueryLanguageParser.query_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID14=null;
        Token COLON15=null;

        Object ID14_tree=null;
        Object COLON15_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:73:2: ( ID COLON -> ID | -> EPSILON )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==COLON) ) {
                    alt3=1;
                }
                else if ( (LA3_1==FILTER) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==SELECT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:73:4: ID COLON
                    {
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_query_name489);  
                    stream_ID.add(ID14);


                    COLON15=(Token)match(input,COLON,FOLLOW_COLON_in_query_name491);  
                    stream_COLON.add(COLON15);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:13: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query_name"


    public static class select_query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_query"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:77:1: select_query : SELECT limitation_clause LEFT_PAREN node_chain ( ID )? node_chain_op block RIGHT_PAREN with_clause in_clause select_where -> ^( NODE_CHAIN node_chain ) ^( LIMITATION_CLAUSE limitation_clause ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where ;
    public final QueryLanguageParser.select_query_return select_query() throws RecognitionException {
        QueryLanguageParser.select_query_return retval = new QueryLanguageParser.select_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT16=null;
        Token LEFT_PAREN18=null;
        Token ID20=null;
        Token RIGHT_PAREN23=null;
        QueryLanguageParser.limitation_clause_return limitation_clause17 =null;

        QueryLanguageParser.node_chain_return node_chain19 =null;

        QueryLanguageParser.node_chain_op_return node_chain_op21 =null;

        QueryLanguageParser.block_return block22 =null;

        QueryLanguageParser.with_clause_return with_clause24 =null;

        QueryLanguageParser.in_clause_return in_clause25 =null;

        QueryLanguageParser.select_where_return select_where26 =null;


        Object SELECT16_tree=null;
        Object LEFT_PAREN18_tree=null;
        Object ID20_tree=null;
        Object RIGHT_PAREN23_tree=null;
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_select_where=new RewriteRuleSubtreeStream(adaptor,"rule select_where");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_with_clause=new RewriteRuleSubtreeStream(adaptor,"rule with_clause");
        RewriteRuleSubtreeStream stream_limitation_clause=new RewriteRuleSubtreeStream(adaptor,"rule limitation_clause");
        RewriteRuleSubtreeStream stream_node_chain_op=new RewriteRuleSubtreeStream(adaptor,"rule node_chain_op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_in_clause=new RewriteRuleSubtreeStream(adaptor,"rule in_clause");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:2: ( SELECT limitation_clause LEFT_PAREN node_chain ( ID )? node_chain_op block RIGHT_PAREN with_clause in_clause select_where -> ^( NODE_CHAIN node_chain ) ^( LIMITATION_CLAUSE limitation_clause ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:4: SELECT limitation_clause LEFT_PAREN node_chain ( ID )? node_chain_op block RIGHT_PAREN with_clause in_clause select_where
            {
            SELECT16=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_query513);  
            stream_SELECT.add(SELECT16);


            pushFollow(FOLLOW_limitation_clause_in_select_query515);
            limitation_clause17=limitation_clause();

            state._fsp--;

            stream_limitation_clause.add(limitation_clause17.getTree());

            LEFT_PAREN18=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_select_query517);  
            stream_LEFT_PAREN.add(LEFT_PAREN18);


            pushFollow(FOLLOW_node_chain_in_select_query519);
            node_chain19=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain19.getTree());

            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:51: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:51: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_select_query521);  
                    stream_ID.add(ID20);


                    }
                    break;

            }


            pushFollow(FOLLOW_node_chain_op_in_select_query524);
            node_chain_op21=node_chain_op();

            state._fsp--;

            stream_node_chain_op.add(node_chain_op21.getTree());

            pushFollow(FOLLOW_block_in_select_query526);
            block22=block();

            state._fsp--;

            stream_block.add(block22.getTree());

            RIGHT_PAREN23=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_select_query528);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN23);


            pushFollow(FOLLOW_with_clause_in_select_query530);
            with_clause24=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause24.getTree());

            pushFollow(FOLLOW_in_clause_in_select_query532);
            in_clause25=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause25.getTree());

            pushFollow(FOLLOW_select_where_in_select_query534);
            select_where26=select_where();

            state._fsp--;

            stream_select_where.add(select_where26.getTree());

            // AST REWRITE
            // elements: select_where, node_chain_op, block, with_clause, node_chain, in_clause, limitation_clause, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:122: -> ^( NODE_CHAIN node_chain ) ^( LIMITATION_CLAUSE limitation_clause ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:125: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:150: ^( LIMITATION_CLAUSE limitation_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIMITATION_CLAUSE, "LIMITATION_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_limitation_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:189: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:200: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:205: ^( NODE_CHAIN_OP node_chain_op )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN_OP, "NODE_CHAIN_OP")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain_op.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:237: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:260: ^( BLOCK_STATEMENTS block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_with_clause.nextTree());

                adaptor.addChild(root_0, stream_select_where.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_query"


    public static class select_where_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_where"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:81:1: select_where : ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | stat_statements -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) ) );
    public final QueryLanguageParser.select_where_return select_where() throws RecognitionException {
        QueryLanguageParser.select_where_return retval = new QueryLanguageParser.select_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE27=null;
        QueryLanguageParser.boolean_exp_return boolean_exp28 =null;

        QueryLanguageParser.stat_statements_return stat_statements29 =null;

        QueryLanguageParser.stat_statements_return stat_statements30 =null;


        Object WHERE27_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:2: ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | stat_statements -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            else if ( (LA5_0==LEFT_BRACKET) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:4: WHERE boolean_exp stat_statements
                    {
                    WHERE27=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_where590);  
                    stream_WHERE.add(WHERE27);


                    pushFollow(FOLLOW_boolean_exp_in_select_where592);
                    boolean_exp28=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp28.getTree());

                    pushFollow(FOLLOW_stat_statements_in_select_where594);
                    stat_statements29=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements29.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, stat_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:38: -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:41: ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:55: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:79: ^( STATEMENTS stat_statements )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_2);

                        adaptor.addChild(root_2, stream_stat_statements.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:4: stat_statements
                    {
                    pushFollow(FOLLOW_stat_statements_in_select_where617);
                    stat_statements30=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements30.getTree());

                    // AST REWRITE
                    // elements: stat_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:20: -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:23: ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:37: ^( STATEMENTS stat_statements )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_2);

                        adaptor.addChild(root_2, stream_stat_statements.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_where"


    public static class in_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_clause"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:1: in_clause : ( directly IN variable -> directly variable | -> EPSILON );
    public final QueryLanguageParser.in_clause_return in_clause() throws RecognitionException {
        QueryLanguageParser.in_clause_return retval = new QueryLanguageParser.in_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IN32=null;
        QueryLanguageParser.directly_return directly31 =null;

        QueryLanguageParser.variable_return variable33 =null;


        Object IN32_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_directly=new RewriteRuleSubtreeStream(adaptor,"rule directly");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:2: ( directly IN variable -> directly variable | -> EPSILON )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DIRECTLY||LA6_0==IN) ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= AND && LA6_0 <= AS)||(LA6_0 >= COMMA && LA6_0 <= COMPOUND_ADD)||LA6_0==DIVIDE||LA6_0==EQUALS||(LA6_0 >= GT && LA6_0 <= GTE)||LA6_0==INCREMENT||LA6_0==LEFT_BRACKET||LA6_0==LOGIC_EQUALS||(LA6_0 >= LT && LA6_0 <= LTE)||LA6_0==MINUS||LA6_0==NOT_EQUAL||LA6_0==OR||LA6_0==PLUS||LA6_0==RIGHT_PAREN||LA6_0==SEMICOLON||LA6_0==STAR||LA6_0==WHERE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:4: directly IN variable
                    {
                    pushFollow(FOLLOW_directly_in_in_clause640);
                    directly31=directly();

                    state._fsp--;

                    stream_directly.add(directly31.getTree());

                    IN32=(Token)match(input,IN,FOLLOW_IN_in_in_clause642);  
                    stream_IN.add(IN32);


                    pushFollow(FOLLOW_variable_in_in_clause644);
                    variable33=variable();

                    state._fsp--;

                    stream_variable.add(variable33.getTree());

                    // AST REWRITE
                    // elements: directly, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:25: -> directly variable
                    {
                        adaptor.addChild(root_0, stream_directly.nextTree());

                        adaptor.addChild(root_0, stream_variable.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:88:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_clause"


    public static class limitation_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitation_clause"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:1: limitation_clause : ( limitation | -> EPSILON );
    public final QueryLanguageParser.limitation_clause_return limitation_clause() throws RecognitionException {
        QueryLanguageParser.limitation_clause_return retval = new QueryLanguageParser.limitation_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.limitation_return limitation34 =null;



        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:2: ( limitation | -> EPSILON )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==INMOST||LA7_0==OUTMOST) ) {
                alt7=1;
            }
            else if ( (LA7_0==LEFT_PAREN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:4: limitation
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_limitation_in_limitation_clause669);
                    limitation34=limitation();

                    state._fsp--;

                    adaptor.addChild(root_0, limitation34.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitation_clause"


    public static class limitation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitation"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:1: limitation : ( OUTMOST | INMOST );
    public final QueryLanguageParser.limitation_return limitation() throws RecognitionException {
        QueryLanguageParser.limitation_return retval = new QueryLanguageParser.limitation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:2: ( OUTMOST | INMOST )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            {
            root_0 = (Object)adaptor.nil();


            set35=(Token)input.LT(1);

            if ( input.LA(1)==INMOST||input.LA(1)==OUTMOST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set35)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitation"


    public static class directly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "directly"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:1: directly : ( DIRECTLY | -> EPSILON );
    public final QueryLanguageParser.directly_return directly() throws RecognitionException {
        QueryLanguageParser.directly_return retval = new QueryLanguageParser.directly_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIRECTLY36=null;

        Object DIRECTLY36_tree=null;

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:2: ( DIRECTLY | -> EPSILON )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DIRECTLY) ) {
                alt8=1;
            }
            else if ( (LA8_0==IN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:4: DIRECTLY
                    {
                    root_0 = (Object)adaptor.nil();


                    DIRECTLY36=(Token)match(input,DIRECTLY,FOLLOW_DIRECTLY_in_directly703); 
                    DIRECTLY36_tree = 
                    (Object)adaptor.create(DIRECTLY36)
                    ;
                    adaptor.addChild(root_0, DIRECTLY36_tree);


                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:104:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "directly"


    public static class with_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "with_clause"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:1: with_clause : ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE );
    public final QueryLanguageParser.with_clause_return with_clause() throws RecognitionException {
        QueryLanguageParser.with_clause_return retval = new QueryLanguageParser.with_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH37=null;
        Token AS39=null;
        Token ID40=null;
        QueryLanguageParser.variable_return variable38 =null;


        Object WITH37_tree=null;
        Object AS39_tree=null;
        Object ID40_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:2: ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITH) ) {
                alt9=1;
            }
            else if ( ((LA9_0 >= AND && LA9_0 <= AS)||(LA9_0 >= COMMA && LA9_0 <= COMPOUND_ADD)||(LA9_0 >= DIRECTLY && LA9_0 <= DIVIDE)||LA9_0==EQUALS||(LA9_0 >= GT && LA9_0 <= GTE)||LA9_0==IN||LA9_0==INCREMENT||LA9_0==LEFT_BRACKET||LA9_0==LOGIC_EQUALS||(LA9_0 >= LT && LA9_0 <= LTE)||LA9_0==MINUS||LA9_0==NOT_EQUAL||LA9_0==OR||LA9_0==PLUS||LA9_0==RIGHT_PAREN||LA9_0==SEMICOLON||LA9_0==STAR||LA9_0==WHERE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:4: WITH variable AS ID
                    {
                    WITH37=(Token)match(input,WITH,FOLLOW_WITH_in_with_clause722);  
                    stream_WITH.add(WITH37);


                    pushFollow(FOLLOW_variable_in_with_clause724);
                    variable38=variable();

                    state._fsp--;

                    stream_variable.add(variable38.getTree());

                    AS39=(Token)match(input,AS,FOLLOW_AS_in_with_clause726);  
                    stream_AS.add(AS39);


                    ID40=(Token)match(input,ID,FOLLOW_ID_in_with_clause728);  
                    stream_ID.add(ID40);


                    // AST REWRITE
                    // elements: ID, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:24: -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:27: ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:41: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:57: ^( CHAIN_ID ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:75: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:75: -> WITH_CLAUSE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "with_clause"


    public static class node_chain_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_chain_op"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:111:1: node_chain_op : ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON );
    public final QueryLanguageParser.node_chain_op_return node_chain_op() throws RecognitionException {
        QueryLanguageParser.node_chain_op_return retval = new QueryLanguageParser.node_chain_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR41=null;
        Token ID43=null;
        Token REPEATER44=null;
        Token ID46=null;
        QueryLanguageParser.node_chain_return node_chain42 =null;

        QueryLanguageParser.node_chain_return node_chain45 =null;


        Object STAR41_tree=null;
        Object ID43_tree=null;
        Object REPEATER44_tree=null;
        Object ID46_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:2: ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON )
            int alt12=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt12=1;
                }
                break;
            case REPEATER:
                {
                alt12=2;
                }
                break;
            case LEFT_BRACKET:
            case RIGHT_PAREN:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:4: STAR node_chain ( ID )?
                    {
                    STAR41=(Token)match(input,STAR,FOLLOW_STAR_in_node_chain_op764);  
                    stream_STAR.add(STAR41);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op766);
                    node_chain42=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain42.getTree());

                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:20: ( ID )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:20: ID
                            {
                            ID43=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op768);  
                            stream_ID.add(ID43);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: STAR, ID, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:24: -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:27: ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:45: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:56: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:4: REPEATER node_chain ( ID )?
                    {
                    REPEATER44=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_node_chain_op789);  
                    stream_REPEATER.add(REPEATER44);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op791);
                    node_chain45=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain45.getTree());

                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:24: ( ID )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:24: ID
                            {
                            ID46=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op793);  
                            stream_ID.add(ID46);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: REPEATER, ID, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:28: -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:31: ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPEATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:53: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:64: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node_chain_op"


    public static class node_chain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_chain"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:117:1: node_chain : ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | ast_child keywords -> ^( NODE ^( AST_CHILD ast_child ) keywords ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) );
    public final QueryLanguageParser.node_chain_return node_chain() throws RecognitionException {
        QueryLanguageParser.node_chain_return retval = new QueryLanguageParser.node_chain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD48=null;
        Token COLON51=null;
        Token PERIOD60=null;
        Token ID62=null;
        Token PERIOD63=null;
        QueryLanguageParser.node_return node47 =null;

        QueryLanguageParser.node_chain_return node_chain49 =null;

        QueryLanguageParser.node_return node50 =null;

        QueryLanguageParser.attr_return attr52 =null;

        QueryLanguageParser.node_return node53 =null;

        QueryLanguageParser.node_return node54 =null;

        QueryLanguageParser.keywords_return keywords55 =null;

        QueryLanguageParser.ast_child_return ast_child56 =null;

        QueryLanguageParser.ast_child_return ast_child57 =null;

        QueryLanguageParser.keywords_return keywords58 =null;

        QueryLanguageParser.ast_child_return ast_child59 =null;

        QueryLanguageParser.node_chain_return node_chain61 =null;

        QueryLanguageParser.node_chain_return node_chain64 =null;

        QueryLanguageParser.property_return property65 =null;


        Object PERIOD48_tree=null;
        Object COLON51_tree=null;
        Object PERIOD60_tree=null;
        Object ID62_tree=null;
        Object PERIOD63_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_keywords=new RewriteRuleSubtreeStream(adaptor,"rule keywords");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:118:2: ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | ast_child keywords -> ^( NODE ^( AST_CHILD ast_child ) keywords ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case LT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==NODE_TYPE) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==GT) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA13_14 = input.LA(5);

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||(LA13_14 >= IS && LA13_14 <= ISPARENT)||LA13_14==LINENUMBER) ) {
                                alt13=4;
                            }
                            else if ( (LA13_14==ID||LA13_14==LEFT_BRACKET||LA13_14==LEFT_SQ_BRACKET||LA13_14==LT) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt13=2;
                            }
                            break;
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
                        case DIVIDE:
                        case EQUALS:
                        case GT:
                        case GTE:
                        case ID:
                        case INCREMENT:
                        case LEFT_BRACKET:
                        case LEFT_SQ_BRACKET:
                        case LOGIC_EQUALS:
                        case LT:
                        case LTE:
                        case MINUS:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case REPEATER:
                        case RIGHT_BRACKET:
                        case RIGHT_PAREN:
                        case SEMICOLON:
                        case STAR:
                        case WHERE:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 10, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_SQ_BRACKET:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==ID) ) {
                    int LA13_6 = input.LA(3);

                    if ( (LA13_6==RIGHT_SQ_BRACKET) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA13_14 = input.LA(5);

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||(LA13_14 >= IS && LA13_14 <= ISPARENT)||LA13_14==LINENUMBER) ) {
                                alt13=4;
                            }
                            else if ( (LA13_14==ID||LA13_14==LEFT_BRACKET||LA13_14==LEFT_SQ_BRACKET||LA13_14==LT) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt13=2;
                            }
                            break;
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
                        case DIVIDE:
                        case EQUALS:
                        case GT:
                        case GTE:
                        case ID:
                        case INCREMENT:
                        case LEFT_BRACKET:
                        case LEFT_SQ_BRACKET:
                        case LOGIC_EQUALS:
                        case LT:
                        case LTE:
                        case MINUS:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case REPEATER:
                        case RIGHT_BRACKET:
                        case RIGHT_PAREN:
                        case SEMICOLON:
                        case STAR:
                        case WHERE:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 11, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==ID) ) {
                    int LA13_7 = input.LA(3);

                    if ( (LA13_7==RIGHT_BRACKET) ) {
                        int LA13_12 = input.LA(4);

                        if ( ((LA13_12 >= AND && LA13_12 <= AS)||(LA13_12 >= COMMA && LA13_12 <= COMPOUND_ADD)||LA13_12==DIVIDE||LA13_12==EQUALS||(LA13_12 >= GT && LA13_12 <= GTE)||LA13_12==ID||LA13_12==INCREMENT||LA13_12==LEFT_BRACKET||LA13_12==LEFT_SQ_BRACKET||LA13_12==LOGIC_EQUALS||(LA13_12 >= LT && LA13_12 <= LTE)||LA13_12==MINUS||LA13_12==NOT_EQUAL||LA13_12==OR||LA13_12==PLUS||LA13_12==REPEATER||(LA13_12 >= RIGHT_BRACKET && LA13_12 <= RIGHT_PAREN)||LA13_12==SEMICOLON||LA13_12==STAR||LA13_12==WHERE) ) {
                            alt13=5;
                        }
                        else if ( (LA13_12==PERIOD) ) {
                            int LA13_18 = input.LA(5);

                            if ( (LA13_18==CONTAINS||LA13_18==HAS||(LA13_18 >= IS && LA13_18 <= ISPARENT)||LA13_18==LINENUMBER) ) {
                                alt13=6;
                            }
                            else if ( (LA13_18==ID||LA13_18==LEFT_BRACKET||LA13_18==LEFT_SQ_BRACKET||LA13_18==LT) ) {
                                alt13=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==PERIOD) ) {
                    int LA13_8 = input.LA(3);

                    if ( (LA13_8==CONTAINS||LA13_8==FIRSTCHILD||(LA13_8 >= ISNODETYPE && LA13_8 <= ISPARENT)||LA13_8==LINENUMBER||LA13_8==NEXTNODE) ) {
                        alt13=9;
                    }
                    else if ( (LA13_8==ID||LA13_8==LEFT_BRACKET||LA13_8==LEFT_SQ_BRACKET||LA13_8==LT) ) {
                        alt13=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 8, input);

                        throw nvae;

                    }
                }
                else if ( ((LA13_4 >= AND && LA13_4 <= AS)||(LA13_4 >= COMMA && LA13_4 <= COMPOUND_ADD)||LA13_4==DIVIDE||LA13_4==EQUALS||(LA13_4 >= GT && LA13_4 <= GTE)||LA13_4==ID||LA13_4==INCREMENT||LA13_4==LEFT_BRACKET||LA13_4==LEFT_SQ_BRACKET||LA13_4==LOGIC_EQUALS||(LA13_4 >= LT && LA13_4 <= LTE)||LA13_4==MINUS||LA13_4==NOT_EQUAL||LA13_4==OR||LA13_4==PLUS||LA13_4==REPEATER||(LA13_4 >= RIGHT_BRACKET && LA13_4 <= RIGHT_PAREN)||LA13_4==SEMICOLON||LA13_4==STAR||LA13_4==WHERE) ) {
                    alt13=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:118:4: node PERIOD node_chain
                    {
                    pushFollow(FOLLOW_node_in_node_chain829);
                    node47=node();

                    state._fsp--;

                    stream_node.add(node47.getTree());

                    PERIOD48=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain831);  
                    stream_PERIOD.add(PERIOD48);


                    pushFollow(FOLLOW_node_chain_in_node_chain833);
                    node_chain49=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain49.getTree());

                    // AST REWRITE
                    // elements: node_chain, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:31: -> ^( NODE node ) ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:118:34: ^( NODE node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:118:47: ^( NODE_CHAIN node_chain )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:4: node COLON attr
                    {
                    pushFollow(FOLLOW_node_in_node_chain856);
                    node50=node();

                    state._fsp--;

                    stream_node.add(node50.getTree());

                    COLON51=(Token)match(input,COLON,FOLLOW_COLON_in_node_chain858);  
                    stream_COLON.add(COLON51);


                    pushFollow(FOLLOW_attr_in_node_chain860);
                    attr52=attr();

                    state._fsp--;

                    stream_attr.add(attr52.getTree());

                    // AST REWRITE
                    // elements: attr, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:24: -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:27: ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:34: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:52: ^( ATTRIBUTE attr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                        , root_2);

                        adaptor.addChild(root_2, stream_attr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:4: node
                    {
                    pushFollow(FOLLOW_node_in_node_chain887);
                    node53=node();

                    state._fsp--;

                    stream_node.add(node53.getTree());

                    // AST REWRITE
                    // elements: node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:15: -> ^( NODE ^( NODE_NAME node ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:18: ^( NODE ^( NODE_NAME node ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:25: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:4: node keywords
                    {
                    pushFollow(FOLLOW_node_in_node_chain910);
                    node54=node();

                    state._fsp--;

                    stream_node.add(node54.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain912);
                    keywords55=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords55.getTree());

                    // AST REWRITE
                    // elements: keywords, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:22: -> ^( NODE ^( NODE_NAME node ) keywords )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:25: ^( NODE ^( NODE_NAME node ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:32: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_keywords.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:6: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain937);
                    ast_child56=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child56.getTree());

                    // AST REWRITE
                    // elements: ast_child
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:31: -> ^( NODE ^( AST_CHILD ast_child ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:34: ^( NODE ^( AST_CHILD ast_child ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:41: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:6: ast_child keywords
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain971);
                    ast_child57=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child57.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain973);
                    keywords58=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords58.getTree());

                    // AST REWRITE
                    // elements: ast_child, keywords
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:30: -> ^( NODE ^( AST_CHILD ast_child ) keywords )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:33: ^( NODE ^( AST_CHILD ast_child ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:40: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_keywords.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:6: ast_child PERIOD node_chain
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain999);
                    ast_child59=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child59.getTree());

                    PERIOD60=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain1001);  
                    stream_PERIOD.add(PERIOD60);


                    pushFollow(FOLLOW_node_chain_in_node_chain1003);
                    node_chain61=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain61.getTree());

                    // AST REWRITE
                    // elements: ast_child, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:45: -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:48: ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:55: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:78: ^( NODE_CHAIN node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_2);

                        adaptor.addChild(root_2, stream_node_chain.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:4: ID PERIOD node_chain
                    {
                    ID62=(Token)match(input,ID,FOLLOW_ID_in_node_chain1037);  
                    stream_ID.add(ID62);


                    PERIOD63=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain1039);  
                    stream_PERIOD.add(PERIOD63);


                    pushFollow(FOLLOW_node_chain_in_node_chain1041);
                    node_chain64=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain64.getTree());

                    // AST REWRITE
                    // elements: ID, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:29: -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:32: ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:46: ^( NODE_CHAIN node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_2);

                        adaptor.addChild(root_2, stream_node_chain.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:4: property
                    {
                    pushFollow(FOLLOW_property_in_node_chain1064);
                    property65=property();

                    state._fsp--;

                    stream_property.add(property65.getTree());

                    // AST REWRITE
                    // elements: property
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:17: -> ^( PROPERTY property )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:20: ^( PROPERTY property )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PROPERTY, "PROPERTY")
                        , root_1);

                        adaptor.addChild(root_1, stream_property.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node_chain"


    public static class node_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:129:1: node : ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) );
    public final QueryLanguageParser.node_return node() throws RecognitionException {
        QueryLanguageParser.node_return retval = new QueryLanguageParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT66=null;
        Token NODE_TYPE67=null;
        Token GT68=null;
        Token LEFT_SQ_BRACKET69=null;
        Token ID70=null;
        Token RIGHT_SQ_BRACKET71=null;

        Object LT66_tree=null;
        Object NODE_TYPE67_tree=null;
        Object GT68_tree=null;
        Object LEFT_SQ_BRACKET69_tree=null;
        Object ID70_tree=null;
        Object RIGHT_SQ_BRACKET71_tree=null;
        RewriteRuleTokenStream stream_LEFT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_SQ_BRACKET");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_NODE_TYPE=new RewriteRuleTokenStream(adaptor,"token NODE_TYPE");
        RewriteRuleTokenStream stream_RIGHT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQ_BRACKET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:130:2: ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LT) ) {
                alt14=1;
            }
            else if ( (LA14_0==LEFT_SQ_BRACKET) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:130:4: LT NODE_TYPE GT
                    {
                    LT66=(Token)match(input,LT,FOLLOW_LT_in_node1089);  
                    stream_LT.add(LT66);


                    NODE_TYPE67=(Token)match(input,NODE_TYPE,FOLLOW_NODE_TYPE_in_node1091);  
                    stream_NODE_TYPE.add(NODE_TYPE67);


                    GT68=(Token)match(input,GT,FOLLOW_GT_in_node1093);  
                    stream_GT.add(GT68);


                    // AST REWRITE
                    // elements: NODE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:20: -> NODE_TYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_NODE_TYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:131:4: LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET
                    {
                    LEFT_SQ_BRACKET69=(Token)match(input,LEFT_SQ_BRACKET,FOLLOW_LEFT_SQ_BRACKET_in_node1103);  
                    stream_LEFT_SQ_BRACKET.add(LEFT_SQ_BRACKET69);


                    ID70=(Token)match(input,ID,FOLLOW_ID_in_node1105);  
                    stream_ID.add(ID70);


                    RIGHT_SQ_BRACKET71=(Token)match(input,RIGHT_SQ_BRACKET,FOLLOW_RIGHT_SQ_BRACKET_in_node1107);  
                    stream_RIGHT_SQ_BRACKET.add(RIGHT_SQ_BRACKET71);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:40: -> ^( TABLE ID )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:131:43: ^( TABLE ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TABLE, "TABLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node"


    public static class ast_child_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ast_child"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:134:1: ast_child : LEFT_BRACKET ID RIGHT_BRACKET -> ID ;
    public final QueryLanguageParser.ast_child_return ast_child() throws RecognitionException {
        QueryLanguageParser.ast_child_return retval = new QueryLanguageParser.ast_child_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET72=null;
        Token ID73=null;
        Token RIGHT_BRACKET74=null;

        Object LEFT_BRACKET72_tree=null;
        Object ID73_tree=null;
        Object RIGHT_BRACKET74_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:135:2: ( LEFT_BRACKET ID RIGHT_BRACKET -> ID )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:135:4: LEFT_BRACKET ID RIGHT_BRACKET
            {
            LEFT_BRACKET72=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_ast_child1127);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET72);


            ID73=(Token)match(input,ID,FOLLOW_ID_in_ast_child1129);  
            stream_ID.add(ID73);


            RIGHT_BRACKET74=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_ast_child1131);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET74);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:34: -> ID
            {
                adaptor.addChild(root_0, 
                stream_ID.nextNode()
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ast_child"


    public static class keywords_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywords"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:1: keywords : ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( LINENUMBER ) );
    public final QueryLanguageParser.keywords_return keywords() throws RecognitionException {
        QueryLanguageParser.keywords_return retval = new QueryLanguageParser.keywords_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD75=null;
        Token CONTAINS76=null;
        Token LEFT_PAREN77=null;
        Token RIGHT_PAREN79=null;
        Token PERIOD80=null;
        Token ISPARENT81=null;
        Token LEFT_PAREN82=null;
        Token RIGHT_PAREN84=null;
        Token PERIOD85=null;
        Token ISNODETYPE86=null;
        Token LEFT_PAREN87=null;
        Token RIGHT_PAREN89=null;
        Token PERIOD90=null;
        Token IS91=null;
        Token LEFT_PAREN92=null;
        Token RIGHT_PAREN94=null;
        Token PERIOD95=null;
        Token HAS96=null;
        Token LEFT_PAREN97=null;
        Token RIGHT_PAREN99=null;
        Token PERIOD100=null;
        Token LINENUMBER101=null;
        Token LEFT_PAREN102=null;
        Token RIGHT_PAREN103=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes78 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes83 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes88 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes93 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes98 =null;


        Object PERIOD75_tree=null;
        Object CONTAINS76_tree=null;
        Object LEFT_PAREN77_tree=null;
        Object RIGHT_PAREN79_tree=null;
        Object PERIOD80_tree=null;
        Object ISPARENT81_tree=null;
        Object LEFT_PAREN82_tree=null;
        Object RIGHT_PAREN84_tree=null;
        Object PERIOD85_tree=null;
        Object ISNODETYPE86_tree=null;
        Object LEFT_PAREN87_tree=null;
        Object RIGHT_PAREN89_tree=null;
        Object PERIOD90_tree=null;
        Object IS91_tree=null;
        Object LEFT_PAREN92_tree=null;
        Object RIGHT_PAREN94_tree=null;
        Object PERIOD95_tree=null;
        Object HAS96_tree=null;
        Object LEFT_PAREN97_tree=null;
        Object RIGHT_PAREN99_tree=null;
        Object PERIOD100_tree=null;
        Object LINENUMBER101_tree=null;
        Object LEFT_PAREN102_tree=null;
        Object RIGHT_PAREN103_tree=null;
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LINENUMBER=new RewriteRuleTokenStream(adaptor,"token LINENUMBER");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:2: ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( LINENUMBER ) )
            int alt15=6;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PERIOD) ) {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt15=1;
                    }
                    break;
                case ISPARENT:
                    {
                    alt15=2;
                    }
                    break;
                case ISNODETYPE:
                    {
                    alt15=3;
                    }
                    break;
                case IS:
                    {
                    alt15=4;
                    }
                    break;
                case HAS:
                    {
                    alt15=5;
                    }
                    break;
                case LINENUMBER:
                    {
                    alt15=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD75=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1147);  
                    stream_PERIOD.add(PERIOD75);


                    CONTAINS76=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_keywords1149);  
                    stream_CONTAINS.add(CONTAINS76);


                    LEFT_PAREN77=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1151);  
                    stream_LEFT_PAREN.add(LEFT_PAREN77);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1153);
                    keyword_nodes78=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes78.getTree());

                    RIGHT_PAREN79=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1155);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN79);


                    // AST REWRITE
                    // elements: CONTAINS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:61: ^( CONTAINS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:140:4: PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD80=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1170);  
                    stream_PERIOD.add(PERIOD80);


                    ISPARENT81=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_keywords1172);  
                    stream_ISPARENT.add(ISPARENT81);


                    LEFT_PAREN82=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1174);  
                    stream_LEFT_PAREN.add(LEFT_PAREN82);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1176);
                    keyword_nodes83=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes83.getTree());

                    RIGHT_PAREN84=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1178);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN84);


                    // AST REWRITE
                    // elements: ISPARENT, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:57: -> ^( ISPARENT keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:140:60: ^( ISPARENT keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:141:4: PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD85=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1191);  
                    stream_PERIOD.add(PERIOD85);


                    ISNODETYPE86=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_keywords1193);  
                    stream_ISNODETYPE.add(ISNODETYPE86);


                    LEFT_PAREN87=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1195);  
                    stream_LEFT_PAREN.add(LEFT_PAREN87);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1197);
                    keyword_nodes88=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes88.getTree());

                    RIGHT_PAREN89=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1199);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN89);


                    // AST REWRITE
                    // elements: keyword_nodes, ISNODETYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:59: -> ^( ISNODETYPE keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:141:62: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:142:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD90=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1212);  
                    stream_PERIOD.add(PERIOD90);


                    IS91=(Token)match(input,IS,FOLLOW_IS_in_keywords1214);  
                    stream_IS.add(IS91);


                    LEFT_PAREN92=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1216);  
                    stream_LEFT_PAREN.add(LEFT_PAREN92);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1218);
                    keyword_nodes93=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes93.getTree());

                    RIGHT_PAREN94=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1220);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN94);


                    // AST REWRITE
                    // elements: keyword_nodes, IS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:142:56: ^( IS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD95=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1235);  
                    stream_PERIOD.add(PERIOD95);


                    HAS96=(Token)match(input,HAS,FOLLOW_HAS_in_keywords1237);  
                    stream_HAS.add(HAS96);


                    LEFT_PAREN97=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1239);  
                    stream_LEFT_PAREN.add(LEFT_PAREN97);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1241);
                    keyword_nodes98=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes98.getTree());

                    RIGHT_PAREN99=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1243);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN99);


                    // AST REWRITE
                    // elements: HAS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:56: ^( HAS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_HAS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:4: PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN
                    {
                    PERIOD100=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1257);  
                    stream_PERIOD.add(PERIOD100);


                    LINENUMBER101=(Token)match(input,LINENUMBER,FOLLOW_LINENUMBER_in_keywords1259);  
                    stream_LINENUMBER.add(LINENUMBER101);


                    LEFT_PAREN102=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1261);  
                    stream_LEFT_PAREN.add(LEFT_PAREN102);


                    RIGHT_PAREN103=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1263);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN103);


                    // AST REWRITE
                    // elements: LINENUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:46: -> ^( LINENUMBER )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:49: ^( LINENUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LINENUMBER.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keywords"


    public static class keyword_nodes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword_nodes"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:147:1: keyword_nodes : ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) );
    public final QueryLanguageParser.keyword_nodes_return keyword_nodes() throws RecognitionException {
        QueryLanguageParser.keyword_nodes_return retval = new QueryLanguageParser.keyword_nodes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID105=null;
        QueryLanguageParser.node_return node104 =null;

        QueryLanguageParser.logical_op_return logical_op106 =null;

        QueryLanguageParser.ast_child_return ast_child107 =null;


        Object ID105_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:2: ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt16=1;
                }
                break;
            case ID:
                {
                alt16=2;
                }
                break;
            case AND:
            case OR:
                {
                alt16=3;
                }
                break;
            case LEFT_BRACKET:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:4: node
                    {
                    pushFollow(FOLLOW_node_in_keyword_nodes1282);
                    node104=node();

                    state._fsp--;

                    stream_node.add(node104.getTree());

                    // AST REWRITE
                    // elements: node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:9: -> ^( NODE_NAME node )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:12: ^( NODE_NAME node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:149:4: ID
                    {
                    ID105=(Token)match(input,ID,FOLLOW_ID_in_keyword_nodes1295);  
                    stream_ID.add(ID105);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:7: -> ^( VAR_NAME ID )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:149:10: ^( VAR_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:150:4: logical_op
                    {
                    pushFollow(FOLLOW_logical_op_in_keyword_nodes1308);
                    logical_op106=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op106.getTree());

                    // AST REWRITE
                    // elements: logical_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:15: -> ^( LOGIC_OP logical_op )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:150:18: ^( LOGIC_OP logical_op )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LOGIC_OP, "LOGIC_OP")
                        , root_1);

                        adaptor.addChild(root_1, stream_logical_op.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:4: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_keyword_nodes1321);
                    ast_child107=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child107.getTree());

                    // AST REWRITE
                    // elements: ast_child
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:14: -> ^( AST_CHILD ast_child )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:17: ^( AST_CHILD ast_child )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_1);

                        adaptor.addChild(root_1, stream_ast_child.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword_nodes"


    public static class attr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attr"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:1: attr : ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( LINENUMBER ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON );
    public final QueryLanguageParser.attr_return attr() throws RecognitionException {
        QueryLanguageParser.attr_return retval = new QueryLanguageParser.attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON108=null;
        Token PERIOD110=null;
        Token CONTAINS111=null;
        Token LEFT_PAREN112=null;
        Token RIGHT_PAREN114=null;
        Token PERIOD115=null;
        Token ISPARENT116=null;
        Token LEFT_PAREN117=null;
        Token RIGHT_PAREN119=null;
        Token PERIOD120=null;
        Token ISNODETYPE121=null;
        Token LEFT_PAREN122=null;
        Token RIGHT_PAREN124=null;
        Token PERIOD125=null;
        Token IS126=null;
        Token LEFT_PAREN127=null;
        Token RIGHT_PAREN129=null;
        Token PERIOD130=null;
        Token HAS131=null;
        Token LEFT_PAREN132=null;
        Token RIGHT_PAREN134=null;
        Token PERIOD135=null;
        Token LINENUMBER136=null;
        Token LEFT_PAREN137=null;
        Token RIGHT_PAREN138=null;
        Token ATTRIBUTES139=null;
        QueryLanguageParser.attr_return attr109 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes113 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes118 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes123 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes128 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes133 =null;

        QueryLanguageParser.attr_return attr140 =null;


        Object COLON108_tree=null;
        Object PERIOD110_tree=null;
        Object CONTAINS111_tree=null;
        Object LEFT_PAREN112_tree=null;
        Object RIGHT_PAREN114_tree=null;
        Object PERIOD115_tree=null;
        Object ISPARENT116_tree=null;
        Object LEFT_PAREN117_tree=null;
        Object RIGHT_PAREN119_tree=null;
        Object PERIOD120_tree=null;
        Object ISNODETYPE121_tree=null;
        Object LEFT_PAREN122_tree=null;
        Object RIGHT_PAREN124_tree=null;
        Object PERIOD125_tree=null;
        Object IS126_tree=null;
        Object LEFT_PAREN127_tree=null;
        Object RIGHT_PAREN129_tree=null;
        Object PERIOD130_tree=null;
        Object HAS131_tree=null;
        Object LEFT_PAREN132_tree=null;
        Object RIGHT_PAREN134_tree=null;
        Object PERIOD135_tree=null;
        Object LINENUMBER136_tree=null;
        Object LEFT_PAREN137_tree=null;
        Object RIGHT_PAREN138_tree=null;
        Object ATTRIBUTES139_tree=null;
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_ATTRIBUTES=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTES");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LINENUMBER=new RewriteRuleTokenStream(adaptor,"token LINENUMBER");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:155:2: ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( LINENUMBER ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON )
            int alt17=9;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt17=1;
                }
                break;
            case PERIOD:
                {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt17=2;
                    }
                    break;
                case ISPARENT:
                    {
                    alt17=3;
                    }
                    break;
                case ISNODETYPE:
                    {
                    alt17=4;
                    }
                    break;
                case IS:
                    {
                    alt17=5;
                    }
                    break;
                case HAS:
                    {
                    alt17=6;
                    }
                    break;
                case LINENUMBER:
                    {
                    alt17=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }

                }
                break;
            case ATTRIBUTES:
                {
                alt17=8;
                }
                break;
            case AND:
            case AS:
            case COMMA:
            case COMPOUND_ADD:
            case DIVIDE:
            case EQUALS:
            case GT:
            case GTE:
            case ID:
            case INCREMENT:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LOGIC_EQUALS:
            case LT:
            case LTE:
            case MINUS:
            case NOT_EQUAL:
            case OR:
            case PLUS:
            case REPEATER:
            case RIGHT_BRACKET:
            case RIGHT_PAREN:
            case SEMICOLON:
            case STAR:
            case WHERE:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:155:4: COLON attr
                    {
                    COLON108=(Token)match(input,COLON,FOLLOW_COLON_in_attr1341);  
                    stream_COLON.add(COLON108);


                    pushFollow(FOLLOW_attr_in_attr1343);
                    attr109=attr();

                    state._fsp--;

                    stream_attr.add(attr109.getTree());

                    // AST REWRITE
                    // elements: attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:20: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:155:24: ^( ATTRIBUTES attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                        , root_1);

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:156:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD110=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1362);  
                    stream_PERIOD.add(PERIOD110);


                    CONTAINS111=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_attr1364);  
                    stream_CONTAINS.add(CONTAINS111);


                    LEFT_PAREN112=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1366);  
                    stream_LEFT_PAREN.add(LEFT_PAREN112);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1368);
                    keyword_nodes113=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes113.getTree());

                    RIGHT_PAREN114=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1370);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN114);


                    // AST REWRITE
                    // elements: keyword_nodes, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:156:61: ^( CONTAINS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:4: PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD115=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1384);  
                    stream_PERIOD.add(PERIOD115);


                    ISPARENT116=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_attr1386);  
                    stream_ISPARENT.add(ISPARENT116);


                    LEFT_PAREN117=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1388);  
                    stream_LEFT_PAREN.add(LEFT_PAREN117);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1390);
                    keyword_nodes118=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes118.getTree());

                    RIGHT_PAREN119=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1392);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN119);


                    // AST REWRITE
                    // elements: keyword_nodes, ISPARENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:58: -> ^( ISPARENT keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:61: ^( ISPARENT keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:4: PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD120=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1406);  
                    stream_PERIOD.add(PERIOD120);


                    ISNODETYPE121=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_attr1408);  
                    stream_ISNODETYPE.add(ISNODETYPE121);


                    LEFT_PAREN122=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1410);  
                    stream_LEFT_PAREN.add(LEFT_PAREN122);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1412);
                    keyword_nodes123=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes123.getTree());

                    RIGHT_PAREN124=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1414);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN124);


                    // AST REWRITE
                    // elements: ISNODETYPE, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:60: -> ^( ISNODETYPE keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:63: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:159:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD125=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1428);  
                    stream_PERIOD.add(PERIOD125);


                    IS126=(Token)match(input,IS,FOLLOW_IS_in_attr1430);  
                    stream_IS.add(IS126);


                    LEFT_PAREN127=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1432);  
                    stream_LEFT_PAREN.add(LEFT_PAREN127);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1434);
                    keyword_nodes128=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes128.getTree());

                    RIGHT_PAREN129=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1436);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN129);


                    // AST REWRITE
                    // elements: IS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:159:56: ^( IS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:160:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD130=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1451);  
                    stream_PERIOD.add(PERIOD130);


                    HAS131=(Token)match(input,HAS,FOLLOW_HAS_in_attr1453);  
                    stream_HAS.add(HAS131);


                    LEFT_PAREN132=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1455);  
                    stream_LEFT_PAREN.add(LEFT_PAREN132);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1457);
                    keyword_nodes133=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes133.getTree());

                    RIGHT_PAREN134=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1459);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN134);


                    // AST REWRITE
                    // elements: HAS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:160:56: ^( HAS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_HAS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:161:4: PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN
                    {
                    PERIOD135=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1473);  
                    stream_PERIOD.add(PERIOD135);


                    LINENUMBER136=(Token)match(input,LINENUMBER,FOLLOW_LINENUMBER_in_attr1475);  
                    stream_LINENUMBER.add(LINENUMBER136);


                    LEFT_PAREN137=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1477);  
                    stream_LEFT_PAREN.add(LEFT_PAREN137);


                    RIGHT_PAREN138=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1479);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN138);


                    // AST REWRITE
                    // elements: LINENUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:46: -> ^( LINENUMBER )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:161:49: ^( LINENUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LINENUMBER.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:4: ATTRIBUTES attr
                    {
                    ATTRIBUTES139=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attr1491);  
                    stream_ATTRIBUTES.add(ATTRIBUTES139);


                    pushFollow(FOLLOW_attr_in_attr1493);
                    attr140=attr();

                    state._fsp--;

                    stream_attr.add(attr140.getTree());

                    // AST REWRITE
                    // elements: attr, ATTRIBUTES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:24: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:27: ^( ATTRIBUTES attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ATTRIBUTES.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attr"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:166:1: property : ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) | ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) ) | ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) ) | ID PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( LINENUMBER ) ) | ID PERIOD NEXTNODE LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( NEXTNODE ) ) | ID PERIOD FIRSTCHILD LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( FIRSTCHILD ) ) );
    public final QueryLanguageParser.property_return property() throws RecognitionException {
        QueryLanguageParser.property_return retval = new QueryLanguageParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID141=null;
        Token ID142=null;
        Token PERIOD143=null;
        Token CONTAINS144=null;
        Token LEFT_PAREN145=null;
        Token RIGHT_PAREN147=null;
        Token ID148=null;
        Token PERIOD149=null;
        Token ISPARENT150=null;
        Token LEFT_PAREN151=null;
        Token RIGHT_PAREN153=null;
        Token ID154=null;
        Token PERIOD155=null;
        Token ISNODETYPE156=null;
        Token LEFT_PAREN157=null;
        Token RIGHT_PAREN159=null;
        Token ID160=null;
        Token PERIOD161=null;
        Token LINENUMBER162=null;
        Token LEFT_PAREN163=null;
        Token RIGHT_PAREN164=null;
        Token ID165=null;
        Token PERIOD166=null;
        Token NEXTNODE167=null;
        Token LEFT_PAREN168=null;
        Token RIGHT_PAREN169=null;
        Token ID170=null;
        Token PERIOD171=null;
        Token FIRSTCHILD172=null;
        Token LEFT_PAREN173=null;
        Token RIGHT_PAREN174=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes146 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes152 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes158 =null;


        Object ID141_tree=null;
        Object ID142_tree=null;
        Object PERIOD143_tree=null;
        Object CONTAINS144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object RIGHT_PAREN147_tree=null;
        Object ID148_tree=null;
        Object PERIOD149_tree=null;
        Object ISPARENT150_tree=null;
        Object LEFT_PAREN151_tree=null;
        Object RIGHT_PAREN153_tree=null;
        Object ID154_tree=null;
        Object PERIOD155_tree=null;
        Object ISNODETYPE156_tree=null;
        Object LEFT_PAREN157_tree=null;
        Object RIGHT_PAREN159_tree=null;
        Object ID160_tree=null;
        Object PERIOD161_tree=null;
        Object LINENUMBER162_tree=null;
        Object LEFT_PAREN163_tree=null;
        Object RIGHT_PAREN164_tree=null;
        Object ID165_tree=null;
        Object PERIOD166_tree=null;
        Object NEXTNODE167_tree=null;
        Object LEFT_PAREN168_tree=null;
        Object RIGHT_PAREN169_tree=null;
        Object ID170_tree=null;
        Object PERIOD171_tree=null;
        Object FIRSTCHILD172_tree=null;
        Object LEFT_PAREN173_tree=null;
        Object RIGHT_PAREN174_tree=null;
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LINENUMBER=new RewriteRuleTokenStream(adaptor,"token LINENUMBER");
        RewriteRuleTokenStream stream_FIRSTCHILD=new RewriteRuleTokenStream(adaptor,"token FIRSTCHILD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_NEXTNODE=new RewriteRuleTokenStream(adaptor,"token NEXTNODE");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:167:2: ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) | ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) ) | ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) ) | ID PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( LINENUMBER ) ) | ID PERIOD NEXTNODE LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( NEXTNODE ) ) | ID PERIOD FIRSTCHILD LEFT_PAREN RIGHT_PAREN -> ^( VAR_NAME ID ^( FIRSTCHILD ) ) )
            int alt18=7;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PERIOD) ) {
                    switch ( input.LA(3) ) {
                    case CONTAINS:
                        {
                        alt18=2;
                        }
                        break;
                    case ISPARENT:
                        {
                        alt18=3;
                        }
                        break;
                    case ISNODETYPE:
                        {
                        alt18=4;
                        }
                        break;
                    case LINENUMBER:
                        {
                        alt18=5;
                        }
                        break;
                    case NEXTNODE:
                        {
                        alt18=6;
                        }
                        break;
                    case FIRSTCHILD:
                        {
                        alt18=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;

                    }

                }
                else if ( ((LA18_1 >= AND && LA18_1 <= AS)||(LA18_1 >= COMMA && LA18_1 <= COMPOUND_ADD)||LA18_1==DIVIDE||LA18_1==EQUALS||(LA18_1 >= GT && LA18_1 <= GTE)||LA18_1==ID||LA18_1==INCREMENT||LA18_1==LEFT_BRACKET||LA18_1==LEFT_SQ_BRACKET||LA18_1==LOGIC_EQUALS||(LA18_1 >= LT && LA18_1 <= LTE)||LA18_1==MINUS||LA18_1==NOT_EQUAL||LA18_1==OR||LA18_1==PLUS||LA18_1==REPEATER||(LA18_1 >= RIGHT_BRACKET && LA18_1 <= RIGHT_PAREN)||LA18_1==SEMICOLON||LA18_1==STAR||LA18_1==WHERE) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:167:4: ID
                    {
                    ID141=(Token)match(input,ID,FOLLOW_ID_in_property1524);  
                    stream_ID.add(ID141);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:18: -> ^( VAR_NAME ID )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:167:21: ^( VAR_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:4: ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID142=(Token)match(input,ID,FOLLOW_ID_in_property1548);  
                    stream_ID.add(ID142);


                    PERIOD143=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1550);  
                    stream_PERIOD.add(PERIOD143);


                    CONTAINS144=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_property1552);  
                    stream_CONTAINS.add(CONTAINS144);


                    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1554);  
                    stream_LEFT_PAREN.add(LEFT_PAREN145);


                    pushFollow(FOLLOW_keyword_nodes_in_property1556);
                    keyword_nodes146=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes146.getTree());

                    RIGHT_PAREN147=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1558);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN147);


                    // AST REWRITE
                    // elements: keyword_nodes, ID, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:60: -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:63: ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:77: ^( CONTAINS keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:4: ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID148=(Token)match(input,ID,FOLLOW_ID_in_property1577);  
                    stream_ID.add(ID148);


                    PERIOD149=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1579);  
                    stream_PERIOD.add(PERIOD149);


                    ISPARENT150=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_property1581);  
                    stream_ISPARENT.add(ISPARENT150);


                    LEFT_PAREN151=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1583);  
                    stream_LEFT_PAREN.add(LEFT_PAREN151);


                    pushFollow(FOLLOW_keyword_nodes_in_property1585);
                    keyword_nodes152=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes152.getTree());

                    RIGHT_PAREN153=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1587);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN153);


                    // AST REWRITE
                    // elements: keyword_nodes, ID, ISPARENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:60: -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:63: ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:77: ^( ISPARENT keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:4: ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID154=(Token)match(input,ID,FOLLOW_ID_in_property1606);  
                    stream_ID.add(ID154);


                    PERIOD155=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1608);  
                    stream_PERIOD.add(PERIOD155);


                    ISNODETYPE156=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_property1610);  
                    stream_ISNODETYPE.add(ISNODETYPE156);


                    LEFT_PAREN157=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1612);  
                    stream_LEFT_PAREN.add(LEFT_PAREN157);


                    pushFollow(FOLLOW_keyword_nodes_in_property1614);
                    keyword_nodes158=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes158.getTree());

                    RIGHT_PAREN159=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1616);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN159);


                    // AST REWRITE
                    // elements: ID, keyword_nodes, ISNODETYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:62: -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:65: ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:79: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:4: ID PERIOD LINENUMBER LEFT_PAREN RIGHT_PAREN
                    {
                    ID160=(Token)match(input,ID,FOLLOW_ID_in_property1635);  
                    stream_ID.add(ID160);


                    PERIOD161=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1637);  
                    stream_PERIOD.add(PERIOD161);


                    LINENUMBER162=(Token)match(input,LINENUMBER,FOLLOW_LINENUMBER_in_property1639);  
                    stream_LINENUMBER.add(LINENUMBER162);


                    LEFT_PAREN163=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1641);  
                    stream_LEFT_PAREN.add(LEFT_PAREN163);


                    RIGHT_PAREN164=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1643);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN164);


                    // AST REWRITE
                    // elements: ID, LINENUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:48: -> ^( VAR_NAME ID ^( LINENUMBER ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:51: ^( VAR_NAME ID ^( LINENUMBER ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:65: ^( LINENUMBER )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_LINENUMBER.nextNode()
                        , root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:172:6: ID PERIOD NEXTNODE LEFT_PAREN RIGHT_PAREN
                    {
                    ID165=(Token)match(input,ID,FOLLOW_ID_in_property1662);  
                    stream_ID.add(ID165);


                    PERIOD166=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1664);  
                    stream_PERIOD.add(PERIOD166);


                    NEXTNODE167=(Token)match(input,NEXTNODE,FOLLOW_NEXTNODE_in_property1666);  
                    stream_NEXTNODE.add(NEXTNODE167);


                    LEFT_PAREN168=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1668);  
                    stream_LEFT_PAREN.add(LEFT_PAREN168);


                    RIGHT_PAREN169=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1670);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN169);


                    // AST REWRITE
                    // elements: NEXTNODE, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:48: -> ^( VAR_NAME ID ^( NEXTNODE ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:172:51: ^( VAR_NAME ID ^( NEXTNODE ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:172:65: ^( NEXTNODE )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_NEXTNODE.nextNode()
                        , root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:173:6: ID PERIOD FIRSTCHILD LEFT_PAREN RIGHT_PAREN
                    {
                    ID170=(Token)match(input,ID,FOLLOW_ID_in_property1689);  
                    stream_ID.add(ID170);


                    PERIOD171=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1691);  
                    stream_PERIOD.add(PERIOD171);


                    FIRSTCHILD172=(Token)match(input,FIRSTCHILD,FOLLOW_FIRSTCHILD_in_property1693);  
                    stream_FIRSTCHILD.add(FIRSTCHILD172);


                    LEFT_PAREN173=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1695);  
                    stream_LEFT_PAREN.add(LEFT_PAREN173);


                    RIGHT_PAREN174=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1697);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN174);


                    // AST REWRITE
                    // elements: FIRSTCHILD, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:50: -> ^( VAR_NAME ID ^( FIRSTCHILD ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:173:53: ^( VAR_NAME ID ^( FIRSTCHILD ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:173:67: ^( FIRSTCHILD )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_FIRSTCHILD.nextNode()
                        , root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "property"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:1: variable : ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | COUNT -> COUNT | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) );
    public final QueryLanguageParser.variable_return variable() throws RecognitionException {
        QueryLanguageParser.variable_return retval = new QueryLanguageParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID175=null;
        Token COLON176=null;
        Token INTEGER179=null;
        Token COUNT180=null;
        Token STRING181=null;
        Token RESERVED_TYPES182=null;
        QueryLanguageParser.attr_return attr177 =null;

        QueryLanguageParser.node_chain_return node_chain178 =null;

        QueryLanguageParser.function_return function183 =null;


        Object ID175_tree=null;
        Object COLON176_tree=null;
        Object INTEGER179_tree=null;
        Object COUNT180_tree=null;
        Object STRING181_tree=null;
        Object RESERVED_TYPES182_tree=null;
        RewriteRuleTokenStream stream_RESERVED_TYPES=new RewriteRuleTokenStream(adaptor,"token RESERVED_TYPES");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:177:2: ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | COUNT -> COUNT | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==COLON) ) {
                    alt19=1;
                }
                else if ( ((LA19_1 >= AND && LA19_1 <= AS)||(LA19_1 >= COMMA && LA19_1 <= COMPOUND_ADD)||LA19_1==DIVIDE||LA19_1==EQUALS||(LA19_1 >= GT && LA19_1 <= GTE)||LA19_1==INCREMENT||LA19_1==LEFT_BRACKET||LA19_1==LOGIC_EQUALS||(LA19_1 >= LT && LA19_1 <= LTE)||LA19_1==MINUS||LA19_1==NOT_EQUAL||LA19_1==OR||(LA19_1 >= PERIOD && LA19_1 <= PLUS)||LA19_1==RIGHT_PAREN||LA19_1==SEMICOLON||LA19_1==STAR||LA19_1==WHERE) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt19=2;
                }
                break;
            case INTEGER:
                {
                alt19=3;
                }
                break;
            case COUNT:
                {
                alt19=4;
                }
                break;
            case STRING:
                {
                alt19=5;
                }
                break;
            case RESERVED_TYPES:
                {
                alt19=6;
                }
                break;
            case CALLQUERY:
            case DEPTH:
            case MAP:
            case MAPGET:
            case MAX:
            case METHODBINDING:
            case MIN:
            case NODETYPE:
            case PRINT:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:177:4: ID COLON attr
                    {
                    ID175=(Token)match(input,ID,FOLLOW_ID_in_variable1722);  
                    stream_ID.add(ID175);


                    COLON176=(Token)match(input,COLON,FOLLOW_COLON_in_variable1724);  
                    stream_COLON.add(COLON176);


                    pushFollow(FOLLOW_attr_in_variable1726);
                    attr177=attr();

                    state._fsp--;

                    stream_attr.add(attr177.getTree());

                    // AST REWRITE
                    // elements: ID, attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:21: -> ^( VAR_NAME ID attr )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:177:24: ^( VAR_NAME ID attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:4: node_chain
                    {
                    pushFollow(FOLLOW_node_chain_in_variable1744);
                    node_chain178=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain178.getTree());

                    // AST REWRITE
                    // elements: node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:19: -> ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:22: ^( NODE_CHAIN node_chain )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:179:4: INTEGER
                    {
                    INTEGER179=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable1761);  
                    stream_INTEGER.add(INTEGER179);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:16: -> INTEGER
                    {
                        adaptor.addChild(root_0, 
                        stream_INTEGER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:6: COUNT
                    {
                    COUNT180=(Token)match(input,COUNT,FOLLOW_COUNT_in_variable1776);  
                    stream_COUNT.add(COUNT180);


                    // AST REWRITE
                    // elements: COUNT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:12: -> COUNT
                    {
                        adaptor.addChild(root_0, 
                        stream_COUNT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:181:10: STRING
                    {
                    STRING181=(Token)match(input,STRING,FOLLOW_STRING_in_variable1791);  
                    stream_STRING.add(STRING181);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:50: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:4: RESERVED_TYPES
                    {
                    RESERVED_TYPES182=(Token)match(input,RESERVED_TYPES,FOLLOW_RESERVED_TYPES_in_variable1833);  
                    stream_RESERVED_TYPES.add(RESERVED_TYPES182);


                    // AST REWRITE
                    // elements: RESERVED_TYPES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:22: -> RESERVED_TYPES
                    {
                        adaptor.addChild(root_0, 
                        stream_RESERVED_TYPES.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:4: function
                    {
                    pushFollow(FOLLOW_function_in_variable1846);
                    function183=function();

                    state._fsp--;

                    stream_function.add(function183.getTree());

                    // AST REWRITE
                    // elements: function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:16: -> ^( FUNCTION function )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:19: ^( FUNCTION function )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_function.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:186:1: function : ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) | NODETYPE LEFT_PAREN variable RIGHT_PAREN -> ^( NODETYPE variable ) | METHODBINDING LEFT_PAREN variable RIGHT_PAREN -> ^( METHODBINDING variable ) | CALLQUERY LEFT_PAREN ID RIGHT_PAREN in_clause -> ^( CALLQUERY ID ^( IN_CLAUSE in_clause ) ) | PRINT ( LEFT_PAREN variable RIGHT_PAREN ) -> ^( PRINT variable ) | MAPGET LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAPGET variable variable ) | MAP LEFT_PAREN variable COMMA variable COMMA variable RIGHT_PAREN -> ^( MAP variable variable variable ) );
    public final QueryLanguageParser.function_return function() throws RecognitionException {
        QueryLanguageParser.function_return retval = new QueryLanguageParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAX184=null;
        Token LEFT_PAREN185=null;
        Token COMMA187=null;
        Token RIGHT_PAREN189=null;
        Token MIN190=null;
        Token LEFT_PAREN191=null;
        Token COMMA193=null;
        Token RIGHT_PAREN195=null;
        Token DEPTH196=null;
        Token LEFT_PAREN197=null;
        Token RIGHT_PAREN199=null;
        Token NODETYPE200=null;
        Token LEFT_PAREN201=null;
        Token RIGHT_PAREN203=null;
        Token METHODBINDING204=null;
        Token LEFT_PAREN205=null;
        Token RIGHT_PAREN207=null;
        Token CALLQUERY208=null;
        Token LEFT_PAREN209=null;
        Token ID210=null;
        Token RIGHT_PAREN211=null;
        Token PRINT213=null;
        Token LEFT_PAREN214=null;
        Token RIGHT_PAREN216=null;
        Token MAPGET217=null;
        Token LEFT_PAREN218=null;
        Token COMMA220=null;
        Token RIGHT_PAREN222=null;
        Token MAP223=null;
        Token LEFT_PAREN224=null;
        Token COMMA226=null;
        Token COMMA228=null;
        Token RIGHT_PAREN230=null;
        QueryLanguageParser.variable_return variable186 =null;

        QueryLanguageParser.variable_return variable188 =null;

        QueryLanguageParser.variable_return variable192 =null;

        QueryLanguageParser.variable_return variable194 =null;

        QueryLanguageParser.variable_return variable198 =null;

        QueryLanguageParser.variable_return variable202 =null;

        QueryLanguageParser.variable_return variable206 =null;

        QueryLanguageParser.in_clause_return in_clause212 =null;

        QueryLanguageParser.variable_return variable215 =null;

        QueryLanguageParser.variable_return variable219 =null;

        QueryLanguageParser.variable_return variable221 =null;

        QueryLanguageParser.variable_return variable225 =null;

        QueryLanguageParser.variable_return variable227 =null;

        QueryLanguageParser.variable_return variable229 =null;


        Object MAX184_tree=null;
        Object LEFT_PAREN185_tree=null;
        Object COMMA187_tree=null;
        Object RIGHT_PAREN189_tree=null;
        Object MIN190_tree=null;
        Object LEFT_PAREN191_tree=null;
        Object COMMA193_tree=null;
        Object RIGHT_PAREN195_tree=null;
        Object DEPTH196_tree=null;
        Object LEFT_PAREN197_tree=null;
        Object RIGHT_PAREN199_tree=null;
        Object NODETYPE200_tree=null;
        Object LEFT_PAREN201_tree=null;
        Object RIGHT_PAREN203_tree=null;
        Object METHODBINDING204_tree=null;
        Object LEFT_PAREN205_tree=null;
        Object RIGHT_PAREN207_tree=null;
        Object CALLQUERY208_tree=null;
        Object LEFT_PAREN209_tree=null;
        Object ID210_tree=null;
        Object RIGHT_PAREN211_tree=null;
        Object PRINT213_tree=null;
        Object LEFT_PAREN214_tree=null;
        Object RIGHT_PAREN216_tree=null;
        Object MAPGET217_tree=null;
        Object LEFT_PAREN218_tree=null;
        Object COMMA220_tree=null;
        Object RIGHT_PAREN222_tree=null;
        Object MAP223_tree=null;
        Object LEFT_PAREN224_tree=null;
        Object COMMA226_tree=null;
        Object COMMA228_tree=null;
        Object RIGHT_PAREN230_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_MAPGET=new RewriteRuleTokenStream(adaptor,"token MAPGET");
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_METHODBINDING=new RewriteRuleTokenStream(adaptor,"token METHODBINDING");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
        RewriteRuleTokenStream stream_CALLQUERY=new RewriteRuleTokenStream(adaptor,"token CALLQUERY");
        RewriteRuleTokenStream stream_NODETYPE=new RewriteRuleTokenStream(adaptor,"token NODETYPE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DEPTH=new RewriteRuleTokenStream(adaptor,"token DEPTH");
        RewriteRuleTokenStream stream_MAP=new RewriteRuleTokenStream(adaptor,"token MAP");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_in_clause=new RewriteRuleSubtreeStream(adaptor,"rule in_clause");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:2: ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) | NODETYPE LEFT_PAREN variable RIGHT_PAREN -> ^( NODETYPE variable ) | METHODBINDING LEFT_PAREN variable RIGHT_PAREN -> ^( METHODBINDING variable ) | CALLQUERY LEFT_PAREN ID RIGHT_PAREN in_clause -> ^( CALLQUERY ID ^( IN_CLAUSE in_clause ) ) | PRINT ( LEFT_PAREN variable RIGHT_PAREN ) -> ^( PRINT variable ) | MAPGET LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAPGET variable variable ) | MAP LEFT_PAREN variable COMMA variable COMMA variable RIGHT_PAREN -> ^( MAP variable variable variable ) )
            int alt20=9;
            switch ( input.LA(1) ) {
            case MAX:
                {
                alt20=1;
                }
                break;
            case MIN:
                {
                alt20=2;
                }
                break;
            case DEPTH:
                {
                alt20=3;
                }
                break;
            case NODETYPE:
                {
                alt20=4;
                }
                break;
            case METHODBINDING:
                {
                alt20=5;
                }
                break;
            case CALLQUERY:
                {
                alt20=6;
                }
                break;
            case PRINT:
                {
                alt20=7;
                }
                break;
            case MAPGET:
                {
                alt20=8;
                }
                break;
            case MAP:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:4: MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAX184=(Token)match(input,MAX,FOLLOW_MAX_in_function1868);  
                    stream_MAX.add(MAX184);


                    LEFT_PAREN185=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1870);  
                    stream_LEFT_PAREN.add(LEFT_PAREN185);


                    pushFollow(FOLLOW_variable_in_function1872);
                    variable186=variable();

                    state._fsp--;

                    stream_variable.add(variable186.getTree());

                    COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1874);  
                    stream_COMMA.add(COMMA187);


                    pushFollow(FOLLOW_variable_in_function1876);
                    variable188=variable();

                    state._fsp--;

                    stream_variable.add(variable188.getTree());

                    RIGHT_PAREN189=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1878);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN189);


                    // AST REWRITE
                    // elements: MAX, variable, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:55: -> ^( MAX variable variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:58: ^( MAX variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MAX.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:4: MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MIN190=(Token)match(input,MIN,FOLLOW_MIN_in_function1893);  
                    stream_MIN.add(MIN190);


                    LEFT_PAREN191=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1895);  
                    stream_LEFT_PAREN.add(LEFT_PAREN191);


                    pushFollow(FOLLOW_variable_in_function1897);
                    variable192=variable();

                    state._fsp--;

                    stream_variable.add(variable192.getTree());

                    COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1899);  
                    stream_COMMA.add(COMMA193);


                    pushFollow(FOLLOW_variable_in_function1901);
                    variable194=variable();

                    state._fsp--;

                    stream_variable.add(variable194.getTree());

                    RIGHT_PAREN195=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1903);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN195);


                    // AST REWRITE
                    // elements: variable, variable, MIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:55: -> ^( MIN variable variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:58: ^( MIN variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MIN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:189:10: DEPTH LEFT_PAREN variable RIGHT_PAREN
                    {
                    DEPTH196=(Token)match(input,DEPTH,FOLLOW_DEPTH_in_function1924);  
                    stream_DEPTH.add(DEPTH196);


                    LEFT_PAREN197=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1926);  
                    stream_LEFT_PAREN.add(LEFT_PAREN197);


                    pushFollow(FOLLOW_variable_in_function1928);
                    variable198=variable();

                    state._fsp--;

                    stream_variable.add(variable198.getTree());

                    RIGHT_PAREN199=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1930);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN199);


                    // AST REWRITE
                    // elements: DEPTH, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:48: -> ^( DEPTH variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:189:51: ^( DEPTH variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DEPTH.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:190:4: NODETYPE LEFT_PAREN variable RIGHT_PAREN
                    {
                    NODETYPE200=(Token)match(input,NODETYPE,FOLLOW_NODETYPE_in_function1943);  
                    stream_NODETYPE.add(NODETYPE200);


                    LEFT_PAREN201=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1945);  
                    stream_LEFT_PAREN.add(LEFT_PAREN201);


                    pushFollow(FOLLOW_variable_in_function1947);
                    variable202=variable();

                    state._fsp--;

                    stream_variable.add(variable202.getTree());

                    RIGHT_PAREN203=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1949);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN203);


                    // AST REWRITE
                    // elements: NODETYPE, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:45: -> ^( NODETYPE variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:190:48: ^( NODETYPE variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NODETYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:4: METHODBINDING LEFT_PAREN variable RIGHT_PAREN
                    {
                    METHODBINDING204=(Token)match(input,METHODBINDING,FOLLOW_METHODBINDING_in_function1962);  
                    stream_METHODBINDING.add(METHODBINDING204);


                    LEFT_PAREN205=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1964);  
                    stream_LEFT_PAREN.add(LEFT_PAREN205);


                    pushFollow(FOLLOW_variable_in_function1966);
                    variable206=variable();

                    state._fsp--;

                    stream_variable.add(variable206.getTree());

                    RIGHT_PAREN207=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1968);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN207);


                    // AST REWRITE
                    // elements: variable, METHODBINDING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:50: -> ^( METHODBINDING variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:53: ^( METHODBINDING variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_METHODBINDING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:6: CALLQUERY LEFT_PAREN ID RIGHT_PAREN in_clause
                    {
                    CALLQUERY208=(Token)match(input,CALLQUERY,FOLLOW_CALLQUERY_in_function1983);  
                    stream_CALLQUERY.add(CALLQUERY208);


                    LEFT_PAREN209=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1985);  
                    stream_LEFT_PAREN.add(LEFT_PAREN209);


                    ID210=(Token)match(input,ID,FOLLOW_ID_in_function1987);  
                    stream_ID.add(ID210);


                    RIGHT_PAREN211=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1989);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN211);


                    pushFollow(FOLLOW_in_clause_in_function1991);
                    in_clause212=in_clause();

                    state._fsp--;

                    stream_in_clause.add(in_clause212.getTree());

                    // AST REWRITE
                    // elements: ID, CALLQUERY, in_clause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:52: -> ^( CALLQUERY ID ^( IN_CLAUSE in_clause ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:55: ^( CALLQUERY ID ^( IN_CLAUSE in_clause ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CALLQUERY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:70: ^( IN_CLAUSE in_clause )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                        , root_2);

                        adaptor.addChild(root_2, stream_in_clause.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:6: PRINT ( LEFT_PAREN variable RIGHT_PAREN )
                    {
                    PRINT213=(Token)match(input,PRINT,FOLLOW_PRINT_in_function2012);  
                    stream_PRINT.add(PRINT213);


                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:12: ( LEFT_PAREN variable RIGHT_PAREN )
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:13: LEFT_PAREN variable RIGHT_PAREN
                    {
                    LEFT_PAREN214=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function2015);  
                    stream_LEFT_PAREN.add(LEFT_PAREN214);


                    pushFollow(FOLLOW_variable_in_function2017);
                    variable215=variable();

                    state._fsp--;

                    stream_variable.add(variable215.getTree());

                    RIGHT_PAREN216=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function2019);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN216);


                    }


                    // AST REWRITE
                    // elements: variable, PRINT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:46: -> ^( PRINT variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:49: ^( PRINT variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_PRINT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:194:6: MAPGET LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAPGET217=(Token)match(input,MAPGET,FOLLOW_MAPGET_in_function2037);  
                    stream_MAPGET.add(MAPGET217);


                    LEFT_PAREN218=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function2039);  
                    stream_LEFT_PAREN.add(LEFT_PAREN218);


                    pushFollow(FOLLOW_variable_in_function2041);
                    variable219=variable();

                    state._fsp--;

                    stream_variable.add(variable219.getTree());

                    COMMA220=(Token)match(input,COMMA,FOLLOW_COMMA_in_function2043);  
                    stream_COMMA.add(COMMA220);


                    pushFollow(FOLLOW_variable_in_function2045);
                    variable221=variable();

                    state._fsp--;

                    stream_variable.add(variable221.getTree());

                    RIGHT_PAREN222=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function2047);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN222);


                    // AST REWRITE
                    // elements: variable, MAPGET, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:60: -> ^( MAPGET variable variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:194:63: ^( MAPGET variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MAPGET.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:195:6: MAP LEFT_PAREN variable COMMA variable COMMA variable RIGHT_PAREN
                    {
                    MAP223=(Token)match(input,MAP,FOLLOW_MAP_in_function2064);  
                    stream_MAP.add(MAP223);


                    LEFT_PAREN224=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function2066);  
                    stream_LEFT_PAREN.add(LEFT_PAREN224);


                    pushFollow(FOLLOW_variable_in_function2068);
                    variable225=variable();

                    state._fsp--;

                    stream_variable.add(variable225.getTree());

                    COMMA226=(Token)match(input,COMMA,FOLLOW_COMMA_in_function2070);  
                    stream_COMMA.add(COMMA226);


                    pushFollow(FOLLOW_variable_in_function2072);
                    variable227=variable();

                    state._fsp--;

                    stream_variable.add(variable227.getTree());

                    COMMA228=(Token)match(input,COMMA,FOLLOW_COMMA_in_function2074);  
                    stream_COMMA.add(COMMA228);


                    pushFollow(FOLLOW_variable_in_function2076);
                    variable229=variable();

                    state._fsp--;

                    stream_variable.add(variable229.getTree());

                    RIGHT_PAREN230=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function2078);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN230);


                    // AST REWRITE
                    // elements: variable, variable, variable, MAP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:72: -> ^( MAP variable variable variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:195:75: ^( MAP variable variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MAP.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:198:1: block : ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON );
    public final QueryLanguageParser.block_return block() throws RecognitionException {
        QueryLanguageParser.block_return retval = new QueryLanguageParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET231=null;
        Token RIGHT_BRACKET233=null;
        QueryLanguageParser.block_statements_return block_statements232 =null;


        Object LEFT_BRACKET231_tree=null;
        Object RIGHT_BRACKET233_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:2: ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LEFT_BRACKET) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==ID) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==ID||LA21_3==LEFT_BRACKET||LA21_3==LEFT_SQ_BRACKET||LA21_3==LT||LA21_3==PERIOD||LA21_3==REPEATER||LA21_3==RIGHT_BRACKET||LA21_3==STAR) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA21_1==LEFT_BRACKET||LA21_1==LEFT_SQ_BRACKET||LA21_1==LT||LA21_1==REPEATER||LA21_1==RIGHT_BRACKET||LA21_1==STAR) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA21_0==ID||LA21_0==LEFT_SQ_BRACKET||LA21_0==LT||LA21_0==REPEATER||(LA21_0 >= RIGHT_BRACKET && LA21_0 <= RIGHT_PAREN)||LA21_0==STAR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:4: LEFT_BRACKET block_statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET231=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block2102);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET231);


                    pushFollow(FOLLOW_block_statements_in_block2104);
                    block_statements232=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements232.getTree());

                    RIGHT_BRACKET233=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block2106);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET233);


                    // AST REWRITE
                    // elements: block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:48: -> ^( BLOCK_STATEMENTS block_statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:51: ^( BLOCK_STATEMENTS block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:200:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class block_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_statements"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:1: block_statements : ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON );
    public final QueryLanguageParser.block_statements_return block_statements() throws RecognitionException {
        QueryLanguageParser.block_statements_return retval = new QueryLanguageParser.block_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR234=null;
        Token REPEATER236=null;
        QueryLanguageParser.block_statements_return block_statements235 =null;

        QueryLanguageParser.block_statements_return block_statements237 =null;

        QueryLanguageParser.node_chain_return node_chain238 =null;

        QueryLanguageParser.block_return block239 =null;

        QueryLanguageParser.block_statements_return block_statements240 =null;


        Object STAR234_tree=null;
        Object REPEATER236_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:204:2: ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON )
            int alt22=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt22=1;
                }
                break;
            case REPEATER:
                {
                alt22=2;
                }
                break;
            case ID:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt22=3;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:204:4: STAR block_statements
                    {
                    STAR234=(Token)match(input,STAR,FOLLOW_STAR_in_block_statements2133);  
                    stream_STAR.add(STAR234);


                    pushFollow(FOLLOW_block_statements_in_block_statements2135);
                    block_statements235=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements235.getTree());

                    // AST REWRITE
                    // elements: STAR, block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:29: -> ^( STAR block_statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:204:32: ^( STAR block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:205:4: REPEATER block_statements
                    {
                    REPEATER236=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_block_statements2151);  
                    stream_REPEATER.add(REPEATER236);


                    pushFollow(FOLLOW_block_statements_in_block_statements2153);
                    block_statements237=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements237.getTree());

                    // AST REWRITE
                    // elements: block_statements, REPEATER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:32: -> ^( REPEATER block_statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:205:35: ^( REPEATER block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPEATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:4: node_chain block block_statements
                    {
                    pushFollow(FOLLOW_node_chain_in_block_statements2168);
                    node_chain238=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain238.getTree());

                    pushFollow(FOLLOW_block_in_block_statements2170);
                    block239=block();

                    state._fsp--;

                    stream_block.add(block239.getTree());

                    pushFollow(FOLLOW_block_statements_in_block_statements2172);
                    block_statements240=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements240.getTree());

                    // AST REWRITE
                    // elements: block, node_chain, block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:38: -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:41: ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NESTED, "NESTED")
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:50: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:70: ^( BLOCK_STATEMENTS block_statements )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                        , root_2);

                        adaptor.addChild(root_2, stream_block_statements.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_statements"


    public static class print_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_stmt"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:210:1: print_stmt : ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON );
    public final QueryLanguageParser.print_stmt_return print_stmt() throws RecognitionException {
        QueryLanguageParser.print_stmt_return retval = new QueryLanguageParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT241=null;
        Token SEMICOLON243=null;
        QueryLanguageParser.variable_stmt_return variable_stmt242 =null;


        Object PRINT241_tree=null;
        Object SEMICOLON243_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:2: ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PRINT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==CALLQUERY||(LA23_1 >= COUNT && LA23_1 <= DEPTH)||LA23_1==ID||LA23_1==INTEGER||LA23_1==LEFT_BRACKET||LA23_1==LEFT_SQ_BRACKET||LA23_1==LT||(LA23_1 >= MAP && LA23_1 <= MIN)||LA23_1==NODETYPE||LA23_1==PRINT||LA23_1==RESERVED_TYPES||LA23_1==STRING) ) {
                    alt23=1;
                }
                else if ( (LA23_1==LEFT_PAREN) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA23_0==EOF||LA23_0==CALLQUERY||(LA23_0 >= COUNT && LA23_0 <= DEPTH)||LA23_0==EPSILON||(LA23_0 >= ID && LA23_0 <= IF)||LA23_0==INTEGER||LA23_0==LEFT_BRACKET||LA23_0==LEFT_SQ_BRACKET||LA23_0==LT||(LA23_0 >= MAP && LA23_0 <= MIN)||LA23_0==NODETYPE||(LA23_0 >= RESERVED_TYPES && LA23_0 <= RIGHT_BRACKET)||LA23_0==SELECT||LA23_0==SET||LA23_0==STRING||LA23_0==WHILE) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:4: PRINT variable_stmt SEMICOLON
                    {
                    PRINT241=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt2208);  
                    stream_PRINT.add(PRINT241);


                    pushFollow(FOLLOW_variable_stmt_in_print_stmt2210);
                    variable_stmt242=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt242.getTree());

                    SEMICOLON243=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_stmt2212);  
                    stream_SEMICOLON.add(SEMICOLON243);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:34: -> variable_stmt
                    {
                        adaptor.addChild(root_0, stream_variable_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_stmt"


    public static class stat_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat_statements"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:215:1: stat_statements : LEFT_BRACKET statements RIGHT_BRACKET -> statements ;
    public final QueryLanguageParser.stat_statements_return stat_statements() throws RecognitionException {
        QueryLanguageParser.stat_statements_return retval = new QueryLanguageParser.stat_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET244=null;
        Token RIGHT_BRACKET246=null;
        QueryLanguageParser.statements_return statements245 =null;


        Object LEFT_BRACKET244_tree=null;
        Object RIGHT_BRACKET246_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:216:2: ( LEFT_BRACKET statements RIGHT_BRACKET -> statements )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:216:4: LEFT_BRACKET statements RIGHT_BRACKET
            {
            LEFT_BRACKET244=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_stat_statements2234);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET244);


            pushFollow(FOLLOW_statements_in_stat_statements2236);
            statements245=statements();

            state._fsp--;

            stream_statements.add(statements245.getTree());

            RIGHT_BRACKET246=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_stat_statements2238);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET246);


            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:42: -> statements
            {
                adaptor.addChild(root_0, stream_statements.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat_statements"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:219:1: statements : ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | while_statement statements -> ^( STATEMENT while_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.statements_return statements() throws RecognitionException {
        QueryLanguageParser.statements_return retval = new QueryLanguageParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET255=null;
        Token WHERE257=null;
        Token SEMICOLON259=null;
        QueryLanguageParser.variable_assn_return variable_assn247 =null;

        QueryLanguageParser.statements_return statements248 =null;

        QueryLanguageParser.if_statement_return if_statement249 =null;

        QueryLanguageParser.statements_return statements250 =null;

        QueryLanguageParser.while_statement_return while_statement251 =null;

        QueryLanguageParser.statements_return statements252 =null;

        QueryLanguageParser.query_return query253 =null;

        QueryLanguageParser.statements_return statements254 =null;

        QueryLanguageParser.variable_assn_return variable_assn256 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp258 =null;


        Object SET255_tree=null;
        Object WHERE257_tree=null;
        Object SEMICOLON259_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_while_statement=new RewriteRuleSubtreeStream(adaptor,"rule while_statement");
        RewriteRuleSubtreeStream stream_variable_assn=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:2: ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | while_statement statements -> ^( STATEMENT while_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON )
            int alt24=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case COLON:
                    {
                    int LA24_9 = input.LA(3);

                    if ( (LA24_9==ATTRIBUTES||LA24_9==COLON||LA24_9==COMPOUND_ADD||LA24_9==EQUALS||LA24_9==INCREMENT||LA24_9==PERIOD||LA24_9==SEMICOLON) ) {
                        alt24=1;
                    }
                    else if ( (LA24_9==ID||LA24_9==SELECT) ) {
                        alt24=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case COMPOUND_ADD:
                case EQUALS:
                case INCREMENT:
                case PERIOD:
                case SEMICOLON:
                    {
                    alt24=1;
                    }
                    break;
                case FILTER:
                    {
                    alt24=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }

                }
                break;
            case CALLQUERY:
            case COUNT:
            case DEPTH:
            case INTEGER:
            case LEFT_SQ_BRACKET:
            case LT:
            case MAP:
            case MAPGET:
            case MAX:
            case METHODBINDING:
            case MIN:
            case NODETYPE:
            case PRINT:
            case RESERVED_TYPES:
            case STRING:
                {
                alt24=1;
                }
                break;
            case LEFT_BRACKET:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==ID) ) {
                    int LA24_10 = input.LA(3);

                    if ( (LA24_10==RIGHT_BRACKET) ) {
                        alt24=1;
                    }
                    else if ( (LA24_10==COLON||LA24_10==COMPOUND_ADD||LA24_10==EQUALS||LA24_10==FILTER||LA24_10==INCREMENT||LA24_10==PERIOD||LA24_10==SEMICOLON) ) {
                        alt24=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA24_3==CALLQUERY||(LA24_3 >= COUNT && LA24_3 <= DEPTH)||LA24_3==EPSILON||LA24_3==IF||LA24_3==INTEGER||LA24_3==LEFT_BRACKET||LA24_3==LEFT_SQ_BRACKET||LA24_3==LT||(LA24_3 >= MAP && LA24_3 <= MIN)||LA24_3==NODETYPE||LA24_3==PRINT||(LA24_3 >= RESERVED_TYPES && LA24_3 <= RIGHT_BRACKET)||LA24_3==SELECT||LA24_3==SET||LA24_3==STRING||LA24_3==WHILE) ) {
                    alt24=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt24=2;
                }
                break;
            case WHILE:
                {
                alt24=3;
                }
                break;
            case EPSILON:
            case SELECT:
                {
                alt24=4;
                }
                break;
            case SET:
                {
                alt24=5;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:4: variable_assn statements
                    {
                    pushFollow(FOLLOW_variable_assn_in_statements2254);
                    variable_assn247=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn247.getTree());

                    pushFollow(FOLLOW_statements_in_statements2256);
                    statements248=statements();

                    state._fsp--;

                    stream_statements.add(statements248.getTree());

                    // AST REWRITE
                    // elements: statements, variable_assn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:29: -> ^( STATEMENT variable_assn statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:32: ^( STATEMENT variable_assn statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_assn.nextTree());

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:221:4: if_statement statements
                    {
                    pushFollow(FOLLOW_if_statement_in_statements2271);
                    if_statement249=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement249.getTree());

                    pushFollow(FOLLOW_statements_in_statements2273);
                    statements250=statements();

                    state._fsp--;

                    stream_statements.add(statements250.getTree());

                    // AST REWRITE
                    // elements: if_statement, statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:29: -> ^( STATEMENT if_statement statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:221:32: ^( STATEMENT if_statement statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_if_statement.nextTree());

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:4: while_statement statements
                    {
                    pushFollow(FOLLOW_while_statement_in_statements2289);
                    while_statement251=while_statement();

                    state._fsp--;

                    stream_while_statement.add(while_statement251.getTree());

                    pushFollow(FOLLOW_statements_in_statements2291);
                    statements252=statements();

                    state._fsp--;

                    stream_statements.add(statements252.getTree());

                    // AST REWRITE
                    // elements: statements, while_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:32: -> ^( STATEMENT while_statement statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:35: ^( STATEMENT while_statement statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_while_statement.nextTree());

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:4: query statements
                    {
                    pushFollow(FOLLOW_query_in_statements2307);
                    query253=query();

                    state._fsp--;

                    stream_query.add(query253.getTree());

                    pushFollow(FOLLOW_statements_in_statements2309);
                    statements254=statements();

                    state._fsp--;

                    stream_statements.add(statements254.getTree());

                    // AST REWRITE
                    // elements: statements, query
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:22: -> ^( QUERY query ) statements
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:25: ^( QUERY query )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        adaptor.addChild(root_1, stream_query.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:224:4: SET variable_assn WHERE boolean_exp SEMICOLON
                    {
                    SET255=(Token)match(input,SET,FOLLOW_SET_in_statements2325);  
                    stream_SET.add(SET255);


                    pushFollow(FOLLOW_variable_assn_in_statements2327);
                    variable_assn256=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn256.getTree());

                    WHERE257=(Token)match(input,WHERE,FOLLOW_WHERE_in_statements2329);  
                    stream_WHERE.add(WHERE257);


                    pushFollow(FOLLOW_boolean_exp_in_statements2331);
                    boolean_exp258=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp258.getTree());

                    SEMICOLON259=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements2333);  
                    stream_SEMICOLON.add(SEMICOLON259);


                    // AST REWRITE
                    // elements: boolean_exp, variable_assn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:50: -> ^( SET_TABLE variable_assn boolean_exp )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:224:53: ^( SET_TABLE variable_assn boolean_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SET_TABLE, "SET_TABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_assn.nextTree());

                        adaptor.addChild(root_1, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:225:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class variable_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_stmt"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:229:1: variable_stmt : variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) ;
    public final QueryLanguageParser.variable_stmt_return variable_stmt() throws RecognitionException {
        QueryLanguageParser.variable_stmt_return retval = new QueryLanguageParser.variable_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable260 =null;

        QueryLanguageParser.binary_op_return binary_op261 =null;


        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:2: ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:4: variable binary_op
            {
            pushFollow(FOLLOW_variable_in_variable_stmt2363);
            variable260=variable();

            state._fsp--;

            stream_variable.add(variable260.getTree());

            pushFollow(FOLLOW_binary_op_in_variable_stmt2365);
            binary_op261=binary_op();

            state._fsp--;

            stream_binary_op.add(binary_op261.getTree());

            // AST REWRITE
            // elements: variable, binary_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:25: -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:28: ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_STMT, "VAR_STMT")
                , root_1);

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:39: ^( VAR variable )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_2);

                adaptor.addChild(root_2, stream_variable.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:55: ^( BIN_OP binary_op )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BIN_OP, "BIN_OP")
                , root_2);

                adaptor.addChild(root_2, stream_binary_op.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_stmt"


    public static class variable_assn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_assn"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:233:1: variable_assn : variable variable_assn_right -> ^( VAR variable ) variable_assn_right ;
    public final QueryLanguageParser.variable_assn_return variable_assn() throws RecognitionException {
        QueryLanguageParser.variable_assn_return retval = new QueryLanguageParser.variable_assn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable262 =null;

        QueryLanguageParser.variable_assn_right_return variable_assn_right263 =null;


        RewriteRuleSubtreeStream stream_variable_assn_right=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:234:2: ( variable variable_assn_right -> ^( VAR variable ) variable_assn_right )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:234:4: variable variable_assn_right
            {
            pushFollow(FOLLOW_variable_in_variable_assn2397);
            variable262=variable();

            state._fsp--;

            stream_variable.add(variable262.getTree());

            pushFollow(FOLLOW_variable_assn_right_in_variable_assn2399);
            variable_assn_right263=variable_assn_right();

            state._fsp--;

            stream_variable_assn_right.add(variable_assn_right263.getTree());

            // AST REWRITE
            // elements: variable_assn_right, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:33: -> ^( VAR variable ) variable_assn_right
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:234:36: ^( VAR variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_variable_assn_right.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_assn"


    public static class variable_assn_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_assn_right"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:236:1: variable_assn_right : ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR | SEMICOLON -> EPSILON );
    public final QueryLanguageParser.variable_assn_right_return variable_assn_right() throws RecognitionException {
        QueryLanguageParser.variable_assn_right_return retval = new QueryLanguageParser.variable_assn_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS264=null;
        Token SEMICOLON266=null;
        Token COMPOUND_ADD267=null;
        Token SEMICOLON269=null;
        Token INCREMENT270=null;
        Token SEMICOLON271=null;
        Token SEMICOLON272=null;
        QueryLanguageParser.variable_stmt_return variable_stmt265 =null;

        QueryLanguageParser.variable_stmt_return variable_stmt268 =null;


        Object EQUALS264_tree=null;
        Object SEMICOLON266_tree=null;
        Object COMPOUND_ADD267_tree=null;
        Object SEMICOLON269_tree=null;
        Object INCREMENT270_tree=null;
        Object SEMICOLON271_tree=null;
        Object SEMICOLON272_tree=null;
        RewriteRuleTokenStream stream_INCREMENT=new RewriteRuleTokenStream(adaptor,"token INCREMENT");
        RewriteRuleTokenStream stream_COMPOUND_ADD=new RewriteRuleTokenStream(adaptor,"token COMPOUND_ADD");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:2: ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR | SEMICOLON -> EPSILON )
            int alt25=4;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt25=1;
                }
                break;
            case COMPOUND_ADD:
                {
                alt25=2;
                }
                break;
            case INCREMENT:
                {
                alt25=3;
                }
                break;
            case SEMICOLON:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:4: EQUALS variable_stmt SEMICOLON
                    {
                    EQUALS264=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_variable_assn_right2419);  
                    stream_EQUALS.add(EQUALS264);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right2421);
                    variable_stmt265=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt265.getTree());

                    SEMICOLON266=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2423);  
                    stream_SEMICOLON.add(SEMICOLON266);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:36: -> ^( VAR_ASSIGN variable_stmt )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:39: ^( VAR_ASSIGN variable_stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_ASSIGN, "VAR_ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:238:4: COMPOUND_ADD variable_stmt SEMICOLON
                    {
                    COMPOUND_ADD267=(Token)match(input,COMPOUND_ADD,FOLLOW_COMPOUND_ADD_in_variable_assn_right2437);  
                    stream_COMPOUND_ADD.add(COMPOUND_ADD267);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right2439);
                    variable_stmt268=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt268.getTree());

                    SEMICOLON269=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2441);  
                    stream_SEMICOLON.add(SEMICOLON269);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:41: -> ^( COMP_ADD variable_stmt )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:238:44: ^( COMP_ADD variable_stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMP_ADD, "COMP_ADD")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:239:4: INCREMENT SEMICOLON
                    {
                    INCREMENT270=(Token)match(input,INCREMENT,FOLLOW_INCREMENT_in_variable_assn_right2454);  
                    stream_INCREMENT.add(INCREMENT270);


                    SEMICOLON271=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2456);  
                    stream_SEMICOLON.add(SEMICOLON271);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:26: -> INCR
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCR, "INCR")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:240:4: SEMICOLON
                    {
                    SEMICOLON272=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2467);  
                    stream_SEMICOLON.add(SEMICOLON272);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:14: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_assn_right"


    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:242:1: if_statement : IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET else_block -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) else_block ) ;
    public final QueryLanguageParser.if_statement_return if_statement() throws RecognitionException {
        QueryLanguageParser.if_statement_return retval = new QueryLanguageParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF273=null;
        Token LEFT_PAREN274=null;
        Token RIGHT_PAREN276=null;
        Token LEFT_BRACKET277=null;
        Token RIGHT_BRACKET279=null;
        QueryLanguageParser.boolean_exp_return boolean_exp275 =null;

        QueryLanguageParser.statements_return statements278 =null;

        QueryLanguageParser.else_block_return else_block280 =null;


        Object IF273_tree=null;
        Object LEFT_PAREN274_tree=null;
        Object RIGHT_PAREN276_tree=null;
        Object LEFT_BRACKET277_tree=null;
        Object RIGHT_BRACKET279_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_else_block=new RewriteRuleSubtreeStream(adaptor,"rule else_block");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:2: ( IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET else_block -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) else_block ) )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:4: IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET else_block
            {
            IF273=(Token)match(input,IF,FOLLOW_IF_in_if_statement2481);  
            stream_IF.add(IF273);


            LEFT_PAREN274=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_if_statement2483);  
            stream_LEFT_PAREN.add(LEFT_PAREN274);


            pushFollow(FOLLOW_boolean_exp_in_if_statement2485);
            boolean_exp275=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp275.getTree());

            RIGHT_PAREN276=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_if_statement2487);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN276);


            LEFT_BRACKET277=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_if_statement2489);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET277);


            pushFollow(FOLLOW_statements_in_if_statement2491);
            statements278=statements();

            state._fsp--;

            stream_statements.add(statements278.getTree());

            RIGHT_BRACKET279=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_if_statement2493);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET279);


            pushFollow(FOLLOW_else_block_in_if_statement2495);
            else_block280=else_block();

            state._fsp--;

            stream_else_block.add(else_block280.getTree());

            // AST REWRITE
            // elements: statements, else_block, boolean_exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:91: -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) else_block )
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:94: ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) else_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT")
                , root_1);

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:109: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:133: ^( STATEMENTS statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_2);

                adaptor.addChild(root_2, stream_statements.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_else_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class else_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_block"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:246:1: else_block : ( ELSE LEFT_BRACKET statements RIGHT_BRACKET -> ^( STATEMENTS statements ) | -> EPSILON );
    public final QueryLanguageParser.else_block_return else_block() throws RecognitionException {
        QueryLanguageParser.else_block_return retval = new QueryLanguageParser.else_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE281=null;
        Token LEFT_BRACKET282=null;
        Token RIGHT_BRACKET284=null;
        QueryLanguageParser.statements_return statements283 =null;


        Object ELSE281_tree=null;
        Object LEFT_BRACKET282_tree=null;
        Object RIGHT_BRACKET284_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:247:2: ( ELSE LEFT_BRACKET statements RIGHT_BRACKET -> ^( STATEMENTS statements ) | -> EPSILON )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ELSE) ) {
                alt26=1;
            }
            else if ( (LA26_0==CALLQUERY||(LA26_0 >= COUNT && LA26_0 <= DEPTH)||LA26_0==EPSILON||(LA26_0 >= ID && LA26_0 <= IF)||LA26_0==INTEGER||LA26_0==LEFT_BRACKET||LA26_0==LEFT_SQ_BRACKET||LA26_0==LT||(LA26_0 >= MAP && LA26_0 <= MIN)||LA26_0==NODETYPE||LA26_0==PRINT||(LA26_0 >= RESERVED_TYPES && LA26_0 <= RIGHT_BRACKET)||LA26_0==SELECT||LA26_0==SET||LA26_0==STRING||LA26_0==WHILE) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:247:4: ELSE LEFT_BRACKET statements RIGHT_BRACKET
                    {
                    ELSE281=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_block2527);  
                    stream_ELSE.add(ELSE281);


                    LEFT_BRACKET282=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_else_block2529);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET282);


                    pushFollow(FOLLOW_statements_in_else_block2531);
                    statements283=statements();

                    state._fsp--;

                    stream_statements.add(statements283.getTree());

                    RIGHT_BRACKET284=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_else_block2533);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET284);


                    // AST REWRITE
                    // elements: statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:47: -> ^( STATEMENTS statements )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:247:50: ^( STATEMENTS statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_1);

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:10: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:10: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_block"


    public static class while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_statement"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:251:1: while_statement : WHILE LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( WHILE_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) ;
    public final QueryLanguageParser.while_statement_return while_statement() throws RecognitionException {
        QueryLanguageParser.while_statement_return retval = new QueryLanguageParser.while_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE285=null;
        Token LEFT_PAREN286=null;
        Token RIGHT_PAREN288=null;
        Token LEFT_BRACKET289=null;
        Token RIGHT_BRACKET291=null;
        QueryLanguageParser.boolean_exp_return boolean_exp287 =null;

        QueryLanguageParser.statements_return statements290 =null;


        Object WHILE285_tree=null;
        Object LEFT_PAREN286_tree=null;
        Object RIGHT_PAREN288_tree=null;
        Object LEFT_BRACKET289_tree=null;
        Object RIGHT_BRACKET291_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:252:2: ( WHILE LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( WHILE_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:252:4: WHILE LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET
            {
            WHILE285=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement2565);  
            stream_WHILE.add(WHILE285);


            LEFT_PAREN286=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_while_statement2567);  
            stream_LEFT_PAREN.add(LEFT_PAREN286);


            pushFollow(FOLLOW_boolean_exp_in_while_statement2569);
            boolean_exp287=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp287.getTree());

            RIGHT_PAREN288=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_while_statement2571);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN288);


            LEFT_BRACKET289=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_while_statement2573);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET289);


            pushFollow(FOLLOW_statements_in_while_statement2575);
            statements290=statements();

            state._fsp--;

            stream_statements.add(statements290.getTree());

            RIGHT_BRACKET291=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_while_statement2577);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET291);


            // AST REWRITE
            // elements: boolean_exp, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:83: -> ^( WHILE_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:252:86: ^( WHILE_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHILE_STATEMENT, "WHILE_STATEMENT")
                , root_1);

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:252:104: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:252:128: ^( STATEMENTS statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_2);

                adaptor.addChild(root_2, stream_statements.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_statement"


    public static class boolean_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_stmt"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:255:1: boolean_stmt : variable boolean_right -> ^( VAR variable ) boolean_right ;
    public final QueryLanguageParser.boolean_stmt_return boolean_stmt() throws RecognitionException {
        QueryLanguageParser.boolean_stmt_return retval = new QueryLanguageParser.boolean_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable292 =null;

        QueryLanguageParser.boolean_right_return boolean_right293 =null;


        RewriteRuleSubtreeStream stream_boolean_right=new RewriteRuleSubtreeStream(adaptor,"rule boolean_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:256:2: ( variable boolean_right -> ^( VAR variable ) boolean_right )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:256:4: variable boolean_right
            {
            pushFollow(FOLLOW_variable_in_boolean_stmt2606);
            variable292=variable();

            state._fsp--;

            stream_variable.add(variable292.getTree());

            pushFollow(FOLLOW_boolean_right_in_boolean_stmt2608);
            boolean_right293=boolean_right();

            state._fsp--;

            stream_boolean_right.add(boolean_right293.getTree());

            // AST REWRITE
            // elements: variable, boolean_right
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 256:27: -> ^( VAR variable ) boolean_right
            {
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:256:30: ^( VAR variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_boolean_right.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_stmt"


    public static class boolean_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_right"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:259:1: boolean_right : ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON );
    public final QueryLanguageParser.boolean_right_return boolean_right() throws RecognitionException {
        QueryLanguageParser.boolean_right_return retval = new QueryLanguageParser.boolean_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.boolean_op_return boolean_op294 =null;

        QueryLanguageParser.variable_return variable295 =null;


        RewriteRuleSubtreeStream stream_boolean_op=new RewriteRuleSubtreeStream(adaptor,"rule boolean_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:260:2: ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0 >= GT && LA27_0 <= GTE)||LA27_0==LOGIC_EQUALS||(LA27_0 >= LT && LA27_0 <= LTE)||LA27_0==NOT_EQUAL) ) {
                alt27=1;
            }
            else if ( (LA27_0==AND||LA27_0==LEFT_BRACKET||LA27_0==OR||LA27_0==RIGHT_PAREN||LA27_0==SEMICOLON) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:260:4: boolean_op variable
                    {
                    pushFollow(FOLLOW_boolean_op_in_boolean_right2629);
                    boolean_op294=boolean_op();

                    state._fsp--;

                    stream_boolean_op.add(boolean_op294.getTree());

                    pushFollow(FOLLOW_variable_in_boolean_right2631);
                    variable295=variable();

                    state._fsp--;

                    stream_variable.add(variable295.getTree());

                    // AST REWRITE
                    // elements: boolean_op, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:24: -> ^( boolean_op variable )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:260:27: ^( boolean_op variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_boolean_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:261:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_right"


    public static class boolean_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_exp"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:264:1: boolean_exp : ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) );
    public final QueryLanguageParser.boolean_exp_return boolean_exp() throws RecognitionException {
        QueryLanguageParser.boolean_exp_return retval = new QueryLanguageParser.boolean_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT298=null;
        QueryLanguageParser.boolean_stmt_return boolean_stmt296 =null;

        QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont297 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp299 =null;


        Object NOT298_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_boolean_stmt=new RewriteRuleSubtreeStream(adaptor,"rule boolean_stmt");
        RewriteRuleSubtreeStream stream_boolean_exp_cont=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp_cont");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:2: ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CALLQUERY||(LA28_0 >= COUNT && LA28_0 <= DEPTH)||LA28_0==ID||LA28_0==INTEGER||LA28_0==LEFT_BRACKET||LA28_0==LEFT_SQ_BRACKET||LA28_0==LT||(LA28_0 >= MAP && LA28_0 <= MIN)||LA28_0==NODETYPE||LA28_0==PRINT||LA28_0==RESERVED_TYPES||LA28_0==STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==NOT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:4: boolean_stmt boolean_exp_cont
                    {
                    pushFollow(FOLLOW_boolean_stmt_in_boolean_exp2658);
                    boolean_stmt296=boolean_stmt();

                    state._fsp--;

                    stream_boolean_stmt.add(boolean_stmt296.getTree());

                    pushFollow(FOLLOW_boolean_exp_cont_in_boolean_exp2660);
                    boolean_exp_cont297=boolean_exp_cont();

                    state._fsp--;

                    stream_boolean_exp_cont.add(boolean_exp_cont297.getTree());

                    // AST REWRITE
                    // elements: boolean_stmt, boolean_exp_cont
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:34: -> boolean_stmt ^( BOOL_EXP boolean_exp_cont )
                    {
                        adaptor.addChild(root_0, stream_boolean_stmt.nextTree());

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:50: ^( BOOL_EXP boolean_exp_cont )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolean_exp_cont.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:266:4: NOT boolean_exp
                    {
                    NOT298=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_exp2675);  
                    stream_NOT.add(NOT298);


                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp2677);
                    boolean_exp299=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp299.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:22: -> ^( NOT ^( BOOL_EXP boolean_exp ) )
                    {
                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:266:25: ^( NOT ^( BOOL_EXP boolean_exp ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:266:31: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_exp"


    public static class boolean_exp_cont_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_exp_cont"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:269:1: boolean_exp_cont : ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont() throws RecognitionException {
        QueryLanguageParser.boolean_exp_cont_return retval = new QueryLanguageParser.boolean_exp_cont_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.logical_op_return logical_op300 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp301 =null;


        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:270:2: ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==AND||LA29_0==OR) ) {
                alt29=1;
            }
            else if ( (LA29_0==LEFT_BRACKET||LA29_0==RIGHT_PAREN||LA29_0==SEMICOLON) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:270:4: logical_op boolean_exp
                    {
                    pushFollow(FOLLOW_logical_op_in_boolean_exp_cont2702);
                    logical_op300=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op300.getTree());

                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp_cont2704);
                    boolean_exp301=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp301.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, logical_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 270:28: -> logical_op ^( BOOL_EXP boolean_exp )
                    {
                        adaptor.addChild(root_0, stream_logical_op.nextTree());

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:270:42: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:271:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_exp_cont"


    public static class binary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_op"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:274:1: binary_op : ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | STAR variable -> STAR ^( VAR variable ) | AND variable -> AND ^( VAR variable ) | OR variable -> OR ^( VAR variable ) | -> EPSILON );
    public final QueryLanguageParser.binary_op_return binary_op() throws RecognitionException {
        QueryLanguageParser.binary_op_return retval = new QueryLanguageParser.binary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS302=null;
        Token MINUS304=null;
        Token DIVIDE306=null;
        Token STAR308=null;
        Token AND310=null;
        Token OR312=null;
        QueryLanguageParser.variable_return variable303 =null;

        QueryLanguageParser.variable_return variable305 =null;

        QueryLanguageParser.variable_return variable307 =null;

        QueryLanguageParser.variable_return variable309 =null;

        QueryLanguageParser.variable_return variable311 =null;

        QueryLanguageParser.variable_return variable313 =null;


        Object PLUS302_tree=null;
        Object MINUS304_tree=null;
        Object DIVIDE306_tree=null;
        Object STAR308_tree=null;
        Object AND310_tree=null;
        Object OR312_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:275:2: ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | STAR variable -> STAR ^( VAR variable ) | AND variable -> AND ^( VAR variable ) | OR variable -> OR ^( VAR variable ) | -> EPSILON )
            int alt30=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt30=1;
                }
                break;
            case MINUS:
                {
                alt30=2;
                }
                break;
            case DIVIDE:
                {
                alt30=3;
                }
                break;
            case STAR:
                {
                alt30=4;
                }
                break;
            case AND:
                {
                alt30=5;
                }
                break;
            case OR:
                {
                alt30=6;
                }
                break;
            case SEMICOLON:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:275:4: PLUS variable
                    {
                    PLUS302=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_op2733);  
                    stream_PLUS.add(PLUS302);


                    pushFollow(FOLLOW_variable_in_binary_op2735);
                    variable303=variable();

                    state._fsp--;

                    stream_variable.add(variable303.getTree());

                    // AST REWRITE
                    // elements: PLUS, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 275:20: -> PLUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_PLUS.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:275:28: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:276:4: MINUS variable
                    {
                    MINUS304=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_op2752);  
                    stream_MINUS.add(MINUS304);


                    pushFollow(FOLLOW_variable_in_binary_op2754);
                    variable305=variable();

                    state._fsp--;

                    stream_variable.add(variable305.getTree());

                    // AST REWRITE
                    // elements: variable, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 276:21: -> MINUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_MINUS.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:276:30: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:277:4: DIVIDE variable
                    {
                    DIVIDE306=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_binary_op2771);  
                    stream_DIVIDE.add(DIVIDE306);


                    pushFollow(FOLLOW_variable_in_binary_op2773);
                    variable307=variable();

                    state._fsp--;

                    stream_variable.add(variable307.getTree());

                    // AST REWRITE
                    // elements: variable, DIVIDE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 277:22: -> DIVIDE ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_DIVIDE.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:277:32: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:278:10: STAR variable
                    {
                    STAR308=(Token)match(input,STAR,FOLLOW_STAR_in_binary_op2796);  
                    stream_STAR.add(STAR308);


                    pushFollow(FOLLOW_variable_in_binary_op2798);
                    variable309=variable();

                    state._fsp--;

                    stream_variable.add(variable309.getTree());

                    // AST REWRITE
                    // elements: STAR, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:26: -> STAR ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_STAR.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:278:34: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:4: AND variable
                    {
                    AND310=(Token)match(input,AND,FOLLOW_AND_in_binary_op2815);  
                    stream_AND.add(AND310);


                    pushFollow(FOLLOW_variable_in_binary_op2817);
                    variable311=variable();

                    state._fsp--;

                    stream_variable.add(variable311.getTree());

                    // AST REWRITE
                    // elements: AND, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:19: -> AND ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:26: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:280:4: OR variable
                    {
                    OR312=(Token)match(input,OR,FOLLOW_OR_in_binary_op2834);  
                    stream_OR.add(OR312);


                    pushFollow(FOLLOW_variable_in_binary_op2836);
                    variable313=variable();

                    state._fsp--;

                    stream_variable.add(variable313.getTree());

                    // AST REWRITE
                    // elements: variable, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 280:18: -> OR ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_OR.nextNode()
                        );

                        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:280:24: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:281:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary_op"


    public static class boolean_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_op"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:283:1: boolean_op : ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS );
    public final QueryLanguageParser.boolean_op_return boolean_op() throws RecognitionException {
        QueryLanguageParser.boolean_op_return retval = new QueryLanguageParser.boolean_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT314=null;
        Token GTE315=null;
        Token LT316=null;
        Token LTE317=null;
        Token NOT_EQUAL318=null;
        Token LOGIC_EQUALS319=null;

        Object GT314_tree=null;
        Object GTE315_tree=null;
        Object LT316_tree=null;
        Object LTE317_tree=null;
        Object NOT_EQUAL318_tree=null;
        Object LOGIC_EQUALS319_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_LOGIC_EQUALS=new RewriteRuleTokenStream(adaptor,"token LOGIC_EQUALS");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:284:2: ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS )
            int alt31=6;
            switch ( input.LA(1) ) {
            case GT:
                {
                alt31=1;
                }
                break;
            case GTE:
                {
                alt31=2;
                }
                break;
            case LT:
                {
                alt31=3;
                }
                break;
            case LTE:
                {
                alt31=4;
                }
                break;
            case NOT_EQUAL:
                {
                alt31=5;
                }
                break;
            case LOGIC_EQUALS:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:284:4: GT
                    {
                    GT314=(Token)match(input,GT,FOLLOW_GT_in_boolean_op2865);  
                    stream_GT.add(GT314);


                    // AST REWRITE
                    // elements: GT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:8: -> GT
                    {
                        adaptor.addChild(root_0, 
                        stream_GT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:285:4: GTE
                    {
                    GTE315=(Token)match(input,GTE,FOLLOW_GTE_in_boolean_op2875);  
                    stream_GTE.add(GTE315);


                    // AST REWRITE
                    // elements: GTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:9: -> GTE
                    {
                        adaptor.addChild(root_0, 
                        stream_GTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:286:4: LT
                    {
                    LT316=(Token)match(input,LT,FOLLOW_LT_in_boolean_op2885);  
                    stream_LT.add(LT316);


                    // AST REWRITE
                    // elements: LT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:8: -> LT
                    {
                        adaptor.addChild(root_0, 
                        stream_LT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:287:4: LTE
                    {
                    LTE317=(Token)match(input,LTE,FOLLOW_LTE_in_boolean_op2895);  
                    stream_LTE.add(LTE317);


                    // AST REWRITE
                    // elements: LTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:9: -> LTE
                    {
                        adaptor.addChild(root_0, 
                        stream_LTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:288:4: NOT_EQUAL
                    {
                    NOT_EQUAL318=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolean_op2905);  
                    stream_NOT_EQUAL.add(NOT_EQUAL318);


                    // AST REWRITE
                    // elements: NOT_EQUAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:14: -> NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        stream_NOT_EQUAL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:289:4: LOGIC_EQUALS
                    {
                    LOGIC_EQUALS319=(Token)match(input,LOGIC_EQUALS,FOLLOW_LOGIC_EQUALS_in_boolean_op2914);  
                    stream_LOGIC_EQUALS.add(LOGIC_EQUALS319);


                    // AST REWRITE
                    // elements: LOGIC_EQUALS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:17: -> LOGIC_EQUALS
                    {
                        adaptor.addChild(root_0, 
                        stream_LOGIC_EQUALS.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_op"


    public static class logical_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_op"
    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:291:1: logical_op : ( AND -> AND | OR -> OR );
    public final QueryLanguageParser.logical_op_return logical_op() throws RecognitionException {
        QueryLanguageParser.logical_op_return retval = new QueryLanguageParser.logical_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND320=null;
        Token OR321=null;

        Object AND320_tree=null;
        Object OR321_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");

        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:2: ( AND -> AND | OR -> OR )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==AND) ) {
                alt32=1;
            }
            else if ( (LA32_0==OR) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:4: AND
                    {
                    AND320=(Token)match(input,AND,FOLLOW_AND_in_logical_op2928);  
                    stream_AND.add(AND320);


                    // AST REWRITE
                    // elements: AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 292:9: -> AND
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:293:4: OR
                    {
                    OR321=(Token)match(input,OR,FOLLOW_OR_in_logical_op2938);  
                    stream_OR.add(OR321);


                    // AST REWRITE
                    // elements: OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 293:8: -> OR
                    {
                        adaptor.addChild(root_0, 
                        stream_OR.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_op"

    // Delegated rules


 

    public static final BitSet FOLLOW_queries_in_startrule332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockquery_in_queries350 = new BitSet(new long[]{0x0010010004000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_query_in_blockquery369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query380 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_query_in_query382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_print_stmt_in_query384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query415 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_query417 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FILTER_in_query419 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_query421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_print_stmt_in_query423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_statements_in_query458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPSILON_in_query477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_name489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_query_name491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_query513 = new BitSet(new long[]{0x0020400000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_limitation_clause_in_select_query515 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_select_query517 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_select_query519 = new BitSet(new long[]{0x0010010000000000L,0x0000001012000000L});
    public static final BitSet FOLLOW_ID_in_select_query521 = new BitSet(new long[]{0x0010000000000000L,0x0000001012000000L});
    public static final BitSet FOLLOW_node_chain_op_in_select_query524 = new BitSet(new long[]{0x0010000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_select_query526 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_select_query528 = new BitSet(new long[]{0x0010080000200000L,0x0004400000000000L});
    public static final BitSet FOLLOW_with_clause_in_select_query530 = new BitSet(new long[]{0x0010080000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_in_clause_in_select_query532 = new BitSet(new long[]{0x0010000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_select_where_in_select_query534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_where590 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_select_where592 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_stat_statements_in_select_where594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_statements_in_select_where617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directly_in_in_clause640 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IN_in_in_clause642 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_in_clause644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitation_in_limitation_clause669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIRECTLY_in_directly703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause722 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_with_clause724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_with_clause726 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_with_clause728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_node_chain_op764 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op766 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_node_chain_op789 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op791 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain831 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain856 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_node_chain858 = new BitSet(new long[]{0x0000000000004100L,0x0000000000040000L});
    public static final BitSet FOLLOW_attr_in_node_chain860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_keywords_in_node_chain912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_keywords_in_node_chain973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain1001 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain1039 = new BitSet(new long[]{0x2050010000000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_node_chain1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_node1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_NODE_TYPE_in_node1091 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_GT_in_node1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQ_BRACKET_in_node1103 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_node1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RIGHT_SQ_BRACKET_in_node1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_ast_child1127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_ast_child1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_ast_child1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1147 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CONTAINS_in_keywords1149 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1151 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1170 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_keywords1172 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1174 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1191 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_keywords1193 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1195 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1212 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IS_in_keywords1214 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1216 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1235 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HAS_in_keywords1237 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1239 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1257 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LINENUMBER_in_keywords1259 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_keyword_nodes1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_keyword_nodes1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_keyword_nodes1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_keyword_nodes1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_attr1341 = new BitSet(new long[]{0x0000000000004100L,0x0000000000040000L});
    public static final BitSet FOLLOW_attr_in_attr1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CONTAINS_in_attr1364 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1366 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1384 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_attr1386 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1388 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1406 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_attr1408 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1410 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1428 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_IS_in_attr1430 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1432 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1451 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HAS_in_attr1453 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1455 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1473 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LINENUMBER_in_attr1475 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_attr1491 = new BitSet(new long[]{0x0000000000004100L,0x0000000000040000L});
    public static final BitSet FOLLOW_attr_in_attr1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CONTAINS_in_property1552 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1554 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1579 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_property1581 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1583 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1608 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_property1610 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1612 = new BitSet(new long[]{0x2050010000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1614 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1637 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LINENUMBER_in_property1639 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NEXTNODE_in_property1666 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_property1691 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FIRSTCHILD_in_property1693 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable1722 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COLON_in_variable1724 = new BitSet(new long[]{0x0000000000004100L,0x0000000000040000L});
    public static final BitSet FOLLOW_attr_in_variable1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_variable1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_variable1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_variable1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_variable1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESERVED_TYPES_in_variable1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_variable1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_function1868 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1870 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_function1874 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_function1893 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1895 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1897 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_function1899 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1901 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEPTH_in_function1924 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1926 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODETYPE_in_function1943 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1945 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHODBINDING_in_function1962 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1964 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLQUERY_in_function1983 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1985 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_function1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1989 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_in_clause_in_function1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_function2012 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function2015 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAPGET_in_function2037 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function2039 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2041 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_function2043 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAP_in_function2064 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function2066 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2068 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_function2070 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2072 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_function2074 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_function2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block2102 = new BitSet(new long[]{0x2050010000000000L,0x000000100A000000L});
    public static final BitSet FOLLOW_block_statements_in_block2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_block_statements2133 = new BitSet(new long[]{0x2050010000000000L,0x0000001002000000L});
    public static final BitSet FOLLOW_block_statements_in_block_statements2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_block_statements2151 = new BitSet(new long[]{0x2050010000000000L,0x0000001002000000L});
    public static final BitSet FOLLOW_block_statements_in_block_statements2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_block_statements2168 = new BitSet(new long[]{0x2050010000000000L,0x0000001002000000L});
    public static final BitSet FOLLOW_block_in_block_statements2170 = new BitSet(new long[]{0x2050010000000000L,0x0000001002000000L});
    public static final BitSet FOLLOW_block_statements_in_block_statements2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt2208 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_stmt_in_print_stmt2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_stmt2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_stat_statements2234 = new BitSet(new long[]{0xA050830004181000L,0x000100824C10010FL});
    public static final BitSet FOLLOW_statements_in_stat_statements2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_stat_statements2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assn_in_statements2254 = new BitSet(new long[]{0xA050830004181000L,0x000100824410010FL});
    public static final BitSet FOLLOW_statements_in_statements2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statements2271 = new BitSet(new long[]{0xA050830004181000L,0x000100824410010FL});
    public static final BitSet FOLLOW_statements_in_statements2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statements2289 = new BitSet(new long[]{0xA050830004181000L,0x000100824410010FL});
    public static final BitSet FOLLOW_statements_in_statements2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statements2307 = new BitSet(new long[]{0xA050830004181000L,0x000100824410010FL});
    public static final BitSet FOLLOW_statements_in_statements2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_statements2325 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_assn_in_statements2327 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHERE_in_statements2329 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_statements2331 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_stmt2363 = new BitSet(new long[]{0x0000000000400010L,0x0000001000090010L});
    public static final BitSet FOLLOW_binary_op_in_variable_stmt2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_assn2397 = new BitSet(new long[]{0x0000200008010000L,0x0000000100000000L});
    public static final BitSet FOLLOW_variable_assn_right_in_variable_assn2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_variable_assn_right2419 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_ADD_in_variable_assn_right2437 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCREMENT_in_variable_assn_right2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2481 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_if_statement2483 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_if_statement2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_if_statement2487 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_if_statement2489 = new BitSet(new long[]{0xA050830004181000L,0x000100824C10010FL});
    public static final BitSet FOLLOW_statements_in_if_statement2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_if_statement2493 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_else_block_in_if_statement2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_block2527 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_else_block2529 = new BitSet(new long[]{0xA050830004181000L,0x000100824C10010FL});
    public static final BitSet FOLLOW_statements_in_else_block2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_else_block2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement2565 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_while_statement2567 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_while_statement2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_while_statement2571 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_while_statement2573 = new BitSet(new long[]{0xA050830004181000L,0x000100824C10010FL});
    public static final BitSet FOLLOW_statements_in_while_statement2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_while_statement2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_boolean_stmt2606 = new BitSet(new long[]{0x6800003000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_boolean_right_in_boolean_stmt2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_op_in_boolean_right2629 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_boolean_right2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_stmt_in_boolean_exp2658 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_boolean_exp_cont_in_boolean_exp2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_exp2675 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_boolean_exp_cont2702 = new BitSet(new long[]{0xA050810000181000L,0x000000800410210FL});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp_cont2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_op2733 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_op2752 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_binary_op2771 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_binary_op2796 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_binary_op2815 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_binary_op2834 = new BitSet(new long[]{0xA050810000181000L,0x000000800410010FL});
    public static final BitSet FOLLOW_variable_in_binary_op2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolean_op2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_boolean_op2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolean_op2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_boolean_op2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolean_op2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_EQUALS_in_boolean_op2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_op2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_op2938 = new BitSet(new long[]{0x0000000000000002L});

}