package at.jku.se.dbml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDBMLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalDBMLLexer() {;} 
    public InternalDBMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDBMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDBML.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:11:7: ( 'Table' )
            // InternalDBML.g:11:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:12:7: ( '\"' )
            // InternalDBML.g:12:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:13:7: ( '{' )
            // InternalDBML.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:14:7: ( 'Indexes' )
            // InternalDBML.g:14:9: 'Indexes'
            {
            match("Indexes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:15:7: ( '}' )
            // InternalDBML.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:16:7: ( '(' )
            // InternalDBML.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:17:7: ( ',' )
            // InternalDBML.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:18:7: ( ')' )
            // InternalDBML.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:19:7: ( '[' )
            // InternalDBML.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:20:7: ( 'unique,' )
            // InternalDBML.g:20:9: 'unique,'
            {
            match("unique,"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:21:7: ( 'pk' )
            // InternalDBML.g:21:9: 'pk'
            {
            match("pk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:22:7: ( 'name:' )
            // InternalDBML.g:22:9: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:23:7: ( ']' )
            // InternalDBML.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:24:7: ( 'not' )
            // InternalDBML.g:24:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:25:7: ( 'null' )
            // InternalDBML.g:25:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:26:7: ( 'increment' )
            // InternalDBML.g:26:9: 'increment'
            {
            match("increment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:27:7: ( 'BOOLEAN' )
            // InternalDBML.g:27:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:28:7: ( 'BIT' )
            // InternalDBML.g:28:9: 'BIT'
            {
            match("BIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:29:7: ( 'INT' )
            // InternalDBML.g:29:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:30:7: ( 'INTEGER' )
            // InternalDBML.g:30:9: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:31:7: ( 'FLOAT' )
            // InternalDBML.g:31:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:32:7: ( 'TINYINT' )
            // InternalDBML.g:32:9: 'TINYINT'
            {
            match("TINYINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:33:7: ( 'BIGINT' )
            // InternalDBML.g:33:9: 'BIGINT'
            {
            match("BIGINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:34:7: ( 'SMALLINT' )
            // InternalDBML.g:34:9: 'SMALLINT'
            {
            match("SMALLINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:35:7: ( 'BYTE' )
            // InternalDBML.g:35:9: 'BYTE'
            {
            match("BYTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:36:7: ( 'TIMESTAMP' )
            // InternalDBML.g:36:9: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:37:7: ( 'DATE' )
            // InternalDBML.g:37:9: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:38:7: ( 'DATETIME' )
            // InternalDBML.g:38:9: 'DATETIME'
            {
            match("DATETIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:39:7: ( 'TEXT' )
            // InternalDBML.g:39:9: 'TEXT'
            {
            match("TEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:40:7: ( 'LONGTEXT' )
            // InternalDBML.g:40:9: 'LONGTEXT'
            {
            match("LONGTEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:41:7: ( 'MEDIUMTEXT' )
            // InternalDBML.g:41:9: 'MEDIUMTEXT'
            {
            match("MEDIUMTEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:42:7: ( 'CHAR(' )
            // InternalDBML.g:42:9: 'CHAR('
            {
            match("CHAR("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:43:7: ( 'VARCHAR(' )
            // InternalDBML.g:43:9: 'VARCHAR('
            {
            match("VARCHAR("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:44:7: ( 'NCHAR(' )
            // InternalDBML.g:44:9: 'NCHAR('
            {
            match("NCHAR("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:45:7: ( 'NVARCHAR(' )
            // InternalDBML.g:45:9: 'NVARCHAR('
            {
            match("NVARCHAR("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:46:7: ( 'DECIMAL(' )
            // InternalDBML.g:46:9: 'DECIMAL('
            {
            match("DECIMAL("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:47:7: ( 'DOUBLE' )
            // InternalDBML.g:47:9: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:48:7: ( 'timestamp(' )
            // InternalDBML.g:48:9: 'timestamp('
            {
            match("timestamp("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:49:7: ( 'jsonb' )
            // InternalDBML.g:49:9: 'jsonb'
            {
            match("jsonb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:50:7: ( 'json' )
            // InternalDBML.g:50:9: 'json'
            {
            match("json"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:51:7: ( 'JSON' )
            // InternalDBML.g:51:9: 'JSON'
            {
            match("JSON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:52:7: ( 'Ref' )
            // InternalDBML.g:52:9: 'Ref'
            {
            match("Ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:53:7: ( ':' )
            // InternalDBML.g:53:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:54:7: ( '\":' )
            // InternalDBML.g:54:9: '\":'
            {
            match("\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:55:7: ( '<' )
            // InternalDBML.g:55:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:56:7: ( '.' )
            // InternalDBML.g:56:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1000:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDBML.g:1000:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDBML.g:1000:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDBML.g:1000:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDBML.g:1000:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDBML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1002:10: ( ( '0' .. '9' )+ )
            // InternalDBML.g:1002:12: ( '0' .. '9' )+
            {
            // InternalDBML.g:1002:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDBML.g:1002:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1004:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDBML.g:1004:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDBML.g:1004:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDBML.g:1004:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1006:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDBML.g:1006:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDBML.g:1006:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDBML.g:1006:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDBML.g:1006:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDBML.g:1006:41: ( '\\r' )? '\\n'
                    {
                    // InternalDBML.g:1006:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDBML.g:1006:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1008:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDBML.g:1008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDBML.g:1008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDBML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDBML.g:1010:16: ( . )
            // InternalDBML.g:1010:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDBML.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt9=52;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalDBML.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalDBML.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalDBML.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalDBML.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalDBML.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalDBML.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalDBML.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalDBML.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalDBML.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalDBML.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalDBML.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalDBML.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalDBML.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalDBML.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalDBML.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalDBML.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalDBML.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalDBML.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalDBML.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalDBML.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalDBML.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalDBML.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalDBML.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalDBML.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalDBML.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalDBML.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalDBML.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalDBML.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalDBML.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalDBML.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalDBML.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalDBML.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalDBML.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // InternalDBML.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // InternalDBML.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // InternalDBML.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // InternalDBML.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // InternalDBML.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // InternalDBML.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // InternalDBML.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // InternalDBML.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // InternalDBML.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // InternalDBML.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // InternalDBML.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // InternalDBML.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // InternalDBML.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // InternalDBML.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalDBML.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalDBML.g:1:303: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalDBML.g:1:319: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // InternalDBML.g:1:335: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalDBML.g:1:343: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\50\1\52\1\uffff\1\50\5\uffff\3\50\1\uffff\16\50\3\uffff\1\44\2\uffff\1\44\2\uffff\3\50\4\uffff\2\50\5\uffff\1\50\1\132\3\50\1\uffff\23\50\7\uffff\5\50\1\170\1\50\1\uffff\1\50\1\173\3\50\1\177\20\50\1\u0090\3\50\1\u0094\2\50\1\uffff\2\50\1\uffff\1\u0099\2\50\1\uffff\1\50\1\u009d\2\50\1\u00a1\11\50\1\u00ac\1\u00ad\1\uffff\1\u00ae\2\50\1\uffff\3\50\2\uffff\3\50\1\uffff\1\u00b7\2\50\1\uffff\4\50\1\uffff\4\50\1\u00c2\3\uffff\7\50\1\u00ca\1\uffff\3\50\1\u00ce\3\50\1\uffff\2\50\1\uffff\1\u00d4\1\50\1\u00d6\1\u00d7\1\uffff\1\50\1\u00d9\1\uffff\3\50\1\uffff\5\50\1\uffff\1\50\2\uffff\1\50\1\uffff\1\u00e4\1\u00e5\1\uffff\1\u00e6\1\50\1\uffff\2\50\1\u00ea\1\u00eb\3\uffff\1\50\1\uffff\1\50\2\uffff\1\u00ee\2\uffff";
    static final String DFA9_eofS =
        "\u00ef\uffff";
    static final String DFA9_minS =
        "\1\0\1\105\1\72\1\uffff\1\116\5\uffff\1\156\1\153\1\141\1\uffff\1\156\1\111\1\114\1\115\1\101\1\117\1\105\1\110\1\101\1\103\1\151\1\163\1\123\1\145\3\uffff\1\101\2\uffff\1\52\2\uffff\1\142\1\115\1\130\4\uffff\1\144\1\124\5\uffff\1\151\1\60\1\155\1\164\1\154\1\uffff\1\143\1\117\1\107\1\124\1\117\1\101\1\124\1\103\1\125\1\116\1\104\1\101\1\122\1\110\1\101\1\155\1\157\1\117\1\146\7\uffff\1\154\1\131\1\105\1\124\1\145\1\60\1\161\1\uffff\1\145\1\60\1\154\1\162\1\114\1\60\1\111\1\105\1\101\1\114\1\105\1\111\1\102\1\107\1\111\1\122\1\103\1\101\1\122\1\145\1\156\1\116\1\60\1\145\1\111\1\123\1\60\1\170\1\107\1\uffff\1\165\1\72\1\uffff\1\60\1\145\1\105\1\uffff\1\116\1\60\1\124\1\114\1\60\1\115\1\114\1\124\1\125\1\50\1\110\1\122\1\103\1\163\2\60\1\uffff\1\60\1\116\1\124\1\uffff\1\145\1\105\1\145\2\uffff\1\155\1\101\1\124\1\uffff\1\60\2\111\1\uffff\1\101\2\105\1\115\1\uffff\1\101\1\50\1\110\1\164\1\60\3\uffff\1\124\1\101\1\163\1\122\1\54\1\145\1\116\1\60\1\uffff\1\116\1\115\1\114\1\60\1\130\1\124\1\122\1\uffff\1\101\1\141\1\uffff\1\60\1\115\2\60\1\uffff\1\156\1\60\1\uffff\1\124\1\105\1\50\1\uffff\1\124\1\105\1\50\1\122\1\155\1\uffff\1\120\2\uffff\1\164\1\uffff\2\60\1\uffff\1\60\1\130\1\uffff\1\50\1\160\2\60\3\uffff\1\124\1\uffff\1\50\2\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\141\1\72\1\uffff\1\156\5\uffff\1\156\1\153\1\165\1\uffff\1\156\1\131\1\114\1\115\2\117\1\105\1\110\1\101\1\126\1\151\1\163\1\123\1\145\3\uffff\1\172\2\uffff\1\57\2\uffff\1\142\1\116\1\130\4\uffff\1\144\1\124\5\uffff\1\151\1\172\1\155\1\164\1\154\1\uffff\1\143\1\117\2\124\1\117\1\101\1\124\1\103\1\125\1\116\1\104\1\101\1\122\1\110\1\101\1\155\1\157\1\117\1\146\7\uffff\1\154\1\131\1\105\1\124\1\145\1\172\1\161\1\uffff\1\145\1\172\1\154\1\162\1\114\1\172\1\111\1\105\1\101\1\114\1\105\1\111\1\102\1\107\1\111\1\122\1\103\1\101\1\122\1\145\1\156\1\116\1\172\1\145\1\111\1\123\1\172\1\170\1\107\1\uffff\1\165\1\72\1\uffff\1\172\1\145\1\105\1\uffff\1\116\1\172\1\124\1\114\1\172\1\115\1\114\1\124\1\125\1\50\1\110\1\122\1\103\1\163\2\172\1\uffff\1\172\1\116\1\124\1\uffff\1\145\1\105\1\145\2\uffff\1\155\1\101\1\124\1\uffff\1\172\2\111\1\uffff\1\101\2\105\1\115\1\uffff\1\101\1\50\1\110\1\164\1\172\3\uffff\1\124\1\101\1\163\1\122\1\54\1\145\1\116\1\172\1\uffff\1\116\1\115\1\114\1\172\1\130\1\124\1\122\1\uffff\1\101\1\141\1\uffff\1\172\1\115\2\172\1\uffff\1\156\1\172\1\uffff\1\124\1\105\1\50\1\uffff\1\124\1\105\1\50\1\122\1\155\1\uffff\1\120\2\uffff\1\164\1\uffff\2\172\1\uffff\1\172\1\130\1\uffff\1\50\1\160\2\172\3\uffff\1\124\1\uffff\1\50\2\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\3\uffff\1\15\16\uffff\1\53\1\55\1\56\1\uffff\1\57\1\60\1\uffff\1\63\1\64\3\uffff\1\57\1\54\1\2\1\3\2\uffff\1\5\1\6\1\7\1\10\1\11\5\uffff\1\15\23\uffff\1\53\1\55\1\56\1\60\1\61\1\62\1\63\7\uffff\1\13\35\uffff\1\23\2\uffff\1\16\3\uffff\1\22\20\uffff\1\52\3\uffff\1\35\3\uffff\1\14\1\17\3\uffff\1\31\3\uffff\1\33\4\uffff\1\40\5\uffff\1\50\1\51\1\1\10\uffff\1\25\7\uffff\1\42\2\uffff\1\47\4\uffff\1\12\2\uffff\1\27\3\uffff\1\45\5\uffff\1\26\1\uffff\1\4\1\24\1\uffff\1\21\2\uffff\1\44\2\uffff\1\41\4\uffff\1\30\1\34\1\36\1\uffff\1\43\1\uffff\1\32\1\20\1\uffff\1\46\1\37";
    static final String DFA9_specialS =
        "\1\0\u00ee\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\2\5\44\1\6\1\10\2\44\1\7\1\44\1\36\1\42\12\41\1\34\1\44\1\35\4\44\1\40\1\17\1\25\1\22\1\40\1\20\2\40\1\4\1\32\1\40\1\23\1\24\1\27\3\40\1\33\1\21\1\1\1\40\1\26\4\40\1\11\1\44\1\15\1\37\1\40\1\44\10\40\1\16\1\31\3\40\1\14\1\40\1\13\3\40\1\30\1\12\5\40\1\3\1\44\1\5\uff82\44",
            "\1\47\3\uffff\1\46\27\uffff\1\45",
            "\1\51",
            "",
            "\1\55\37\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65\15\uffff\1\66\5\uffff\1\67",
            "",
            "\1\71",
            "\1\73\5\uffff\1\72\11\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100\11\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\22\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "\1\123",
            "\1\125\1\124",
            "\1\126",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\141\14\uffff\1\140",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\50\7\uffff\4\50\1\167\25\50\4\uffff\1\50\1\uffff\32\50",
            "\1\171",
            "",
            "\1\172",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009e",
            "\1\u009f",
            "\12\50\7\uffff\23\50\1\u00a0\6\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\50\1\u00ab\30\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='T') ) {s = 1;}

                        else if ( (LA9_0=='\"') ) {s = 2;}

                        else if ( (LA9_0=='{') ) {s = 3;}

                        else if ( (LA9_0=='I') ) {s = 4;}

                        else if ( (LA9_0=='}') ) {s = 5;}

                        else if ( (LA9_0=='(') ) {s = 6;}

                        else if ( (LA9_0==',') ) {s = 7;}

                        else if ( (LA9_0==')') ) {s = 8;}

                        else if ( (LA9_0=='[') ) {s = 9;}

                        else if ( (LA9_0=='u') ) {s = 10;}

                        else if ( (LA9_0=='p') ) {s = 11;}

                        else if ( (LA9_0=='n') ) {s = 12;}

                        else if ( (LA9_0==']') ) {s = 13;}

                        else if ( (LA9_0=='i') ) {s = 14;}

                        else if ( (LA9_0=='B') ) {s = 15;}

                        else if ( (LA9_0=='F') ) {s = 16;}

                        else if ( (LA9_0=='S') ) {s = 17;}

                        else if ( (LA9_0=='D') ) {s = 18;}

                        else if ( (LA9_0=='L') ) {s = 19;}

                        else if ( (LA9_0=='M') ) {s = 20;}

                        else if ( (LA9_0=='C') ) {s = 21;}

                        else if ( (LA9_0=='V') ) {s = 22;}

                        else if ( (LA9_0=='N') ) {s = 23;}

                        else if ( (LA9_0=='t') ) {s = 24;}

                        else if ( (LA9_0=='j') ) {s = 25;}

                        else if ( (LA9_0=='J') ) {s = 26;}

                        else if ( (LA9_0=='R') ) {s = 27;}

                        else if ( (LA9_0==':') ) {s = 28;}

                        else if ( (LA9_0=='<') ) {s = 29;}

                        else if ( (LA9_0=='.') ) {s = 30;}

                        else if ( (LA9_0=='^') ) {s = 31;}

                        else if ( (LA9_0=='A'||LA9_0=='E'||(LA9_0>='G' && LA9_0<='H')||LA9_0=='K'||(LA9_0>='O' && LA9_0<='Q')||LA9_0=='U'||(LA9_0>='W' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='h')||(LA9_0>='k' && LA9_0<='m')||LA9_0=='o'||(LA9_0>='q' && LA9_0<='s')||(LA9_0>='v' && LA9_0<='z')) ) {s = 32;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 33;}

                        else if ( (LA9_0=='/') ) {s = 34;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 35;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||LA9_0=='!'||(LA9_0>='#' && LA9_0<='\'')||(LA9_0>='*' && LA9_0<='+')||LA9_0=='-'||LA9_0==';'||(LA9_0>='=' && LA9_0<='@')||LA9_0=='\\'||LA9_0=='`'||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}