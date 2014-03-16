/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp.kunde;

import at.kast.library.domain.Kunde;
import at.kast.library.domain.Person;
import at.kast.library.repository.KundeRepository;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.util.Date;

/**
 *
 */
public class KundeForm extends Form<Kunde> {
    @SpringBean
    private KundeRepository kundeRepository;

    public KundeForm(String id) {
        super(id, new CompoundPropertyModel<Kunde>(new Kunde(3,new Person("Franz Meier",32,"Spengergasse 10","test@gmail.com"))));
        add(new TextField<>("name"));
        add(new TextField<>("age"));
        add(new TextField<>("addresse"));
        add(new TextField<>("email"));
    }

    @Override
    public final void onSubmit() {
        Kunde kunde = getModelObject();
        kundeRepository.save(kunde);
        System.out.println(kunde);
    }
}
