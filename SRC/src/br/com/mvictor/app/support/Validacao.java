/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvictor.app.support;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mvictor
 */
public final class Validacao {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static Validacao instance;
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private Validacao() {
        super();
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static Validacao getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new Validacao();
            }
        }
        return instance;
    }
    
    public boolean isEmailValid(final String Campo)
    {
       matcher = pattern.matcher(Campo);
       return matcher.matches();
    }
    
    public boolean isNull(final String texto)
    {
        return texto == null;
    }
    
    public boolean isNull(final javax.swing.JFormattedTextField campo, String exp)
    {
        return campo.getText().equals(exp);
    }
    
    public boolean isEmpty(final String texto)
    {
        return texto.isEmpty();
    }
    
    public boolean isEmpty(final javax.swing.JFormattedTextField campo, String exp)
    {
        return campo.getText().equals(exp);
    }
    
}
