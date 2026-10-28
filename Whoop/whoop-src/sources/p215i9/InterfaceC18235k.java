package p215i9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import hm.C17417d;
import java.nio.ByteBuffer;
import mo.C25727h;
import p010a9.C0578c;

/* JADX INFO: renamed from: i9.k */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18235k {
    /* JADX INFO: renamed from: a */
    void mo52483a(int i13, int i14, long j7, int i15);

    /* JADX INFO: renamed from: b */
    void mo52484b(int i13);

    /* JADX INFO: renamed from: c */
    void mo52485c(Surface surface);

    /* JADX INFO: renamed from: d */
    void mo52486d(int i13, long j7);

    /* JADX INFO: renamed from: e */
    int mo52487e();

    /* JADX INFO: renamed from: f */
    int mo52488f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    /* JADX INFO: renamed from: g */
    void mo52489g(int i13, C0578c c0578c, long j7, int i14);

    ByteBuffer getInputBuffer(int i13);

    ByteBuffer getOutputBuffer(int i13);

    MediaFormat getOutputFormat();

    /* JADX INFO: renamed from: h */
    void mo52490h();

    /* JADX INFO: renamed from: i */
    void mo52491i(int i13);

    /* JADX INFO: renamed from: j */
    void mo52492j(C25727h c25727h, Handler handler);

    /* JADX INFO: renamed from: k */
    default boolean mo52493k(C17417d c17417d) {
        return false;
    }

    void release();

    void setParameters(Bundle bundle);
}
