package com.kodewerk.jheappo.objects;

/*
 * Copyright (c) 2018 Kirk Pepperdine.
 * Licensed under https://github.com/AdoptOpenJDK/jheappo/blob/master/LICENSE
 * Instructions: https://github.com/AdoptOpenJDK/jheappo/wiki
 */

import com.kodewerk.jheappo.io.HeapDumpBuffer;

/*
    0x01  | ID      | object ID
          | ID      | JNI global ref ID
 */
public class RootJNIGlobal extends HeapData {

    public static final int TAG = 0x01;

    private long objectID;
    private long jniGlobalRefID;

    public RootJNIGlobal(HeapDumpBuffer buffer) {
        objectID = buffer.extractID();
        jniGlobalRefID = buffer.extractID();
    }

    public String toString() {
        return "RootJNIGlobal : " + objectID + ":" + jniGlobalRefID;
    }
}
