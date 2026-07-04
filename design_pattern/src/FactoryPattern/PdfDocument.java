package FactoryPattern;

public class PdfDocument implements Document {

    @Override
    public void open() { // implementation of open method
        System.out.println("Opening PDF Document"); //Since it implements the Document interface, it must implement the open() method

    }
}