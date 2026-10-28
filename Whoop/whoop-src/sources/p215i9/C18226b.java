package p215i9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.fragment.app.RunnableC1319m;
import hm.C17417d;
import java.nio.ByteBuffer;
import mo.C25727h;
import p002a0.C0028i;
import p010a9.C0578c;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: i9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C18226b implements InterfaceC18235k {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f70905a;

    /* JADX INFO: renamed from: b */
    public final C18229e f70906b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18236l f70907c;

    /* JADX INFO: renamed from: d */
    public final C18233i f70908d;

    /* JADX INFO: renamed from: e */
    public boolean f70909e;

    /* JADX INFO: renamed from: f */
    public int f70910f = 0;

    public C18226b(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC18236l interfaceC18236l, C18233i c18233i) {
        this.f70905a = mediaCodec;
        this.f70906b = new C18229e(handlerThread);
        this.f70907c = interfaceC18236l;
        this.f70908d = c18233i;
    }

    /* JADX INFO: renamed from: l */
    public static void m52481l(C18226b c18226b, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i13) {
        C18233i c18233i;
        C18229e c18229e = c18226b.f70906b;
        MediaCodec mediaCodec = c18226b.f70905a;
        HandlerThread handlerThread = c18229e.f70925b;
        AbstractC35849g.m113807i(c18229e.f70926c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c18229e, handler);
        c18229e.f70926c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i13);
        Trace.endSection();
        c18226b.f70907c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (AbstractC38065t.f163031a >= 35 && (c18233i = c18226b.f70908d) != null) {
            c18233i.m52504a(mediaCodec);
        }
        c18226b.f70910f = 1;
    }

    /* JADX INFO: renamed from: m */
    public static String m52482m(int i13, String str) {
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

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: a */
    public final void mo52483a(int i13, int i14, long j7, int i15) {
        this.f70907c.mo52495a(i13, i14, j7, i15);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: b */
    public final void mo52484b(int i13) {
        this.f70905a.setVideoScalingMode(i13);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: c */
    public final void mo52485c(Surface surface) {
        this.f70905a.setOutputSurface(surface);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: d */
    public final void mo52486d(int i13, long j7) {
        this.f70905a.releaseOutputBuffer(i13, j7);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: e */
    public final int mo52487e() {
        this.f70907c.mo52496b();
        C18229e c18229e = this.f70906b;
        synchronized (c18229e.f70924a) {
            try {
                IllegalStateException illegalStateException = c18229e.f70937n;
                if (illegalStateException != null) {
                    c18229e.f70937n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c18229e.f70933j;
                if (codecException != null) {
                    c18229e.f70933j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c18229e.f70934k;
                if (cryptoException != null) {
                    c18229e.f70934k = null;
                    throw cryptoException;
                }
                int i13 = -1;
                if (c18229e.f70935l > 0 || c18229e.f70936m) {
                    return -1;
                }
                C0028i c0028i = c18229e.f70927d;
                int i14 = c0028i.f70b;
                int i15 = c0028i.f71c;
                if (!(i14 == i15)) {
                    if (i14 == i15) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i13 = ((int[]) c0028i.f73e)[i14];
                    c0028i.f70b = (i14 + 1) & c0028i.f72d;
                }
                return i13;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: f */
    public final int mo52488f(MediaCodec.BufferInfo bufferInfo) {
        this.f70907c.mo52496b();
        C18229e c18229e = this.f70906b;
        synchronized (c18229e.f70924a) {
            try {
                IllegalStateException illegalStateException = c18229e.f70937n;
                if (illegalStateException != null) {
                    c18229e.f70937n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c18229e.f70933j;
                if (codecException != null) {
                    c18229e.f70933j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c18229e.f70934k;
                if (cryptoException != null) {
                    c18229e.f70934k = null;
                    throw cryptoException;
                }
                if (c18229e.f70935l > 0 || c18229e.f70936m) {
                    return -1;
                }
                C0028i c0028i = c18229e.f70928e;
                int i13 = c0028i.f70b;
                int i14 = c0028i.f71c;
                if (i13 == i14) {
                    return -1;
                }
                if (i13 == i14) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i15 = ((int[]) c0028i.f73e)[i13];
                c0028i.f70b = c0028i.f72d & (i13 + 1);
                if (i15 >= 0) {
                    AbstractC35849g.m113808j(c18229e.f70931h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c18229e.f70929f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i15 == -2) {
                    c18229e.f70931h = (MediaFormat) c18229e.f70930g.remove();
                }
                return i15;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p215i9.InterfaceC18235k
    public final void flush() {
        this.f70907c.flush();
        this.f70905a.flush();
        C18229e c18229e = this.f70906b;
        synchronized (c18229e.f70924a) {
            c18229e.f70935l++;
            Handler handler = c18229e.f70926c;
            int i13 = AbstractC38065t.f163031a;
            handler.post(new RunnableC1319m(c18229e, 27));
        }
        this.f70905a.start();
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: g */
    public final void mo52489g(int i13, C0578c c0578c, long j7, int i14) {
        this.f70907c.mo52497g(i13, c0578c, j7, i14);
    }

    @Override // p215i9.InterfaceC18235k
    public final ByteBuffer getInputBuffer(int i13) {
        return this.f70905a.getInputBuffer(i13);
    }

    @Override // p215i9.InterfaceC18235k
    public final ByteBuffer getOutputBuffer(int i13) {
        return this.f70905a.getOutputBuffer(i13);
    }

    @Override // p215i9.InterfaceC18235k
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        C18229e c18229e = this.f70906b;
        synchronized (c18229e.f70924a) {
            try {
                mediaFormat = c18229e.f70931h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mediaFormat;
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: h */
    public final void mo52490h() {
        this.f70905a.detachOutputSurface();
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: i */
    public final void mo52491i(int i13) {
        this.f70905a.releaseOutputBuffer(i13, false);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: j */
    public final void mo52492j(C25727h c25727h, Handler handler) {
        this.f70905a.setOnFrameRenderedListener(new C18225a(this, c25727h, 0), handler);
    }

    @Override // p215i9.InterfaceC18235k
    /* JADX INFO: renamed from: k */
    public final boolean mo52493k(C17417d c17417d) {
        C18229e c18229e = this.f70906b;
        synchronized (c18229e.f70924a) {
            c18229e.f70938o = c17417d;
        }
        return true;
    }

    @Override // p215i9.InterfaceC18235k
    public final void release() {
        C18233i c18233i;
        C18233i c18233i2;
        try {
            if (this.f70910f == 1) {
                this.f70907c.shutdown();
                C18229e c18229e = this.f70906b;
                synchronized (c18229e.f70924a) {
                    c18229e.f70936m = true;
                    c18229e.f70925b.quit();
                    c18229e.m52498a();
                }
            }
            this.f70910f = 2;
            if (this.f70909e) {
                return;
            }
            try {
                int i13 = AbstractC38065t.f163031a;
                if (i13 >= 30 && i13 < 33) {
                    this.f70905a.stop();
                }
            } finally {
                if (AbstractC38065t.f163031a >= 35 && (c18233i2 = this.f70908d) != null) {
                    c18233i2.m52506c(this.f70905a);
                }
                this.f70905a.release();
                this.f70909e = true;
            }
        } catch (Throwable th3) {
            if (!this.f70909e) {
                try {
                    int i14 = AbstractC38065t.f163031a;
                    if (i14 >= 30 && i14 < 33) {
                        this.f70905a.stop();
                    }
                } finally {
                    if (AbstractC38065t.f163031a >= 35 && (c18233i = this.f70908d) != null) {
                        c18233i.m52506c(this.f70905a);
                    }
                    this.f70905a.release();
                    this.f70909e = true;
                }
            }
            throw th3;
        }
    }

    @Override // p215i9.InterfaceC18235k
    public final void setParameters(Bundle bundle) {
        this.f70907c.setParameters(bundle);
    }
}
