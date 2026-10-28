package p293l2;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import j93.AbstractC21478l0;
import java.util.Locale;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p005a3.C0227m1;
import p029b5.AbstractC2722a;
import p181h2.C16617b;
import p181h2.C16618c;
import p181h2.C16620e;
import p208i2.AbstractC17904p0;
import p208i2.C17887h;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.InterfaceC17910s0;
import p270k2.AbstractC22130d;
import p270k2.C22128b;
import p270k2.InterfaceC22131e;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: l2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C23226c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC23228e f91965a;

    /* JADX INFO: renamed from: f */
    public Outline f91970f;

    /* JADX INFO: renamed from: j */
    public float f91974j;

    /* JADX INFO: renamed from: k */
    public AbstractC17904p0 f91975k;

    /* JADX INFO: renamed from: l */
    public InterfaceC17910s0 f91976l;

    /* JADX INFO: renamed from: m */
    public C17891j f91977m;

    /* JADX INFO: renamed from: n */
    public boolean f91978n;

    /* JADX INFO: renamed from: o */
    public C22128b f91979o;

    /* JADX INFO: renamed from: p */
    public C17887h f91980p;

    /* JADX INFO: renamed from: q */
    public int f91981q;

    /* JADX INFO: renamed from: s */
    public boolean f91983s;

    /* JADX INFO: renamed from: t */
    public long f91984t;

    /* JADX INFO: renamed from: u */
    public long f91985u;

    /* JADX INFO: renamed from: v */
    public long f91986v;

    /* JADX INFO: renamed from: w */
    public boolean f91987w;

    /* JADX INFO: renamed from: x */
    public RectF f91988x;

    /* JADX INFO: renamed from: b */
    public InterfaceC39171c f91966b = AbstractC22130d.f85855a;

    /* JADX INFO: renamed from: c */
    public EnumC39181m f91967c = EnumC39181m.f168423w;

    /* JADX INFO: renamed from: d */
    public AbstractC22680m f91968d = C23225b.f91962x;

    /* JADX INFO: renamed from: e */
    public final C0227m1 f91969e = new C0227m1(this, 23);

    /* JADX INFO: renamed from: g */
    public boolean f91971g = true;

    /* JADX INFO: renamed from: h */
    public long f91972h = 0;

    /* JADX INFO: renamed from: i */
    public long f91973i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final C23224a f91982r = new C23224a();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public C23226c(InterfaceC23228e interfaceC23228e) {
        this.f91965a = interfaceC23228e;
        interfaceC23228e.mo67247s(false);
        this.f91984t = 0L;
        this.f91985u = 0L;
        this.f91986v = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m67208a() {
        Outline outline;
        if (this.f91971g) {
            boolean z4 = this.f91987w;
            Outline outline2 = null;
            InterfaceC23228e interfaceC23228e = this.f91965a;
            if (z4 || interfaceC23228e.mo67227N() > 0.0f) {
                InterfaceC17910s0 interfaceC17910s0 = this.f91976l;
                if (interfaceC17910s0 != null) {
                    RectF rectF = this.f91988x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f91988x = rectF;
                    }
                    boolean z13 = interfaceC17910s0 instanceof C17891j;
                    if (!z13) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C17891j) interfaceC17910s0).f69587a.computeBounds(rectF, false);
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 > 28 || ((C17891j) interfaceC17910s0).f69587a.isConvex()) {
                        outline = this.f91970f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f91970f = outline;
                        }
                        if (i13 >= 30) {
                            AbstractC2722a.m7686m(outline, interfaceC17910s0);
                        } else {
                            if (!z13) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((C17891j) interfaceC17910s0).f69587a);
                        }
                        this.f91978n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f91970f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f91978n = true;
                        outline = null;
                    }
                    this.f91976l = interfaceC17910s0;
                    if (outline != null) {
                        outline.setAlpha(interfaceC23228e.mo67229a());
                        outline2 = outline;
                    }
                    interfaceC23228e.mo67218E(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f91978n && this.f91987w) {
                        interfaceC23228e.mo67247s(false);
                        interfaceC23228e.mo67233e();
                    } else {
                        interfaceC23228e.mo67247s(this.f91987w);
                    }
                } else {
                    interfaceC23228e.mo67247s(this.f91987w);
                    Outline outline4 = this.f91970f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f91970f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM113239l = AbstractC35744b.m113239l(this.f91985u);
                    long j7 = this.f91972h;
                    long j13 = this.f91973i;
                    if (j13 != 9205357640488583168L) {
                        jM113239l = j13;
                    }
                    int i14 = (int) (j7 >> 32);
                    int i15 = (int) (j7 & 4294967295L);
                    int i16 = (int) (jM113239l >> 32);
                    int i17 = (int) (jM113239l & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i14)), Math.round(Float.intBitsToFloat(i15)), Math.round(Float.intBitsToFloat(i16) + Float.intBitsToFloat(i14)), Math.round(Float.intBitsToFloat(i17) + Float.intBitsToFloat(i15)), this.f91974j);
                    outline5.setAlpha(interfaceC23228e.mo67229a());
                    interfaceC23228e.mo67218E(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i17)))) | (((long) Math.round(Float.intBitsToFloat(i16))) << 32));
                }
            } else {
                interfaceC23228e.mo67247s(false);
                interfaceC23228e.mo67218E(null, 0L);
            }
        }
        this.f91971g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m67209b() {
        if (this.f91983s && this.f91981q == 0) {
            C23224a c23224a = this.f91982r;
            C23226c c23226c = (C23226c) c23224a.f91958b;
            if (c23226c != null) {
                c23226c.f91981q--;
                c23226c.m67209b();
                c23224a.f91958b = null;
            }
            C0059w0 c0059w0 = (C0059w0) c23224a.f91960d;
            if (c0059w0 != null) {
                Object[] objArr = c0059w0.f178b;
                long[] jArr = c0059w0.f177a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j7 = jArr[i13];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i13 != length) {
                                break;
                                break;
                            }
                            i13++;
                        } else {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j7) < 128) {
                                    C23226c c23226c2 = (C23226c) objArr[(i13 << 3) + i15];
                                    c23226c2.f91981q--;
                                    c23226c2.m67209b();
                                }
                                j7 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            } else if (i13 != length) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                c0059w0.m137b();
            }
            this.f91965a.mo67233e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: c */
    public final void m67210c(InterfaceC22131e interfaceC22131e) {
        C23224a c23224a = this.f91982r;
        c23224a.f91959c = (C23226c) c23224a.f91958b;
        C0059w0 c0059w0 = (C0059w0) c23224a.f91960d;
        if (c0059w0 != null && c0059w0.m143h()) {
            C0059w0 c0059w1 = (C0059w0) c23224a.f91961e;
            if (c0059w1 == null) {
                C0059w0 c0059w2 = AbstractC0018e1.f44a;
                c0059w1 = new C0059w0();
                c23224a.f91961e = c0059w1;
            }
            c0059w1.m145j(c0059w0);
            c0059w0.m137b();
        }
        c23224a.f91957a = true;
        this.f91968d.invoke(interfaceC22131e);
        c23224a.f91957a = false;
        C23226c c23226c = (C23226c) c23224a.f91959c;
        if (c23226c != null) {
            c23226c.f91981q--;
            c23226c.m67209b();
        }
        C0059w0 c0059w3 = (C0059w0) c23224a.f91961e;
        if (c0059w3 == null || !c0059w3.m143h()) {
            return;
        }
        Object[] objArr = c0059w3.f178b;
        long[] jArr = c0059w3.f177a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            C23226c c23226c2 = (C23226c) objArr[(i13 << 3) + i15];
                            c23226c2.f91981q--;
                            c23226c2.m67209b();
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        c0059w3.m137b();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC17904p0 m67211d() {
        AbstractC17904p0 c17900n0;
        AbstractC17904p0 abstractC17904p0 = this.f91975k;
        InterfaceC17910s0 interfaceC17910s0 = this.f91976l;
        if (abstractC17904p0 != null) {
            return abstractC17904p0;
        }
        if (interfaceC17910s0 != null) {
            C17898m0 c17898m0 = new C17898m0(interfaceC17910s0);
            this.f91975k = c17898m0;
            return c17898m0;
        }
        long jM113239l = AbstractC35744b.m113239l(this.f91985u);
        long j7 = this.f91972h;
        long j13 = this.f91973i;
        if (j13 != 9205357640488583168L) {
            jM113239l = j13;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM113239l >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM113239l & 4294967295L)) + fIntBitsToFloat2;
        float f13 = this.f91974j;
        if (f13 > 0.0f) {
            c17900n0 = new C17902o0(AbstractC21478l0.m60427d((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        } else {
            c17900n0 = new C17900n0(new C16618c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f91975k = c17900n0;
        return c17900n0;
    }

    /* JADX INFO: renamed from: e */
    public final void m67212e(float f13) {
        InterfaceC23228e interfaceC23228e = this.f91965a;
        if (interfaceC23228e.mo67229a() == f13) {
            return;
        }
        interfaceC23228e.mo67221H(f13);
    }

    /* JADX INFO: renamed from: f */
    public final void m67213f(long j7, long j13, float f13) {
        if (C16617b.m47187c(this.f91972h, j7) && C16620e.m47210b(this.f91973i, j13) && this.f91974j == f13 && this.f91976l == null) {
            return;
        }
        this.f91975k = null;
        this.f91976l = null;
        this.f91971g = true;
        this.f91978n = false;
        this.f91972h = j7;
        this.f91973i = j13;
        this.f91974j = f13;
        m67208a();
    }
}
