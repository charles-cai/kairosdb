/*
 * Copyright 2013 Proofpoint Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.kairosdb.core.telnet;

import org.kairosdb.core.exception.DatastoreException;
import org.jboss.netty.channel.Channel;

public class VersionCommand implements TelnetCommand
{
	@Override
	public void execute(Channel chan, String[] command) throws DatastoreException
	{
		if (chan.isConnected())
		{
			//TODO fix this to return a real version
			chan.write("KairosDB2\nAlpha\n");
		}
	}
}
