package com.company;

import com.company.Command.*;

public class MainCommand {
    public static void main(String[] args) {
        // Create obj
        ObjectWithMethod obj = new ObjectWithMethod();

        // Create command need to execute
        ExportPdf commandExportPdf = new ExportPdf(obj);
        ExportExcel commandExportExcel = new ExportExcel(obj);

        // Create Invoker to queue action
        CommandInvoker invoker = new CommandInvoker();
        invoker.takeCommand(commandExportPdf);
        invoker.takeCommand(commandExportExcel);

        invoker.placeOrders();
    }
}
