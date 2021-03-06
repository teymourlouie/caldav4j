/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.caldav4j.functional;

import com.github.caldav4j.credential.CaldavCredential;
import com.github.caldav4j.dialect.CalDavDialect;
import com.github.caldav4j.dialect.ChandlerCalDavDialect;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FreeBusyQueryFunctionalTestSuite extends FreeBusyQueryFunctionalTest {
	public FreeBusyQueryFunctionalTestSuite(CaldavCredential credential,
			CalDavDialect dialect) {
		super(credential, dialect);
	}

	@Parameters
	public static Collection<Object[]> getCaldavCredentials() {
		return Arrays.asList(new Object[][] {
				{new CaldavCredential(), new ChandlerCalDavDialect()}
				// ,{new BedeworkCaldavCredential(), new BedeworkCalDavDialect()}
				// TODO Google doesn't support FB
				// , {new GCaldavCredential(), new GoogleCalDavDialect()} 

		});
	}

	
}
