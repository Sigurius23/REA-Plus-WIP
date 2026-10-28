package p547v8;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: v8.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C35791h implements InterfaceC35788e {

    /* JADX INFO: renamed from: b */
    public int f152229b;

    /* JADX INFO: renamed from: c */
    public float f152230c;

    /* JADX INFO: renamed from: d */
    public float f152231d;

    /* JADX INFO: renamed from: e */
    public C35787d f152232e;

    /* JADX INFO: renamed from: f */
    public C35787d f152233f;

    /* JADX INFO: renamed from: g */
    public C35787d f152234g;

    /* JADX INFO: renamed from: h */
    public C35787d f152235h;

    /* JADX INFO: renamed from: i */
    public boolean f152236i;

    /* JADX INFO: renamed from: j */
    public C35790g f152237j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f152238k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f152239l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f152240m;

    /* JADX INFO: renamed from: n */
    public long f152241n;

    /* JADX INFO: renamed from: o */
    public long f152242o;

    /* JADX INFO: renamed from: p */
    public boolean f152243p;

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo31606a() {
        C35790g c35790g = this.f152237j;
        if (c35790g != null) {
            int i13 = c35790g.f152207b;
            AbstractC35849g.m113807i(c35790g.f152218m >= 0);
            int i14 = c35790g.f152218m * i13 * 2;
            if (i14 > 0) {
                if (this.f152238k.capacity() < i14) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                    this.f152238k = byteBufferOrder;
                    this.f152239l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f152238k.clear();
                    this.f152239l.clear();
                }
                ShortBuffer shortBuffer = this.f152239l;
                AbstractC35849g.m113807i(c35790g.f152218m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i13, c35790g.f152218m);
                int i15 = iMin * i13;
                shortBuffer.put(c35790g.f152217l, 0, i15);
                int i16 = c35790g.f152218m - iMin;
                c35790g.f152218m = i16;
                short[] sArr = c35790g.f152217l;
                System.arraycopy(sArr, i15, sArr, 0, i16 * i13);
                this.f152242o += (long) i14;
                this.f152238k.limit(i14);
                this.f152240m = this.f152238k;
            }
        }
        ByteBuffer byteBuffer = this.f152240m;
        this.f152240m = InterfaceC35788e.f152198a;
        return byteBuffer;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: b */
    public final void mo31596b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C35790g c35790g = this.f152237j;
            c35790g.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f152241n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i13 = c35790g.f152207b;
            int i14 = iRemaining2 / i13;
            short[] sArrM113443c = c35790g.m113443c(c35790g.f152215j, c35790g.f152216k, i14);
            c35790g.f152215j = sArrM113443c;
            shortBufferAsShortBuffer.get(sArrM113443c, c35790g.f152216k * i13, ((i14 * i13) * 2) / 2);
            c35790g.f152216k += i14;
            c35790g.m113445f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: c */
    public final void mo113437c() {
        C35790g c35790g = this.f152237j;
        if (c35790g != null) {
            int i13 = c35790g.f152216k;
            float f13 = c35790g.f152208c;
            float f14 = c35790g.f152209d;
            double d3 = f13 / f14;
            double d14 = c35790g.f152210e * f14;
            int i14 = c35790g.f152223r;
            int i15 = c35790g.f152218m + ((int) ((((((((double) (i13 - i14)) / d3) + ((double) i14)) + c35790g.f152228w) + ((double) c35790g.f152220o)) / d14) + 0.5d));
            c35790g.f152228w = 0.0d;
            short[] sArr = c35790g.f152215j;
            int i16 = c35790g.f152213h * 2;
            c35790g.f152215j = c35790g.m113443c(sArr, i13, i16 + i13);
            int i17 = 0;
            while (true) {
                int i18 = c35790g.f152207b;
                if (i17 >= i16 * i18) {
                    break;
                }
                c35790g.f152215j[(i18 * i13) + i17] = 0;
                i17++;
            }
            c35790g.f152216k = i16 + c35790g.f152216k;
            c35790g.m113445f();
            if (c35790g.f152218m > i15) {
                c35790g.f152218m = Math.max(i15, 0);
            }
            c35790g.f152216k = 0;
            c35790g.f152223r = 0;
            c35790g.f152220o = 0;
        }
        this.f152243p = true;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: d */
    public final boolean mo31607d() {
        if (this.f152243p) {
            C35790g c35790g = this.f152237j;
            if (c35790g != null) {
                AbstractC35849g.m113807i(c35790g.f152218m >= 0);
                if (c35790g.f152218m * c35790g.f152207b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: e */
    public final C35787d mo113438e(C35787d c35787d) throws AudioProcessor$UnhandledAudioFormatException {
        if (c35787d.f152196c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c35787d);
        }
        int i13 = this.f152229b;
        if (i13 == -1) {
            i13 = c35787d.f152194a;
        }
        this.f152232e = c35787d;
        C35787d c35787d2 = new C35787d(i13, c35787d.f152195b, 2);
        this.f152233f = c35787d2;
        this.f152236i = true;
        return c35787d2;
    }

    @Override // p547v8.InterfaceC35788e
    public final void flush() {
        if (isActive()) {
            C35787d c35787d = this.f152232e;
            this.f152234g = c35787d;
            C35787d c35787d2 = this.f152233f;
            this.f152235h = c35787d2;
            if (this.f152236i) {
                this.f152237j = new C35790g(c35787d.f152194a, c35787d.f152195b, this.f152230c, this.f152231d, c35787d2.f152194a);
            } else {
                C35790g c35790g = this.f152237j;
                if (c35790g != null) {
                    c35790g.f152216k = 0;
                    c35790g.f152218m = 0;
                    c35790g.f152220o = 0;
                    c35790g.f152221p = 0;
                    c35790g.f152222q = 0;
                    c35790g.f152223r = 0;
                    c35790g.f152224s = 0;
                    c35790g.f152225t = 0;
                    c35790g.f152226u = 0;
                    c35790g.f152227v = 0;
                    c35790g.f152228w = 0.0d;
                }
            }
        }
        this.f152240m = InterfaceC35788e.f152198a;
        this.f152241n = 0L;
        this.f152242o = 0L;
        this.f152243p = false;
    }

    @Override // p547v8.InterfaceC35788e
    public final boolean isActive() {
        if (this.f152233f.f152194a != -1) {
            return Math.abs(this.f152230c - 1.0f) >= 1.0E-4f || Math.abs(this.f152231d - 1.0f) >= 1.0E-4f || this.f152233f.f152194a != this.f152232e.f152194a;
        }
        return false;
    }

    @Override // p547v8.InterfaceC35788e
    public final void reset() {
        this.f152230c = 1.0f;
        this.f152231d = 1.0f;
        C35787d c35787d = C35787d.f152193e;
        this.f152232e = c35787d;
        this.f152233f = c35787d;
        this.f152234g = c35787d;
        this.f152235h = c35787d;
        ByteBuffer byteBuffer = InterfaceC35788e.f152198a;
        this.f152238k = byteBuffer;
        this.f152239l = byteBuffer.asShortBuffer();
        this.f152240m = byteBuffer;
        this.f152229b = -1;
        this.f152236i = false;
        this.f152237j = null;
        this.f152241n = 0L;
        this.f152242o = 0L;
        this.f152243p = false;
    }
}
