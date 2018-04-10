public class Printer {

    private int sheets;
    private int totalSheetsToPrint;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int print(int copies, int pages) {
        if (this.sheets >= totalSheetsToPrint) {
            totalSheetsToPrint = copies * pages;
            this.sheets = this.sheets - totalSheetsToPrint;
        }
        return this.sheets;
    }
}
