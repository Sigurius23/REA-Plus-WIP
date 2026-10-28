package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i13);

    Surface createInputSurface();

    int dequeueInputBuffer(long j7);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j7);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i13);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i13);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i13);

    void queueInputBuffer(int i13, int i14, int i15, long j7, int i16);

    void release();

    void releaseOutputBuffer(int i13, boolean z4);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
