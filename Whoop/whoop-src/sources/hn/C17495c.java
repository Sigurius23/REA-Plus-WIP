package hn;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.session.HandlerC1074h;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import mo.C25727h;
import p010a9.C0578c;
import p094dn.C12185e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: hn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17495c implements InterfaceC17503k {

    /* JADX INFO: renamed from: E */
    public boolean f67614E;

    /* JADX INFO: renamed from: w */
    public final MediaCodec f67616w;

    /* JADX INFO: renamed from: x */
    public final C17498f f67617x;

    /* JADX INFO: renamed from: y */
    public final C17497e f67618y;

    /* JADX INFO: renamed from: z */
    public final boolean f67619z = true;

    /* JADX INFO: renamed from: F */
    public int f67615F = 0;

    public C17495c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f67616w = mediaCodec;
        this.f67617x = new C17498f(handlerThread);
        this.f67618y = new C17497e(mediaCodec, handlerThread2);
    }

    /* JADX INFO: renamed from: g */
    public static void m49684g(C17495c c17495c, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        C17498f c17498f = c17495c.f67617x;
        MediaCodec mediaCodec = c17495c.f67616w;
        HandlerThread handlerThread = c17498f.f67634b;
        AbstractC24543a.m71573i(c17498f.f67635c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c17498f, handler);
        c17498f.f67635c = handler;
        AbstractC24543a.m71567c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC24543a.m71579o();
        C17497e c17497e = c17495c.f67618y;
        HandlerThread handlerThread2 = c17497e.f67628b;
        if (!c17497e.f67632f) {
            handlerThread2.start();
            c17497e.f67629c = new HandlerC1074h(c17497e, handlerThread2.getLooper(), 1);
            c17497e.f67632f = true;
        }
        AbstractC24543a.m71567c("startCodec");
        mediaCodec.start();
        AbstractC24543a.m71579o();
        c17495c.f67615F = 1;
    }

    /* JADX INFO: renamed from: h */
    public static String m49685h(int i13, String str) {
        StringBuilder sb4 = new StringBuilder(str);
        if (i13 == 1) {
            sb4.append("Audio");
        } else if (i13 == 2) {
            sb4.append("Video");
        } else {
            sb4.append("Unknown(");
            sb4.append(i13);
            sb4.append(")");
        }
        return sb4.toString();
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: a */
    public final void mo45158a(int i13, int i14, long j7, int i15) {
        C17497e c17497e = this.f67618y;
        RuntimeException runtimeException = (RuntimeException) c17497e.f67630d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C17496d c17496dM49686b = C17497e.m49686b();
        c17496dM49686b.f67620a = i13;
        c17496dM49686b.f67621b = i14;
        c17496dM49686b.f67623d = j7;
        c17496dM49686b.f67624e = i15;
        HandlerC1074h handlerC1074h = c17497e.f67629c;
        int i16 = AbstractC24567y.f95875a;
        handlerC1074h.obtainMessage(0, c17496dM49686b).sendToTarget();
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: b */
    public final void mo45159b(int i13) {
        this.f67616w.setVideoScalingMode(i13);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: c */
    public final void mo45160c(Surface surface) {
        this.f67616w.setOutputSurface(surface);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: d */
    public final void mo45161d(int i13, long j7) {
        this.f67616w.releaseOutputBuffer(i13, j7);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: e */
    public final int mo45162e() {
        C17498f c17498f = this.f67617x;
        synchronized (c17498f.f67633a) {
            try {
                boolean z4 = true;
                int iM33789h = -1;
                if (c17498f.f67643k > 0 || c17498f.f67644l) {
                    return -1;
                }
                IllegalStateException illegalStateException = c17498f.f67645m;
                if (illegalStateException != null) {
                    c17498f.f67645m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c17498f.f67642j;
                if (codecException != null) {
                    c17498f.f67642j = null;
                    throw codecException;
                }
                C12185e c12185e = c17498f.f67636d;
                if (c12185e.f40626z != 0) {
                    z4 = false;
                }
                if (!z4) {
                    iM33789h = c12185e.m33789h();
                }
                return iM33789h;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: f */
    public final int mo45163f(MediaCodec.BufferInfo bufferInfo) {
        C17498f c17498f = this.f67617x;
        synchronized (c17498f.f67633a) {
            try {
                boolean z4 = true;
                if (c17498f.f67643k > 0 || c17498f.f67644l) {
                    return -1;
                }
                IllegalStateException illegalStateException = c17498f.f67645m;
                if (illegalStateException != null) {
                    c17498f.f67645m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c17498f.f67642j;
                if (codecException != null) {
                    c17498f.f67642j = null;
                    throw codecException;
                }
                C12185e c12185e = c17498f.f67637e;
                if (c12185e.f40626z != 0) {
                    z4 = false;
                }
                if (z4) {
                    return -1;
                }
                int iM33789h = c12185e.m33789h();
                if (iM33789h >= 0) {
                    AbstractC24543a.m71574j(c17498f.f67640h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c17498f.f67638f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iM33789h == -2) {
                    c17498f.f67640h = (MediaFormat) c17498f.f67639g.remove();
                }
                return iM33789h;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hn.InterfaceC17503k
    public final void flush() {
        this.f67618y.m49687a();
        MediaCodec mediaCodec = this.f67616w;
        mediaCodec.flush();
        boolean z4 = this.f67619z;
        C17498f c17498f = this.f67617x;
        if (!z4) {
            c17498f.m49688a(mediaCodec);
        } else {
            c17498f.m49688a(null);
            mediaCodec.start();
        }
    }

    @Override // hn.InterfaceC17503k
    public final ByteBuffer getInputBuffer(int i13) {
        return this.f67616w.getInputBuffer(i13);
    }

    @Override // hn.InterfaceC17503k
    public final ByteBuffer getOutputBuffer(int i13) {
        return this.f67616w.getOutputBuffer(i13);
    }

    @Override // hn.InterfaceC17503k
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        C17498f c17498f = this.f67617x;
        synchronized (c17498f.f67633a) {
            try {
                mediaFormat = c17498f.f67640h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mediaFormat;
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: r */
    public final void mo45168r(int i13, C0578c c0578c, long j7) {
        C17497e c17497e = this.f67618y;
        RuntimeException runtimeException = (RuntimeException) c17497e.f67630d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        C17496d c17496dM49686b = C17497e.m49686b();
        c17496dM49686b.f67620a = i13;
        c17496dM49686b.f67621b = 0;
        c17496dM49686b.f67623d = j7;
        c17496dM49686b.f67624e = 0;
        MediaCodec.CryptoInfo cryptoInfo = c17496dM49686b.f67622c;
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
        if (AbstractC24567y.f95875a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c0578c.f2059g, c0578c.f2060h));
        }
        c17497e.f67629c.obtainMessage(1, c17496dM49686b).sendToTarget();
    }

    @Override // hn.InterfaceC17503k
    public final void release() {
        try {
            if (this.f67615F == 1) {
                C17497e c17497e = this.f67618y;
                if (c17497e.f67632f) {
                    c17497e.m49687a();
                    c17497e.f67628b.quit();
                }
                c17497e.f67632f = false;
                C17498f c17498f = this.f67617x;
                synchronized (c17498f.f67633a) {
                    c17498f.f67644l = true;
                    c17498f.f67634b.quit();
                    c17498f.m49689b();
                }
            }
            this.f67615F = 2;
            if (this.f67614E) {
                return;
            }
            this.f67616w.release();
            this.f67614E = true;
        } catch (Throwable th3) {
            if (!this.f67614E) {
                this.f67616w.release();
                this.f67614E = true;
            }
            throw th3;
        }
    }

    @Override // hn.InterfaceC17503k
    public final void releaseOutputBuffer(int i13, boolean z4) {
        this.f67616w.releaseOutputBuffer(i13, z4);
    }

    @Override // hn.InterfaceC17503k
    public final void setParameters(Bundle bundle) {
        this.f67616w.setParameters(bundle);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: t */
    public final void mo45169t(C25727h c25727h, Handler handler) {
        this.f67616w.setOnFrameRenderedListener(new C17493a(this, c25727h, 0), handler);
    }
}
