/*---------------------------------------------------------------------------*
 * Copyright (c) 2019 McAfee, LLC - All Rights Reserved.                     *
 *---------------------------------------------------------------------------*/

package com.opendxl.streaming.client;

import com.opendxl.streaming.client.entity.ConsumerRecords;
import com.opendxl.streaming.client.exception.PermanentError;
import com.opendxl.streaming.client.exception.TemporaryError;

/**
 * ConsumerRecordProcessor is an interface that must be implemented by the process which receives the consumed records
 */
public interface ConsumerRecordProcessor {

    boolean processCallback(final ConsumerRecords consumerRecords, final String consumerId)
            throws TemporaryError, PermanentError;

}
