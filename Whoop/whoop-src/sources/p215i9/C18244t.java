package p215i9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import mo.C25727h;
import p010a9.C0578c;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: i9.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C18244t implements InterfaceC18235k {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f71029a;

    /* JADX INFO: renamed from: b */
    public final C18233i f71030b;

    public C18244t(MediaCodec mediaCodec, C18233i c18233i) {
        this.f71029a = mediaCodec;
        this.f71030b = c18233i;
        if (AbstractC38065t.f163031a < 35 || c18233i == null) {
            return;
        }
        c18233i.m52504a(mediaCodec);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: a */
    public final void mo52483a(int i13, int i14, long j7, int i15) {
        this.f71029a.queueInputBuffer(i13, 0, i14, j7, i15);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: b */
    public final void mo52484b(int i13) {
        this.f71029a.setVideoScalingMode(i13);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: c */
    public final void mo52485c(Surface surface) {
        this.f71029a.setOutputSurface(surface);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: d */
    public final void mo52486d(int i13, long j7) {
        this.f71029a.releaseOutputBuffer(i13, j7);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: e */
    public final int mo52487e() {
        return this.f71029a.dequeueInputBuffer(0L);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: f */
    public final int mo52488f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f71029a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p215i9.InterfaceC18235k
    public final void flush() {
        this.f71029a.flush();
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: g */
    public final void mo52489g(int i13, C0578c c0578c, long j7, int i14) {
        this.f71029a.queueSecureInputBuffer(i13, 0, c0578c.f2061i, j7, i14);
    }

    @Override // p215i9.InterfaceC18235k
    public final ByteBuffer getInputBuffer(int i13) {
        return this.f71029a.getInputBuffer(i13);
    }

    @Override // p215i9.InterfaceC18235k
    public final ByteBuffer getOutputBuffer(int i13) {
        return this.f71029a.getOutputBuffer(i13);
    }

    @Override // p215i9.InterfaceC18235k
    public final MediaFormat getOutputFormat() {
        return this.f71029a.getOutputFormat();
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: h */
    public final void mo52490h() {
        this.f71029a.detachOutputSurface();
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: i */
    public final void mo52491i(int i13) {
        this.f71029a.releaseOutputBuffer(i13, false);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: j */
    public final void mo52492j(C25727h c25727h, Handler handler) {
        this.f71029a.setOnFrameRenderedListener(new C18225a(this, c25727h, 1), handler);
    }

    @Override // p215i9.InterfaceC18235k
    public final void release() {
        C18233i c18233i = this.f71030b;
        MediaCodec mediaCodec = this.f71029a;
        try {
            int i13 = AbstractC38065t.f163031a;
            if (i13 >= 30 && i13 < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (AbstractC38065t.f163031a >= 35 && c18233i != null) {
                c18233i.m52506c(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // p215i9.InterfaceC18235k
    public final void setParameters(Bundle bundle) {
        this.f71029a.setParameters(bundle);
    }
}
