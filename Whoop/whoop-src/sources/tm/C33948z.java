package tm;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: tm.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C33948z implements InterfaceC33930h {

    /* JADX INFO: renamed from: b */
    public int f142344b;

    /* JADX INFO: renamed from: c */
    public float f142345c;

    /* JADX INFO: renamed from: d */
    public float f142346d;

    /* JADX INFO: renamed from: e */
    public C33929g f142347e;

    /* JADX INFO: renamed from: f */
    public C33929g f142348f;

    /* JADX INFO: renamed from: g */
    public C33929g f142349g;

    /* JADX INFO: renamed from: h */
    public C33929g f142350h;

    /* JADX INFO: renamed from: i */
    public boolean f142351i;

    /* JADX INFO: renamed from: j */
    public C33947y f142352j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f142353k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f142354l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f142355m;

    /* JADX INFO: renamed from: n */
    public long f142356n;

    /* JADX INFO: renamed from: o */
    public long f142357o;

    /* JADX INFO: renamed from: p */
    public boolean f142358p;

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo107334a() {
        C33947y c33947y = this.f142352j;
        if (c33947y != null) {
            int i13 = c33947y.f142323b;
            int i14 = c33947y.f142334m * i13 * 2;
            if (i14 > 0) {
                if (this.f142353k.capacity() < i14) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                    this.f142353k = byteBufferOrder;
                    this.f142354l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f142353k.clear();
                    this.f142354l.clear();
                }
                ShortBuffer shortBuffer = this.f142354l;
                int iMin = Math.min(shortBuffer.remaining() / i13, c33947y.f142334m);
                int i15 = iMin * i13;
                shortBuffer.put(c33947y.f142333l, 0, i15);
                int i16 = c33947y.f142334m - iMin;
                c33947y.f142334m = i16;
                short[] sArr = c33947y.f142333l;
                System.arraycopy(sArr, i15, sArr, 0, i16 * i13);
                this.f142357o += (long) i14;
                this.f142353k.limit(i14);
                this.f142355m = this.f142353k;
            }
        }
        ByteBuffer byteBuffer = this.f142355m;
        this.f142355m = InterfaceC33930h.f142179a;
        return byteBuffer;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: b */
    public final void mo107335b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C33947y c33947y = this.f142352j;
            c33947y.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f142356n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i13 = c33947y.f142323b;
            int i14 = iRemaining2 / i13;
            short[] sArrM107386c = c33947y.m107386c(c33947y.f142331j, c33947y.f142332k, i14);
            c33947y.f142331j = sArrM107386c;
            shortBufferAsShortBuffer.get(sArrM107386c, c33947y.f142332k * i13, ((i14 * i13) * 2) / 2);
            c33947y.f142332k += i14;
            c33947y.m107388f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: c */
    public final void mo107345c() {
        C33947y c33947y = this.f142352j;
        if (c33947y != null) {
            int i13 = c33947y.f142332k;
            float f13 = c33947y.f142324c;
            float f14 = c33947y.f142325d;
            int i14 = c33947y.f142334m + ((int) ((((i13 / (f13 / f14)) + c33947y.f142336o) / (c33947y.f142326e * f14)) + 0.5f));
            short[] sArr = c33947y.f142331j;
            int i15 = c33947y.f142329h * 2;
            c33947y.f142331j = c33947y.m107386c(sArr, i13, i15 + i13);
            int i16 = 0;
            while (true) {
                int i17 = c33947y.f142323b;
                if (i16 >= i15 * i17) {
                    break;
                }
                c33947y.f142331j[(i17 * i13) + i16] = 0;
                i16++;
            }
            c33947y.f142332k = i15 + c33947y.f142332k;
            c33947y.m107388f();
            if (c33947y.f142334m > i14) {
                c33947y.f142334m = i14;
            }
            c33947y.f142332k = 0;
            c33947y.f142339r = 0;
            c33947y.f142336o = 0;
        }
        this.f142358p = true;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: d */
    public final boolean mo107336d() {
        if (!this.f142358p) {
            return false;
        }
        C33947y c33947y = this.f142352j;
        return c33947y == null || (c33947y.f142334m * c33947y.f142323b) * 2 == 0;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: e */
    public final C33929g mo107346e(C33929g c33929g) throws AudioProcessor$UnhandledAudioFormatException {
        if (c33929g.f142177c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(c33929g);
        }
        int i13 = this.f142344b;
        if (i13 == -1) {
            i13 = c33929g.f142175a;
        }
        this.f142347e = c33929g;
        C33929g c33929g2 = new C33929g(i13, c33929g.f142176b, 2);
        this.f142348f = c33929g2;
        this.f142351i = true;
        return c33929g2;
    }

    @Override // tm.InterfaceC33930h
    public final void flush() {
        if (isActive()) {
            C33929g c33929g = this.f142347e;
            this.f142349g = c33929g;
            C33929g c33929g2 = this.f142348f;
            this.f142350h = c33929g2;
            if (this.f142351i) {
                this.f142352j = new C33947y(c33929g.f142175a, c33929g.f142176b, this.f142345c, this.f142346d, c33929g2.f142175a);
            } else {
                C33947y c33947y = this.f142352j;
                if (c33947y != null) {
                    c33947y.f142332k = 0;
                    c33947y.f142334m = 0;
                    c33947y.f142336o = 0;
                    c33947y.f142337p = 0;
                    c33947y.f142338q = 0;
                    c33947y.f142339r = 0;
                    c33947y.f142340s = 0;
                    c33947y.f142341t = 0;
                    c33947y.f142342u = 0;
                    c33947y.f142343v = 0;
                }
            }
        }
        this.f142355m = InterfaceC33930h.f142179a;
        this.f142356n = 0L;
        this.f142357o = 0L;
        this.f142358p = false;
    }

    @Override // tm.InterfaceC33930h
    public final boolean isActive() {
        if (this.f142348f.f142175a != -1) {
            return Math.abs(this.f142345c - 1.0f) >= 1.0E-4f || Math.abs(this.f142346d - 1.0f) >= 1.0E-4f || this.f142348f.f142175a != this.f142347e.f142175a;
        }
        return false;
    }

    @Override // tm.InterfaceC33930h
    public final void reset() {
        this.f142345c = 1.0f;
        this.f142346d = 1.0f;
        C33929g c33929g = C33929g.f142174e;
        this.f142347e = c33929g;
        this.f142348f = c33929g;
        this.f142349g = c33929g;
        this.f142350h = c33929g;
        ByteBuffer byteBuffer = InterfaceC33930h.f142179a;
        this.f142353k = byteBuffer;
        this.f142354l = byteBuffer.asShortBuffer();
        this.f142355m = byteBuffer;
        this.f142344b = -1;
        this.f142351i = false;
        this.f142352j = null;
        this.f142356n = 0L;
        this.f142357o = 0L;
        this.f142358p = false;
    }
}
