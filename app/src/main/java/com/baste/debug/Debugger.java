package com.baste.debug;

import android.util.Log;

import com.baste.BuildConfig;


public class Debugger {
	
	private static boolean isDebug = BuildConfig.DEBUG;
	private static String LOG_TAG = "com.promofarma.android.debug";
	
	/**
	 * Send the given message to the debug console (if enabled)
	 * @param message
	 */
	public static void debug(String message)
	{
		debug(LOG_TAG, message);
	}

    public static void debug(String tag, String message)
    {
        if(isDebug)
            Log.d(tag, message);
    }

    /**
     * Send the given message to the information console
     * @param message
     */
    public static void info(String message)
    {
        if(isDebug)
            Log.i(LOG_TAG, message);
    }

    /**
     * Send the given message to the warning console
     * @param message
     */
	public static void warn(String message)
	{
		warn(LOG_TAG, message);
	}

    public static void warn(String tag, String message)
    {
        if(isDebug)
            Log.w(tag, message);
    }

    public static void error(String message)
    {
        if(isDebug)
            Debugger.error(LOG_TAG, message, null);
    }
	/**
	 * Send the given message to the error console with the given TAG
	 * @param tag
	 * @param message
	 */
	public static void error(String tag, String message)
	{
		if(isDebug)
			Debugger.error(tag, message, null);
	}

	/**
	 * Send the given message to the error console with the given TAG
	 * @param tag
	 * @param message
	 * @param error
	 */
	public static void error(String tag, String message, Throwable error)
	{
		if(error != null)
			Log.e(tag, message, error);
		else
			Log.e(tag, message);
	}
}
