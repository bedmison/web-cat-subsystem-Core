/*==========================================================================*\
 |  Copyright (C) 2006-2016 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package org.webcat.core;

import com.webobjects.appserver.*;
import com.webobjects.eoaccess.*;
import com.webobjects.foundation.*;
import org.webcat.core.AuthenticationDomain;
import org.webcat.core.LoginPage;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * Implements the login UI functionality of the system.
 *
 *  @author  Stephen Edwards
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
    public LoginPage(WOContext context)
    {
        super(context);
    }


    //~ KVC Attributes (must be public) .......................................

    public String                    userName;
    public String                    password;
    public NSMutableDictionary<?, ?> errors;
    public WODisplayGroup            domainDisplayGroup;
    public AuthenticationDomain      domain;
    public AuthenticationDomain      domainItem;
    public NSDictionary<?, ?>        extraKeys;
    public String                    aKey;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /* (non-Javadoc)
     * @see com.webobjects.appserver.WOComponent#awake()
     */
    public void awake()
    {
        super.awake();
        if (log.isDebugEnabled())
        {
            log.debug("hasSession = " + hasSession());
            if (hasSession())
            {
                log.debug("session = " + session().sessionID());
            }
            log.debug("errors = " + errors);
            log.debug("domain = " + domain);
        }

        domainDisplayGroup.setObjectArray(
            AuthenticationDomain.authDomains());
        if (domain == null && !hasSpecificAuthDomain())
        {
            domain = AuthenticationDomain.defaultDomain();
        }
        log.debug("domain = " + domain);
    }


    // ----------------------------------------------------------
    /* (non-Javadoc)
     * @see com.webobjects.appserver.WOComponent#sleep()
     */
    public void sleep()
    {
        log.debug("hasSession = " + hasSession());
        if (hasSession())
        {
            log.debug("session = " + session().sessionID());
        }
        super.sleep();
    }


    // ----------------------------------------------------------
    public boolean multipleAuthDomains()
    {
        return domainDisplayGroup.allObjects().count() > 1;
    }


    // ----------------------------------------------------------
    public boolean oneCasDomain()
    {
        return domainDisplayGroup.allObjects().count() == 1
          && domainDisplayGroup.allObjects().get(0) instanceof CasAuthenticator;
    }


    // ----------------------------------------------------------
    public boolean hasSpecificAuthDomain()
    {
        WORequest request = context().request();
        String auth = request.cookieValueForKey(
            AuthenticationDomain.COOKIE_LAST_USED_INSTITUTION);
        if (auth == null)
        {
            auth = request.stringFormValueForKey("institution");
        }
        if (auth == null)
        {
            auth = request.stringFormValueForKey("d");
        }
        if (auth != null)
        {
            try
            {
                log.debug("looking up domain: " + auth);
                domain = AuthenticationDomain.authDomainByName(auth);
                specificAuthDomainName = auth;
            }
            catch (EOObjectNotAvailableException e)
            {
                log.error("Unrecognized institution parameter provided: '"
                    + auth + "'", e);
            }
            catch (EOUtilities.MoreThanOneException e)
            {
                log.error("Ambiguous institution parameter provided: '"
                    + auth + "'", e);
            }
        }
        return specificAuthDomainName != null;
    }


    // ----------------------------------------------------------
    public String specificAuthDomainName()
    {
        return specificAuthDomainName;
    }


    // ----------------------------------------------------------
    public boolean showForgotPasswordLink()
    {
        boolean result = false;
        for (int i = 0; i < domainDisplayGroup.allObjects().count(); i++)
        {
            AuthenticationDomain aDomain = (AuthenticationDomain)
                domainDisplayGroup.allObjects().objectAtIndex(i);
            if (aDomain.authenticator() != null
                && aDomain.authenticator() instanceof
                PasswordManagingUserAuthenticator)
            {
                result = true;
                break;
            }
        }
        return result;
    }


    // ----------------------------------------------------------
    public Object aKeyValue()
    {
        Object value = extraKeys.valueForKey(aKey);
        if (value instanceof NSArray)
        {
            NSArray<?> array = (NSArray<?>)value;
            if (array.count() == 1)
            {
                value = array.objectAtIndex(0);
            }
        }
        return value;
    }


    //~ Instance/static variables .............................................

    private String specificAuthDomainName;
    static Logger log = Logger.getLogger(LoginPage.class);
}
