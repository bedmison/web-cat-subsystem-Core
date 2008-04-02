/*==========================================================================*\
 |  _LoggedError.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to LoggedError.java instead.
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
 * LoggedError.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _LoggedError
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _LoggedError object.
     */
    public _LoggedError()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * _LoggedError object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @param line
     * @param occurrences
     * @return The newly created object
     */
    public static LoggedError create(
        EOEditingContext editingContext,
        int line,
        int occurrences
        )
    {
        LoggedError eoObject = (LoggedError)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _LoggedError.ENTITY_NAME);
        eoObject.setLine(line);
        eoObject.setOccurrences(occurrences);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static LoggedError localInstance(
        EOEditingContext editingContext, LoggedError eo)
    {
        return (eo == null)
            ? null
            : (LoggedError)EOUtilities.localInstanceOfObject(
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
    public static LoggedError forId(
        EOEditingContext ec, int id )
    {
        LoggedError obj = null;
        if (id > 0)
        {
            NSArray results = EOUtilities.objectsMatchingKeyAndValue( ec,
                ENTITY_NAME, "id", new Integer( id ) );
            if ( results != null && results.count() > 0 )
            {
                obj = (LoggedError)results.objectAtIndex( 0 );
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
    public static LoggedError forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String COMPONENT_KEY = "component";
    public static final String EXCEPTION_NAME_KEY = "exceptionName";
    public static final String IN_CLASS_KEY = "inClass";
    public static final String IN_METHOD_KEY = "inMethod";
    public static final String LINE_KEY = "line";
    public static final String MESSAGE_KEY = "message";
    public static final String MOST_RECENT_KEY = "mostRecent";
    public static final String OCCURRENCES_KEY = "occurrences";
    public static final String PAGE_KEY = "page";
    public static final String STACK_TRACE_KEY = "stackTrace";
    // To-one relationships ---
    // To-many relationships ---
    // Fetch specifications ---
    public static final String EXCEPTION_LOCATION_FSPEC = "exceptionLocation";
    public static final String ENTITY_NAME = "LoggedError";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public LoggedError localInstance(EOEditingContext editingContext)
    {
        return (LoggedError)EOUtilities.localInstanceOfObject(
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
     * Retrieve this object's <code>component</code> value.
     * @return the value of the attribute
     */
    public String component()
    {
        return (String)storedValueForKey( "component" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>component</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setComponent( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setComponent("
                + value + "): was " + component() );
        }
        takeStoredValueForKey( value, "component" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>exceptionName</code> value.
     * @return the value of the attribute
     */
    public String exceptionName()
    {
        return (String)storedValueForKey( "exceptionName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>exceptionName</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setExceptionName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setExceptionName("
                + value + "): was " + exceptionName() );
        }
        takeStoredValueForKey( value, "exceptionName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>inClass</code> value.
     * @return the value of the attribute
     */
    public String inClass()
    {
        return (String)storedValueForKey( "inClass" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>inClass</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setInClass( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setInClass("
                + value + "): was " + inClass() );
        }
        takeStoredValueForKey( value, "inClass" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>inMethod</code> value.
     * @return the value of the attribute
     */
    public String inMethod()
    {
        return (String)storedValueForKey( "inMethod" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>inMethod</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setInMethod( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setInMethod("
                + value + "): was " + inMethod() );
        }
        takeStoredValueForKey( value, "inMethod" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>line</code> value.
     * @return the value of the attribute
     */
    public int line()
    {
        Number result =
            (Number)storedValueForKey( "line" );
        return ( result == null )
            ? 0
            : result.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>line</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLine( int value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLine("
                + value + "): was " + line() );
        }
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        setLineRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>line</code> value.
     * @return the value of the attribute
     */
    public Number lineRaw()
    {
        return (Number)storedValueForKey( "line" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>line</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLineRaw( Number value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLineRaw("
                + value + "): was " + lineRaw() );
        }
        takeStoredValueForKey( value, "line" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>message</code> value.
     * @return the value of the attribute
     */
    public String message()
    {
        return (String)storedValueForKey( "message" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>message</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMessage( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMessage("
                + value + "): was " + message() );
        }
        takeStoredValueForKey( value, "message" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>mostRecent</code> value.
     * @return the value of the attribute
     */
    public NSTimestamp mostRecent()
    {
        return (NSTimestamp)storedValueForKey( "mostRecent" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>mostRecent</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMostRecent( NSTimestamp value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMostRecent("
                + value + "): was " + mostRecent() );
        }
        takeStoredValueForKey( value, "mostRecent" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>occurrences</code> value.
     * @return the value of the attribute
     */
    public int occurrences()
    {
        Number result =
            (Number)storedValueForKey( "occurrences" );
        return ( result == null )
            ? 0
            : result.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>occurrences</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setOccurrences( int value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOccurrences("
                + value + "): was " + occurrences() );
        }
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        setOccurrencesRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>occurrences</code> value.
     * @return the value of the attribute
     */
    public Number occurrencesRaw()
    {
        return (Number)storedValueForKey( "occurrences" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>occurrences</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setOccurrencesRaw( Number value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOccurrencesRaw("
                + value + "): was " + occurrencesRaw() );
        }
        takeStoredValueForKey( value, "occurrences" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>page</code> value.
     * @return the value of the attribute
     */
    public String page()
    {
        return (String)storedValueForKey( "page" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>page</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setPage( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setPage("
                + value + "): was " + page() );
        }
        takeStoredValueForKey( value, "page" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>stackTrace</code> value.
     * @return the value of the attribute
     */
    public String stackTrace()
    {
        return (String)storedValueForKey( "stackTrace" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>stackTrace</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setStackTrace( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setStackTrace("
                + value + "): was " + stackTrace() );
        }
        takeStoredValueForKey( value, "stackTrace" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>ExceptionLocation</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param lineBinding fetch spec parameter
     * @param methodBinding fetch spec parameter
     * @param classBinding fetch spec parameter
     * @param nameBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForExceptionLocation(
            EOEditingContext context,
            Number lineBinding,
            String methodBinding,
            String classBinding,
            String nameBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "exceptionLocation", "LoggedError" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( lineBinding != null )
            bindings.setObjectForKey( lineBinding,
                                      "line" );
        if ( methodBinding != null )
            bindings.setObjectForKey( methodBinding,
                                      "method" );
        if ( classBinding != null )
            bindings.setObjectForKey( classBinding,
                                      "class" );
        if ( nameBinding != null )
            bindings.setObjectForKey( nameBinding,
                                      "name" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray result = context.objectsWithFetchSpecification( spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForExceptionLocation(ec"
            
                + ", " + lineBinding
                + ", " + methodBinding
                + ", " + classBinding
                + ", " + nameBinding
                + "): " + result );
        }
        return result;
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( LoggedError.class );
}
