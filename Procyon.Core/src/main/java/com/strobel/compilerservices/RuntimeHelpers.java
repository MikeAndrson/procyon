/*
 * RuntimeHelpers.java
 *
 * Copyright (c) 2012 Mike Strobel
 *
 * This source code is subject to terms and conditions of the Apache License, Version 2.0.
 * A copy of the license can be found in the License.html file at the root of this distribution.
 * By using this source code in any fashion, you are agreeing to be bound by the terms of the
 * Apache License, Version 2.0.
 *
 * You must not remove this notice, or any other, from this software.
 */

package com.strobel.compilerservices;

import com.strobel.core.VerifyArgument;
import com.strobel.util.ContractUtils;

/**
 * @author strobelm
 */
public final class RuntimeHelpers {
    private RuntimeHelpers() {
        throw ContractUtils.unreachable();
    }

    public static void ensureClassInitialized(final Class<?> clazz) {
        VerifyArgument.notNull(clazz, "clazz");
        
        // Don't do anything here.
        // This method originally calls sun.misc.Unsafe#ensureClassInitialized
        // which doesn't exist on Android, leading to crashes.
    }
}
