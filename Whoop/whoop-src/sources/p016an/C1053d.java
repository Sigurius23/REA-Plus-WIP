package p016an;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.SystemClock;
import ba.C2895c;
import java.util.List;
import ne3.C26621j0;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import p073cq.C11040i;
import p112e9.InterfaceC12870i;
import p141f9.C14268j;
import p180h0.EnumC16377d2;
import p181h2.C16617b;
import p309lo.AbstractC24543a;
import p499t9.C33634i;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p512u2.C34472r;
import p529uo.AbstractC35135w;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38065t;
import p621xn.InterfaceC38468e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import to.InterfaceC33987n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: an.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C1053d implements InterfaceC37368j, InterfaceC37369k, InterfaceC33646o, InterfaceC33648q, InterfaceC12870i, InterfaceC33987n, InterfaceC38468e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4097w;

    /* JADX INFO: renamed from: x */
    public long f4098x;

    /* JADX INFO: renamed from: y */
    public Object f4099y;

    public /* synthetic */ C1053d(long j7, Object obj, int i13) {
        this.f4097w = i13;
        this.f4098x = j7;
        this.f4099y = obj;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: A */
    public boolean mo3076A() {
        return true;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: B */
    public long mo3077B() {
        return 0L;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: C */
    public boolean mo3078C(int i13, boolean z4) {
        return ((InterfaceC33646o) this.f4099y).mo3078C(i13, true);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: D */
    public long mo3079D(long j7, long j13) {
        return ((C33634i) this.f4099y).f140385a;
    }

    /* JADX INFO: renamed from: E */
    public long m3080E(C34472r c34472r, float f13) {
        long jM47192h = C16617b.m47192h(this.f4098x, C16617b.m47191g(c34472r.f144817c, c34472r.f144821g));
        this.f4098x = jM47192h;
        EnumC16377d2 enumC16377d2 = (EnumC16377d2) this.f4099y;
        if ((enumC16377d2 == null ? C16617b.m47188d(jM47192h) : Math.abs(m3086K(jM47192h))) < f13) {
            return 9205357640488583168L;
        }
        if (enumC16377d2 == null) {
            long j7 = this.f4098x;
            return C16617b.m47191g(this.f4098x, C16617b.m47193i(f13, C16617b.m47186b(C16617b.m47188d(j7), j7)));
        }
        float fM3086K = m3086K(this.f4098x) - (Math.signum(m3086K(this.f4098x)) * f13);
        long j13 = this.f4098x;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62972x;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC16377d2 == enumC16377d3 ? j13 & 4294967295L : j13 >> 32));
        if (enumC16377d2 == enumC16377d3) {
            return (((long) Float.floatToRawIntBits(fM3086K)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM3086K)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    public void m3081F(int i13) {
        if (i13 < 64) {
            this.f4098x &= ~(1 << i13);
            return;
        }
        C1053d c1053d = (C1053d) this.f4099y;
        if (c1053d != null) {
            c1053d.m3081F(i13 - 64);
        }
    }

    /* JADX INFO: renamed from: G */
    public int m3082G(int i13) {
        C1053d c1053d = (C1053d) this.f4099y;
        if (c1053d == null) {
            return i13 >= 64 ? Long.bitCount(this.f4098x) : Long.bitCount(this.f4098x & ((1 << i13) - 1));
        }
        if (i13 < 64) {
            return Long.bitCount(this.f4098x & ((1 << i13) - 1));
        }
        return Long.bitCount(this.f4098x) + c1053d.m3082G(i13 - 64);
    }

    /* JADX INFO: renamed from: H */
    public void m3083H() {
        if (((C1053d) this.f4099y) == null) {
            this.f4099y = new C1053d(2);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m3084I(int i13) {
        if (i13 < 64) {
            return (this.f4098x & (1 << i13)) != 0;
        }
        m3083H();
        return ((C1053d) this.f4099y).m3084I(i13 - 64);
    }

    /* JADX INFO: renamed from: J */
    public void m3085J(int i13, boolean z4) {
        if (i13 >= 64) {
            m3083H();
            ((C1053d) this.f4099y).m3085J(i13 - 64, z4);
            return;
        }
        long j7 = this.f4098x;
        boolean z13 = (Long.MIN_VALUE & j7) != 0;
        long j13 = (1 << i13) - 1;
        this.f4098x = ((j7 & (~j13)) << 1) | (j7 & j13);
        if (z4) {
            m3089N(i13);
        } else {
            m3081F(i13);
        }
        if (z13 || ((C1053d) this.f4099y) != null) {
            m3083H();
            ((C1053d) this.f4099y).m3085J(0, z13);
        }
    }

    /* JADX INFO: renamed from: K */
    public float m3086K(long j7) {
        return Float.intBitsToFloat((int) (((EnumC16377d2) this.f4099y) == EnumC16377d2.f62972x ? j7 >> 32 : j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: L */
    public boolean m3087L(int i13) {
        if (i13 >= 64) {
            m3083H();
            return ((C1053d) this.f4099y).m3087L(i13 - 64);
        }
        long j7 = 1 << i13;
        long j13 = this.f4098x;
        boolean z4 = (j13 & j7) != 0;
        long j14 = j13 & (~j7);
        this.f4098x = j14;
        long j15 = j7 - 1;
        this.f4098x = (j14 & j15) | Long.rotateRight((~j15) & j14, 1);
        C1053d c1053d = (C1053d) this.f4099y;
        if (c1053d != null) {
            if (c1053d.m3084I(0)) {
                m3089N(63);
            }
            ((C1053d) this.f4099y).m3087L(0);
        }
        return z4;
    }

    /* JADX INFO: renamed from: M */
    public void m3088M() {
        this.f4098x = 0L;
        C1053d c1053d = (C1053d) this.f4099y;
        if (c1053d != null) {
            c1053d.m3088M();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m3089N(int i13) {
        if (i13 < 64) {
            this.f4098x |= 1 << i13;
        } else {
            m3083H();
            ((C1053d) this.f4099y).m3089N(i13 - 64);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m3090O(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f4099y) == null) {
            this.f4099y = exc;
            this.f4098x = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f4098x) {
            Exception exc2 = (Exception) this.f4099y;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f4099y;
            this.f4099y = null;
            throw exc3;
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: a */
    public long mo3091a(long j7) {
        return ((C33634i) this.f4099y).f140389e[(int) j7] - this.f4098x;
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        long j7 = this.f4098x;
        PendingIntent pendingIntent = (PendingIntent) this.f4099y;
        C27004i c27004i = (C27004i) obj;
        C11040i c11040i = (C11040i) obj2;
        c27004i.m111058c();
        AbstractC35135w.m111094f(pendingIntent);
        AbstractC35135w.m111090b(j7 >= 0, "detectionIntervalMillis must be >= 0");
        C27000e c27000e = (C27000e) c27004i.m111061j();
        Parcel parcelM80981s = c27000e.m80981s();
        parcelM80981s.writeLong(j7);
        int i13 = AbstractC27007l.f107703a;
        parcelM80981s.writeInt(1);
        AbstractC27007l.m80996c(parcelM80981s, pendingIntent);
        c27000e.m80980c0(parcelM80981s, 5);
        c11040i.m29687b(null);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public int mo1673b(long j7) {
        return this.f4098x > j7 ? 0 : -1;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: c */
    public boolean mo3092c(byte[] bArr, int i13, int i14, boolean z4) {
        switch (this.f4097w) {
            case 0:
                return ((InterfaceC37368j) this.f4099y).mo3092c(bArr, i13, i14, z4);
            default:
                return ((InterfaceC33646o) this.f4099y).mo3092c(bArr, 0, i14, z4);
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public List mo1674d(long j7) {
        if (j7 >= this.f4098x) {
            return (AbstractC41023g0) this.f4099y;
        }
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        return C41060w0.f177067E;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: e */
    public void mo3093e() {
        switch (this.f4097w) {
            case 0:
                ((InterfaceC37368j) this.f4099y).mo3093e();
                break;
            default:
                ((InterfaceC33646o) this.f4099y).mo3093e();
                break;
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: f */
    public boolean mo3094f(byte[] bArr, int i13, int i14, boolean z4) {
        switch (this.f4097w) {
            case 0:
                return ((InterfaceC37368j) this.f4099y).mo3094f(bArr, 0, i14, z4);
            default:
                return ((InterfaceC33646o) this.f4099y).mo3094f(bArr, 0, i14, z4);
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: g */
    public long mo3095g() {
        long jMo3095g;
        long j7;
        switch (this.f4097w) {
            case 0:
                jMo3095g = ((InterfaceC37368j) this.f4099y).mo3095g();
                j7 = this.f4098x;
                break;
            default:
                jMo3095g = ((InterfaceC33646o) this.f4099y).mo3095g();
                j7 = this.f4098x;
                break;
        }
        return jMo3095g - j7;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public long getLength() {
        long length;
        long j7;
        switch (this.f4097w) {
            case 0:
                length = ((InterfaceC37368j) this.f4099y).getLength();
                j7 = this.f4098x;
                break;
            default:
                length = ((InterfaceC33646o) this.f4099y).getLength();
                j7 = this.f4098x;
                break;
        }
        return length - j7;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public long getPosition() {
        long position;
        long j7;
        switch (this.f4097w) {
            case 0:
                position = ((InterfaceC37368j) this.f4099y).getPosition();
                j7 = this.f4098x;
                break;
            default:
                position = ((InterfaceC33646o) this.f4099y).getPosition();
                j7 = this.f4098x;
                break;
        }
        return position - j7;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public long mo1675h(int i13) {
        AbstractC24543a.m71569e(i13 == 0);
        return this.f4098x;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: i */
    public void mo3096i(int i13) {
        switch (this.f4097w) {
            case 0:
                ((InterfaceC37368j) this.f4099y).mo3096i(i13);
                break;
            default:
                ((InterfaceC33646o) this.f4099y).mo3096i(i13);
                break;
        }
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public int mo1676j() {
        return 1;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: k */
    public int mo3097k(int i13) {
        switch (this.f4097w) {
            case 0:
                return ((InterfaceC37368j) this.f4099y).mo3097k(i13);
            default:
                return ((InterfaceC33646o) this.f4099y).mo3097k(i13);
        }
    }

    @Override // p588wm.InterfaceC37369k, p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public void mo3098l() {
        switch (this.f4097w) {
            case 1:
                ((InterfaceC37369k) this.f4099y).mo3098l();
                break;
            default:
                ((InterfaceC33648q) this.f4099y).mo3098l();
                break;
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: m */
    public int mo3099m(byte[] bArr, int i13, int i14) {
        switch (this.f4097w) {
            case 0:
                return ((InterfaceC37368j) this.f4099y).mo3099m(bArr, i13, i14);
            default:
                return ((InterfaceC33646o) this.f4099y).mo3099m(bArr, i13, i14);
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: n */
    public void mo3100n(int i13) {
        switch (this.f4097w) {
            case 0:
                ((InterfaceC37368j) this.f4099y).mo3100n(i13);
                break;
            default:
                ((InterfaceC33646o) this.f4099y).mo3100n(i13);
                break;
        }
    }

    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: o */
    public InterfaceC37377s mo3102o(int i13, int i14) {
        return ((InterfaceC37369k) this.f4099y).mo3102o(i13, i14);
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: p */
    public void mo3103p(byte[] bArr, int i13, int i14) {
        switch (this.f4097w) {
            case 0:
                ((InterfaceC37368j) this.f4099y).mo3103p(bArr, i13, i14);
                break;
            default:
                ((InterfaceC33646o) this.f4099y).mo3103p(bArr, i13, i14);
                break;
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: q */
    public long mo3104q(long j7, long j13) {
        return ((C33634i) this.f4099y).f140388d[(int) j7];
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: r */
    public long mo3105r(long j7, long j13) {
        return 0L;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public int read(byte[] bArr, int i13, int i14) {
        switch (this.f4097w) {
            case 0:
                return ((InterfaceC37368j) this.f4099y).read(bArr, i13, i14);
            default:
                return ((InterfaceC33646o) this.f4099y).read(bArr, i13, i14);
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public void readFully(byte[] bArr, int i13, int i14) {
        switch (this.f4097w) {
            case 0:
                ((InterfaceC37368j) this.f4099y).readFully(bArr, i13, i14);
                break;
            default:
                ((InterfaceC33646o) this.f4099y).readFully(bArr, i13, i14);
                break;
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: s */
    public long mo3106s(long j7, long j13) {
        return -9223372036854775807L;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: t */
    public C14268j mo3107t(long j7) {
        C33634i c33634i = (C33634i) this.f4099y;
        int i13 = (int) j7;
        return new C14268j(null, c33634i.f140387c[i13], c33634i.f140386b[i13]);
    }

    public String toString() {
        switch (this.f4097w) {
            case 2:
                if (((C1053d) this.f4099y) == null) {
                    return Long.toBinaryString(this.f4098x);
                }
                return ((C1053d) this.f4099y).toString() + "xx" + Long.toBinaryString(this.f4098x);
            default:
                return super.toString();
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: u */
    public long mo3108u(long j7, long j13) {
        return AbstractC38065t.m121911d(((C33634i) this.f4099y).f140389e, j7 + this.f4098x, true);
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: v */
    public void mo3109v(InterfaceC33627e0 interfaceC33627e0) {
        ((InterfaceC33648q) this.f4099y).mo3109v(new C2895c(this, interfaceC33627e0, interfaceC33627e0));
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: w */
    public long mo3110w(long j7) {
        return ((C33634i) this.f4099y).f140385a;
    }

    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: x */
    public void mo3111x(InterfaceC37374p interfaceC37374p) {
        ((InterfaceC37369k) this.f4099y).mo3111x(new C1054e(this, interfaceC37374p));
    }

    public /* synthetic */ C1053d(Object obj, long j7, int i13) {
        this.f4097w = i13;
        this.f4099y = obj;
        this.f4098x = j7;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: o */
    public InterfaceC33639k0 mo3101o(int i13, int i14) {
        return ((InterfaceC33648q) this.f4099y).mo3101o(i13, i14);
    }

    public C1053d(Context context) {
        this.f4097w = 3;
        this.f4099y = context;
        this.f4098x = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    public C1053d(C26621j0 source) {
        this.f4097w = 6;
        AbstractC22676k.m65750j(source, "source");
        this.f4099y = source;
        this.f4098x = 262144L;
    }

    public C1053d(InterfaceC37368j interfaceC37368j, long j7) {
        this.f4097w = 0;
        this.f4099y = interfaceC37368j;
        AbstractC24543a.m71569e(interfaceC37368j.getPosition() >= j7);
        this.f4098x = j7;
    }

    public C1053d(InterfaceC33646o interfaceC33646o, long j7) {
        this.f4097w = 4;
        this.f4099y = interfaceC33646o;
        AbstractC35849g.m113802d(interfaceC33646o.getPosition() >= j7);
        this.f4098x = j7;
    }

    public C1053d(int i13) {
        this.f4097w = i13;
        switch (i13) {
            case 9:
                break;
            default:
                this.f4098x = 0L;
                break;
        }
    }
}
