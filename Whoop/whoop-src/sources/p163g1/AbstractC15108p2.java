package p163g1;

import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c11.C3840g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dw1.C12413a;
import ep1.C13412g;
import fa0.C14294a;
import fq2.C14686c;
import j93.AbstractC21478l0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p077d0.InterfaceC11419z;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p512u2.AbstractC34452c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p636y3.InterfaceC39171c;
import p704dk2.C12122i;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32417h;

/* JADX INFO: renamed from: g1.p2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15108p2 {

    /* JADX INFO: renamed from: a */
    public static final float f56602a = 56;

    /* JADX INFO: renamed from: b */
    public static final float f56603b = 400;

    /* JADX INFO: renamed from: c */
    public static final C11347e2 f56604c = new C11347e2(256, (InterfaceC11419z) null, 6);

    /* JADX INFO: renamed from: a */
    public static final void m43170a(final C37816b c37816b, final Modifier modifier, final C15136s0 c15136s0, final boolean z4, final InterfaceC17869a1 interfaceC17869a1, float f13, final long j7, final long j13, final long j14, final C37816b c37816b2, Composer composer, final int i13) {
        int i14;
        C15136s0 c15136s1;
        boolean z13;
        InterfaceC17869a1 interfaceC17869a2;
        C37816b c37816b3;
        final float f14;
        float f15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1403479060);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c15136s1 = c15136s0;
            i14 |= c28655q.m87157i(c15136s1) ? 256 : 128;
        } else {
            c15136s1 = c15136s0;
        }
        if ((i13 & 3072) == 0) {
            z13 = z4;
            i14 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z13 = z4;
        }
        if ((i13 & 24576) == 0) {
            interfaceC17869a2 = interfaceC17869a1;
            i14 |= c28655q.m87153g(interfaceC17869a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        int i15 = i14 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87151f(j7) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87151f(j13) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87151f(j14) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            c37816b3 = c37816b2;
            i15 |= c28655q.m87157i(c37816b3) ? 536870912 : 268435456;
        } else {
            c37816b3 = c37816b2;
        }
        if (c28655q.m87135U(i15 & 1, (306783379 & i15) != 306783378)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                f15 = AbstractC14993e2.f56068b;
            } else {
                c28655q.m87138X();
                f15 = f13;
            }
            c28655q.m87175r();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, modifier), null, false, AbstractC37817c.m121344e(468886998, c28655q, new C15058k2(z13, c15136s1, c37816b3, j14, (InterfaceC2994c0) objM87133R, interfaceC17869a2, j7, j13, f15, c37816b)), c28655q, 3072, 6);
            f14 = f15;
        } else {
            c28655q.m87138X();
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.f2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC15108p2.m43170a(c37816b, modifier, c15136s0, z4, interfaceC17869a1, f14, j7, j13, j14, c37816b2, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43171b(final long j7, final InterfaceC4339a interfaceC4339a, final boolean z4, Composer composer, final int i13) {
        Modifier modifierM51775c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-513067266);
        int i14 = i13 | (c28655q.m87151f(j7) ? 4 : 2) | (c28655q.m87157i(interfaceC4339a) ? 32 : 16) | (c28655q.m87155h(z4) ? 256 : 128);
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (j7 != 16) {
            c28655q.m87150e0(1001834356);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(z4 ? 1.0f : 0.0f, new C11347e2(0, (InterfaceC11419z) null, 7), null, null, c28655q, 48, 28);
            String strM101177H = AbstractC32417h.m101177H(c28655q, 1);
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(1002054704);
                int i15 = i14 & 112;
                boolean z13 = i15 == 32;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C15068l2(interfaceC4339a, 0);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(c2314t, interfaceC4339a, (PointerInputEventHandler) objM87133R);
                boolean zM87153g = (i15 == 32) | c28655q.m87153g(strM101177H);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C15015g2(0, strM101177H, interfaceC4339a);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM51775c = AbstractC18032n.m51775c(modifierM108903b, true, (Function1) objM87133R2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1002419388);
                c28655q.m87173q(false);
                modifierM51775c = c2314t;
            }
            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(modifierM51775c);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b) | ((i14 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C3840g(j7, interfaceC28670t2M30588b, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierMo3471e, (Function1) objM87133R3, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1002587780);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(j7, interfaceC4339a, z4, i13) { // from class: g1.h2

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ long f56238w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ InterfaceC4339a f56239x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ boolean f56240y;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    AbstractC15108p2.m43171b(this.f56238w, this.f56239x, this.f56240y, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C15136s0 m43172c(EnumC15146t0 enumC15146t0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C14686c(22);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        C11347e2 c11347e2 = AbstractC14993e2.f56067a;
        C28655q c28655q2 = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
        Object[] objArr = {interfaceC39171c};
        int i14 = 10;
        C28539n0 c28539n0 = new C28539n0(i14, new C12413a(20), new C13412g(interfaceC39171c, function1, c11347e2, i14));
        boolean z4 = true;
        boolean zM87153g = ((((i13 & 14) ^ 6) > 4 && c28655q2.m87149e(enumC15146t0.ordinal())) || (i13 & 6) == 4) | c28655q2.m87153g(interfaceC39171c);
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q2.m87153g(function1)) && (i13 & 48) != 32) {
            z4 = false;
        }
        boolean zM87157i = zM87153g | z4 | c28655q2.m87157i(c11347e2);
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            C1012d c1012d = new C1012d((Object) enumC15146t0, (Object) interfaceC39171c, function1, (Object) c11347e2, 10);
            c28655q2.m87172p0(c1012d);
            objM87133R2 = c1012d;
        }
        return (C15136s0) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R2, c28655q2, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final C15118q2 m43173d(Composer composer) {
        EnumC15128r2 enumC15128r2 = EnumC15128r2.f56690w;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        int i13 = 21;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C14686c(i13);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        Object[] objArr = new Object[0];
        C28539n0 c28539n0 = new C28539n0(10, new C12413a(i13), new C12122i(function1, 27));
        boolean zM87153g = ((C28655q) composer).m87153g(function1);
        C28655q c28655q2 = (C28655q) composer;
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C14294a(function1);
            c28655q2.m87172p0(objM87133R2);
        }
        return (C15118q2) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R2, c28655q2, 0);
    }
}
