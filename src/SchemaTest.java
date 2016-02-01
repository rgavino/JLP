package com.xmlunit.tutorial.comparison;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
 
import org.custommonkey.xmlunit.Validator;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.xml.sax.SAXException;
 
public class SchemaTest {
 
    public static void main(String[] args) {

	  //Validator v = new Validator(new File("oata/myXML.xml").toString(), new File("oata/myXML3.xsd").toString());

	  //assertTrue(v.toString(), v.isValid());

InputSource is = new InputSource(new FileInputStream(oata/myXML.xml));
//Validator v = new Validator(is);
//v.useXMLSchema(true);
//v.setJAXP12SchemaSource(new File(myXML3.xsd));
//boolean isValid = v.isValid();

    }
 
}