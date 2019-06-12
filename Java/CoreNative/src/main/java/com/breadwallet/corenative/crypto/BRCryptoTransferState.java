/*
 * Created by Michael Carrara <michael.carrara@breadwallet.com> on 5/31/18.
 * Copyright (c) 2018 Breadwinner AG.  All right reserved.
 *
 * See the LICENSE file at the project root for license information.
 * See the CONTRIBUTORS file at the project root for a list of contributors.
 */
package com.breadwallet.corenative.crypto;

public interface BRCryptoTransferState {

    int CRYPTO_TRANSFER_STATE_CREATED = 0;
    int CRYPTO_TRANSFER_STATE_SIGNED = 1;
    int CRYPTO_TRANSFER_STATE_SUBMITTED = 2;
    int CRYPTO_TRANSFER_STATE_INCLUDED = 3;
    int CRYPTO_TRANSFER_STATE_ERRORRED = 4;
    int CRYPTO_TRANSFER_STATE_DELETED = 5;
}