package com.xmlunit.tutorial.comparison;

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
 
public class SchemaTest {
 
    public static void main(String[] args) {

	  //Validator v = new Validator(new File("oata/myXML.xml").toString(), new File("oata/myXML3.xsd").toString());

	  //assertTrue(v.toString(), v.isValid());
 
        try {
			InputSource is = new InputSource(new FileInputStream("oata/myXML.xml"));
   			Validator v = new Validator(is);
			v.useXMLSchema(true);
			v.setJAXP12SchemaSource(new File("oata/myXML3.xsd"));
			assertTrue(v.toString(), v.isValid());
			//boolean isValid = v.isValid();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
 
}