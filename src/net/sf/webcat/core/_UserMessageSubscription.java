/*==========================================================================*\
 |  _UserMessageSubscription.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to UserMessageSubscription.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2009 Virginia Tech
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
import er.extensions.eof.ERXKey;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * UserMessageSubscription.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _UserMessageSubscription
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _UserMessageSubscription object.
     */
    public _UserMessageSubscription()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * UserMessageSubscription object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @param isEnabled
     * @return The newly created object
     */
    public static UserMessageSubscription create(
        EOEditingContext editingContext,
        boolean isEnabledValue
        )
    {
        UserMessageSubscription eoObject = (UserMessageSubscription)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _UserMessageSubscription.ENTITY_NAME);
        eoObject.setIsEnabled(isEnabledValue);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static UserMessageSubscription localInstance(
        EOEditingContext editingContext, UserMessageSubscription eo)
    {
        return (eo == null)
            ? null
            : (UserMessageSubscription)EOUtilities.localInstanceOfObject(
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
    public static UserMessageSubscription forId(
        EOEditingContext ec, int id )
    {
        UserMessageSubscription obj = null;
        if (id > 0)
        {
            NSArray<UserMessageSubscription> results =
                objectsMatchingValues(ec, "id", new Integer(id));
            if (results != null && results.count() > 0)
            {
                obj = results.objectAtIndex(0);
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
    public static UserMessageSubscription forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.foundation.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String IS_ENABLED_KEY = "isEnabled";
    public static final ERXKey<Integer> isEnabled =
        new ERXKey<Integer>(IS_ENABLED_KEY);
    public static final String MESSAGE_TYPE_KEY = "messageType";
    public static final ERXKey<String> messageType =
        new ERXKey<String>(MESSAGE_TYPE_KEY);
    public static final String PROTOCOL_TYPE_KEY = "protocolType";
    public static final ERXKey<String> protocolType =
        new ERXKey<String>(PROTOCOL_TYPE_KEY);
    // To-one relationships ---
    public static final String USER_KEY = "user";
    public static final ERXKey<net.sf.webcat.core.User> user =
        new ERXKey<net.sf.webcat.core.User>(USER_KEY);
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ENABLED_SUBSCRIPTIONS_FOR_MESSAGE_TYPE_AND_USER_FSPEC = "enabledSubscriptionsForMessageTypeAndUser";
    public static final String SUBSCRIPTIONS_FOR_USER_FSPEC = "subscriptionsForUser";
    public static final String ENTITY_NAME = "UserMessageSubscription";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public UserMessageSubscription localInstance(EOEditingContext editingContext)
    {
        return (UserMessageSubscription)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    @SuppressWarnings("unchecked")
    public NSDictionary<String, Object> changedProperties()
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
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isEnabled</code> value.
     * @return the value of the attribute
     */
    public boolean isEnabled()
    {
        Integer result =
            (Integer)storedValueForKey( "isEnabled" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isEnabled</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsEnabled( boolean value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsEnabled("
                + value + "): was " + isEnabled() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value ? 1 : 0 );
            setIsEnabledRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isEnabled</code> value.
     * @return the value of the attribute
     */
    public Integer isEnabledRaw()
    {
        return (Integer)storedValueForKey( "isEnabled" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isEnabled</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsEnabledRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsEnabledRaw("
                + value + "): was " + isEnabledRaw() );
        }
        takeStoredValueForKey( value, "isEnabled" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>messageType</code> value.
     * @return the value of the attribute
     */
    public String messageType()
    {
        return (String)storedValueForKey( "messageType" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>messageType</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMessageType( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMessageType("
                + value + "): was " + messageType() );
        }
        takeStoredValueForKey( value, "messageType" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>protocolType</code> value.
     * @return the value of the attribute
     */
    public String protocolType()
    {
        return (String)storedValueForKey( "protocolType" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>protocolType</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setProtocolType( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setProtocolType("
                + value + "): was " + protocolType() );
        }
        takeStoredValueForKey( value, "protocolType" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>user</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.core.User user()
    {
        return (net.sf.webcat.core.User)storedValueForKey( "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship (DO NOT USE--instead, use
     * <code>setUserRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setUser( net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUser("
                + value + "): was " + user() );
        }
        takeStoredValueForKey( value, "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setUserRelationship(
        net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUserRelationship("
                + value + "): was " + user() );
        }
        if ( value == null )
        {
            net.sf.webcat.core.User object = user();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "user" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "user" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a fetch specification.
     *
     * @param context The editing context to use
     * @param fspec The fetch specification to use
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<UserMessageSubscription> objectsWithFetchSpecification(
        EOEditingContext context,
        EOFetchSpecification fspec)
    {
        return context.objectsWithFetchSpecification(fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> allObjects(
        EOEditingContext context)
    {
        return objectsMatchingQualifier(context, null, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier)
    {
        return objectsMatchingQualifier(context, qualifier, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier and sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings The sort orderings to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        return objectsWithFetchSpecification(context, fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a qualifier, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings the sort orderings
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static UserMessageSubscription firstObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        NSArray<UserMessageSubscription> results =
            objectsMatchingQualifier(context, qualifier, sortOrderings);
        return (results.size() > 0)
            ? results.get(0)
            : null;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return the single entity that was retrieved
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static UserMessageSubscription uniqueObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier) throws EOUtilities.MoreThanOneException
    {
        NSArray<UserMessageSubscription> results =
            objectsMatchingQualifier(context, qualifier);
        if (results.size() > 1)
        {
            throw new EOUtilities.MoreThanOneException(null);
        }
        return (results.size() > 0)
            ? results.get(0)
            : null;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> objectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<UserMessageSubscription> objectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return EOUtilities.objectsMatchingValues(context, ENTITY_NAME,
            keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static UserMessageSubscription firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return firstObjectMatchingValues(
            context, sortOrderings, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieves the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static UserMessageSubscription firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        NSDictionary<String, Object> keysAndValues)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME,
            EOQualifier.qualifierToMatchAllValues(keysAndValues),
            sortOrderings);
        fspec.setFetchLimit(1);

        NSArray<UserMessageSubscription> result =
            objectsWithFetchSpecification( context, fspec );

        if ( result.count() == 0 )
        {
            return null;
        }
        else
        {
            return result.objectAtIndex(0);
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static UserMessageSubscription uniqueObjectMatchingValues(
        EOEditingContext context,
        Object... keysAndValues) throws EOUtilities.MoreThanOneException
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return uniqueObjectMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve an object using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static UserMessageSubscription uniqueObjectMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
        throws EOUtilities.MoreThanOneException
    {
        try
        {
            return (UserMessageSubscription)EOUtilities.objectMatchingValues(
                context, ENTITY_NAME, keysAndValues);
        }
        catch (EOObjectNotAvailableException e)
        {
            return null;
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects according to the <code>enabledSubscriptionsForMessageTypeAndUser</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param messageTypeBinding fetch spec parameter
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> enabledSubscriptionsForMessageTypeAndUser(
            EOEditingContext context,
            String messageTypeBinding,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "enabledSubscriptionsForMessageTypeAndUser", "UserMessageSubscription" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( messageTypeBinding != null )
        {
            bindings.setObjectForKey( messageTypeBinding,
                                      "messageType" );
        }
        if ( userBinding != null )
        {
            bindings.setObjectForKey( userBinding,
                                      "user" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray<UserMessageSubscription> result =
            objectsWithFetchSpecification( context, spec );
        if (log.isDebugEnabled())
        {
            log.debug( "enabledSubscriptionsForMessageTypeAndUser(ec"
                + ", " + messageTypeBinding
                + ", " + userBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects according to the <code>subscriptionsForUser</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<UserMessageSubscription> subscriptionsForUser(
            EOEditingContext context,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "subscriptionsForUser", "UserMessageSubscription" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( userBinding != null )
        {
            bindings.setObjectForKey( userBinding,
                                      "user" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray<UserMessageSubscription> result =
            objectsWithFetchSpecification( context, spec );
        if (log.isDebugEnabled())
        {
            log.debug( "subscriptionsForUser(ec"
                + ", " + userBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Produce a string representation of this object.  This implementation
     * calls UserPresentableDescription(), which uses WebObjects' internal
     * mechanism to print out the visible fields of this object.  Normally,
     * subclasses would override userPresentableDescription() to change
     * the way the object is printed.
     *
     * @return A string representation of the object's value
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( UserMessageSubscription.class );
}