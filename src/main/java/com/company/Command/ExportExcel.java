package com.company.Command;

public class ExportExcel implements Command{
    private ObjectWithMethod objectWithMethod;

    public ExportExcel(ObjectWithMethod object){
        this.objectWithMethod = object;
    }

    @Override
    public void execute(String json) {
        // compile json data to export
        objectWithMethod.exportExcels();
    }
}
