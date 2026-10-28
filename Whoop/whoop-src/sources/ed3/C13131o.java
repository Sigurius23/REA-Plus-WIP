package ed3;

import dd3.EnumC11973b;
import java.io.EOFException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p123en.C13358e;
import p309lo.AbstractC24543a;
import p499t9.InterfaceC33646o;
import p588wm.InterfaceC37368j;
import p607x8.C38059n;
import p715kotlin.NoWhenBranchMatchedException;
import va3.AbstractC35849g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ed3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13131o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45420a;

    /* JADX INFO: renamed from: b */
    public int f45421b;

    /* JADX INFO: renamed from: c */
    public int f45422c;

    /* JADX INFO: renamed from: d */
    public boolean f45423d;

    /* JADX INFO: renamed from: e */
    public final Object f45424e;

    /* JADX INFO: renamed from: f */
    public Object f45425f;

    public C13131o(C13117a c13117a) {
        this.f45420a = 0;
        this.f45424e = c13117a;
        this.f45421b = -1;
        this.f45425f = EnumC13128l.INVALID;
    }

    /* JADX INFO: renamed from: b */
    public static void m36740b(int i13) {
        if (i13 < 0) {
            throw new ProtobufDecodingException(AbstractC2875y.m8295h(i13, "Unexpected negative length: "), null);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m36741a(int i13) {
        int i14;
        int i15;
        switch (this.f45420a) {
            case 1:
                int i16 = 0;
                this.f45422c = 0;
                do {
                    int i17 = this.f45422c;
                    int i18 = i13 + i17;
                    C13358e c13358e = (C13358e) this.f45424e;
                    if (i18 < c13358e.f46689c) {
                        int[] iArr = c13358e.f46692f;
                        this.f45422c = i17 + 1;
                        i14 = iArr[i18];
                        i16 += i14;
                    }
                    return i16;
                } while (i14 == 255);
                return i16;
            default:
                int i19 = 0;
                this.f45422c = 0;
                do {
                    int i24 = this.f45422c;
                    int i25 = i13 + i24;
                    C13358e c13358e2 = (C13358e) this.f45424e;
                    if (i25 < c13358e2.f46689c) {
                        int[] iArr2 = c13358e2.f46692f;
                        this.f45422c = i24 + 1;
                        i15 = iArr2[i25];
                        i19 += i15;
                    }
                    return i19;
                } while (i15 == 255);
                return i19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a A[LOOP:0: B:22:0x003e->B:29:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004e A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public int m36742c(EnumC11973b enumC11973b) {
        int i13;
        int iM36695e;
        C13117a c13117a = (C13117a) this.f45424e;
        int iOrdinal = enumC11973b.ordinal();
        if (iOrdinal == 0) {
            return (int) c13117a.m36685G(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m36753n();
            }
            throw new NoWhenBranchMatchedException();
        }
        int i14 = c13117a.f45383c;
        int i15 = c13117a.f45382b;
        if (i14 == i15) {
            throw new SerializationException("Unexpected EOF");
        }
        byte[] bArr = c13117a.f45381a;
        int i16 = i14 + 1;
        int i17 = bArr[i14];
        if (i17 >= 0) {
            c13117a.f45383c = i16;
        } else {
            if (i15 - i14 <= 1) {
                i13 = 0;
                for (int i18 = 0; i18 < 32; i18 += 7) {
                    iM36695e = c13117a.m36695e();
                    i13 |= (iM36695e & 127) << i18;
                    if ((iM36695e & 128) == 0) {
                        i17 = i13;
                    }
                }
                throw new SerializationException("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            int i19 = i14 + 2;
            int i24 = (bArr[i16] << 7) ^ i17;
            if (i24 >= 0) {
                i13 = 0;
                while (i18 < 32) {
                    iM36695e = c13117a.m36695e();
                    i13 |= (iM36695e & 127) << i18;
                    if ((iM36695e & 128) == 0) {
                        i17 = i13;
                    }
                }
                throw new SerializationException("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            c13117a.f45383c = i19;
            i17 = (i24 == true ? 1 : 0) ^ (-128);
        }
        return (((((i17 << 31) >> 31) ^ i17) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i17);
    }

    /* JADX INFO: renamed from: d */
    public long m36743d(EnumC11973b enumC11973b) {
        C13117a c13117a = (C13117a) this.f45424e;
        int iOrdinal = enumC11973b.ordinal();
        if (iOrdinal == 0) {
            return c13117a.m36685G(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m36755p();
            }
            throw new NoWhenBranchMatchedException();
        }
        long jM36685G = c13117a.m36685G(false);
        return (jM36685G & Long.MIN_VALUE) ^ ((((jM36685G << 63) >> 63) ^ jM36685G) >> 1);
    }

    /* JADX INFO: renamed from: e */
    public C13117a m36744e() {
        EnumC13128l enumC13128l = EnumC13128l.SIZE_DELIMITED;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return m36745f();
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: f */
    public C13117a m36745f() {
        int iM36742c = m36742c(EnumC11973b.DEFAULT);
        m36740b(iM36742c);
        C13117a c13117a = (C13117a) this.f45424e;
        c13117a.m36694c(iM36742c);
        C13117a c13117a2 = new C13117a(c13117a.f45381a, c13117a.f45383c + iM36742c, 0, false);
        c13117a2.f45383c = c13117a.f45383c;
        c13117a.f45383c += iM36742c;
        return c13117a2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m36746g(InterfaceC33646o interfaceC33646o) {
        int i13;
        C13358e c13358e = (C13358e) this.f45424e;
        C38059n c38059n = (C38059n) this.f45425f;
        AbstractC35849g.m113807i(interfaceC33646o != null);
        if (this.f45423d) {
            this.f45423d = false;
            c38059n.m121843C(0);
        }
        while (!this.f45423d) {
            if (this.f45421b < 0) {
                if (c13358e.m37619c(interfaceC33646o, -1L) && c13358e.m37617a(interfaceC33646o, true)) {
                    int iM36741a = c13358e.f46690d;
                    if ((c13358e.f46687a & 1) == 1 && c38059n.f163019c == 0) {
                        iM36741a += m36741a(0);
                        i13 = this.f45422c;
                    } else {
                        i13 = 0;
                    }
                    try {
                        interfaceC33646o.mo3100n(iM36741a);
                        this.f45421b = i13;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM36741a2 = m36741a(this.f45421b);
            int i14 = this.f45421b + this.f45422c;
            if (iM36741a2 > 0) {
                c38059n.m121849b(c38059n.f163019c + iM36741a2);
                try {
                    interfaceC33646o.readFully(c38059n.f163017a, c38059n.f163019c, iM36741a2);
                    c38059n.m121845E(c38059n.f163019c + iM36741a2);
                    this.f45423d = c13358e.f46692f[i14 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i14 == c13358e.f46689c) {
                i14 = -1;
            }
            this.f45421b = i14;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m36747h(InterfaceC37368j interfaceC37368j) {
        int i13;
        C13358e c13358e = (C13358e) this.f45424e;
        C13117a c13117a = (C13117a) this.f45425f;
        AbstractC24543a.m71573i(interfaceC37368j != null);
        if (this.f45423d) {
            this.f45423d = false;
            c13117a.m36686H(0);
        }
        while (!this.f45423d) {
            if (this.f45421b < 0) {
                if (c13358e.m37620d(interfaceC37368j, -1L) && c13358e.m37618b(interfaceC37368j, true)) {
                    int iM36741a = c13358e.f46690d;
                    if ((c13358e.f46687a & 1) == 1 && c13117a.f45383c == 0) {
                        iM36741a += m36741a(0);
                        i13 = this.f45422c;
                    } else {
                        i13 = 0;
                    }
                    try {
                        interfaceC37368j.mo3100n(iM36741a);
                        this.f45421b = i13;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM36741a2 = m36741a(this.f45421b);
            int i14 = this.f45421b + this.f45422c;
            if (iM36741a2 > 0) {
                c13117a.m36693b(c13117a.f45383c + iM36741a2);
                try {
                    interfaceC37368j.readFully(c13117a.f45381a, c13117a.f45383c, iM36741a2);
                    c13117a.m36688J(c13117a.f45383c + iM36741a2);
                    this.f45423d = c13358e.f46692f[i14 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i14 == c13358e.f46689c) {
                i14 = -1;
            }
            this.f45421b = i14;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public byte[] m36748i() {
        EnumC13128l enumC13128l = EnumC13128l.SIZE_DELIMITED;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return m36749j();
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: j */
    public byte[] m36749j() {
        int iM36742c = m36742c(EnumC11973b.DEFAULT);
        m36740b(iM36742c);
        C13117a c13117a = (C13117a) this.f45424e;
        c13117a.m36694c(iM36742c);
        byte[] bArr = new byte[iM36742c];
        int i13 = c13117a.f45382b;
        int i14 = c13117a.f45383c;
        int i15 = i13 - i14;
        if (i15 < iM36742c) {
            iM36742c = i15;
        }
        AbstractC25260n.m74060c0(0, i14, i14 + iM36742c, c13117a.f45381a, bArr);
        c13117a.f45383c += iM36742c;
        return bArr;
    }

    /* JADX INFO: renamed from: k */
    public double m36750k() {
        EnumC13128l enumC13128l = EnumC13128l.i64;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return Double.longBitsToDouble(m36755p());
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: l */
    public float m36751l() {
        EnumC13128l enumC13128l = EnumC13128l.i32;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return Float.intBitsToFloat(m36753n());
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: m */
    public int m36752m(EnumC11973b enumC11973b) {
        EnumC13128l enumC13128l = enumC11973b == EnumC11973b.FIXED ? EnumC13128l.i32 : EnumC13128l.VARINT;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return m36742c(enumC11973b);
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: n */
    public int m36753n() {
        int iM36695e = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            iM36695e |= (((C13117a) this.f45424e).m36695e() & 255) << (i13 * 8);
        }
        return iM36695e;
    }

    /* JADX INFO: renamed from: o */
    public long m36754o(EnumC11973b enumC11973b) {
        EnumC13128l enumC13128l = enumC11973b == EnumC11973b.FIXED ? EnumC13128l.i64 : EnumC13128l.VARINT;
        if (((EnumC13128l) this.f45425f) == enumC13128l) {
            return m36743d(enumC11973b);
        }
        throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
    }

    /* JADX INFO: renamed from: p */
    public long m36755p() {
        long jM36695e = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            jM36695e |= ((long) (((C13117a) this.f45424e).m36695e() & 255)) << (i13 * 8);
        }
        return jM36695e;
    }

    /* JADX INFO: renamed from: q */
    public String m36756q() {
        EnumC13128l enumC13128l = EnumC13128l.SIZE_DELIMITED;
        if (((EnumC13128l) this.f45425f) != enumC13128l) {
            throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
        }
        int iM36742c = m36742c(EnumC11973b.DEFAULT);
        m36740b(iM36742c);
        C13117a c13117a = (C13117a) this.f45424e;
        byte[] bArr = c13117a.f45381a;
        int i13 = c13117a.f45383c;
        String strM125918C = AbstractC39421y.m125918C(i13, i13 + iM36742c, 4, bArr);
        c13117a.f45383c += iM36742c;
        return strM125918C;
    }

    /* JADX INFO: renamed from: r */
    public int m36757r() {
        if (!this.f45423d) {
            this.f45422c = (this.f45421b << 3) | ((EnumC13128l) this.f45425f).f45407w;
            return m36759t((int) ((C13117a) this.f45424e).m36685G(true));
        }
        this.f45423d = false;
        int i13 = (this.f45421b << 3) | ((EnumC13128l) this.f45425f).f45407w;
        int iM36759t = m36759t(this.f45422c);
        this.f45422c = i13;
        return iM36759t;
    }

    /* JADX INFO: renamed from: s */
    public void m36758s() {
        int iOrdinal = ((EnumC13128l) this.f45425f).ordinal();
        if (iOrdinal == 1) {
            m36752m(EnumC11973b.DEFAULT);
            return;
        }
        if (iOrdinal == 2) {
            m36754o(EnumC11973b.FIXED);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                m36752m(EnumC11973b.FIXED);
                return;
            } else {
                throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + ((EnumC13128l) this.f45425f), null);
            }
        }
        EnumC13128l enumC13128l = EnumC13128l.SIZE_DELIMITED;
        if (((EnumC13128l) this.f45425f) != enumC13128l) {
            throw new ProtobufDecodingException("Expected wire type " + enumC13128l + ", but found " + ((EnumC13128l) this.f45425f), null);
        }
        int iM36742c = m36742c(EnumC11973b.DEFAULT);
        m36740b(iM36742c);
        C13117a c13117a = (C13117a) this.f45424e;
        c13117a.m36694c(iM36742c);
        c13117a.f45383c += iM36742c;
    }

    /* JADX INFO: renamed from: t */
    public int m36759t(int i13) {
        if (i13 == -1) {
            this.f45421b = -1;
            this.f45425f = EnumC13128l.INVALID;
            return -1;
        }
        this.f45421b = i13 >>> 3;
        EnumC13128l.f45404x.getClass();
        this.f45425f = EnumC13128l.f45405y[i13 & 7];
        return this.f45421b;
    }

    public C13131o(int i13) {
        this.f45420a = i13;
        switch (i13) {
            case 2:
                this.f45424e = new C13358e(1);
                this.f45425f = new C38059n(new byte[65025], 0);
                this.f45421b = -1;
                break;
            default:
                this.f45424e = new C13358e(0);
                this.f45425f = new C13117a(new byte[65025], 0, 1, false);
                this.f45421b = -1;
                break;
        }
    }
}
