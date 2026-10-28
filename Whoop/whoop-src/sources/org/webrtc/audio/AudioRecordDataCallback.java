package org.webrtc.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioRecordDataCallback {
    void onAudioDataRecorded(int i13, int i14, int i15, ByteBuffer byteBuffer);
}
