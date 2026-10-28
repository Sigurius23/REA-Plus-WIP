package p208i2;

import androidx.room.AbstractC1772c1;
import p002a0.C0023g0;
import p240j2.AbstractC21222c;
import p240j2.AbstractC21227h;
import p240j2.AbstractC21229j;
import p240j2.C21223d;
import p240j2.C21226g;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: i2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C17919x {

    /* JADX INFO: renamed from: b */
    public static final long f69625b = AbstractC17918w0.m51517e(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f69626c = AbstractC17918w0.m51517e(4282664004L);

    /* JADX INFO: renamed from: d */
    public static final long f69627d = AbstractC17918w0.m51517e(4287137928L);

    /* JADX INFO: renamed from: e */
    public static final long f69628e = AbstractC17918w0.m51517e(4291611852L);

    /* JADX INFO: renamed from: f */
    public static final long f69629f = AbstractC17918w0.m51517e(4294967295L);

    /* JADX INFO: renamed from: g */
    public static final long f69630g = AbstractC17918w0.m51517e(4294901760L);

    /* JADX INFO: renamed from: h */
    public static final long f69631h = AbstractC17918w0.m51517e(4278255360L);

    /* JADX INFO: renamed from: i */
    public static final long f69632i = AbstractC17918w0.m51517e(4278190335L);

    /* JADX INFO: renamed from: j */
    public static final long f69633j = AbstractC17918w0.m51517e(4294967040L);

    /* JADX INFO: renamed from: k */
    public static final long f69634k = AbstractC17918w0.m51517e(4278255615L);

    /* JADX INFO: renamed from: l */
    public static final long f69635l = AbstractC17918w0.m51517e(4294902015L);

    /* JADX INFO: renamed from: m */
    public static final long f69636m = AbstractC17918w0.m51515c(0);

    /* JADX INFO: renamed from: n */
    public static final long f69637n = AbstractC17918w0.m51514b(0.0f, 0.0f, 0.0f, 0.0f, C21223d.f81039u);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f69638o = 0;

    /* JADX INFO: renamed from: a */
    public final long f69639a;

    public /* synthetic */ C17919x(long j7) {
        this.f69639a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C17919x m51539a(long j7) {
        return new C17919x(j7);
    }

    /* JADX INFO: renamed from: b */
    public static final long m51540b(long j7, AbstractC21222c abstractC21222c) {
        C21226g c21226gM59557e;
        AbstractC21222c abstractC21222cM51545g = m51545g(j7);
        int i13 = abstractC21222cM51545g.f81018c;
        int i14 = abstractC21222c.f81018c;
        if ((i13 | i14) < 0) {
            c21226gM59557e = AbstractC21229j.m59557e(abstractC21222cM51545g, abstractC21222c);
        } else {
            C0023g0 c0023g0 = AbstractC21227h.f81051a;
            int i15 = i13 | (i14 << 6);
            Object objM121b = c0023g0.m121b(i15);
            if (objM121b == null) {
                objM121b = AbstractC21229j.m59557e(abstractC21222cM51545g, abstractC21222c);
                c0023g0.m51h(i15, objM121b);
            }
            c21226gM59557e = (C21226g) objM121b;
        }
        return c21226gM59557e.mo59552a(j7);
    }

    /* JADX INFO: renamed from: c */
    public static long m51541c(float f13, long j7) {
        return AbstractC17918w0.m51514b(m51547i(j7), m51546h(j7), m51544f(j7), f13, m51545g(j7));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m51542d(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: e */
    public static final float m51543e(long j7) {
        float fM5383T;
        float f13;
        if ((63 & j7) == 0) {
            fM5383T = (float) AbstractC1772c1.m5383T((j7 >>> 56) & 255);
            f13 = 255.0f;
        } else {
            fM5383T = (float) AbstractC1772c1.m5383T((j7 >>> 6) & 1023);
            f13 = 1023.0f;
        }
        return fM5383T / f13;
    }

    /* JADX INFO: renamed from: f */
    public static final float m51544f(long j7) {
        int i13;
        int i14;
        int i15;
        if ((63 & j7) == 0) {
            return ((float) AbstractC1772c1.m5383T((j7 >>> 32) & 255)) / 255.0f;
        }
        short s13 = (short) ((j7 >>> 16) & 65535);
        int i16 = Short.MIN_VALUE & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + 112;
            }
            int i24 = i13;
            i14 = i19;
            i15 = i24;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - AbstractC17880e0.f69565a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC21222c m51545g(long j7) {
        float[] fArr = C21223d.f81019a;
        return C21223d.f81043y[(int) (j7 & 63)];
    }

    /* JADX INFO: renamed from: h */
    public static final float m51546h(long j7) {
        int i13;
        int i14;
        int i15;
        if ((63 & j7) == 0) {
            return ((float) AbstractC1772c1.m5383T((j7 >>> 40) & 255)) / 255.0f;
        }
        short s13 = (short) ((j7 >>> 32) & 65535);
        int i16 = Short.MIN_VALUE & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + 112;
            }
            int i24 = i13;
            i14 = i19;
            i15 = i24;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - AbstractC17880e0.f69565a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    /* JADX INFO: renamed from: i */
    public static final float m51547i(long j7) {
        int i13;
        int i14;
        int i15;
        if ((63 & j7) == 0) {
            return ((float) AbstractC1772c1.m5383T((j7 >>> 48) & 255)) / 255.0f;
        }
        short s13 = (short) ((j7 >>> 48) & 65535);
        int i16 = Short.MIN_VALUE & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + 112;
            }
            int i24 = i13;
            i14 = i19;
            i15 = i24;
        } else {
            if (i18 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i18 + 1056964608) - AbstractC17880e0.f69565a;
                return i16 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    /* JADX INFO: renamed from: j */
    public static String m51548j(long j7) {
        StringBuilder sb4 = new StringBuilder("Color(");
        sb4.append(m51547i(j7));
        sb4.append(", ");
        sb4.append(m51546h(j7));
        sb4.append(", ");
        sb4.append(m51544f(j7));
        sb4.append(", ");
        sb4.append(m51543e(j7));
        sb4.append(", ");
        return AbstractC25012a.m73377j(sb4, m51545g(j7).f81016a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17919x) {
            return this.f69639a == ((C17919x) obj).f69639a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69639a);
    }

    public final String toString() {
        return m51548j(this.f69639a);
    }
}
