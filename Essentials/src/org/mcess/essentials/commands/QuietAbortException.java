package org.mcess.essentials.commands;


public class QuietAbortException extends Exception
{
	public QuietAbortException()
	{
		super();
	}

	public QuietAbortException(String message)
	{
		super(message);
	}
}