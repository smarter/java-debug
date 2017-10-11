/*******************************************************************************
* Copyright (c) 2017 Microsoft Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Microsoft Corporation - initial API and implementation
*******************************************************************************/

package com.microsoft.java.debug.core;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This helper class provides static methods for a default instance of <code>java.util.logging.Logger</code>,a simple code like
 * <code>Log.info("Sample trace: %d", 10)</code> is able to replace <code>logger.info(String.format("Sample trace: %d", 10))</code>.
 * Using a very short name to better code fitness.
 */
public final class Log {
    private static final Logger logger = Logger.getLogger(Configuration.LOGGER_NAME);

    /**
     * Log an ERROR message.
     *
     * @param ex The exception object
     * @param message The string message
     * @param arguments Arguments referenced by the format specifiers in the message
     */
    public static void error(Exception ex, String message, Object... arguments) {
        logger.log(Level.SEVERE, String.format(message, arguments), ex);
    }


    /**
     * Log an ERROR message.
     *
     * @param message The string message
     * @param arguments Arguments referenced by the format specifiers in the message
     */
    public static void error(String message, Object... arguments) {
        logger.severe(String.format(message, arguments));
    }

    /**
     * Log a INFO message.
     *
     * @param message The string message
     * @param arguments Arguments referenced by the format specifiers in the message
     *         string.
     */
    public static void info(String message, Object... arguments) {
        logger.info(String.format(message, arguments));
    }

    /**
     * Log a WARN message.
     *
     * @param message The string message
     * @param arguments Arguments referenced by the format specifiers in the message
     */
    public static void warn(String message, Object... arguments) {
        logger.warning(String.format(message, arguments));
    }

    /**
     * Log a DEBUG message.
     *
     * @param message The string message
     * @param arguments Arguments referenced by the format specifiers in the message
     */
    public static void debug(String message, Object... arguments) {
        logger.fine(String.format(message, arguments));
    }


    /**
     * Set the log level specifying which message levels will be
     * logged by this logger.  Message levels lower than this
     * value will be discarded.  The level value Level.OFF
     * can be used to turn off logging.
     *
     * @param newLevel   the new value for the log level (may be null)
     */
    public static void setLevel(Level newLevel) {
        logger.setLevel(newLevel);
    }

    /**
     * Add a log Handler to receive logging messages.
     * @param   handler a logging Handler
     */
    public static void addHandler(Handler handler) {
        logger.addHandler(handler);
    }

    /**
     * Remove a log Handler.
     * Returns silently if the given Handler is not found or is null
     *
     * @param   handler a logging Handler
     */
    public void removeHandler(Handler handler) throws SecurityException {
        logger.removeHandler(handler);
    }


    private Log() {

    }
}
