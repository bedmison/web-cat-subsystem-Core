/*==========================================================================*\
 |  $Id$
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU General Public License as published by
 |  the Free Software Foundation; either version 2 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU General Public License
 |  along with Web-CAT; if not, write to the Free Software
 |  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 |
 |  Project manager: Stephen Edwards <edwards@cs.vt.edu>
 |  Virginia Tech CS Dept, 660 McBryde Hall (0106), Blacksburg, VA 24061 USA
\*==========================================================================*/

package net.sf.webcat.core;

import com.webobjects.appserver.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * Implements the login UI functionality of the system.
 *
 *  @author Stephen Edwards
 *  @version $Id$
 */
public class LoginPage
    extends WOComponent
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new LoginPage object.
     *
     * @param context The context to use
     */
    public LoginPage( WOContext context )
    {
        super( context );
    }


    //~ KVC Attributes (must be public) .......................................

    public String               userName;
    public String               password;
    public NSMutableDictionary  errors;
    public WODisplayGroup       domainDisplayGroup;
    public AuthenticationDomain domain;
    public AuthenticationDomain domainItem;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /* (non-Javadoc)
     * @see com.webobjects.appserver.WOComponent#awake()
     */
    public void awake()
    {
        super.awake();
        log.debug( "hasSession = " + hasSession() );
        if ( hasSession() )
            log.debug( "session = " + session().sessionID() );
        log.debug( "errors = " + errors );

        domainDisplayGroup.setObjectArray(
            AuthenticationDomain.authDomains() );
        log.debug( "domain = " + domain );
        if ( domain == null )
        {
            // Set up a default domain, if possible
            String defaultDomain = Application.configurationProperties()
                .getProperty( "authenticator.default" );
            if ( defaultDomain != null )
            {
                try
                {
                    log.debug( "looking up default domain" );
                    domain =
                        AuthenticationDomain.authDomainByName( defaultDomain );
                }
                catch ( EOObjectNotAvailableException e )
                {
                    log.error( "Default authentication domain ("
                             + defaultDomain + ") does not exist." );
                }
                catch ( EOUtilities.MoreThanOneException e )
                {
                    log.error( "Multiple entries for default authentication "
                             + "domain (" + defaultDomain + ")" );
                }
            }
        }
        log.debug( "domain = " + domain );
    }


    // ----------------------------------------------------------
    /* (non-Javadoc)
     * @see com.webobjects.appserver.WOComponent#sleep()
     */
    public void sleep()
    {
        log.debug( "hasSession = " + hasSession() );
        if ( hasSession() )
            log.debug( "session = " + session().sessionID() );
        super.sleep();
    }


    // ----------------------------------------------------------
    public boolean multipleAuthDomains()
    {
        return domainDisplayGroup.allObjects().count() > 1;
    }


    // ----------------------------------------------------------
    public boolean hasSpecificAuthDomain()
    {
        WORequest request = context().request();
        String auth = request.stringFormValueForKey( "institution" );
        if ( auth == null )
        {
            auth = request.stringFormValueForKey( "d" );
        }
        if ( auth != null )
        {
            try
            {
                log.debug( "looking up domain: " + auth );
                domain = AuthenticationDomain.authDomainByName( auth );
                specificAuthDomainName = auth;
            }
            catch ( EOObjectNotAvailableException e )
            {
                log.error( "Unrecognized institution parameter provided: '"
                    + auth + "'", e );
            }
            catch ( EOUtilities.MoreThanOneException e )
            {
                log.error( "Ambiguous institution parameter provided: '"
                    + auth + "'", e );
            }
        }
        return specificAuthDomainName != null;
    }


    // ----------------------------------------------------------
    public String specificAuthDomainName()
    {
        return specificAuthDomainName;
    }


    //~ Instance/static variables .............................................

    private String specificAuthDomainName;
    static Logger log = Logger.getLogger( LoginPage.class );
}
