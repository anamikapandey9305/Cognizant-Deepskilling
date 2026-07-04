package FactoryPattern;

public class FactoryPattern {

    public static void main(String[] args) {

        // Create Factory Object
        DocumentFactory factory = new DocumentFactory();

        // Create Word Document
        Document doc1 = factory.createDocument("WORD");
        doc1.open();

        // Create PDF Document
        Document doc2 = factory.createDocument("PDF");
        doc2.open();

        // Create Excel Document
        Document doc3 = factory.createDocument("EXCEL");
        doc3.open();
    }
}
    //Factory Design Pattern is a Creational Design Pattern that provides a way to create objects without exposing the object creation logic to the client. Instead of creating objects directly using new, the client requests the Factory class, and the Factory decides which object to create.

    // Using Factory Pattern:
   // DocumentFactory factory = new DocumentFactory();
 //   Document doc = factory.createDocument("PDF");

    //Yahan Factory class decide karti hai ki PdfDocument, WordDocument, ya ExcelDocument ka object banana hai.



// Note: Factory Pattern centralizes object creation and hides the object creation logic from the client.

 // Why we use:
//To hide object creation from the client and centralize object creation in one class (the Factory). This reduces coupling and makes the code easier to maintain.


