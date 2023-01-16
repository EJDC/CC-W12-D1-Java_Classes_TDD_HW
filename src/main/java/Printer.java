public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public void printOut (int pages, int copies) {
        int sheets = pages * copies;
        if ( this.paper >= sheets) {
            if (this.toner >=  sheets) {
                this.setPaper(this.paper - sheets);
                this.setToner(this.toner - sheets);
            }
        }
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }
}
