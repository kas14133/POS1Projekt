/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 */
public class LibraryManagementPage extends WebPage {
    private Component headerPanel;
    private Component navigationPanel;
    private Component contentPanel;
    private Component footerPanel;

    public LibraryManagementPage() {

        add(new Label("helloMessage", "Hello WicketWorld!"));
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(navigationPanel = new NavigationPanel("navigationPanel"));
        contentPanel = contentPanel();
        if (contentPanel != null) {
            add(contentPanel);
        }
        add(footerPanel = new FooterPanel("footerPanel"));
    }

    protected Component contentPanel() {
        return null;
    }
}
