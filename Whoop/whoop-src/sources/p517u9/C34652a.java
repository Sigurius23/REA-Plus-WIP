package p517u9;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import jh3.AbstractC21702c;
import p309lo.C24553k;
import p499t9.C33619a0;
import p499t9.C33636j;
import p499t9.C33642m;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34652a implements InterfaceC33644n {

    /* JADX INFO: renamed from: s */
    public static final int[] f145963s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t */
    public static final int[] f145964t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u */
    public static final byte[] f145965u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f145966v;

    /* JADX INFO: renamed from: b */
    public final int f145968b;

    /* JADX INFO: renamed from: c */
    public final C33642m f145969c;

    /* JADX INFO: renamed from: d */
    public boolean f145970d;

    /* JADX INFO: renamed from: e */
    public long f145971e;

    /* JADX INFO: renamed from: f */
    public int f145972f;

    /* JADX INFO: renamed from: g */
    public int f145973g;

    /* JADX INFO: renamed from: h */
    public long f145974h;

    /* JADX INFO: renamed from: j */
    public int f145976j;

    /* JADX INFO: renamed from: k */
    public long f145977k;

    /* JADX INFO: renamed from: l */
    public InterfaceC33648q f145978l;

    /* JADX INFO: renamed from: m */
    public InterfaceC33639k0 f145979m;

    /* JADX INFO: renamed from: n */
    public InterfaceC33639k0 f145980n;

    /* JADX INFO: renamed from: o */
    public InterfaceC33627e0 f145981o;

    /* JADX INFO: renamed from: p */
    public boolean f145982p;

    /* JADX INFO: renamed from: q */
    public long f145983q;

    /* JADX INFO: renamed from: r */
    public boolean f145984r;

    /* JADX INFO: renamed from: a */
    public final byte[] f145967a = new byte[1];

    /* JADX INFO: renamed from: i */
    public int f145975i = -1;

    static {
        int i13 = AbstractC38065t.f163031a;
        Charset charset = StandardCharsets.UTF_8;
        f145965u = "#!AMR\n".getBytes(charset);
        f145966v = "#!AMR-WB\n".getBytes(charset);
    }

    public C34652a(int i13) {
        this.f145968b = i13;
        C33642m c33642m = new C33642m();
        this.f145969c = c33642m;
        this.f145980n = c33642m;
    }

    /* JADX INFO: renamed from: a */
    public final int m109498a(InterfaceC33646o interfaceC33646o) throws ParserException {
        boolean z4;
        interfaceC33646o.mo3093e();
        byte[] bArr = this.f145967a;
        interfaceC33646o.mo3103p(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.m5049a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i13 = (b >> 3) & 15;
        if (i13 >= 0 && i13 <= 15 && (((z4 = this.f145970d) && (i13 < 10 || i13 > 13)) || (!z4 && (i13 < 12 || i13 > 14)))) {
            return z4 ? f145964t[i13] : f145963s[i13];
        }
        StringBuilder sb4 = new StringBuilder("Illegal AMR ");
        sb4.append(this.f145970d ? "WB" : "NB");
        sb4.append(" frame type ");
        sb4.append(i13);
        throw ParserException.m5049a(null, sb4.toString());
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f145971e = 0L;
        this.f145972f = 0;
        this.f145973g = 0;
        this.f145983q = j13;
        InterfaceC33627e0 interfaceC33627e0 = this.f145981o;
        if (!(interfaceC33627e0 instanceof C33619a0)) {
            if (j7 == 0 || !(interfaceC33627e0 instanceof C33636j)) {
                this.f145977k = 0L;
                return;
            } else {
                C33636j c33636j = (C33636j) interfaceC33627e0;
                this.f145977k = (Math.max(0L, j7 - c33636j.f140392b) * 8000000) / ((long) c33636j.f140395e);
                return;
            }
        }
        C33619a0 c33619a0 = (C33619a0) interfaceC33627e0;
        C24553k c24553k = c33619a0.f140328b;
        long jM71601e = c24553k.f95825b == 0 ? -9223372036854775807L : c24553k.m71601e(AbstractC38065t.m121909b(c33619a0.f140327a, j7));
        this.f145977k = jM71601e;
        if (Math.abs(this.f145983q - jM71601e) < 20000) {
            return;
        }
        this.f145982p = true;
        this.f145980n = this.f145969c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m109499c(InterfaceC33646o interfaceC33646o) {
        interfaceC33646o.mo3093e();
        byte[] bArr = f145965u;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC33646o.mo3103p(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f145970d = false;
            interfaceC33646o.mo3100n(bArr.length);
            return true;
        }
        interfaceC33646o.mo3093e();
        byte[] bArr3 = f145966v;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC33646o.mo3103p(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f145970d = true;
        interfaceC33646o.mo3100n(bArr3.length);
        return true;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f145978l = interfaceC33648q;
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(0, 1);
        this.f145979m = interfaceC33639k0Mo3101o;
        this.f145980n = interfaceC33639k0Mo3101o;
        interfaceC33648q.mo3098l();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        return m109499c(interfaceC33646o);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[PHI: r4
      0x00ee: PHI (r4v1 t9.o) = (r4v0 t9.o), (r4v5 t9.o) binds: [B:53:0x00ec, B:56:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        InterfaceC33646o interfaceC33646o2;
        int i13;
        int iMo36175c;
        int i14;
        AbstractC35849g.m113808j(this.f145979m);
        int i15 = AbstractC38065t.f163031a;
        if (interfaceC33646o.getPosition() == 0 && !m109499c(interfaceC33646o)) {
            throw ParserException.m5049a(null, "Could not find AMR header.");
        }
        if (!this.f145984r) {
            this.f145984r = true;
            boolean z4 = this.f145970d;
            String str = z4 ? "audio/amr-wb" : "audio/amr";
            String str2 = z4 ? "audio/amr-wb" : "audio/3gpp";
            int i16 = z4 ? 16000 : 8000;
            int i17 = z4 ? f145964t[8] : f145963s[7];
            InterfaceC33639k0 interfaceC33639k0 = this.f145979m;
            C34608o c34608o = new C34608o();
            c34608o.f145740l = AbstractC34587d0.m109382o(str);
            c34608o.f145741m = AbstractC34587d0.m109382o(str2);
            c34608o.f145742n = i17;
            c34608o.f145719C = 1;
            c34608o.f145720D = i16;
            AbstractC21702c.m61152w(c34608o, interfaceC33639k0);
        }
        int i18 = 0;
        if (this.f145973g == 0) {
            try {
                int iM109498a = m109498a(interfaceC33646o);
                this.f145972f = iM109498a;
                this.f145973g = iM109498a;
                if (this.f145975i == -1) {
                    this.f145974h = interfaceC33646o.getPosition();
                    this.f145975i = this.f145972f;
                }
                if (this.f145975i == this.f145972f) {
                    this.f145976j++;
                }
                InterfaceC33627e0 interfaceC33627e0 = this.f145981o;
                if (interfaceC33627e0 instanceof C33619a0) {
                    C33619a0 c33619a0 = (C33619a0) interfaceC33627e0;
                    long j7 = this.f145977k + this.f145971e + 20000;
                    long position = interfaceC33646o.getPosition() + ((long) this.f145972f);
                    C24553k c24553k = c33619a0.f140328b;
                    int i19 = c24553k.f95825b;
                    if (i19 == 0 || j7 - c24553k.m71601e(i19 - 1) >= 100000) {
                        C24553k c24553k2 = c33619a0.f140327a;
                        C24553k c24553k3 = c33619a0.f140328b;
                        if (c24553k3.f95825b == 0 && j7 > 0) {
                            c24553k2.m71597a(0L);
                            c24553k3.m71597a(0L);
                        }
                        c24553k2.m71597a(position);
                        c24553k3.m71597a(j7);
                    }
                    if (this.f145982p && Math.abs(this.f145983q - j7) < 20000) {
                        this.f145982p = false;
                        this.f145980n = this.f145979m;
                    }
                }
                interfaceC33646o2 = interfaceC33646o;
                iMo36175c = this.f145980n.mo36175c(interfaceC33646o2, this.f145973g, true);
                if (iMo36175c == -1) {
                    i18 = -1;
                } else {
                    i14 = this.f145973g - iMo36175c;
                    this.f145973g = i14;
                    if (i14 <= 0) {
                        this.f145980n.mo36174b(this.f145977k + this.f145971e, 1, this.f145972f, 0, null);
                        this.f145971e += 20000;
                    }
                }
            } catch (EOFException unused) {
                interfaceC33646o2 = interfaceC33646o;
            }
        } else {
            interfaceC33646o2 = interfaceC33646o;
            iMo36175c = this.f145980n.mo36175c(interfaceC33646o2, this.f145973g, true);
            if (iMo36175c == -1) {
                i18 = -1;
            } else {
                i14 = this.f145973g - iMo36175c;
                this.f145973g = i14;
                if (i14 <= 0) {
                    this.f145980n.mo36174b(this.f145977k + this.f145971e, 1, this.f145972f, 0, null);
                    this.f145971e += 20000;
                }
            }
        }
        long length = interfaceC33646o2.getLength();
        if (this.f145981o == null) {
            if ((this.f145968b & 1) == 0 || !((i13 = this.f145975i) == -1 || i13 == this.f145972f)) {
                this.f145981o = new C33651t(-9223372036854775807L);
            } else if (this.f145976j >= 20 || i18 == -1) {
                this.f145981o = new C33636j(length, this.f145974h, (int) ((((long) i13) * 8000000) / 20000), i13, false);
                this.f145979m.getClass();
            }
            InterfaceC33627e0 interfaceC33627e1 = this.f145981o;
            if (interfaceC33627e1 != null) {
                this.f145978l.mo3109v(interfaceC33627e1);
            }
        }
        if (i18 == -1) {
            InterfaceC33627e0 interfaceC33627e2 = this.f145981o;
            if (interfaceC33627e2 instanceof C33619a0) {
                ((C33619a0) interfaceC33627e2).f140329c = this.f145977k + this.f145971e;
                this.f145978l.mo3109v(interfaceC33627e2);
                this.f145979m.getClass();
            }
        }
        return i18;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
