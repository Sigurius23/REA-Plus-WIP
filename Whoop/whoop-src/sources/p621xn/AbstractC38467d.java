package p621xn;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import no.nordicsemi.android.dfu.DfuBaseService;
import p010a9.C0582g;
import p309lo.AbstractC24543a;
import p527um.C35073c;
import p527um.InterfaceC35072b;

/* JADX INFO: renamed from: xn.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38467d implements InterfaceC38469f, InterfaceC35072b {

    /* JADX INFO: renamed from: a */
    public final C0582g f164747a;

    /* JADX INFO: renamed from: f */
    public final C38466c[] f164752f;

    /* JADX INFO: renamed from: h */
    public int f164754h;

    /* JADX INFO: renamed from: i */
    public C35073c f164755i;

    /* JADX INFO: renamed from: j */
    public SubtitleDecoderException f164756j;

    /* JADX INFO: renamed from: k */
    public boolean f164757k;

    /* JADX INFO: renamed from: l */
    public boolean f164758l;

    /* JADX INFO: renamed from: b */
    public final Object f164748b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f164749c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f164750d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final C35073c[] f164751e = new C38471h[2];

    /* JADX INFO: renamed from: g */
    public int f164753g = 2;

    public AbstractC38467d() {
        C38466c[] c38466cArr = new C38466c[2];
        int i13 = 0;
        while (true) {
            if (i13 >= this.f164753g) {
                break;
            }
            this.f164751e[i13] = new C38471h(1);
            i13++;
        }
        this.f164752f = c38466cArr;
        this.f164754h = 2;
        for (int i14 = 0; i14 < this.f164754h; i14++) {
            this.f164752f[i14] = new C38466c(this, 1);
        }
        C0582g c0582g = new C0582g(this, 2);
        this.f164747a = c0582g;
        c0582g.start();
        int i15 = this.f164753g;
        C35073c[] c35073cArr = this.f164751e;
        AbstractC24543a.m71573i(i15 == c35073cArr.length);
        for (C35073c c35073c : c35073cArr) {
            c35073c.m110918q(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        }
    }

    @Override // p621xn.InterfaceC38469f
    /* JADX INFO: renamed from: a */
    public final void mo35859a(long j7) {
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: b */
    public final Object mo35860b() {
        synchronized (this.f164748b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f164756j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.f164750d.isEmpty()) {
                    return null;
                }
                return (C38466c) this.f164750d.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: c */
    public final Object mo35861c() {
        C35073c c35073c;
        synchronized (this.f164748b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f164756j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                AbstractC24543a.m71573i(this.f164755i == null);
                int i13 = this.f164753g;
                if (i13 == 0) {
                    c35073c = null;
                } else {
                    C35073c[] c35073cArr = this.f164751e;
                    int i14 = i13 - 1;
                    this.f164753g = i14;
                    c35073c = c35073cArr[i14];
                }
                this.f164755i = c35073c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c35073c;
    }

    @Override // p527um.InterfaceC35072b
    /* JADX INFO: renamed from: d */
    public final void mo35862d(C38471h c38471h) {
        synchronized (this.f164748b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f164756j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                AbstractC24543a.m71569e(c38471h == this.f164755i);
                this.f164749c.addLast(c38471h);
                if (!this.f164749c.isEmpty() && this.f164754h > 0) {
                    this.f164748b.notify();
                }
                this.f164755i = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final SubtitleDecoderException m123262e(C35073c c35073c, C38466c c38466c, boolean z4) {
        C38471h c38471h = (C38471h) c35073c;
        try {
            ByteBuffer byteBuffer = c38471h.f148801z;
            byteBuffer.getClass();
            c38466c.m123261p(c38471h.f148797F, mo5527f(byteBuffer.limit(), z4, byteBuffer.array()), c38471h.f164760I);
            c38466c.f2052x &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e5) {
            return e5;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr);

    @Override // p527um.InterfaceC35072b
    public final void flush() {
        synchronized (this.f164748b) {
            try {
                this.f164757k = true;
                C35073c c35073c = this.f164755i;
                if (c35073c != null) {
                    c35073c.mo49690o();
                    C35073c[] c35073cArr = this.f164751e;
                    int i13 = this.f164753g;
                    this.f164753g = i13 + 1;
                    c35073cArr[i13] = c35073c;
                    this.f164755i = null;
                }
                while (!this.f164749c.isEmpty()) {
                    C35073c c35073c2 = (C35073c) this.f164749c.removeFirst();
                    c35073c2.mo49690o();
                    C35073c[] c35073cArr2 = this.f164751e;
                    int i14 = this.f164753g;
                    this.f164753g = i14 + 1;
                    c35073cArr2[i14] = c35073c2;
                }
                while (!this.f164750d.isEmpty()) {
                    ((C38466c) this.f164750d.removeFirst()).m123260o();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m123263g() {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderExceptionM123262e;
        synchronized (this.f164748b) {
            while (!this.f164758l) {
                try {
                    if (!this.f164749c.isEmpty() && this.f164754h > 0) {
                        break;
                    }
                    this.f164748b.wait();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f164758l) {
                return false;
            }
            C35073c c35073c = (C35073c) this.f164749c.removeFirst();
            C38466c[] c38466cArr = this.f164752f;
            int i13 = this.f164754h - 1;
            this.f164754h = i13;
            C38466c c38466c = c38466cArr[i13];
            boolean z4 = this.f164757k;
            this.f164757k = false;
            if (c35073c.m1496f(4)) {
                c38466c.m1495a(4);
            } else {
                if (c35073c.m1496f(Integer.MIN_VALUE)) {
                    c38466c.m1495a(Integer.MIN_VALUE);
                }
                try {
                    subtitleDecoderExceptionM123262e = m123262e(c35073c, c38466c, z4);
                } catch (OutOfMemoryError e5) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e5);
                    subtitleDecoderExceptionM123262e = subtitleDecoderException;
                } catch (RuntimeException e13) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e13);
                    subtitleDecoderExceptionM123262e = subtitleDecoderException;
                }
                if (subtitleDecoderExceptionM123262e != null) {
                    synchronized (this.f164748b) {
                        this.f164756j = subtitleDecoderExceptionM123262e;
                    }
                    return false;
                }
            }
            synchronized (this.f164748b) {
                try {
                    if (this.f164757k || c38466c.m1496f(Integer.MIN_VALUE)) {
                        c38466c.m123260o();
                    } else {
                        this.f164750d.addLast(c38466c);
                    }
                    c35073c.mo49690o();
                    C35073c[] c35073cArr = this.f164751e;
                    int i14 = this.f164753g;
                    this.f164753g = i14 + 1;
                    c35073cArr[i14] = c35073c;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
    }

    @Override // p527um.InterfaceC35072b
    public final void release() {
        synchronized (this.f164748b) {
            this.f164758l = true;
            this.f164748b.notify();
        }
        try {
            this.f164747a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
