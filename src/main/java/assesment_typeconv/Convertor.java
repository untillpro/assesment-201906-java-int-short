/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */


package assesment_typeconv;

public class Convertor {
	public static Cracked crack(long value) {
		return new Cracked(0, 0);		
	}
	public static long  uncrack(Cracked cracked ) {
		return 0;
	}
}
