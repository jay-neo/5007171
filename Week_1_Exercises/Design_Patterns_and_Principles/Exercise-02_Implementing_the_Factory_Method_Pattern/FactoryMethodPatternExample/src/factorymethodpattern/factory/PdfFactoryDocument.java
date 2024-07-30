package factorymethodpattern.factory;
import factorymethodpattern.document.Document;
import factorymethodpattern.document.PdfDocument;


public class PdfFactoryDocument extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		 return new PdfDocument();
	}
	
}
