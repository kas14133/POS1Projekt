/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package at.kast.library.webapp;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 */
@WebFilter(value = "/web/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "at.kast.library.webapp.LibraryManagementApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/web/*")})
public class LibraryManagementFilter extends WicketFilter {
}
