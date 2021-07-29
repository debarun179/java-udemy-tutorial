public class Printer {
    private int tonerLevel;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel>0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
            this.numPagesPrinted = 0;
            this.isDuplex = isDuplex;

    }
    public void fillToner(int incrementLevel){
        if (incrementLevel >0 && incrementLevel <=100)
        this.tonerLevel += incrementLevel;
        else {
            System.out.println("Invalid toner increment level");
        }
        if (this.tonerLevel>100) {
            this.tonerLevel = 100;
            System.out.println("You can fill only up to 100%");
        }
    }

    public void printPages(int pagesToPrint){
        if (isDuplex) {
            numPagesPrinted += (pagesToPrint / 2) + (pagesToPrint % 2);
        }
        else {
                numPagesPrinted += pagesToPrint;
            }
        System.out.println("Pages printed "+ numPagesPrinted);
    }


}
