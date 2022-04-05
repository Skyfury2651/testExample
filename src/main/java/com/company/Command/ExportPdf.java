package main.java.com.company.Command;

public class ExportPdf implements Command {
    private ObjectWithMethod objectWithMethod;

    public ExportPdf(ObjectWithMethod object){
        this.objectWithMethod = object;
    }

    @Override
    public void execute(String json) {
        // compile json data to export
        objectWithMethod.exportPDF();
    }
}
