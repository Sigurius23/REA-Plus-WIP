package p240j2;

import io.sentry.okhttp.C20450b;
import java.util.Arrays;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: j2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C21236q extends AbstractC21222c {

    /* JADX INFO: renamed from: r */
    public static final C20450b f81070r = new C20450b(8);

    /* JADX INFO: renamed from: d */
    public final C21238s f81071d;

    /* JADX INFO: renamed from: e */
    public final float f81072e;

    /* JADX INFO: renamed from: f */
    public final float f81073f;

    /* JADX INFO: renamed from: g */
    public final C21237r f81074g;

    /* JADX INFO: renamed from: h */
    public final float[] f81075h;

    /* JADX INFO: renamed from: i */
    public final float[] f81076i;

    /* JADX INFO: renamed from: j */
    public final float[] f81077j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC21228i f81078k;

    /* JADX INFO: renamed from: l */
    public final C21235p f81079l;

    /* JADX INFO: renamed from: m */
    public final C21232m f81080m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC21228i f81081n;

    /* JADX INFO: renamed from: o */
    public final C21235p f81082o;

    /* JADX INFO: renamed from: p */
    public final C21232m f81083p;

    /* JADX INFO: renamed from: q */
    public final boolean f81084q;

    public C21236q(String str, float[] fArr, C21238s c21238s, final C21237r c21237r, int i13) {
        InterfaceC21228i interfaceC21228i;
        InterfaceC21228i interfaceC21228i2;
        double d3 = c21237r.f81085a;
        boolean z4 = d3 == -3.0d;
        double d14 = c21237r.f81091g;
        double d15 = c21237r.f81090f;
        if (z4) {
            final int i14 = 4;
            interfaceC21228i = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i15 = i14;
                    C21237r c21237r2 = c21237r;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i15 = 5;
            interfaceC21228i = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i16 = i15;
                    C21237r c21237r2 = c21237r;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else if (d15 == 0.0d && d14 == 0.0d) {
            final int i16 = 6;
            interfaceC21228i = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i17 = i16;
                    C21237r c21237r2 = c21237r;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else {
            final int i17 = 7;
            interfaceC21228i = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i18 = i17;
                    C21237r c21237r2 = c21237r;
                    switch (i18) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        }
        if (d3 == -3.0d) {
            final int i18 = 0;
            interfaceC21228i2 = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i19 = i18;
                    C21237r c21237r2 = c21237r;
                    switch (i19) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i19 = 1;
            interfaceC21228i2 = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i110 = i19;
                    C21237r c21237r2 = c21237r;
                    switch (i110) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else if (d15 == 0.0d && d14 == 0.0d) {
            final int i24 = 2;
            interfaceC21228i2 = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i110 = i24;
                    C21237r c21237r2 = c21237r;
                    switch (i110) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        } else {
            final int i25 = 3;
            interfaceC21228i2 = new InterfaceC21228i() { // from class: j2.o
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d16) {
                    int i110 = i25;
                    C21237r c21237r2 = c21237r;
                    switch (i110) {
                        case 0:
                            float[] fArr2 = C21223d.f81019a;
                            return C21223d.m59548a(c21237r2, d16);
                        case 1:
                            float[] fArr3 = C21223d.f81019a;
                            return C21223d.m59550c(c21237r2, d16);
                        case 2:
                            double d17 = c21237r2.f81086b;
                            return d16 >= c21237r2.f81089e ? Math.pow((d17 * d16) + c21237r2.f81087c, c21237r2.f81085a) : d16 * c21237r2.f81088d;
                        case 3:
                            double d18 = c21237r2.f81086b;
                            double d19 = c21237r2.f81087c;
                            double d24 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e ? Math.pow((d18 * d16) + d19, c21237r2.f81085a) + c21237r2.f81090f : (d24 * d16) + c21237r2.f81091g;
                        case 4:
                            float[] fArr4 = C21223d.f81019a;
                            return C21223d.m59549b(c21237r2, d16);
                        case 5:
                            float[] fArr5 = C21223d.f81019a;
                            return C21223d.m59551d(c21237r2, d16);
                        case 6:
                            double d25 = c21237r2.f81086b;
                            double d26 = c21237r2.f81087c;
                            double d27 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d27 ? (Math.pow(d16, 1.0d / c21237r2.f81085a) - d26) / d25 : d16 / d27;
                        default:
                            double d28 = c21237r2.f81086b;
                            double d29 = c21237r2.f81087c;
                            double d32 = c21237r2.f81088d;
                            return d16 >= c21237r2.f81089e * d32 ? (Math.pow(d16 - c21237r2.f81090f, 1.0d / c21237r2.f81085a) - d29) / d28 : (d16 - c21237r2.f81091g) / d32;
                    }
                }
            };
        }
        this(str, fArr, c21238s, null, interfaceC21228i, interfaceC21228i2, 0.0f, 1.0f, c21237r, i13);
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: a */
    public final float mo59542a(int i13) {
        return this.f81073f;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: b */
    public final float mo59543b(int i13) {
        return this.f81072e;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: c */
    public final boolean mo59544c() {
        return this.f81084q;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: d */
    public final long mo59545d(float f13, float f14, float f15) {
        double d3 = f13;
        C21232m c21232m = this.f81083p;
        float fMo56647i = (float) c21232m.mo56647i(d3);
        float fMo56647i2 = (float) c21232m.mo56647i(f14);
        float fMo56647i3 = (float) c21232m.mo56647i(f15);
        float[] fArr = this.f81076i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f16 = (fArr[6] * fMo56647i3) + (fArr[3] * fMo56647i2) + (fArr[0] * fMo56647i);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo56647i3) + (fArr[4] * fMo56647i2) + (fArr[1] * fMo56647i))) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: e */
    public final float mo59546e(float f13, float f14, float f15) {
        double d3 = f13;
        C21232m c21232m = this.f81083p;
        float fMo56647i = (float) c21232m.mo56647i(d3);
        float fMo56647i2 = (float) c21232m.mo56647i(f14);
        float fMo56647i3 = (float) c21232m.mo56647i(f15);
        float[] fArr = this.f81076i;
        return (fArr[8] * fMo56647i3) + (fArr[5] * fMo56647i2) + (fArr[2] * fMo56647i);
    }

    @Override // p240j2.AbstractC21222c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21236q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C21236q c21236q = (C21236q) obj;
        C21237r c21237r = c21236q.f81074g;
        if (Float.compare(c21236q.f81072e, this.f81072e) != 0 || Float.compare(c21236q.f81073f, this.f81073f) != 0 || !AbstractC22676k.m65745e(this.f81071d, c21236q.f81071d) || !Arrays.equals(this.f81075h, c21236q.f81075h)) {
            return false;
        }
        C21237r c21237r2 = this.f81074g;
        if (c21237r2 != null) {
            return AbstractC22676k.m65745e(c21237r2, c21237r);
        }
        if (c21237r == null) {
            return true;
        }
        if (AbstractC22676k.m65745e(this.f81078k, c21236q.f81078k)) {
            return AbstractC22676k.m65745e(this.f81081n, c21236q.f81081n);
        }
        return false;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: f */
    public final long mo59547f(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c) {
        float[] fArr = this.f81077j;
        float f17 = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
        C21232m c21232m = this.f81080m;
        return AbstractC17918w0.m51514b((float) c21232m.mo56647i(f17), (float) c21232m.mo56647i(f18), (float) c21232m.mo56647i(f19), f16, abstractC21222c);
    }

    @Override // p240j2.AbstractC21222c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f81075h) + ((this.f81071d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f13 = this.f81072e;
        int iFloatToIntBits = (iHashCode + (f13 == 0.0f ? 0 : Float.floatToIntBits(f13))) * 31;
        float f14 = this.f81073f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f14 == 0.0f ? 0 : Float.floatToIntBits(f14))) * 31;
        C21237r c21237r = this.f81074g;
        int iHashCode2 = iFloatToIntBits2 + (c21237r != null ? c21237r.hashCode() : 0);
        if (c21237r == null) {
            return this.f81081n.hashCode() + ((this.f81078k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0231  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C21236q(String str, float[] fArr, C21238s c21238s, float[] fArr2, InterfaceC21228i interfaceC21228i, InterfaceC21228i interfaceC21228i2, float f13, float f14, C21237r c21237r, int i13) {
        int i14;
        float f15;
        float f16;
        float[] fArr3;
        C21236q c21236q;
        double d3;
        int i15;
        super(i13, str, AbstractC21221b.f81011a);
        this.f81071d = c21238s;
        this.f81072e = f13;
        this.f81073f = f14;
        this.f81074g = c21237r;
        this.f81078k = interfaceC21228i;
        boolean z4 = 1;
        z4 = 1;
        this.f81079l = new C21235p(this, z4 ? 1 : 0);
        int i16 = 0;
        this.f81080m = new C21232m(this, i16);
        this.f81081n = interfaceC21228i2;
        this.f81082o = new C21235p(this, i16);
        this.f81083p = new C21232m(this, z4 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f13 < f14) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                float f19 = f17 + f18 + fArr[2];
                fArr4[0] = f17 / f19;
                fArr4[1] = f18 / f19;
                float f24 = fArr[3];
                float f25 = fArr[4];
                float f26 = f24 + f25 + fArr[5];
                fArr4[2] = f24 / f26;
                fArr4[3] = f25 / f26;
                float f27 = fArr[6];
                float f28 = fArr[7];
                float f29 = f27 + f28 + fArr[8];
                fArr4[4] = f27 / f29;
                fArr4[5] = f28 / f29;
            } else {
                System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.f81075h = fArr4;
            if (fArr2 == null) {
                float f34 = fArr4[0];
                float f35 = fArr4[1];
                float f36 = fArr4[2];
                float f37 = fArr4[3];
                float f38 = fArr4[4];
                float f39 = fArr4[5];
                f15 = 1.0f;
                float f43 = c21238s.f81092a;
                i14 = 0;
                float f44 = c21238s.f81093b;
                float f45 = 1;
                float f46 = (f45 - f34) / f35;
                float f47 = (f45 - f36) / f37;
                float f48 = (f45 - f38) / f39;
                float f49 = (f45 - f43) / f44;
                float f54 = f34 / f35;
                float f55 = (f36 / f37) - f54;
                float f56 = (f43 / f44) - f54;
                float f57 = f47 - f46;
                float f58 = (f38 / f39) - f54;
                float f59 = (((f49 - f46) * f55) - (f56 * f57)) / (((f48 - f46) * f55) - (f57 * f58));
                float f64 = (f56 - (f58 * f59)) / f55;
                float f65 = (1.0f - f64) - f59;
                float f66 = f65 / f35;
                float f67 = f64 / f37;
                float f68 = f59 / f39;
                this.f81076i = new float[]{f66 * f34, f65, ((1.0f - f34) - f35) * f66, f67 * f36, f64, ((1.0f - f36) - f37) * f67, f68 * f38, f59, ((1.0f - f38) - f39) * f68};
            } else {
                i14 = 0;
                f15 = 1.0f;
                if (fArr2.length == 9) {
                    this.f81076i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f81077j = AbstractC21229j.m59558f(this.f81076i);
            float fM59554b = AbstractC21229j.m59554b(fArr4);
            float[] fArr5 = C21223d.f81019a;
            if (fM59554b / AbstractC21229j.m59554b(C21223d.f81020b) > 0.9f) {
                float[] fArr6 = C21223d.f81019a;
                float f69 = fArr4[i14];
                float f74 = fArr6[i14];
                float f75 = fArr4[1];
                float f76 = fArr6[1];
                float f77 = fArr4[2];
                float f78 = fArr6[2];
                float f79 = fArr4[3];
                float f84 = fArr6[3];
                float f85 = fArr4[4];
                float f86 = fArr6[4];
                float f87 = fArr4[5];
                float f88 = fArr6[5];
                f16 = 0.0f;
                float[] fArr7 = new float[6];
                fArr7[i14] = f69 - f74;
                fArr7[1] = f75 - f76;
                fArr7[2] = f77 - f78;
                fArr7[3] = f79 - f84;
                fArr7[4] = f85 - f86;
                fArr7[5] = f87 - f88;
                float f89 = fArr7[i14];
                float f94 = fArr7[1];
                if (((f76 - f88) * f89) - ((f74 - f86) * f94) >= 0.0f && ((f74 - f78) * f94) - ((f76 - f84) * f89) >= 0.0f) {
                    float f95 = fArr7[2];
                    float f96 = fArr7[3];
                    if (((f84 - f76) * f95) - ((f78 - f74) * f96) >= 0.0f && ((f78 - f86) * f96) - ((f84 - f88) * f95) >= 0.0f) {
                        float f97 = fArr7[4];
                        float f98 = fArr7[5];
                        if (((f88 - f84) * f97) - ((f86 - f78) * f98) < 0.0f || ((f86 - f74) * f98) - ((f88 - f76) * f97) < 0.0f) {
                        }
                    }
                }
                if (i13 != 0) {
                    fArr3 = C21223d.f81019a;
                    if (fArr4 == fArr3) {
                        i15 = i14;
                        while (true) {
                            if (i15 < 6) {
                                if (Float.compare(fArr4[i15], fArr3[i15]) != 0 || Math.abs(fArr4[i15] - fArr3[i15]) <= 0.001f) {
                                    i15++;
                                }
                            } else {
                                if (AbstractC21229j.m59556d(c21238s, AbstractC21229j.f81055d)) {
                                    break;
                                }
                                float[] fArr8 = C21223d.f81019a;
                                c21236q = C21223d.f81023e;
                                while (d3 <= 1.0d) {
                                    if (Math.abs(interfaceC21228i.mo56647i(d3) - c21236q.f81078k.mo56647i(d3)) <= 0.001d) {
                                    }
                                }
                            }
                            z4 = i14;
                            break;
                        }
                    }
                    if (AbstractC21229j.m59556d(c21238s, AbstractC21229j.f81055d) || f13 != f16 || f14 != f15) {
                        z4 = i14;
                        break;
                    }
                    float[] fArr9 = C21223d.f81019a;
                    c21236q = C21223d.f81023e;
                    for (d3 = 0.0d; d3 <= 1.0d; d3 += 0.00392156862745098d) {
                        if (Math.abs(interfaceC21228i.mo56647i(d3) - c21236q.f81078k.mo56647i(d3)) <= 0.001d || Math.abs(interfaceC21228i2.mo56647i(d3) - c21236q.f81081n.mo56647i(d3)) > 0.001d) {
                            z4 = i14;
                            break;
                        }
                    }
                }
                this.f81084q = z4;
                return;
            }
            f16 = 0.0f;
            int i17 = (f13 > f16 ? 1 : (f13 == f16 ? 0 : -1));
            if (i13 != 0) {
                fArr3 = C21223d.f81019a;
                if (fArr4 == fArr3) {
                    i15 = i14;
                    while (true) {
                        if (i15 < 6) {
                            if (Float.compare(fArr4[i15], fArr3[i15]) != 0) {
                            }
                            i15++;
                        } else {
                            if (AbstractC21229j.m59556d(c21238s, AbstractC21229j.f81055d)) {
                                break;
                            }
                            float[] fArr10 = C21223d.f81019a;
                            c21236q = C21223d.f81023e;
                            while (d3 <= 1.0d) {
                                if (Math.abs(interfaceC21228i.mo56647i(d3) - c21236q.f81078k.mo56647i(d3)) <= 0.001d) {
                                }
                            }
                        }
                        z4 = i14;
                        break;
                    }
                }
                if (AbstractC21229j.m59556d(c21238s, AbstractC21229j.f81055d)) {
                    z4 = i14;
                    break;
                }
                float[] fArr11 = C21223d.f81019a;
                c21236q = C21223d.f81023e;
                while (d3 <= 1.0d) {
                    if (Math.abs(interfaceC21228i.mo56647i(d3) - c21236q.f81078k.mo56647i(d3)) <= 0.001d) {
                    }
                    z4 = i14;
                }
            }
            this.f81084q = z4;
            return;
        }
        throw new IllegalArgumentException(AbstractC31061c.m95638n("Invalid range: min=", f13, ", max=", f14, "; min must be strictly < max"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21236q(String str, float[] fArr, C21238s c21238s, final double d3, float f13, float f14, int i13) {
        InterfaceC21228i interfaceC21228i;
        InterfaceC21228i interfaceC21228i2 = f81070r;
        if (d3 == 1.0d) {
            interfaceC21228i = interfaceC21228i2;
        } else {
            final int i14 = 0;
            interfaceC21228i = new InterfaceC21228i() { // from class: j2.n
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d14) {
                    switch (i14) {
                        case 0:
                            if (d14 < 0.0d) {
                                d14 = 0.0d;
                            }
                            return Math.pow(d14, 1.0d / d3);
                        default:
                            if (d14 < 0.0d) {
                                d14 = 0.0d;
                            }
                            return Math.pow(d14, d3);
                    }
                }
            };
        }
        if (d3 != 1.0d) {
            final int i15 = 1;
            interfaceC21228i2 = new InterfaceC21228i() { // from class: j2.n
                @Override // p240j2.InterfaceC21228i
                /* JADX INFO: renamed from: i */
                public final double mo56647i(double d14) {
                    switch (i15) {
                        case 0:
                            if (d14 < 0.0d) {
                                d14 = 0.0d;
                            }
                            return Math.pow(d14, 1.0d / d3);
                        default:
                            if (d14 < 0.0d) {
                                d14 = 0.0d;
                            }
                            return Math.pow(d14, d3);
                    }
                }
            };
        }
        InterfaceC21228i interfaceC21228i3 = interfaceC21228i2;
        this(str, fArr, c21238s, null, interfaceC21228i, interfaceC21228i3, f13, f14, new C21237r(d3, 1.0d, 0.0d, 0.0d, 0.0d), i13);
    }
}
