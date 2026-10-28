package p187h9;

import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.mapbox.maps.C5538l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p010a9.AbstractC0581f;
import p010a9.C0580e;
import p010a9.C0582g;
import p010a9.InterfaceC0579d;
import qa.C30099d;
import qa.C30104i;
import qa.InterfaceC30100e;
import qa.InterfaceC30101f;
import qa.InterfaceC30107l;
import rs.AbstractC31780b;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: h9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C17018b implements InterfaceC30101f, InterfaceC0579d {

    /* JADX INFO: renamed from: a */
    public final C0582g f65401a;

    /* JADX INFO: renamed from: b */
    public final Object f65402b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f65403c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f65404d;

    /* JADX INFO: renamed from: e */
    public final C0580e[] f65405e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0581f[] f65406f;

    /* JADX INFO: renamed from: g */
    public int f65407g;

    /* JADX INFO: renamed from: h */
    public int f65408h;

    /* JADX INFO: renamed from: i */
    public C0580e f65409i;

    /* JADX INFO: renamed from: j */
    public DecoderException f65410j;

    /* JADX INFO: renamed from: k */
    public boolean f65411k;

    /* JADX INFO: renamed from: l */
    public boolean f65412l;

    /* JADX INFO: renamed from: m */
    public long f65413m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f65414n;

    /* JADX INFO: renamed from: o */
    public final Object f65415o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17018b(InterfaceC30107l interfaceC30107l) {
        this(new C30104i[2], new C30099d[2]);
        this.f65414n = 1;
        int i13 = this.f65407g;
        C0580e[] c0580eArr = this.f65405e;
        AbstractC35849g.m113807i(i13 == c0580eArr.length);
        for (C0580e c0580e : c0580eArr) {
            c0580e.m1508q(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        }
        this.f65415o = interfaceC30107l;
    }

    @Override // qa.InterfaceC30101f
    /* JADX INFO: renamed from: a */
    public void mo47995a(long j7) {
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: c */
    public final Object mo1503c() {
        C0580e c0580e;
        synchronized (this.f65402b) {
            try {
                DecoderException decoderException = this.f65410j;
                if (decoderException != null) {
                    throw decoderException;
                }
                AbstractC35849g.m113807i(this.f65409i == null);
                int i13 = this.f65407g;
                if (i13 == 0) {
                    c0580e = null;
                } else {
                    C0580e[] c0580eArr = this.f65405e;
                    int i14 = i13 - 1;
                    this.f65407g = i14;
                    c0580e = c0580eArr[i14];
                }
                this.f65409i = c0580e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c0580e;
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: d */
    public final void mo1504d(long j7) {
        synchronized (this.f65402b) {
            try {
                AbstractC35849g.m113807i(this.f65407g == this.f65405e.length || this.f65411k);
                this.f65413m = j7;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final DecoderException m47996f(Throwable th3) {
        switch (this.f65414n) {
            case 0:
                return new ImageDecoderException("Unexpected decode error", th3);
            default:
                return new SubtitleDecoderException("Unexpected decode error", th3);
        }
    }

    @Override // p010a9.InterfaceC0579d
    public final void flush() {
        synchronized (this.f65402b) {
            try {
                this.f65411k = true;
                C0580e c0580e = this.f65409i;
                if (c0580e != null) {
                    c0580e.mo1506o();
                    C0580e[] c0580eArr = this.f65405e;
                    int i13 = this.f65407g;
                    this.f65407g = i13 + 1;
                    c0580eArr[i13] = c0580e;
                    this.f65409i = null;
                }
                while (!this.f65403c.isEmpty()) {
                    C0580e c0580e2 = (C0580e) this.f65403c.removeFirst();
                    c0580e2.mo1506o();
                    C0580e[] c0580eArr2 = this.f65405e;
                    int i14 = this.f65407g;
                    this.f65407g = i14 + 1;
                    c0580eArr2[i14] = c0580e2;
                }
                while (!this.f65404d.isEmpty()) {
                    ((AbstractC0581f) this.f65404d.removeFirst()).mo1511p();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final DecoderException m47997g(C0580e c0580e, AbstractC0581f abstractC0581f, boolean z4) {
        switch (this.f65414n) {
            case 0:
                C17017a c17017a = (C17017a) abstractC0581f;
                try {
                    ByteBuffer byteBuffer = c0580e.f2063E;
                    byteBuffer.getClass();
                    AbstractC35849g.m113807i(byteBuffer.hasArray());
                    AbstractC35849g.m113802d(byteBuffer.arrayOffset() == 0);
                    C5538l c5538l = (C5538l) this.f65415o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c5538l.getClass();
                    try {
                        c17017a.f65399E = AbstractC31780b.m98685f(iRemaining, bArrArray);
                        c17017a.f2070y = c0580e.f2065G;
                        return null;
                    } catch (ParserException e5) {
                        throw new ImageDecoderException(AbstractC26725a.m79505i(new StringBuilder("Could not decode image data with BitmapFactory. (data.length = "), bArrArray.length, ", input length = ", iRemaining, ")"), e5);
                    } catch (IOException e13) {
                        throw new ImageDecoderException(e13);
                    }
                } catch (ImageDecoderException e14) {
                    return e14;
                }
            default:
                C30104i c30104i = (C30104i) c0580e;
                C30099d c30099d = (C30099d) abstractC0581f;
                try {
                    ByteBuffer byteBuffer2 = c30104i.f2063E;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC30107l interfaceC30107l = (InterfaceC30107l) this.f65415o;
                    if (z4) {
                        interfaceC30107l.reset();
                    }
                    InterfaceC30100e interfaceC30100eMo92227L = interfaceC30107l.mo92227L(bArrArray2, 0, iLimit);
                    long j7 = c30104i.f2065G;
                    long j13 = c30104i.f122842J;
                    c30099d.f2070y = j7;
                    c30099d.f122826E = interfaceC30100eMo92227L;
                    if (j13 != Long.MAX_VALUE) {
                        j7 = j13;
                    }
                    c30099d.f122827F = j7;
                    c30099d.f2071z = false;
                    return null;
                } catch (SubtitleDecoderException e15) {
                    return e15;
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m47998h() {
        boolean z4;
        DecoderException decoderExceptionM47996f;
        synchronized (this.f65402b) {
            while (!this.f65412l) {
                try {
                    if (!this.f65403c.isEmpty() && this.f65408h > 0) {
                        break;
                    }
                    this.f65402b.wait();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f65412l) {
                return false;
            }
            C0580e c0580e = (C0580e) this.f65403c.removeFirst();
            AbstractC0581f[] abstractC0581fArr = this.f65406f;
            int i13 = this.f65408h - 1;
            this.f65408h = i13;
            AbstractC0581f abstractC0581f = abstractC0581fArr[i13];
            boolean z13 = this.f65411k;
            this.f65411k = false;
            if (c0580e.m1496f(4)) {
                abstractC0581f.m1495a(4);
            } else {
                abstractC0581f.f2070y = c0580e.f2065G;
                if (c0580e.m1496f(134217728)) {
                    abstractC0581f.m1495a(134217728);
                }
                long j7 = c0580e.f2065G;
                synchronized (this.f65402b) {
                    long j13 = this.f65413m;
                    z4 = j13 == -9223372036854775807L || j7 >= j13;
                }
                if (!z4) {
                    abstractC0581f.f2071z = true;
                }
                try {
                    decoderExceptionM47996f = m47997g(c0580e, abstractC0581f, z13);
                } catch (OutOfMemoryError e5) {
                    decoderExceptionM47996f = m47996f(e5);
                } catch (RuntimeException e13) {
                    decoderExceptionM47996f = m47996f(e13);
                }
                if (decoderExceptionM47996f != null) {
                    synchronized (this.f65402b) {
                        this.f65410j = decoderExceptionM47996f;
                    }
                    return false;
                }
            }
            synchronized (this.f65402b) {
                try {
                    if (this.f65411k || abstractC0581f.f2071z) {
                        abstractC0581f.mo1511p();
                    } else {
                        this.f65404d.addLast(abstractC0581f);
                    }
                    c0580e.mo1506o();
                    C0580e[] c0580eArr = this.f65405e;
                    int i14 = this.f65407g;
                    this.f65407g = i14 + 1;
                    c0580eArr[i14] = c0580e;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC0581f mo1502b() {
        synchronized (this.f65402b) {
            try {
                DecoderException decoderException = this.f65410j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f65404d.isEmpty()) {
                    return null;
                }
                return (AbstractC0581f) this.f65404d.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p010a9.InterfaceC0579d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void mo1505e(C0580e c0580e) {
        synchronized (this.f65402b) {
            try {
                DecoderException decoderException = this.f65410j;
                if (decoderException != null) {
                    throw decoderException;
                }
                AbstractC35849g.m113802d(c0580e == this.f65409i);
                this.f65403c.addLast(c0580e);
                if (!this.f65403c.isEmpty() && this.f65408h > 0) {
                    this.f65402b.notify();
                }
                this.f65409i = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m48001k(AbstractC0581f abstractC0581f) {
        synchronized (this.f65402b) {
            abstractC0581f.mo1510o();
            AbstractC0581f[] abstractC0581fArr = this.f65406f;
            int i13 = this.f65408h;
            this.f65408h = i13 + 1;
            abstractC0581fArr[i13] = abstractC0581f;
            if (!this.f65403c.isEmpty() && this.f65408h > 0) {
                this.f65402b.notify();
            }
        }
    }

    @Override // p010a9.InterfaceC0579d
    public final void release() {
        synchronized (this.f65402b) {
            this.f65412l = true;
            this.f65402b.notify();
        }
        try {
            this.f65401a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C17018b(C0580e[] c0580eArr, AbstractC0581f[] abstractC0581fArr) {
        AbstractC0581f c17017a;
        C0580e c0580e;
        this.f65402b = new Object();
        this.f65413m = -9223372036854775807L;
        this.f65403c = new ArrayDeque();
        this.f65404d = new ArrayDeque();
        this.f65405e = c0580eArr;
        this.f65407g = c0580eArr.length;
        for (int i13 = 0; i13 < this.f65407g; i13++) {
            C0580e[] c0580eArr2 = this.f65405e;
            switch (this.f65414n) {
                case 0:
                    c0580e = new C0580e(1);
                    break;
                default:
                    c0580e = new C30104i(1);
                    break;
            }
            c0580eArr2[i13] = c0580e;
        }
        this.f65406f = abstractC0581fArr;
        this.f65408h = abstractC0581fArr.length;
        for (int i14 = 0; i14 < this.f65408h; i14++) {
            AbstractC0581f[] abstractC0581fArr2 = this.f65406f;
            switch (this.f65414n) {
                case 0:
                    c17017a = new C17017a(this);
                    break;
                default:
                    c17017a = new C30099d(this);
                    break;
            }
            abstractC0581fArr2[i14] = c17017a;
        }
        C0582g c0582g = new C0582g(this, 0);
        this.f65401a = c0582g;
        c0582g.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17018b(C5538l c5538l) {
        this(new C0580e[1], new C17017a[1]);
        this.f65414n = 0;
        this.f65415o = c5538l;
    }
}
