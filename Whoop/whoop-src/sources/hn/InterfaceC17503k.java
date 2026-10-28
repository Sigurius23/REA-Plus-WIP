package hn;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import mo.C25727h;
import p010a9.C0578c;

/* JADX INFO: renamed from: hn.k */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17503k {
    /* JADX INFO: renamed from: a */
    void mo45158a(int i13, int i14, long j7, int i15);

    /* JADX INFO: renamed from: b */
    void mo45159b(int i13);

    /* JADX INFO: renamed from: c */
    void mo45160c(Surface surface);

    /* JADX INFO: renamed from: d */
    void mo45161d(int i13, long j7);

    /* JADX INFO: renamed from: e */
    int mo45162e();

    /* JADX INFO: renamed from: f */
    int mo45163f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    ByteBuffer getInputBuffer(int i13);

    ByteBuffer getOutputBuffer(int i13);

    MediaFormat getOutputFormat();

    /* JADX INFO: renamed from: r */
    void mo45168r(int i13, C0578c c0578c, long j7);

    void release();

    void releaseOutputBuffer(int i13, boolean z4);

    void setParameters(Bundle bundle);

    /* JADX INFO: renamed from: t */
    void mo45169t(C25727h c25727h, Handler handler);
}
