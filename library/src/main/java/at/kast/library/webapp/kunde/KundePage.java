/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp.kunde;

import at.kast.library.webapp.LibraryManagementPage;

import org.apache.wicket.Component;

/**
 *
 */
public class KundePage extends LibraryManagementPage {

    protected KundePanel contentPanel() {
        return new KundePanel("kundePanel");
    }
}
