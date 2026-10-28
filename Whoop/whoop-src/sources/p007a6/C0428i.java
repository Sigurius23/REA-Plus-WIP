package p007a6;

import aa2.C0597f;
import android.graphics.Bitmap;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1848z0;
import androidx.room.C1762a;
import androidx.room.C1786g;
import androidx.room.C1813n1;
import bc3.InterfaceC3027k1;
import bp0.C3526n;
import c93.InterfaceC4351m;
import com.whoop.WhoopApplication;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl;
import com.whoop.data.onboarding.OnboardingStatusDao_Impl;
import com.whoop.data.repositories.UserRepository;
import com.whoop.domain.model.Logout;
import com.whoop.profile.view.edit.C9790n;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ev2.C13693b;
import fm1.C14605i;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.util.List;
import java.util.concurrent.CancellationException;
import jk2.AbstractC21768i;
import k71.AbstractC22253j;
import l83.C23454a0;
import l83.C23470p;
import mc3.C25436b;
import mc3.C25437c;
import nq0.C27050m;
import od1.C27858u;
import p000.AbstractC11266d;
import p002a0.C0059w0;
import p005a3.C0230n0;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p027b3.C2404l2;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p077d0.C11368k;
import p088dc.AbstractC11894a;
import p117eh.C13188e;
import p132f0.C13810o;
import p132f0.C13819r;
import p132f0.C13821r1;
import p132f0.C13822s;
import p134f2.C14015d;
import p163g1.C14949a2;
import p163g1.C15093n7;
import p163g1.C15190x4;
import p180h0.C16372c3;
import p180h0.C16470w;
import p180h0.C16473w2;
import p181h2.C16617b;
import p181h2.C16618c;
import p181h2.C16619d;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17873c;
import p208i2.C17875c1;
import p208i2.C17885g;
import p208i2.C17890i0;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.C17903p;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p239j1.C21194l;
import p268k0.AbstractC22086a;
import p270k2.AbstractC22132f;
import p270k2.C22127a;
import p270k2.C22128b;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.C23000t1;
import p291l0.InterfaceC22973k1;
import p294l3.C23250e;
import p294l3.C23279s0;
import p294l3.C23280t;
import p294l3.C23282u;
import p294l3.InterfaceC23244b;
import p329n0.C26061n;
import p329n0.C26068u;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28679w;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p392p3.C28759a0;
import p392p3.C28772j;
import p490t0.C33252i;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.AbstractC39948a0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import qf2.AbstractC30325d;
import qf2.C30324c;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: a6.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0428i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1470x;

    public /* synthetic */ C0428i(Object obj, int i13) {
        this.f1469w = i13;
        this.f1470x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0467  */
    /* JADX WARN: Code duplicated, block: B:180:0x04bc  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        C17903p c17903p;
        boolean z4;
        long j7;
        InterfaceC17915v interfaceC17915v;
        C22128b c22128b;
        C0237p c0237p;
        float f13;
        float f14;
        long jM670A;
        C16618c c16618cM46639Y0;
        C26061n c26061n;
        switch (this.f1469w) {
            case 0:
                C0429i0 c0429i0 = (C0429i0) this.f1470x;
                C23470p c23470p = c0429i0.f1479i;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    c0429i0.f1477g.m11161J(new C0453s0(th3));
                }
                if (c23470p.mo5046b()) {
                    ((InterfaceC0424g1) c23470p.getValue()).close();
                }
                return C23454a0.f92919a;
            case 1:
                return ((C0597f) this.f1470x).m1579x((InterfaceC33687a) obj);
            case 2:
                AbstractC1848z0 abstractC1848z0 = (AbstractC1848z0) this.f1470x;
                C1786g config = (C1786g) obj;
                AbstractC22676k.m65750j(config, "config");
                return abstractC1848z0.createOpenHelper(config);
            case 3:
                C0428i c0428i = (C0428i) this.f1470x;
                InterfaceC33689c it = (InterfaceC33689c) obj;
                AbstractC22676k.m65750j(it, "it");
                c0428i.invoke(new C1762a(it));
                return C23454a0.f92919a;
            case 4:
                C1813n1 c1813n1 = (C1813n1) this.f1470x;
                InterfaceC33689c it3 = (InterfaceC33689c) obj;
                AbstractC22676k.m65750j(it3, "it");
                int i14 = c1813n1.f7130H;
                if (1 <= i14) {
                    int i15 = 1;
                    while (true) {
                        int i16 = c1813n1.f7129G[i15];
                        if (i16 == 1) {
                            it3.mo5359u(i15);
                        } else if (i16 == 2) {
                            it3.mo5356p(i15, c1813n1.f7133y[i15]);
                        } else if (i16 == 3) {
                            it3.mo5358t(c1813n1.f7134z[i15], i15);
                        } else if (i16 == 4) {
                            String str = c1813n1.f7127E[i15];
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            it3.mo5354L(i15, str);
                        } else if (i16 == 5) {
                            byte[] bArr = c1813n1.f7128F[i15];
                            if (bArr == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            it3.mo5357q(i15, bArr);
                        }
                        if (i15 != i14) {
                            i15++;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 5:
                return ((SmartAlarmDiagnosticDao_Impl) this.f1470x).lambda$getAll$1((InterfaceC33687a) obj);
            case 6:
                return ((OnboardingStatusDao_Impl) this.f1470x).lambda$getOnboardingStatus$1((InterfaceC33687a) obj);
            case 7:
                return UserRepository._init_$lambda$0((UserRepository) this.f1470x, (C27858u.a) obj);
            case 8:
                C11368k c11368k = (C11368k) obj;
                ((InterfaceC4351m) this.f1470x).invoke(c11368k.f36440e.getValue(), AbstractC11348f.f36367i.f36397b.invoke(c11368k.f36441f));
                return C23454a0.f92919a;
            case 9:
                return WhoopApplication.m16943o((WhoopApplication) this.f1470x, (Logout) obj);
            case 10:
                ((C13188e) this.f1470x).f45719K = true;
                return C23454a0.f92919a;
            case 11:
                C13822s c13822s = (C13822s) this.f1470x;
                C14015d c14015d = (C14015d) obj;
                if (c14015d.getDensity() * c13822s.f49327R < 0.0f || C16620e.m47212d(c14015d.f50036w.mo468d()) <= 0.0f) {
                    return c14015d.m39910a(new C13693b(12));
                }
                float f15 = 2;
                final float fMin = Math.min(C39174f.m124782b(c13822s.f49327R, 0.0f) ? 1.0f : (float) Math.ceil(c14015d.getDensity() * c13822s.f49327R), (float) Math.ceil(C16620e.m47212d(c14015d.f50036w.mo468d()) / f15));
                final float f16 = fMin / f15;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() >> 32)) - fMin)) << 32);
                float f17 = fMin * f15;
                boolean z13 = f17 > C16620e.m47212d(c14015d.f50036w.mo468d());
                AbstractC17904p0 abstractC17904p0Mo39171a = c13822s.f49329T.mo39171a(c14015d.f50036w.mo468d(), c14015d.f50036w.getLayoutDirection(), c14015d);
                if (!(abstractC17904p0Mo39171a instanceof C17898m0)) {
                    if (!(abstractC17904p0Mo39171a instanceof C17902o0)) {
                        boolean z14 = z13;
                        if (!(abstractC17904p0Mo39171a instanceof C17900n0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final AbstractC17911t abstractC17911t = c13822s.f49328S;
                        final long j13 = z14 ? 0L : jFloatToRawIntBits;
                        final long jMo468d = z14 ? c14015d.f50036w.mo468d() : jFloatToRawIntBits2;
                        final AbstractC22132f c22135i = z14 ? C22134h.f85857a : new C22135i(fMin, 0.0f, 0, 0, null, 30);
                        return c14015d.m39910a(new Function1() { // from class: f0.p
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj2);
                                c0238p0.m728a();
                                InterfaceC22131e.m63385u(c0238p0, abstractC17911t, j13, jMo468d, 0.0f, c22135i, 0, 104);
                                return C23454a0.f92919a;
                            }
                        });
                    }
                    final AbstractC17911t abstractC17911t2 = c13822s.f49328S;
                    C16619d c16619d = ((C17902o0) abstractC17904p0Mo39171a).f69602a;
                    if (AbstractC21478l0.m60409O(c16619d)) {
                        final long j14 = c16619d.f63947e;
                        final C22135i c22135i2 = new C22135i(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z15 = z13;
                        return c14015d.m39910a(new Function1() { // from class: f0.q
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) throws Throwable {
                                C0237p c0237p2;
                                long j15;
                                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj2);
                                c0238p0.m728a();
                                C22128b c22128b2 = c0238p0.f815w;
                                boolean z16 = z15;
                                AbstractC17911t abstractC17911t3 = abstractC17911t2;
                                long j16 = j14;
                                if (z16) {
                                    InterfaceC22131e.m63376J0(c0238p0, abstractC17911t3, 0L, 0L, j16, 0.0f, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                                    float f18 = f16;
                                    if (fIntBitsToFloat < f18) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32));
                                        float f19 = fMin;
                                        float f24 = fIntBitsToFloat2 - f19;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L)) - f19;
                                        C0237p c0237p3 = c22128b2.f85852x;
                                        long jM670A2 = c0237p3.m670A();
                                        c0237p3.m716w().mo51426q();
                                        try {
                                            ((C0929d) c0237p3.f812x).m2346d(f19, f19, f24, fIntBitsToFloat3, 0);
                                            j15 = jM670A2;
                                            c0237p2 = c0237p3;
                                            try {
                                                InterfaceC22131e.m63376J0(c0238p0, abstractC17911t3, 0L, 0L, j16, 0.0f, null, 246);
                                                AbstractC11266d.m30472z(c0237p2, j15);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                AbstractC11266d.m30472z(c0237p2, j15);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c0237p2 = c0237p3;
                                            j15 = jM670A2;
                                        }
                                    } else {
                                        InterfaceC22131e.m63376J0(c0238p0, abstractC17911t3, jFloatToRawIntBits, jFloatToRawIntBits2, AbstractC15751g.m44440T(f18, j16), 0.0f, c22135i2, 208);
                                    }
                                }
                                return C23454a0.f92919a;
                            }
                        });
                    }
                    boolean z16 = z13;
                    if (c13822s.f49326Q == null) {
                        c13822s.f49326Q = new C13810o();
                    }
                    C13810o c13810o = c13822s.f49326Q;
                    AbstractC22676k.m65747g(c13810o);
                    C17891j c17891j = (C17891j) c13810o.m39178g();
                    c17891j.m51464k();
                    InterfaceC17910s0.m51496b(c17891j, c16619d);
                    if (!z16) {
                        InterfaceC17910s0 interfaceC17910s0M51478a = AbstractC17897m.m51478a();
                        InterfaceC17910s0.m51496b(interfaceC17910s0M51478a, new C16619d(fMin, fMin, c16619d.m47208b() - fMin, c16619d.m47207a() - fMin, AbstractC15751g.m44440T(fMin, c16619d.f63947e), AbstractC15751g.m44440T(fMin, c16619d.f63948f), AbstractC15751g.m44440T(fMin, c16619d.f63949g), AbstractC15751g.m44440T(fMin, c16619d.f63950h)));
                        c17891j.m51463j(c17891j, interfaceC17910s0M51478a, 0);
                    }
                    return c14015d.m39910a(new C3526n(13, c17891j, abstractC17911t2));
                }
                AbstractC17911t abstractC17911t3 = c13822s.f49328S;
                C17898m0 c17898m0 = (C17898m0) abstractC17904p0Mo39171a;
                InterfaceC17910s0 interfaceC17910s0 = c17898m0.f69599a;
                if (z13) {
                    return c14015d.m39910a(new C9790n(22, c17898m0, abstractC17911t3));
                }
                if (abstractC17911t3 instanceof C17875c1) {
                    c17903p = new C17903p(C17919x.m51541c(1.0f, ((C17875c1) abstractC17911t3).f69559c), 5);
                    i13 = 1;
                } else {
                    i13 = 0;
                    c17903p = null;
                }
                C16618c c16618cM51460g = ((C17891j) interfaceC17910s0).m51460g();
                float f18 = c16618cM51460g.f63940b;
                float f19 = c16618cM51460g.f63939a;
                if (c13822s.f49326Q == null) {
                    c13822s.f49326Q = new C13810o();
                }
                C13810o c13810o2 = c13822s.f49326Q;
                AbstractC22676k.m65747g(c13810o2);
                InterfaceC17910s0 interfaceC17910s0M39178g = c13810o2.m39178g();
                C17891j c17891j2 = (C17891j) interfaceC17910s0M39178g;
                c17891j2.m51464k();
                InterfaceC17910s0.m51495a(interfaceC17910s0M39178g, c16618cM51460g);
                c17891j2.m51463j(c17891j2, interfaceC17910s0, 0);
                C22669g0 c22669g0 = new C22669g0();
                long jCeil = (((long) ((int) Math.ceil(c16618cM51460g.f63942d - f18))) & 4294967295L) | (((long) ((int) Math.ceil(c16618cM51460g.f63941c - f19))) << 32);
                C13810o c13810o3 = c13822s.f49326Q;
                AbstractC22676k.m65747g(c13810o3);
                C17885g c17885gM51520h = c13810o3.f49274a;
                InterfaceC17915v interfaceC17915v2 = c13810o3.f49275b;
                C17890i0 c17890i0 = c17885gM51520h != null ? new C17890i0(c17885gM51520h.m51442a()) : null;
                if (c17890i0 != null && c17890i0.f69586a == 0) {
                    z4 = true;
                } else {
                    C17890i0 c17890i1 = c17885gM51520h != null ? new C17890i0(c17885gM51520h.m51442a()) : null;
                    if (c17890i1 != null && i13 == c17890i1.f69586a) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                try {
                    try {
                        if (c17885gM51520h != null && interfaceC17915v2 != null) {
                            j7 = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() >> 32));
                            Bitmap bitmap = c17885gM51520h.f69577a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() & 4294967295L)) > bitmap.getHeight() || !z4) {
                            }
                            c22128b = c13810o3.f49276c;
                            if (c22128b == null) {
                                c22128b = new C22128b();
                                c13810o3.f49276c = c22128b;
                            }
                            c0237p = c22128b.f85852x;
                            C22127a c22127a = c22128b.f85851w;
                            long jM113239l = AbstractC35744b.m113239l(j7);
                            EnumC39181m layoutDirection = c14015d.f50036w.getLayoutDirection();
                            C22128b c22128b2 = c22128b;
                            InterfaceC39171c interfaceC39171c = c22127a.f85847a;
                            EnumC39181m enumC39181m = c22127a.f85848b;
                            InterfaceC17915v interfaceC17915v3 = c22127a.f85849c;
                            C17885g c17885g = c17885gM51520h;
                            long j15 = c22127a.f85850d;
                            c22127a.f85847a = c14015d;
                            c22127a.f85848b = layoutDirection;
                            c22127a.f85849c = interfaceC17915v;
                            c22127a.f85850d = jM113239l;
                            C17873c c17873c = (C17873c) interfaceC17915v;
                            c17873c.mo51426q();
                            InterfaceC22131e.m63383i0(c22128b2, C17919x.f69625b, 0L, jM113239l, 0.0f, null, 0, 58);
                            f13 = -f19;
                            f14 = -f18;
                            ((C0929d) c0237p.f812x).m2339B(f13, f14);
                            InterfaceC22131e.m63378L(c22128b2, c17898m0.f69599a, abstractC17911t3, 0.0f, new C22135i(f17, 0.0f, 0, 0, null, 30), 52);
                            float f24 = 1;
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32)) + f24) / Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L)) + f24) / Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L));
                            long jMo721B0 = c22128b2.mo721B0();
                            jM670A = c0237p.m670A();
                            c0237p.m716w().mo51426q();
                            ((C0929d) c0237p.f812x).m2359w(fIntBitsToFloat2, jMo721B0, fIntBitsToFloat3);
                            InterfaceC22131e.m63378L(c22128b2, interfaceC17910s0M39178g, abstractC17911t3, 0.0f, null, 28);
                            c0237p.m716w().mo51417g();
                            c0237p.m690U(jM670A);
                            ((C0929d) c0237p.f812x).m2339B(-f13, -f14);
                            c17873c.mo51417g();
                            c22127a.f85847a = interfaceC39171c;
                            c22127a.f85848b = enumC39181m;
                            c22127a.f85849c = interfaceC17915v3;
                            c22127a.f85850d = j15;
                            c17885g.f69577a.prepareToDraw();
                            c22669g0.f89336w = c17885g;
                            return c14015d.m39910a(new C13819r(0, j7, c16618cM51460g, c22669g0, c17903p));
                        }
                        j7 = jCeil;
                        ((C0929d) c0237p.f812x).m2359w(fIntBitsToFloat2, jMo721B0, fIntBitsToFloat3);
                        InterfaceC22131e.m63378L(c22128b2, interfaceC17910s0M39178g, abstractC17911t3, 0.0f, null, 28);
                        c0237p.m716w().mo51417g();
                        c0237p.m690U(jM670A);
                        ((C0929d) c0237p.f812x).m2339B(-f13, -f14);
                        c17873c.mo51417g();
                        c22127a.f85847a = interfaceC39171c;
                        c22127a.f85848b = enumC39181m;
                        c22127a.f85849c = interfaceC17915v3;
                        c22127a.f85850d = j15;
                        c17885g.f69577a.prepareToDraw();
                        c22669g0.f89336w = c17885g;
                        return c14015d.m39910a(new C13819r(0, j7, c16618cM51460g, c22669g0, c17903p));
                    } catch (Throwable th4) {
                        c0237p.m716w().mo51417g();
                        c0237p.m690U(jM670A);
                        throw th4;
                    }
                    InterfaceC22131e.m63378L(c22128b2, c17898m0.f69599a, abstractC17911t3, 0.0f, new C22135i(f17, 0.0f, 0, 0, null, 30), 52);
                    float f25 = 1;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32)) + f25) / Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L)) + f25) / Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L));
                    long jMo721B1 = c22128b2.mo721B0();
                    jM670A = c0237p.m670A();
                    c0237p.m716w().mo51426q();
                } catch (Throwable th5) {
                    ((C0929d) c0237p.f812x).m2339B(-f13, -f14);
                    throw th5;
                }
                interfaceC17915v = interfaceC17915v2;
                c17885gM51520h = AbstractC17918w0.m51520h((int) (j7 >> 32), (int) (j7 & 4294967295L), i13);
                c13810o3.f49274a = c17885gM51520h;
                C17873c c17873cM51513a = AbstractC17918w0.m51513a(c17885gM51520h);
                c13810o3.f49275b = c17873cM51513a;
                interfaceC17915v = c17873cM51513a;
                c22128b = c13810o3.f49276c;
                if (c22128b == null) {
                    c22128b = new C22128b();
                    c13810o3.f49276c = c22128b;
                }
                c0237p = c22128b.f85852x;
                C22127a c22127a2 = c22128b.f85851w;
                long jM113239l2 = AbstractC35744b.m113239l(j7);
                EnumC39181m layoutDirection2 = c14015d.f50036w.getLayoutDirection();
                C22128b c22128b3 = c22128b;
                InterfaceC39171c interfaceC39171c2 = c22127a2.f85847a;
                EnumC39181m enumC39181m2 = c22127a2.f85848b;
                InterfaceC17915v interfaceC17915v4 = c22127a2.f85849c;
                C17885g c17885g2 = c17885gM51520h;
                long j16 = c22127a2.f85850d;
                c22127a2.f85847a = c14015d;
                c22127a2.f85848b = layoutDirection2;
                c22127a2.f85849c = interfaceC17915v;
                c22127a2.f85850d = jM113239l2;
                C17873c c17873c2 = (C17873c) interfaceC17915v;
                c17873c2.mo51426q();
                InterfaceC22131e.m63383i0(c22128b3, C17919x.f69625b, 0L, jM113239l2, 0.0f, null, 0, 58);
                f13 = -f19;
                f14 = -f18;
                ((C0929d) c0237p.f812x).m2339B(f13, f14);
                break;
            case 12:
                C13821r1 c13821r1 = (C13821r1) this.f1470x;
                float fFloatValue = ((Float) obj).floatValue();
                C28621h1 c28621h1 = c13821r1.f49318a;
                float fM87024x = c28621h1.m87024x() + fFloatValue + c13821r1.f49322e;
                float fM36283m = AbstractC12889b.m36283m(fM87024x, 0.0f, c13821r1.f49321d.m87024x());
                boolean z17 = fM87024x == fM36283m;
                float fM87024x2 = fM36283m - c28621h1.m87024x();
                int iRound = Math.round(fM87024x2);
                c28621h1.m87025y(c28621h1.m87024x() + iRound);
                c13821r1.f49322e = fM87024x2 - iRound;
                if (!z17) {
                    fFloatValue = fM87024x2;
                }
                return Float.valueOf(fFloatValue);
            case 13:
                return new C39178j((((long) AbstractC12889b.m36258X(((Number) ((C14949a2) this.f1470x).f56512e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
            case 14:
                C15093n7 c15093n7 = (C15093n7) this.f1470x;
                float fFloatValue2 = ((Float) obj).floatValue();
                C28617g1 c28617g1 = c15093n7.f56514g;
                float fM87022x = c28617g1.m87022x() + fFloatValue2;
                float fM36283m2 = AbstractC12889b.m36283m(fM87022x, c15093n7.f56518k, c15093n7.f56519l);
                float f26 = fM87022x - fM36283m2;
                C15190x4 c15190x4 = (C15190x4) c15093n7.f56522o.getValue();
                float fSin = 0.0f;
                if (c15190x4 != null) {
                    float f27 = f26 < 0.0f ? c15190x4.f57007b : c15190x4.f57008c;
                    if (f27 != 0.0f) {
                        float f28 = c15190x4.f57006a;
                        float f29 = f26 / f28;
                        if (f29 < -1.0f) {
                            f29 = -1.0f;
                        }
                        if (f29 > 1.0f) {
                            f29 = 1.0f;
                        }
                        fSin = ((float) Math.sin((f29 * 3.1415927f) / 2)) * (f28 / f27);
                    }
                }
                c15093n7.f56512e.m87023y(fM36283m2 + fSin);
                c15093n7.f56513f.m87023y(f26);
                c28617g1.m87023y(fM87022x);
                return C23454a0.f92919a;
            case 15:
                C23279s0 c23279s0 = (C23279s0) this.f1470x;
                C23250e c23250e = (C23250e) obj;
                InterfaceC23244b interfaceC23244b = (InterfaceC23244b) c23250e.f92125a;
                if (interfaceC23244b instanceof C23282u) {
                    C23282u c23282u = (C23282u) interfaceC23244b;
                    if (c23282u.f92249b == null) {
                        return C23250e.m67313a(c23250e, new C23282u(c23282u.f92248a, c23279s0, c23282u.f92250c), 0, 14);
                    }
                }
                if (!(interfaceC23244b instanceof C23280t)) {
                    return c23250e;
                }
                C23280t c23280t = (C23280t) interfaceC23244b;
                return c23280t.f92242b == null ? C23250e.m67313a(c23250e, new C23280t(c23280t.f92241a, c23279s0, c23280t.f92243c), 0, 14) : c23250e;
            case 16:
                C16470w c16470w = ((C16473w2) this.f1470x).f63300g0;
                c16470w.f63282T = (InterfaceC39147y) obj;
                if (c16470w.f63284V && (c16618cM46639Y0 = c16470w.m46639Y0()) != null && !c16470w.m46640Z0(c16618cM46639Y0, c16470w.f63285W)) {
                    c16470w.f63283U = true;
                    c16470w.m46641a1();
                }
                c16470w.f63284V = false;
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C16372c3 c16372c3 = (C16372c3) this.f1470x;
                return new C16617b(c16372c3.m46570c(c16372c3.f62946k, ((C16617b) obj).f63937a, c16372c3.f62945j));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C17920x0 c17920x0 = (C17920x0) ((InterfaceC17886g0) obj);
                c17920x0.m51550E(((C21194l) this.f1470x).f80760e.m87022x() - Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L)));
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC21768i.m61531x((C14605i) this.f1470x, (InterfaceC3770q) obj);
            case 20:
                return AbstractC22253j.m63855y((C33252i) this.f1470x, (Modifier) obj);
            case 21:
                return AbstractC22253j.m63819E(C23000t1.f90727a, (List) this.f1470x, (Modifier) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                InterfaceC22973k1 interfaceC22973k1 = (InterfaceC22973k1) this.f1470x;
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.m7401c("padding");
                c2404l2.m7400b().m7292c(interfaceC22973k1, "paddingValues");
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((C25437c) this.f1470x).mo68214i(null);
                return C23454a0.f92919a;
            case 24:
                C26068u c26068u = (C26068u) this.f1470x;
                float f34 = -((Float) obj).floatValue();
                if ((f34 >= 0.0f || c26068u.mo39183d()) && (f34 <= 0.0f || c26068u.mo39182c())) {
                    if (Math.abs(c26068u.f103225h) > 0.5f) {
                        AbstractC22086a.m63160c("entered drag with non-zero pending scroll");
                    }
                    c26068u.f103221d = true;
                    float f35 = c26068u.f103225h + f34;
                    c26068u.f103225h = f35;
                    if (Math.abs(f35) > 0.5f) {
                        float f36 = c26068u.f103225h;
                        int iRound2 = Math.round(f36);
                        C26061n c26061nM77536d = ((C26061n) c26068u.f103223f.getValue()).m77536d(iRound2, !c26068u.f103219b);
                        if (c26061nM77536d != null && (c26061n = c26068u.f103220c) != null) {
                            C26061n c26061nM77536d2 = c26061n.m77536d(iRound2, true);
                            if (c26061nM77536d2 != null) {
                                c26068u.f103220c = c26061nM77536d2;
                            } else {
                                c26061nM77536d = null;
                            }
                        }
                        if (c26061nM77536d != null) {
                            c26068u.m77564g(c26061nM77536d, c26068u.f103219b, true);
                            c26068u.f103239v.setValue(C23454a0.f92919a);
                            c26068u.m77566i(f36 - c26068u.f103225h, c26061nM77536d);
                        } else {
                            C0230n0 c0230n0 = c26068u.f103228k;
                            if (c0230n0 != null) {
                                c0230n0.m630m();
                            }
                            c26068u.m77566i(f36 - c26068u.f103225h, c26068u.m77565h());
                        }
                    }
                    if (Math.abs(c26068u.f103225h) > 0.5f) {
                        f34 -= c26068u.f103225h;
                        c26068u.f103225h = 0.0f;
                    }
                } else {
                    f34 = 0.0f;
                }
                return Float.valueOf(-f34);
            case 25:
                ((C28679w) this.f1470x).m87231y(obj);
                return C23454a0.f92919a;
            case 26:
                C28688y1 c28688y1 = (C28688y1) this.f1470x;
                Throwable th6 = (Throwable) obj;
                CancellationException cancellationExceptionM31955d = AbstractC11894a.m31955d("Recomposer effect job completed", th6);
                synchronized (c28688y1.f116037c) {
                    try {
                        InterfaceC3027k1 interfaceC3027k1 = c28688y1.f116038d;
                        if (interfaceC3027k1 != null) {
                            C13045h2 c13045h2 = c28688y1.f116055u;
                            EnumC28681w1 enumC28681w1 = EnumC28681w1.f116015x;
                            c13045h2.getClass();
                            c13045h2.m36571k(null, enumC28681w1);
                            interfaceC3027k1.cancel(cancellationExceptionM31955d);
                            c28688y1.f116052r = null;
                            interfaceC3027k1.invokeOnCompletion(new C27050m(17, c28688y1, th6));
                        } else {
                            c28688y1.f116039e = cancellationExceptionM31955d;
                            C13045h2 c13045h3 = c28688y1.f116055u;
                            EnumC28681w1 enumC28681w2 = EnumC28681w1.f116014w;
                            c13045h3.getClass();
                            c13045h3.m36571k(null, enumC28681w2);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return C23454a0.f92919a;
            case 27:
                C0059w0 c0059w0 = (C0059w0) this.f1470x;
                if (obj instanceof AbstractC39948a0) {
                    ((AbstractC39948a0) obj).m128129s(4);
                }
                c0059w0.m136a(obj);
                return C23454a0.f92919a;
            case 28:
                C28759a0 c28759a0 = (C28759a0) obj;
                return ((C28772j) this.f1470x).m87528a(new C28759a0(null, c28759a0.f116494b, c28759a0.f116495c, c28759a0.f116496d, c28759a0.f116497e)).getValue();
            default:
                return C30324c.m92668f((C30324c) this.f1470x, (AbstractC30325d) obj);
        }
    }

    public /* synthetic */ C0428i(C25437c c25437c, C25436b c25436b) {
        this.f1469w = 23;
        this.f1470x = c25437c;
    }
}
