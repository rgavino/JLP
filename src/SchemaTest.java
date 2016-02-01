//package com.xmlunit.tutorial.comparison;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
 
import org.custommonkey.xmlunit.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
 
public class SchemaTest extends junit.framework.TestCase {
 
    public void testNothing() {
    }
    
    public void testWillAlwaysFail() {
        //fail("An error message - forcing a fail"); 
    }

    public void testXMLagainstSchema() {
//          assertTrue("should pass", true);
          assertTrue("should fail", false);

 
        try {
       //   InputSource is = new InputSource(new FileInputStream("oata/myXML.xml"));
     //     Validator v = new Validator(is);
   //       v.useXMLSchema(true);
 //         v.setJAXP12SchemaSource(new File("oata/myXML.xsd"));
//          assertTrue(v.toString(), v.isValid());
//          assertTrue("should pass", true);
         // assertTrue("should fail", false);
            //boolean isValid = v.isValid();
        } catch (Exception e) {
            e.printStackTrace();
        }
                //fail("An error message - forcing a fail"); 
    }

    public void testXMLagainstDTD() {
        //fail("An error message - forcing a fail"); 
    }



}