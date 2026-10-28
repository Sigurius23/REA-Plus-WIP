package p499t9;

import in.C18715c;
import in.InterfaceC18714b;
import java.util.Arrays;
import java.util.Collections;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import so.C32800q;

/* JADX INFO: renamed from: t9.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C33653v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140443a;

    /* JADX INFO: renamed from: b */
    public final int f140444b;

    /* JADX INFO: renamed from: c */
    public final int f140445c;

    /* JADX INFO: renamed from: d */
    public final int f140446d;

    /* JADX INFO: renamed from: e */
    public final int f140447e;

    /* JADX INFO: renamed from: f */
    public final int f140448f;

    /* JADX INFO: renamed from: g */
    public final int f140449g;

    /* JADX INFO: renamed from: h */
    public final int f140450h;

    /* JADX INFO: renamed from: i */
    public final int f140451i;

    /* JADX INFO: renamed from: j */
    public final int f140452j;

    /* JADX INFO: renamed from: k */
    public final long f140453k;

    /* JADX INFO: renamed from: l */
    public final Object f140454l;

    /* JADX INFO: renamed from: m */
    public final Object f140455m;

    public C33653v(byte[] bArr, int i13, int i14) {
        this.f140443a = i14;
        switch (i14) {
            case 1:
                C24561s c24561s = new C24561s(bArr, bArr.length, 0, (byte) 0);
                c24561s.m71640q(i13 * 8);
                this.f140444b = c24561s.m71632i(16);
                this.f140445c = c24561s.m71632i(16);
                this.f140446d = c24561s.m71632i(24);
                this.f140447e = c24561s.m71632i(24);
                int iM71632i = c24561s.m71632i(20);
                this.f140448f = iM71632i;
                this.f140449g = m106291g(iM71632i);
                this.f140450h = c24561s.m71632i(3) + 1;
                int iM71632i2 = c24561s.m71632i(5) + 1;
                this.f140451i = iM71632i2;
                this.f140452j = m106289b(iM71632i2);
                int iM71632i3 = c24561s.m71632i(4);
                int iM71632i4 = c24561s.m71632i(32);
                int i15 = AbstractC24567y.f95875a;
                this.f140453k = ((((long) iM71632i3) & 4294967295L) << 32) | (((long) iM71632i4) & 4294967295L);
                this.f140454l = null;
                this.f140455m = null;
                break;
            default:
                C24561s c24561s2 = new C24561s(bArr, bArr.length, 5, (byte) 0);
                c24561s2.m71640q(i13 * 8);
                this.f140444b = c24561s2.m71632i(16);
                this.f140445c = c24561s2.m71632i(16);
                this.f140446d = c24561s2.m71632i(24);
                this.f140447e = c24561s2.m71632i(24);
                int iM71632i5 = c24561s2.m71632i(20);
                this.f140448f = iM71632i5;
                this.f140449g = m106290f(iM71632i5);
                this.f140450h = c24561s2.m71632i(3) + 1;
                int iM71632i6 = c24561s2.m71632i(5) + 1;
                this.f140451i = iM71632i6;
                this.f140452j = m106288a(iM71632i6);
                this.f140453k = c24561s2.m71634k(36);
                this.f140454l = null;
                this.f140455m = null;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m106288a(int i13) {
        if (i13 == 8) {
            return 1;
        }
        if (i13 == 12) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 20) {
            return 5;
        }
        if (i13 != 24) {
            return i13 != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static int m106289b(int i13) {
        if (i13 == 8) {
            return 1;
        }
        if (i13 == 12) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 != 20) {
            return i13 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: f */
    public static int m106290f(int i13) {
        switch (i13) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m106291g(int i13) {
        switch (i13) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m106292c() {
        switch (this.f140443a) {
            case 0:
                long j7 = this.f140453k;
                if (j7 == 0) {
                    return -9223372036854775807L;
                }
                return (j7 * 1000000) / ((long) this.f140448f);
            default:
                long j13 = this.f140453k;
                if (j13 == 0) {
                    return -9223372036854775807L;
                }
                return (j13 * 1000000) / ((long) this.f140448f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX INFO: renamed from: d */
    public C31521c0 m106293d(byte[] bArr, C18715c c18715c) {
        bArr[4] = -128;
        int i13 = this.f140447e;
        if (i13 <= 0) {
            i13 = -1;
        }
        C18715c c18715c2 = (C18715c) this.f140455m;
        if (c18715c2 != null) {
            if (c18715c == null) {
                c18715c = c18715c2;
            } else {
                InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
                if (interfaceC18714bArr.length == 0) {
                    c18715c = c18715c2;
                } else {
                    InterfaceC18714b[] interfaceC18714bArr2 = c18715c2.f73525w;
                    int i14 = AbstractC24567y.f95875a;
                    Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr2, interfaceC18714bArr2.length + interfaceC18714bArr.length);
                    System.arraycopy(interfaceC18714bArr, 0, objArrCopyOf, interfaceC18714bArr2.length, interfaceC18714bArr.length);
                    c18715c = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                }
            }
        }
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "audio/flac";
        c31518b0.f130048l = i13;
        c31518b0.f130060x = this.f140450h;
        c31518b0.f130061y = this.f140448f;
        c31518b0.f130049m = Collections.singletonList(bArr);
        c31518b0.f130045i = c18715c;
        return new C31521c0(c31518b0);
    }

    /* JADX INFO: renamed from: e */
    public C34610p m106294e(byte[] bArr, C34585c0 c34585c0) {
        bArr[4] = -128;
        int i13 = this.f140447e;
        if (i13 <= 0) {
            i13 = -1;
        }
        C34585c0 c34585c1 = (C34585c0) this.f140455m;
        if (c34585c1 != null) {
            c34585c0 = c34585c1.m109366b(c34585c0);
        }
        C34608o c34608o = new C34608o();
        c34608o.f145741m = AbstractC34587d0.m109382o("audio/flac");
        c34608o.f145742n = i13;
        c34608o.f145719C = this.f140450h;
        c34608o.f145720D = this.f140448f;
        c34608o.f145721E = AbstractC38065t.m121930w(this.f140451i);
        c34608o.f145744p = Collections.singletonList(bArr);
        c34608o.f145739k = c34585c0;
        return new C34610p(c34608o);
    }

    public C33653v(int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, C32800q c32800q, C18715c c18715c) {
        this.f140443a = 1;
        this.f140444b = i13;
        this.f140445c = i14;
        this.f140446d = i15;
        this.f140447e = i16;
        this.f140448f = i17;
        this.f140449g = m106291g(i17);
        this.f140450h = i18;
        this.f140451i = i19;
        this.f140452j = m106289b(i19);
        this.f140453k = j7;
        this.f140454l = c32800q;
        this.f140455m = c18715c;
    }

    public C33653v(int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j7, C33652u c33652u, C34585c0 c34585c0) {
        this.f140443a = 0;
        this.f140444b = i13;
        this.f140445c = i14;
        this.f140446d = i15;
        this.f140447e = i16;
        this.f140448f = i17;
        this.f140449g = m106290f(i17);
        this.f140450h = i18;
        this.f140451i = i19;
        this.f140452j = m106288a(i19);
        this.f140453k = j7;
        this.f140454l = c33652u;
        this.f140455m = c34585c0;
    }
}
