import com.chenery.tachetastic.example.Example;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/**
 *
 */
public class FirstTest {

    @Test
    public void testExecuteTemplate() throws IOException {

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("template.mustache");
        mustache.execute(new PrintWriter(System.out), new Example()).flush();
    }

    @Test
    public void testAlternativeExecuteTemplate() throws IOException {

        HashMap<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("name", "Mustache");
        scopes.put("feature", new Example.Feature("Perfect!"));

        Writer writer = new OutputStreamWriter(System.out);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(new StringReader("{{name}}, {{feature.description}}!"), "example");
        mustache.execute(writer, scopes);
        writer.flush();
    }
}
