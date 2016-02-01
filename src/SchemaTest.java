package com.xmlunit.tutorial.comparison;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
 
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.xml.sax.SAXException;
 
public class SchemaTest {
 
    public static void main(String[] args) {
    	String example = "
      + " \"http://example.com/order\">"
      + ""
      + ""
      + "";
	  Validator v = new Validator(example, 
	  							  new File("myXML-3.xsd").toURI().toURL().toString());

	  assertTrue(v.toString(), v.isValid());

    }
 
}