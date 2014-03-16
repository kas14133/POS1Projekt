/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp.kunde;

import at.grueneis.timetable.webapp.ContentPanel;

/**
 *
 */
public class KundePanel extends ContentPanel {
    public KundePanel(String id) {
        super(id);
        add(new KundeForm("kundeForm"));
    }
}
