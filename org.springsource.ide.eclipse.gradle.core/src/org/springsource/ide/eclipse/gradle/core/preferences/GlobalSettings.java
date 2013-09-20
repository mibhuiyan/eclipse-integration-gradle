/*******************************************************************************
 * Copyright (c) 2012 GoPivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * GoPivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springsource.ide.eclipse.gradle.core.preferences;

/**
 * @author Kris De Volder
 */
public class GlobalSettings {
	
	/**
	 * Enables/disables some debugging output
	 */
	public static final boolean DEBUG = false;

	//Removed: 
	//public static final boolean exportClasspathContainer = true; 
	//public static final boolean exportClasspathContainerEntries = true;  
	//Now should follow the workspace preference.
	
	public static boolean exportProjectEntries = true;

}
