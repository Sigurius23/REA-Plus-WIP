package i40;

import al.AbstractC0954a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.C0227m1;
import p040c0.C3731d;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11351f2;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p088dc.AbstractC11895b;
import p163g1.C15032h8;
import p163g1.C15204y8;
import p208i2.C17919x;
import p240j2.AbstractC21222c;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i40.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C18080n {

    /* JADX INFO: renamed from: a */
    public static final C18080n f70285a = new C18080n();

    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154  */
    /* JADX INFO: renamed from: a */
    public final void m51918a(EnumC18075i enumC18075i, long j7, long j13, C15032h8 c15032h8, boolean z4, C37816b c37816b, Composer composer, int i13) {
        float f13;
        float f14;
        float f15;
        C3731d c3731d = C3731d.f15261z;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-791965669);
        int i14 = i13 | (c28655q.m87153g(enumC18075i) ? 4 : 2) | (c28655q.m87151f(j7) ? 32 : 16) | (c28655q.m87151f(j13) ? 256 : 128) | (c28655q.m87157i(c15032h8) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        if ((74899 & i14) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(enumC18075i, "TextFieldInputState", c28655q, (i14 & 14) | 48, 0);
            AbstractC0954a abstractC0954a = c11421z1M30544f.f36630a;
            C28633k1 c28633k1 = c11421z1M30544f.f36633d;
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            EnumC18075i enumC18075i2 = (EnumC18075i) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-1082240119);
            int iOrdinal = enumC18075i2.ordinal();
            float f16 = 0.0f;
            if (iOrdinal == 0) {
                f13 = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f13);
            EnumC18075i enumC18075i3 = (EnumC18075i) c28633k1.getValue();
            c28655q.m87150e0(-1082240119);
            int iOrdinal2 = enumC18075i3.ordinal();
            if (iOrdinal2 == 0) {
                f14 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f14);
            InterfaceC11403t1 animateFloat = c11421z1M30544f.m30664f();
            AbstractC22676k.m65750j(animateFloat, "$this$animateFloat");
            c28655q.m87150e0(-1820270483);
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(150, 0, null, 6);
            c28655q.m87173q(false);
            C11409v1 c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf, fValueOf2, c11347e2M30574v, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            EnumC18075i enumC18075i4 = (EnumC18075i) abstractC0954a.mo2428y0();
            c28655q.m87150e0(1758344392);
            int iOrdinal3 = enumC18075i4.ordinal();
            if (iOrdinal3 == 0) {
                f15 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z4) {
                    f15 = 1.0f;
                }
                f15 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf3 = Float.valueOf(f15);
            EnumC18075i enumC18075i5 = (EnumC18075i) c28633k1.getValue();
            c28655q.m87150e0(1758344392);
            int iOrdinal4 = enumC18075i5.ordinal();
            if (iOrdinal4 == 0) {
                f16 = 1.0f;
            } else if (iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z4) {
                f16 = 1.0f;
            }
            c28655q.m87173q(false);
            C11409v1 c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf3, Float.valueOf(f16), (InterfaceC11337c0) C18078l.f70283w.invoke(c11421z1M30544f.m30664f(), c28655q, 0), c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            EnumC18075i enumC18075i6 = (EnumC18075i) c28633k1.getValue();
            c28655q.m87150e0(-15504215);
            int[] iArr = AbstractC18079m.f70284a;
            long j14 = iArr[enumC18075i6.ordinal()] == 1 ? j7 : j13;
            c28655q.m87173q(false);
            AbstractC21222c abstractC21222cM51545g = C17919x.m51545g(j14);
            boolean zM87153g = c28655q.m87153g(abstractC21222cM51545g);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                c28655q.m87172p0(objM87133R);
            }
            C11351f2 c11351f3 = (C11351f2) objM87133R;
            EnumC18075i enumC18075i7 = (EnumC18075i) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-15504215);
            C17919x c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, iArr[enumC18075i7.ordinal()] == 1 ? j7 : j13);
            EnumC18075i enumC18075i8 = (EnumC18075i) c28633k1.getValue();
            c28655q.m87150e0(-15504215);
            C17919x c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, iArr[enumC18075i8.ordinal()] == 1 ? j7 : j13);
            InterfaceC11403t1 animateColor = c11421z1M30544f.m30664f();
            AbstractC22676k.m65750j(animateColor, "$this$animateColor");
            c28655q.m87150e0(412246452);
            C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(150, 0, null, 6);
            c28655q.m87173q(false);
            C11409v1 c11409v1M30542d3 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919xM31989h, c17919xM31989h2, c11347e2M30574v2, c11351f3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            int i15 = (i14 & 7168) | 384;
            AbstractC21222c abstractC21222cM51545g2 = C17919x.m51545g(((C17919x) c15032h8.invoke(c28633k1.getValue(), c28655q, Integer.valueOf((i15 >> 6) & 112))).f69639a);
            boolean zM87153g2 = c28655q.m87153g(abstractC21222cM51545g2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                c28655q.m87172p0(objM87133R2);
            }
            C11351f2 c11351f4 = (C11351f2) objM87133R2;
            int i16 = ((((i15 << 3) & 57344) | 3072) >> 9) & 112;
            Object objInvoke = c15032h8.invoke(abstractC0954a.mo2428y0(), c28655q, Integer.valueOf(i16));
            Object objInvoke2 = c15032h8.invoke(c28633k1.getValue(), c28655q, Integer.valueOf(i16));
            InterfaceC11403t1 animateColor2 = c11421z1M30544f.m30664f();
            AbstractC22676k.m65750j(animateColor2, "$this$animateColor");
            c28655q.m87150e0(1054273641);
            C11347e2 c11347e2M30574v3 = AbstractC11348f.m30574v(150, 0, null, 6);
            c28655q.m87173q(false);
            c37816b.invoke(Float.valueOf(((Number) c11409v1M30542d.f36585J.getValue()).floatValue()), new C17919x(((C17919x) c11409v1M30542d3.f36585J.getValue()).f69639a), new C17919x(((C17919x) AbstractC11343d2.m30542d(c11421z1M30544f, objInvoke, objInvoke2, c11347e2M30574v3, c11351f4, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21).f36585J.getValue()).f69639a), Float.valueOf(((Number) c11409v1M30542d2.f36585J.getValue()).floatValue()), c28655q, 24576);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15204y8(this, enumC18075i, j7, j13, c15032h8, z4, c37816b, i13, 1);
        }
    }
}
