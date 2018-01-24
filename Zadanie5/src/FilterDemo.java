import java.util.logging.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
public class FilterDemo
{
    private Logger logger = null;
    private WordFilter filter = null;

    public FilterDemo()
    {
        logger = Logger.getLogger("sam.logging");
        filter = new WordFilter();
        logger.setFilter(filter);
    }

    public void logMessage(Word word)
    {
       logger.log(Level.INFO, "Words in that log are "+word.getWord(), word);

    }

    public static void main(String args[])
    {
        FilterDemo demo = new FilterDemo();

        Word word1 = new Word("1", "sex");
        Word word2 = new Word("2", "hoh");

     //   String htmlCode = "<html><body><b>" + (demo.logMessage(word1)) + "</b></body></html>";
     //   PrintWriter writer = null;
     //   try {
     //       writer = new PrintWriter("index.html", "UTF-8"); // тут путь куда мы сохраняем наш html файл
     //       writer.println(htmlCode);
     //   } catch (FileNotFoundException e) {
     //       e.printStackTrace();
     //   } catch (UnsupportedEncodingException e) {
     //       e.printStackTrace();
     //   } finally {
     //       writer.close();
     //   }
        demo.logMessage(word1);
        demo.logMessage(word2);
    }
}

class Word{
    private String name = null;
    private String slovechko;

    public Word(String name, String slovechko)
    {
        this.name = name;
        this.slovechko = slovechko;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(String slovechko)
    {
        this.slovechko = slovechko;
    }

    public String getWord()
    {
        return slovechko;
    }
}

class WordFilter implements Filter {
    public WordFilter() {
    }

    public boolean isLoggable(LogRecord record) {
        boolean result = false;

        Object[] objs = record.getParameters();
        Word word = (Word)objs[0];

        if(word !=null) {

            String slovechko = word.getWord();
            if((slovechko!= "sex")&& (slovechko!= "drugs")&&(slovechko!="C++"))
                result = true;
            else
                result = false;
        }
        return result;
    }
}