package com.lw.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class StockWatcher implements EntryPoint {
    private VerticalPanel mainPanel = new VerticalPanel();
    private HorizontalPanel addPanel = new HorizontalPanel();
    private FlexTable stocksFlexTable = new FlexTable();
    private TextBox newSymbolTextBox = new TextBox();
    private Button addStockButton = new Button("Add");
    private Label lastUpdatedLabel = new Label();


    public void onModuleLoad() {
        stocksFlexTable.setText(0, 0, "Symbol");
        stocksFlexTable.setText(0, 1, "Price");
        stocksFlexTable.setText(0, 2, "Change");
        stocksFlexTable.setText(0, 3, "Remove");

        addPanel.add(newSymbolTextBox);
        addPanel.add(addStockButton);

        mainPanel.add(stocksFlexTable);
        mainPanel.add(addPanel);
        mainPanel.add(lastUpdatedLabel);

        RootPanel.get("stockList").add(mainPanel);
        newSymbolTextBox.setFocus(true);
    }
}
