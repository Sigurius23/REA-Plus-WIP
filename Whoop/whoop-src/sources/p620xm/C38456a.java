package p620xm;

import cn.C4839a;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: xm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38456a implements InterfaceC37367i {

    /* JADX INFO: renamed from: n */
    public static final int[] f164656n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: o */
    public static final int[] f164657o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f164658p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f164659q;

    /* JADX INFO: renamed from: r */
    public static final int f164660r;

    /* JADX INFO: renamed from: b */
    public boolean f164662b;

    /* JADX INFO: renamed from: c */
    public long f164663c;

    /* JADX INFO: renamed from: d */
    public int f164664d;

    /* JADX INFO: renamed from: e */
    public int f164665e;

    /* JADX INFO: renamed from: f */
    public boolean f164666f;

    /* JADX INFO: renamed from: h */
    public int f164668h;

    /* JADX INFO: renamed from: i */
    public long f164669i;

    /* JADX INFO: renamed from: j */
    public InterfaceC37369k f164670j;

    /* JADX INFO: renamed from: k */
    public InterfaceC37377s f164671k;

    /* JADX INFO: renamed from: l */
    public InterfaceC37374p f164672l;

    /* JADX INFO: renamed from: m */
    public boolean f164673m;

    /* JADX INFO: renamed from: a */
    public final byte[] f164661a = new byte[1];

    /* JADX INFO: renamed from: g */
    public int f164667g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f164657o = iArr;
        int i13 = AbstractC24567y.f95875a;
        Charset charset = AbstractC39717d.f170958c;
        f164658p = "#!AMR\n".getBytes(charset);
        f164659q = "#!AMR-WB\n".getBytes(charset);
        f164660r = iArr[8];
    }

    /* JADX INFO: renamed from: a */
    public final int m123242a(InterfaceC37368j interfaceC37368j) throws ParserException {
        boolean z4;
        interfaceC37368j.mo3093e();
        byte[] bArr = this.f164661a;
        interfaceC37368j.mo3103p(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append("Invalid padding bits for frame header ");
            sb4.append((int) b);
            throw ParserException.m15562a(null, sb4.toString());
        }
        int i13 = (b >> 3) & 15;
        if (i13 >= 0 && i13 <= 15 && (((z4 = this.f164662b) && (i13 < 10 || i13 > 13)) || (!z4 && (i13 < 12 || i13 > 14)))) {
            return z4 ? f164657o[i13] : f164656n[i13];
        }
        String str = this.f164662b ? "WB" : "NB";
        StringBuilder sb5 = new StringBuilder(str.length() + 35);
        sb5.append("Illegal AMR ");
        sb5.append(str);
        sb5.append(" frame type ");
        sb5.append(i13);
        throw ParserException.m15562a(null, sb5.toString());
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f164663c = 0L;
        this.f164664d = 0;
        this.f164665e = 0;
        if (j7 != 0) {
            InterfaceC37374p interfaceC37374p = this.f164672l;
            if (interfaceC37374p instanceof C4839a) {
                C4839a c4839a = (C4839a) interfaceC37374p;
                this.f164669i = (Math.max(0L, j7 - c4839a.f20099b) * 8000000) / ((long) c4839a.f20102e);
                return;
            }
        }
        this.f164669i = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m123243c(InterfaceC37368j interfaceC37368j) {
        interfaceC37368j.mo3093e();
        byte[] bArr = f164658p;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC37368j.mo3103p(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f164662b = false;
            interfaceC37368j.mo3100n(bArr.length);
            return true;
        }
        interfaceC37368j.mo3093e();
        byte[] bArr3 = f164659q;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC37368j.mo3103p(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f164662b = true;
        interfaceC37368j.mo3100n(bArr3.length);
        return true;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        return m123243c(interfaceC37368j);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f164670j = interfaceC37369k;
        this.f164671k = interfaceC37369k.mo3102o(0, 1);
        interfaceC37369k.mo3098l();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException {
        int iMo102731b;
        int i13;
        AbstractC24543a.m71574j(this.f164671k);
        int i14 = AbstractC24567y.f95875a;
        if (((C37364f) interfaceC37368j).f159852z == 0 && !m123243c(interfaceC37368j)) {
            throw ParserException.m15562a(null, "Could not find AMR header.");
        }
        if (!this.f164673m) {
            this.f164673m = true;
            boolean z4 = this.f164662b;
            String str = z4 ? "audio/amr-wb" : "audio/3gpp";
            int i15 = z4 ? 16000 : 8000;
            InterfaceC37377s interfaceC37377s = this.f164671k;
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130047k = str;
            c31518b0.f130048l = f164660r;
            c31518b0.f130060x = 1;
            c31518b0.f130061y = i15;
            interfaceC37377s.mo102730a(new C31521c0(c31518b0));
        }
        int i16 = -1;
        if (this.f164665e == 0) {
            try {
                int iM123242a = m123242a(interfaceC37368j);
                this.f164664d = iM123242a;
                this.f164665e = iM123242a;
                if (this.f164667g == -1) {
                    long j7 = ((C37364f) interfaceC37368j).f159852z;
                    this.f164667g = iM123242a;
                }
                if (this.f164667g == iM123242a) {
                    this.f164668h++;
                }
                iMo102731b = this.f164671k.mo102731b(interfaceC37368j, this.f164665e, true);
                if (iMo102731b != -1) {
                    i13 = this.f164665e - iMo102731b;
                    this.f164665e = i13;
                    i16 = 0;
                    if (i13 <= 0) {
                        this.f164671k.mo102733d(this.f164663c + this.f164669i, 1, this.f164664d, 0, null);
                        this.f164663c += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo102731b = this.f164671k.mo102731b(interfaceC37368j, this.f164665e, true);
            if (iMo102731b != -1) {
                i13 = this.f164665e - iMo102731b;
                this.f164665e = i13;
                i16 = 0;
                if (i13 <= 0) {
                    this.f164671k.mo102733d(this.f164663c + this.f164669i, 1, this.f164664d, 0, null);
                    this.f164663c += 20000;
                }
            }
        }
        if (!this.f164666f) {
            C37370l c37370l = new C37370l(-9223372036854775807L);
            this.f164672l = c37370l;
            this.f164670j.mo3111x(c37370l);
            this.f164666f = true;
        }
        return i16;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
