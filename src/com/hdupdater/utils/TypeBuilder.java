/*	
	Copyright 2012 Jan Ove Saltvedt
	
	This file is part of KBot.

    KBot is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    KBot is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with KBot.  If not, see <http://www.gnu.org/licenses/>.
	
*/



package com.hdupdater.utils;

import com.sun.org.apache.bcel.internal.generic.Type;
import com.sun.org.apache.bcel.internal.generic.ObjectType;
import com.sun.org.apache.bcel.internal.generic.ArrayType;
import com.hdupdater.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Jan Ove Saltvedt
 * Date: Oct 16, 2009
 * Time: 8:05:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TypeBuilder {

    public static Type createHookType(String className){
        return new ObjectType(Constants.PACKAGE_HOOK+"."+className);
    }

    public static Type createHookArrayType(String className, int dimensions){
        return new ArrayType(new ObjectType(Constants.PACKAGE_HOOK+"."+className), dimensions);
    }
}
