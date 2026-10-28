package p330n1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2518f3;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25272z;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22989q;
import p292l1.AbstractC23138n;
import p292l1.C23132m;
import p354o1.AbstractC27371j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C26107g {

    /* JADX INFO: renamed from: c */
    public static final float f103432c;

    /* JADX INFO: renamed from: d */
    public static final float f103433d;

    /* JADX INFO: renamed from: a */
    public static final C26107g f103430a = new C26107g();

    /* JADX INFO: renamed from: b */
    public static final C33252i f103431b = AbstractC33253j.f138651a;

    /* JADX INFO: renamed from: e */
    public static final float f103434e = AbstractC27371j.f109887c;

    static {
        float f13 = 80;
        f103432c = f13;
        f103433d = f13;
    }

    /* JADX INFO: renamed from: a */
    public final void m77668a(final C26115o c26115o, final boolean z4, final Modifier modifier, long j7, long j13, float f13, Composer composer, final int i13) {
        final long j14;
        final long j15;
        final float f14;
        int i14;
        float f15;
        long j16;
        long j17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1076870256);
        int i15 = i13 | (c28655q.m87153g(c26115o) ? 4 : 2) | (c28655q.m87155h(z4) ? 32 : 16) | (c28655q.m87153g(modifier) ? 256 : 128) | 74752 | (c28655q.m87153g(this) ? 1048576 : 524288);
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                C28674u2 c28674u2 = AbstractC23138n.f91494a;
                long j18 = ((C23132m) c28655q.m87161k(c28674u2)).f91417G;
                long j19 = ((C23132m) c28655q.m87161k(c28674u2)).f91459s;
                i14 = i15 & (-523265);
                f15 = f103433d;
                j16 = j19;
                j17 = j18;
            } else {
                c28655q.m87138X();
                i14 = i15 & (-523265);
                j17 = j7;
                j16 = j13;
                f15 = f13;
            }
            c28655q.m87175r();
            m77669b(c26115o, z4, modifier, f15, null, j17, 0.0f, AbstractC37817c.m121344e(298232649, c28655q, new C2518f3(z4, j16, c26115o)), c28655q, (i14 & 14) | 12582912 | (i14 & 112) | (i14 & 896) | ((i14 << 6) & 234881024));
            f14 = f15;
            j14 = j17;
            j15 = j16;
        } else {
            c28655q.m87138X();
            j14 = j7;
            j15 = j13;
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(c26115o, z4, modifier, j14, j15, f14, i13) { // from class: n1.c

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ long f103407E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ long f103408F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ float f103409G;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C26115o f103411x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ boolean f103412y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ Modifier f103413z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(1);
                    this.f103410w.m77668a(this.f103411x, this.f103412y, this.f103413z, this.f103407E, this.f103408F, this.f103409G, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77669b(final C26115o c26115o, final boolean z4, final Modifier modifier, final float f13, InterfaceC17869a1 interfaceC17869a1, final long j7, float f14, final C37816b c37816b, Composer composer, final int i13) {
        final C26115o c26115o2;
        int i14;
        C26107g c26107g;
        final InterfaceC17869a1 interfaceC17869a2;
        final float f15;
        int i15;
        InterfaceC17869a1 interfaceC17869a3;
        final InterfaceC17869a1 interfaceC17869a4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1341144489);
        if ((i13 & 6) == 0) {
            c26115o2 = c26115o;
            i14 = (c28655q.m87153g(c26115o2) ? 4 : 2) | i13;
        } else {
            c26115o2 = c26115o;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87151f(j7) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            c26107g = this;
            i14 |= c28655q.m87153g(c26107g) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        } else {
            c26107g = this;
        }
        if (c28655q.m87135U(i14 & 1, (38347923 & i14) != 38347922)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                i15 = i14 & (-3727361);
                interfaceC17869a3 = f103431b;
                f15 = f103434e;
            } else {
                c28655q.m87138X();
                i15 = i14 & (-3727361);
                interfaceC17869a3 = interfaceC17869a1;
                f15 = f14;
            }
            int i16 = i15;
            c28655q.m87175r();
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC26108h.f103438d, modifier);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C26009o(8);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3419p, (Function1) objM87133R);
            boolean zM87147d = ((i16 & 112) == 32) | ((i16 & 14) == 4) | ((((i16 & 7168) ^ 3072) > 2048 && c28655q.m87147d(f13)) || (i16 & 3072) == 2048) | c28655q.m87147d(f15) | c28655q.m87153g(interfaceC17869a3);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87147d || objM87133R2 == c28676v0) {
                interfaceC17869a4 = interfaceC17869a3;
                Function3 function3 = new Function3() { // from class: n1.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) obj2).mo448T(((C39169a) obj3).f168407a);
                        int i17 = abstractC39104j1Mo448T.f168211w;
                        int i18 = abstractC39104j1Mo448T.f168212x;
                        final C26115o c26115o3 = c26115o2;
                        final boolean z13 = z4;
                        final float f16 = f13;
                        final float f17 = f15;
                        final InterfaceC17869a1 interfaceC17869a5 = interfaceC17869a4;
                        return ((InterfaceC39133t0) obj).mo86822W(i17, i18, C25272z.f99163w, new Function1() { // from class: n1.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                AbstractC39101i1.m124627s((AbstractC39101i1) obj4, abstractC39104j1Mo448T, 0, 0, new C26102b(c26115o3, z13, f16, f17, interfaceC17869a5), 4);
                                return C23454a0.f92919a;
                            }
                        });
                    }
                };
                c28655q.m87172p0(function3);
                objM87133R2 = function3;
            } else {
                interfaceC17869a4 = interfaceC17869a3;
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1131a.m3498b(modifierM3480c, (Function3) objM87133R2), j7, interfaceC17869a4);
            int i17 = ((i16 >> 12) & 7168) | 48;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c37816b.invoke(C1100b.f4583a, c28655q, Integer.valueOf(((i17 >> 6) & 112) | 6));
            c28655q.m87173q(true);
            interfaceC17869a2 = interfaceC17869a4;
        } else {
            c28655q.m87138X();
            interfaceC17869a2 = interfaceC17869a1;
            f15 = f14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final C26107g c26107g2 = c26107g;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n1.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f103425w.m77669b(c26115o, z4, modifier, f13, interfaceC17869a2, j7, f15, c37816b, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
