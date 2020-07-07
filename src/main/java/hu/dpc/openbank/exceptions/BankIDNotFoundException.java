/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */

package hu.dpc.openbank.exceptions;

public class BankIDNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 8681158276278608889L;


  public BankIDNotFoundException(final String bankId) {
    super("BankID not found [" + bankId + "]!");
  }

}

