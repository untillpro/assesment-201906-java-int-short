/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

import org.junit.Test;
import static org.junit.Assert.fail;

public class ConvertorTest {
	
	@Test
	public void crackUncrack() {
		System.out.println(Convertor.crack(0));
		System.out.println(Convertor.uncrack(Convertor.crack(0)));
		fail("Not implemented yet");
	}
}
