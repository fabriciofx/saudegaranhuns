/**
 * 
 */
package br.edu.ifpe.garanhuns.sg.jsf;

import javax.enterprise.inject.Model;

/**
 * @author Ken Finnigan
 * @version $Id$
 * @since 
 */
/**
 */
@Model
public class Message {
    public String say() {
        return "Hello from JSF";
    }
}