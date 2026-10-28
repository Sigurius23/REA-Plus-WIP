package p328mj;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.ModalFormFactor;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C11327d0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2314t;
import p042c2.C3858c;
import p095dp.AbstractC12240d;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p320m5.C25067k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p409q0.C29674b;
import p490t0.AbstractC33253j;
import p525uj.AbstractC35032j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import sj.C32561l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mj.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25596c extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25594a f100420E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Configuration f100421F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f100422G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2994c0 f100423H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28593a1 f100424I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C4861a f100425J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Nudge f100426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NudgeStep f100427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29674b f100428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C25607n f100429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25596c(Nudge nudge, NudgeStep nudgeStep, C29674b c29674b, C25607n c25607n, C25594a c25594a, Configuration configuration, boolean z4, int i13, InterfaceC2994c0 interfaceC2994c0, InterfaceC28593a1 interfaceC28593a1, C4861a c4861a) {
        super(2);
        this.f100426w = nudge;
        this.f100427x = nudgeStep;
        this.f100428y = c29674b;
        this.f100429z = c25607n;
        this.f100420E = c25594a;
        this.f100421F = configuration;
        this.f100422G = z4;
        this.f100423H = interfaceC2994c0;
        this.f100424I = interfaceC28593a1;
        this.f100425J = c4861a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:21:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:47:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0161  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x021b  */
    /* JADX WARN: Code duplicated, block: B:71:0x022a  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Nudge nudge;
        C25607n c25607n;
        Float f13;
        C28655q c28655q;
        Configuration configuration;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        float fMin;
        float fFloatValue;
        FormFactor formFactor;
        ModalFormFactor modalFormFactor;
        boolean canClickOutsideToClose;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        Object objM87133R2;
        boolean zM87153g2;
        Object objM87133R3;
        int iM87266t;
        C0213j c0213j;
        C0209i c0209i;
        Nudge nudge2;
        Modifier modifierMo3400a;
        Modifier modifierM66722k;
        int iM87266t2;
        float f14;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                C29674b c29674b = this.f100428y;
                int iM91162k = c29674b.m91162k();
                nudge = this.f100426w;
                NudgeStep nudgeStep = this.f100427x;
                c25607n = this.f100429z;
                C32561l c32561l = new C32561l(nudge, nudgeStep, iM91162k, c25607n);
                C25594a c25594a = this.f100420E;
                AbstractC28683x.m87253g(composer, new C11327d0(c25594a, this.f100423H, c29674b, this.f100424I, null, 2), c25594a);
                f13 = AbstractC35032j.m110704f(composer).f148321R;
                c28655q = (C28655q) composer;
                configuration = this.f100421F;
                zM87153g = c28655q.m87153g(configuration) | c28655q.m87153g(f13);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    if (f13 != null) {
                        fMin = f13.floatValue();
                    } else {
                        fMin = configuration.screenHeightDp * 0.95f;
                    }
                    if (configuration.orientation == 1) {
                        fMin = Math.min(fMin, configuration.screenHeightDp * 0.7f);
                    }
                    objM87133R = Float.valueOf(fMin);
                    c28655q.m87172p0(objM87133R);
                }
                fFloatValue = ((Number) objM87133R).floatValue();
                formFactor = nudgeStep.getFormFactor();
                if (formFactor instanceof ModalFormFactor) {
                    modalFormFactor = (ModalFormFactor) formFactor;
                } else {
                    modalFormFactor = null;
                }
                if (modalFormFactor != null) {
                    canClickOutsideToClose = modalFormFactor.getCanClickOutsideToClose();
                } else {
                    canClickOutsideToClose = false;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                long jM51541c = C17919x.m51541c(0.4f, C17919x.f69625b);
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, jM51541c, c17916v0);
                z4 = this.f100422G;
                if (z4 || !canClickOutsideToClose) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
                zM87153g2 = c28655q.m87153g(c25607n);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C25067k(c25607n, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, z13, null, (InterfaceC4339a) objM87133R3, 24);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iM87266t = AbstractC28683x.m87266t(composer);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3360e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(composer, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    nudge2 = nudge;
                } else {
                    nudge2 = nudge;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
                    c28655q.m87152f0(1254111098);
                    if (z4) {
                        modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3411h(fFloatValue, AbstractC1102d.m3424u(480, c2314t)), null, 3), C2299e.f9102E);
                    } else {
                        modifierMo3400a = AbstractC1102d.m3407d(1.0f, c2314t);
                    }
                    modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(modifierMo3400a));
                    if (z4) {
                        modifierM66722k = AbstractC37056f.m118994r(modifierM66722k, AbstractC33253j.m105489e(AbstractC35032j.m110704f(composer).f148315L));
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM66722k, AbstractC35032j.m110704f(composer).f148366w, c17916v0);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
                    iM87266t2 = AbstractC28683x.m87266t(composer);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3358c2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t2))) {
                        AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
                    }
                    AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
                    c32561l.m101582b(AbstractC2294a.m7154a(10.0f, new HorizontalAlignElement(C2299e.f9112O)), 64, composer, 0);
                    Nudge nudge3 = nudge2;
                    AbstractC28683x.m87253g(composer, new C11327d0(c29674b, this.f100424I, this.f100425J, nudge3, null, 3), Integer.valueOf(c29674b.m91162k()));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    AbstractC12240d.m34068e(c29674b, new LayoutWeightElement(f14, true), null, null, 0.0f, null, null, false, null, null, AbstractC37817c.m121341b(2000517453, composer, new C3858c(1, nudge3, c25607n)), composer, 0);
                    c32561l.m101583c(composer, 8);
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35032j.m110704f(composer).f148316M + 8, c2314t));
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                }
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N);
                c28655q.m87152f0(1254111098);
                if (z4) {
                    modifierMo3400a = AbstractC1102d.m3407d(1.0f, c2314t);
                } else {
                    modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3411h(fFloatValue, AbstractC1102d.m3424u(480, c2314t)), null, 3), C2299e.f9102E);
                }
                modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(modifierMo3400a));
                if (z4) {
                    modifierM66722k = AbstractC37056f.m118994r(modifierM66722k, AbstractC33253j.m105489e(AbstractC35032j.m110704f(composer).f148315L));
                }
                c28655q.m87173q(false);
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM66722k, AbstractC35032j.m110704f(composer).f148366w, c17916v0);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
                iM87266t2 = AbstractC28683x.m87266t(composer);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer, modifierM3358c3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(composer, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
                }
                AbstractC28683x.m87239G(composer, c0209i5, modifierM118962N3);
                c32561l.m101582b(AbstractC2294a.m7154a(10.0f, new HorizontalAlignElement(C2299e.f9112O)), 64, composer, 0);
                Nudge nudge4 = nudge2;
                AbstractC28683x.m87253g(composer, new C11327d0(c29674b, this.f100424I, this.f100425J, nudge4, null, 3), Integer.valueOf(c29674b.m91162k()));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC12240d.m34068e(c29674b, new LayoutWeightElement(f14, true), null, null, 0.0f, null, null, false, null, null, AbstractC37817c.m121341b(2000517453, composer, new C3858c(1, nudge4, c25607n)), composer, 0);
                c32561l.m101583c(composer, 8);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35032j.m110704f(composer).f148316M + 8, c2314t));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
        } else {
            C29674b c29674b2 = this.f100428y;
            int iM91162k2 = c29674b2.m91162k();
            nudge = this.f100426w;
            NudgeStep nudgeStep2 = this.f100427x;
            c25607n = this.f100429z;
            C32561l c32561l2 = new C32561l(nudge, nudgeStep2, iM91162k2, c25607n);
            C25594a c25594a2 = this.f100420E;
            AbstractC28683x.m87253g(composer, new C11327d0(c25594a2, this.f100423H, c29674b2, this.f100424I, null, 2), c25594a2);
            f13 = AbstractC35032j.m110704f(composer).f148321R;
            c28655q = (C28655q) composer;
            configuration = this.f100421F;
            zM87153g = c28655q.m87153g(configuration) | c28655q.m87153g(f13);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                if (f13 != null) {
                    fMin = f13.floatValue();
                } else {
                    fMin = configuration.screenHeightDp * 0.95f;
                }
                if (configuration.orientation == 1) {
                    fMin = Math.min(fMin, configuration.screenHeightDp * 0.7f);
                }
                objM87133R = Float.valueOf(fMin);
                c28655q.m87172p0(objM87133R);
            } else {
                if (f13 != null) {
                    fMin = f13.floatValue();
                } else {
                    fMin = configuration.screenHeightDp * 0.95f;
                }
                if (configuration.orientation == 1) {
                    fMin = Math.min(fMin, configuration.screenHeightDp * 0.7f);
                }
                objM87133R = Float.valueOf(fMin);
                c28655q.m87172p0(objM87133R);
            }
            fFloatValue = ((Number) objM87133R).floatValue();
            formFactor = nudgeStep2.getFormFactor();
            if (formFactor instanceof ModalFormFactor) {
                modalFormFactor = (ModalFormFactor) formFactor;
            } else {
                modalFormFactor = null;
            }
            if (modalFormFactor != null) {
                canClickOutsideToClose = modalFormFactor.getCanClickOutsideToClose();
            } else {
                canClickOutsideToClose = false;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            long jM51541c2 = C17919x.m51541c(0.4f, C17919x.f69625b);
            C17916v0 c17916v1 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM3407d2, jM51541c2, c17916v1);
            z4 = this.f100422G;
            if (z4) {
                z13 = false;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
            zM87153g2 = c28655q.m87153g(c25607n);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R3 = new C25067k(c25607n, 1);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C25067k(c25607n, 1);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3358c4, interfaceC21083i2, null, z13, null, (InterfaceC4339a) objM87133R3, 24);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iM87266t = AbstractC28683x.m87266t(composer);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer, modifierM3360e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(composer, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(composer, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                nudge2 = nudge;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(composer, c0209i8, modifierM118962N4);
                c28655q.m87152f0(1254111098);
                if (z4) {
                    modifierMo3400a = AbstractC1102d.m3407d(1.0f, c2314t);
                } else {
                    modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3411h(fFloatValue, AbstractC1102d.m3424u(480, c2314t)), null, 3), C2299e.f9102E);
                }
                modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(modifierMo3400a));
                if (z4) {
                    modifierM66722k = AbstractC37056f.m118994r(modifierM66722k, AbstractC33253j.m105489e(AbstractC35032j.m110704f(composer).f148315L));
                }
                c28655q.m87173q(false);
                Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM66722k, AbstractC35032j.m110704f(composer).f148366w, c17916v1);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
                iM87266t2 = AbstractC28683x.m87266t(composer);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer, modifierM3358c5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(composer, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
                }
                AbstractC28683x.m87239G(composer, c0209i8, modifierM118962N5);
                c32561l2.m101582b(AbstractC2294a.m7154a(10.0f, new HorizontalAlignElement(C2299e.f9112O)), 64, composer, 0);
                Nudge nudge5 = nudge2;
                AbstractC28683x.m87253g(composer, new C11327d0(c29674b2, this.f100424I, this.f100425J, nudge5, null, 3), Integer.valueOf(c29674b2.m91162k()));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC12240d.m34068e(c29674b2, new LayoutWeightElement(f14, true), null, null, 0.0f, null, null, false, null, null, AbstractC37817c.m121341b(2000517453, composer, new C3858c(1, nudge5, c25607n)), composer, 0);
                c32561l2.m101583c(composer, 8);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35032j.m110704f(composer).f148316M + 8, c2314t));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                nudge2 = nudge;
            }
            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(composer, c0209i9, modifierM118962N4);
            c28655q.m87152f0(1254111098);
            if (z4) {
                modifierMo3400a = AbstractC1102d.m3407d(1.0f, c2314t);
            } else {
                modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3411h(fFloatValue, AbstractC1102d.m3424u(480, c2314t)), null, 3), C2299e.f9102E);
            }
            modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(modifierMo3400a));
            if (z4) {
                modifierM66722k = AbstractC37056f.m118994r(modifierM66722k, AbstractC33253j.m105489e(AbstractC35032j.m110704f(composer).f148315L));
            }
            c28655q.m87173q(false);
            Modifier modifierM3358c6 = AbstractC1092a.m3358c(modifierM66722k, AbstractC35032j.m110704f(composer).f148366w, c17916v1);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
            iM87266t2 = AbstractC28683x.m87266t(composer);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(composer, modifierM3358c6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(composer, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t2, c28655q, iM87266t2, c0209i);
            }
            AbstractC28683x.m87239G(composer, c0209i9, modifierM118962N6);
            c32561l2.m101582b(AbstractC2294a.m7154a(10.0f, new HorizontalAlignElement(C2299e.f9112O)), 64, composer, 0);
            Nudge nudge6 = nudge2;
            AbstractC28683x.m87253g(composer, new C11327d0(c29674b2, this.f100424I, this.f100425J, nudge6, null, 3), Integer.valueOf(c29674b2.m91162k()));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            AbstractC12240d.m34068e(c29674b2, new LayoutWeightElement(f14, true), null, null, 0.0f, null, null, false, null, null, AbstractC37817c.m121341b(2000517453, composer, new C3858c(1, nudge6, c25607n)), composer, 0);
            c32561l2.m101583c(composer, 8);
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35032j.m110704f(composer).f148316M + 8, c2314t));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
