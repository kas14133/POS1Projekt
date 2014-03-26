/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 */
public class NavigationPanel extends Panel {
    public NavigationPanel(String id) {
        super(id);
        add(new Link("navigateTeacher") {
            @Override
            public void onClick() {
                //setResponsePage(TeacherPage.class);
            }
        });
    }
}