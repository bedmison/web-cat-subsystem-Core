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

import com.webobjects.foundation.*;
import com.webobjects.foundation.NSValidation.*;
import com.webobjects.eocontrol.*;

// -------------------------------------------------------------------------
/**
 * Represents one course, which may be taught multiple times in different
 * semesters (represented by separate course offerings).
 *
 * @author Stephen Edwards
 * @version $Id$
 */
public class Course
    extends _Course
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Course object.
     */
    public Course()
    {
        super();
    }


    //~ Constants (for key names) .............................................

    // Derived Attributes ---
    public static final String iNSTITUTION_KEY  =
        DEPARTMENT_KEY + "." + Department.INSTITUTION_KEY;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Returns the course's department abbreviation combined with
     * the course's number (e.g., "CS 1705").
     * @return the department abbreviation and the course number
     */
    public String deptNumber()
    {
        return department().abbreviation() + " " + number();
    }


    // ----------------------------------------------------------
    /**
     * Returns the course's department abbreviation combined with
     * the course's number (e.g., "CS 1705").
     * @return the department abbreviation and the course number
     */
    public String deptNumberAndName()
    {
        return deptNumber() + ": " + name();
    }


    // ----------------------------------------------------------
    /**
     * Get a short (no longer than 60 characters) description of this coursse,
     * which currently returns {@link #deptNumber()}.
     * @return the description
     */
    public String userPresentableDescription()
    {
        return deptNumber();
    }


    // ----------------------------------------------------------
    /**
     * Get a human-readable representation of this course, which is
     * the same as {@link #userPresentableDescription()}.
     * @return this course's short name
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    // ----------------------------------------------------------
    public Object validateNumber( Object value )
    {
        if ( value == null )
        {
            throw new ValidationException(
                "Please provide a course number." );
        }
        return value;
    }

}
