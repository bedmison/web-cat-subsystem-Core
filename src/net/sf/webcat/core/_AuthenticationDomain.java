/*==========================================================================*\
 |  _AuthenticationDomain.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to AuthenticationDomain.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2008 Virginia Tech
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

package net.sf.webcat.core;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * AuthenticationDomain.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _AuthenticationDomain
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _AuthenticationDomain object.
     */
    public _AuthenticationDomain()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * _AuthenticationDomain object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @return The newly created object
     */
    public static AuthenticationDomain create(
        EOEditingContext editingContext
        )
    {
        AuthenticationDomain eoObject = (AuthenticationDomain)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _AuthenticationDomain.ENTITY_NAME);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static AuthenticationDomain localInstance(
        EOEditingContext editingContext, AuthenticationDomain eo)
    {
        return (eo == null)
            ? null
            : (AuthenticationDomain)EOUtilities.localInstanceOfObject(
                editingContext, eo);
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static AuthenticationDomain forId(
        EOEditingContext ec, int id )
    {
        AuthenticationDomain obj = null;
        if (id > 0)
        {
            NSArray results = EOUtilities.objectsMatchingKeyAndValue( ec,
                ENTITY_NAME, "id", new Integer( id ) );
            if ( results != null && results.count() > 0 )
            {
                obj = (AuthenticationDomain)results.objectAtIndex( 0 );
            }
        }
        return obj;
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static AuthenticationDomain forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String DATE_FORMAT_KEY = "dateFormat";
    public static final String DEFAULT_EMAIL_DOMAIN_KEY = "defaultEmailDomain";
    public static final String DEFAULT_URLPATTERN_KEY = "defaultURLPattern";
    public static final String DISPLAYABLE_NAME_KEY = "displayableName";
    public static final String PROPERTY_NAME_KEY = "propertyName";
    public static final String TIME_FORMAT_KEY = "timeFormat";
    public static final String TIME_ZONE_NAME_KEY = "timeZoneName";
    // To-one relationships ---
    // To-many relationships ---
    // Fetch specifications ---
    public static final String FETCH_ALL_FSPEC = "FetchAll";
    public static final String ENTITY_NAME = "AuthenticationDomain";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public AuthenticationDomain localInstance(EOEditingContext editingContext)
    {
        return (AuthenticationDomain)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    public NSDictionary changedProperties()
    {
        return changesFromSnapshot(
            editingContext().committedSnapshotForObject(this) );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>id</code> value.
     * @return the value of the attribute
     */
    public Number id()
    {
        try
        {
            return (Number)EOUtilities.primaryKeyForObject(
                editingContext() , this ).objectForKey( "id" );
        }
        catch (Exception e)
        {
            return er.extensions.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>dateFormat</code> value.
     * @return the value of the attribute
     */
    public String dateFormat()
    {
        return (String)storedValueForKey( "dateFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>dateFormat</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDateFormat( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setDateFormat("
                + value + "): was " + dateFormat() );
        }
        takeStoredValueForKey( value, "dateFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>defaultEmailDomain</code> value.
     * @return the value of the attribute
     */
    public String defaultEmailDomain()
    {
        return (String)storedValueForKey( "defaultEmailDomain" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>defaultEmailDomain</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDefaultEmailDomain( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setDefaultEmailDomain("
                + value + "): was " + defaultEmailDomain() );
        }
        takeStoredValueForKey( value, "defaultEmailDomain" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>defaultURLPattern</code> value.
     * @return the value of the attribute
     */
    public String defaultURLPattern()
    {
        return (String)storedValueForKey( "defaultURLPattern" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>defaultURLPattern</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDefaultURLPattern( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setDefaultURLPattern("
                + value + "): was " + defaultURLPattern() );
        }
        takeStoredValueForKey( value, "defaultURLPattern" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>displayableName</code> value.
     * @return the value of the attribute
     */
    public String displayableName()
    {
        return (String)storedValueForKey( "displayableName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>displayableName</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDisplayableName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setDisplayableName("
                + value + "): was " + displayableName() );
        }
        takeStoredValueForKey( value, "displayableName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>propertyName</code> value.
     * @return the value of the attribute
     */
    public String propertyName()
    {
        return (String)storedValueForKey( "propertyName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>propertyName</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setPropertyName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setPropertyName("
                + value + "): was " + propertyName() );
        }
        takeStoredValueForKey( value, "propertyName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>timeFormat</code> value.
     * @return the value of the attribute
     */
    public String timeFormat()
    {
        return (String)storedValueForKey( "timeFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>timeFormat</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTimeFormat( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTimeFormat("
                + value + "): was " + timeFormat() );
        }
        takeStoredValueForKey( value, "timeFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>timeZoneName</code> value.
     * @return the value of the attribute
     */
    public String timeZoneName()
    {
        return (String)storedValueForKey( "timeZoneName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>timeZoneName</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTimeZoneName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTimeZoneName("
                + value + "): was " + timeZoneName() );
        }
        takeStoredValueForKey( value, "timeZoneName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>FetchAll</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForFetchAll(
            EOEditingContext context
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "FetchAll", "AuthenticationDomain" );

        NSArray result = context.objectsWithFetchSpecification( spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForFetchAll(ec"
            
                + "): " + result );
        }
        return result;
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( AuthenticationDomain.class );
}
