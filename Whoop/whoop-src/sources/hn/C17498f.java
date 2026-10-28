package hn;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p009a8.RunnableC0533c;
import p094dn.C12185e;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: hn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17498f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f67634b;

    /* JADX INFO: renamed from: c */
    public Handler f67635c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f67640h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f67641i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f67642j;

    /* JADX INFO: renamed from: k */
    public long f67643k;

    /* JADX INFO: renamed from: l */
    public boolean f67644l;

    /* JADX INFO: renamed from: m */
    public IllegalStateException f67645m;

    /* JADX INFO: renamed from: a */
    public final Object f67633a = new Object();

    /* JADX INFO: renamed from: d */
    public final C12185e f67636d = new C12185e();

    /* JADX INFO: renamed from: e */
    public final C12185e f67637e = new C12185e();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f67638f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f67639g = new ArrayDeque();

    public C17498f(HandlerThread handlerThread) {
        this.f67634b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m49688a(MediaCodec mediaCodec) {
        synchronized (this.f67633a) {
            this.f67643k++;
            Handler handler = this.f67635c;
            int i13 = AbstractC24567y.f95875a;
            handler.post(new RunnableC0533c(22, this, mediaCodec));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m49689b() {
        ArrayDeque arrayDeque = this.f67639g;
        if (!arrayDeque.isEmpty()) {
            this.f67641i = (MediaFormat) arrayDeque.getLast();
        }
        C12185e c12185e = this.f67636d;
        c12185e.f40624x = 0;
        c12185e.f40625y = -1;
        c12185e.f40626z = 0;
        C12185e c12185e2 = this.f67637e;
        c12185e2.f40624x = 0;
        c12185e2.f40625y = -1;
        c12185e2.f40626z = 0;
        this.f67638f.clear();
        arrayDeque.clear();
        this.f67642j = null;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f67633a) {
            this.f67642j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i13) {
        synchronized (this.f67633a) {
            this.f67636d.m33785d(i13);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f67633a) {
            try {
                MediaFormat mediaFormat = this.f67641i;
                if (mediaFormat != null) {
                    this.f67637e.m33785d(-2);
                    this.f67639g.add(mediaFormat);
                    this.f67641i = null;
                }
                this.f67637e.m33785d(i13);
                this.f67638f.add(bufferInfo);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f67633a) {
            this.f67637e.m33785d(-2);
            this.f67639g.add(mediaFormat);
            this.f67641i = null;
        }
    }
}
