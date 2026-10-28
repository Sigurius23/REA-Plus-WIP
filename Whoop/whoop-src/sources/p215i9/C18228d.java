package p215i9;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v4.media.session.HandlerC1074h;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.C0578c;
import p031b9.C2852m1;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: i9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18228d implements InterfaceC18236l {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f70916g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f70917h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f70918a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f70919b;

    /* JADX INFO: renamed from: c */
    public HandlerC1074h f70920c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f70921d;

    /* JADX INFO: renamed from: e */
    public final C2852m1 f70922e;

    /* JADX INFO: renamed from: f */
    public boolean f70923f;

    public C18228d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C2852m1 c2852m1 = new C2852m1(7);
        this.f70918a = mediaCodec;
        this.f70919b = handlerThread;
        this.f70922e = c2852m1;
        this.f70921d = new AtomicReference();
    }

    /* JADX INFO: renamed from: c */
    public static C18227c m52494c() {
        ArrayDeque arrayDeque = f70916g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C18227c();
                }
                return (C18227c) arrayDeque.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p215i9.InterfaceC18236l
    /* JADX INFO: renamed from: a */
    public final void mo52495a(int i13, int i14, long j7, int i15) {
        mo52496b();
        C18227c c18227cM52494c = m52494c();
        c18227cM52494c.f70911a = i13;
        c18227cM52494c.f70912b = i14;
        c18227cM52494c.f70914d = j7;
        c18227cM52494c.f70915e = i15;
        HandlerC1074h handlerC1074h = this.f70920c;
        int i16 = AbstractC38065t.f163031a;
        handlerC1074h.obtainMessage(1, c18227cM52494c).sendToTarget();
    }

    @Override // p215i9.InterfaceC18236l
    /* JADX INFO: renamed from: b */
    public final void mo52496b() {
        RuntimeException runtimeException = (RuntimeException) this.f70921d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p215i9.InterfaceC18236l
    public final void flush() {
        if (this.f70923f) {
            try {
                HandlerC1074h handlerC1074h = this.f70920c;
                handlerC1074h.getClass();
                handlerC1074h.removeCallbacksAndMessages(null);
                C2852m1 c2852m1 = this.f70922e;
                synchronized (c2852m1) {
                    c2852m1.f11320x = false;
                }
                HandlerC1074h handlerC1074h2 = this.f70920c;
                handlerC1074h2.getClass();
                handlerC1074h2.obtainMessage(3).sendToTarget();
                synchronized (c2852m1) {
                    while (!c2852m1.f11320x) {
                        c2852m1.wait();
                    }
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e5);
            }
        }
    }

    @Override // p215i9.InterfaceC18236l
    /* JADX INFO: renamed from: g */
    public final void mo52497g(int i13, C0578c c0578c, long j7, int i14) {
        mo52496b();
        C18227c c18227cM52494c = m52494c();
        c18227cM52494c.f70911a = i13;
        c18227cM52494c.f70912b = 0;
        c18227cM52494c.f70914d = j7;
        c18227cM52494c.f70915e = i14;
        MediaCodec.CryptoInfo cryptoInfo = c18227cM52494c.f70913c;
        cryptoInfo.numSubSamples = c0578c.f2058f;
        int[] iArr = c0578c.f2056d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c0578c.f2057e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c0578c.f2054b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c0578c.f2053a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c0578c.f2055c;
        if (AbstractC38065t.f163031a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c0578c.f2059g, c0578c.f2060h));
        }
        this.f70920c.obtainMessage(2, c18227cM52494c).sendToTarget();
    }

    @Override // p215i9.InterfaceC18236l
    public final void setParameters(Bundle bundle) {
        mo52496b();
        HandlerC1074h handlerC1074h = this.f70920c;
        int i13 = AbstractC38065t.f163031a;
        handlerC1074h.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p215i9.InterfaceC18236l
    public final void shutdown() {
        if (this.f70923f) {
            flush();
            this.f70919b.quit();
        }
        this.f70923f = false;
    }

    @Override // p215i9.InterfaceC18236l
    public final void start() {
        if (this.f70923f) {
            return;
        }
        HandlerThread handlerThread = this.f70919b;
        handlerThread.start();
        this.f70920c = new HandlerC1074h(this, handlerThread.getLooper(), 2);
        this.f70923f = true;
    }
}
