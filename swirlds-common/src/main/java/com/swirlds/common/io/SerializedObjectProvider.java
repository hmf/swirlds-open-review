/*
 * (c) 2016-2020 Swirlds, Inc.
 *
 * This software is owned by Swirlds, Inc., which retains title to the software. This software is protected by various
 * intellectual property laws throughout the world, including copyright and patent laws. This software is licensed and
 * not sold. You must use this software only in accordance with the terms of the Hashgraph Open Review license at
 *
 * https://github.com/hashgraph/swirlds-open-review/raw/master/LICENSE.md
 *
 * SWIRLDS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THIS SOFTWARE, EITHER EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * OR NON-INFRINGEMENT.
 */

package com.swirlds.common.io;

import com.swirlds.common.FastCopyable;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * A functional interface to deserialize object from input stream. The class should implement {@link FastCopyable} or its
 * derived interface.
 */
@FunctionalInterface
public interface SerializedObjectProvider<T extends FastCopyable<T>> {

	/**
	 * Deserialize the input stream to restore the object.
	 *
	 * @param inputStream
	 * 		The stream to read from
	 * 		The object type that restored from the deserialization.
	 * @return A instance of a class that implements {@link FastCopyable} or its derived interface.
	 * @throws IOException
	 * 		Exception related to the input stream.
	 */
	 T deserialize(DataInputStream inputStream) throws IOException;
}