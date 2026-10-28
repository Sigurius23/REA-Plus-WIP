package p215i9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import hm.C17417d;
import java.util.ArrayDeque;
import p002a0.C0028i;
import p031b9.C2836h0;

/* JADX INFO: renamed from: i9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C18229e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f70925b;

    /* JADX INFO: renamed from: c */
    public Handler f70926c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f70931h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f70932i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f70933j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f70934k;

    /* JADX INFO: renamed from: l */
    public long f70935l;

    /* JADX INFO: renamed from: m */
    public boolean f70936m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f70937n;

    /* JADX INFO: renamed from: o */
    public C17417d f70938o;

    /* JADX INFO: renamed from: a */
    public final Object f70924a = new Object();

    /* JADX INFO: renamed from: d */
    public final C0028i f70927d = new C0028i();

    /* JADX INFO: renamed from: e */
    public final C0028i f70928e = new C0028i();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f70929f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f70930g = new ArrayDeque();

    public C18229e(HandlerThread handlerThread) {
        this.f70925b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m52498a() {
        ArrayDeque arrayDeque = this.f70930g;
        if (!arrayDeque.isEmpty()) {
            this.f70932i = (MediaFormat) arrayDeque.getLast();
        }
        C0028i c0028i = this.f70927d;
        c0028i.f71c = c0028i.f70b;
        C0028i c0028i2 = this.f70928e;
        c0028i2.f71c = c0028i2.f70b;
        this.f70929f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f70924a) {
            this.f70934k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f70924a) {
            this.f70933j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i13) {
        C2836h0 c2836h0;
        synchronized (this.f70924a) {
            this.f70927d.m68b(i13);
            C17417d c17417d = this.f70938o;
            if (c17417d != null && (c2836h0 = ((AbstractC18239o) c17417d.f67507x).f71004f0) != null) {
                c2836h0.m8130a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        C2836h0 c2836h0;
        synchronized (this.f70924a) {
            try {
                MediaFormat mediaFormat = this.f70932i;
                if (mediaFormat != null) {
                    this.f70928e.m68b(-2);
                    this.f70930g.add(mediaFormat);
                    this.f70932i = null;
                }
                this.f70928e.m68b(i13);
                this.f70929f.add(bufferInfo);
                C17417d c17417d = this.f70938o;
                if (c17417d != null && (c2836h0 = ((AbstractC18239o) c17417d.f67507x).f71004f0) != null) {
                    c2836h0.m8130a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f70924a) {
            this.f70928e.m68b(-2);
            this.f70930g.add(mediaFormat);
            this.f70932i = null;
        }
    }
}
