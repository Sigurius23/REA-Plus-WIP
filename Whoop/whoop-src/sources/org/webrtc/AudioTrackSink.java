package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioTrackSink {
    @CalledByNative
    void onData(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16, long j7);
}
