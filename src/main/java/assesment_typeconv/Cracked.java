/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */


package assesment_typeconv;

public class Cracked {
	@Override
	public String toString() {
		return "Cracked [hi=" + hi + ", low=" + low + "]";
	}
	public short hi;
	public short low;
	public Cracked(short hi, short low) {
		this.hi = hi;
		this.low = low;		
	}
}
