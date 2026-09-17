
 class Invoice {
	
	private String partNumber;
	

    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
                   }
  
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}



public class InvoiceTest {

    public static void main(String[] args) {


        Invoice invoice = new Invoice(
            "P01",
            "samsung",
            5,
            250.5
        );

  
        System.out.println("Invoice Details");
        

        System.out.println("Part Number: "
                + invoice.getPartNumber());

        System.out.println("Part Description: "
                + invoice.getPartDescription());

        System.out.println("Quantity: "
                + invoice.getQuantity());

        System.out.println("Price Per Item: "
                + invoice.getPricePerItem());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());

   
        invoice.setQuantity(-2);
        invoice.setPricePerItem(-100);

        System.out.println("\nAfter Setting Invalid Values");
    

        System.out.println("Quantity: "
                + invoice.getQuantity());

        System.out.println("Price Per Item: "
                + invoice.getPricePerItem());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());
    }
}