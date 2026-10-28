package p370oj;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.AbstractC1123d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeType;
import com.amplitude.android.engagement.types.SimulationContext;
import com.amplitude.android.engagement.types.ThrottleLimit;
import com.squareup.wire.AbstractC5583n;
import j43.C21317a;
import java.io.Serializable;
import l83.C23454a0;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.C2320z;
import p035bp.AbstractC3511b;
import p048ce.AbstractC4482w;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23149o4;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p328mj.C25598e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p463rj.AbstractC31484o;
import p490t0.AbstractC33253j;
import p490t0.C33249f;
import p525uj.AbstractC35029g;
import p525uj.C35031i;
import p635y2.InterfaceC39127r0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C27961h extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f112761E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Serializable f112762F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f112763G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112764w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f112765x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f112766y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f112767z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27961h(DebugStatus debugStatus, Nudge nudge, SimulationContext simulationContext, InterfaceC28601c1 interfaceC28601c1, boolean z4, C4861a c4861a) {
        super(2);
        this.f112762F = debugStatus;
        this.f112765x = nudge;
        this.f112763G = simulationContext;
        this.f112766y = interfaceC28601c1;
        this.f112767z = z4;
        this.f112761E = c4861a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030c  */
    /* JADX WARN: Code duplicated, block: B:103:0x031a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0329  */
    /* JADX WARN: Code duplicated, block: B:107:0x032b  */
    /* JADX WARN: Code duplicated, block: B:109:0x032e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0354  */
    /* JADX WARN: Code duplicated, block: B:113:0x0358  */
    /* JADX WARN: Code duplicated, block: B:116:0x0365  */
    /* JADX WARN: Code duplicated, block: B:118:0x0373  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:123:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x0436  */
    /* JADX WARN: Code duplicated, block: B:128:0x0462  */
    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    /* JADX WARN: Code duplicated, block: B:130:0x046a  */
    /* JADX WARN: Code duplicated, block: B:133:0x047c  */
    /* JADX WARN: Code duplicated, block: B:135:0x048a  */
    /* JADX WARN: Code duplicated, block: B:141:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:147:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:149:0x054f  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:159:0x0582  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:163:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x019c  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0223  */
    /* JADX WARN: Code duplicated, block: B:76:0x024c  */
    /* JADX WARN: Code duplicated, block: B:79:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0260  */
    /* JADX WARN: Code duplicated, block: B:83:0x0296  */
    /* JADX WARN: Code duplicated, block: B:85:0x029e  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ff  */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C2320z c2320z;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        C2314t c2314t;
        DebugStatus status;
        Nudge nudge;
        SimulationContext simulationContext;
        InterfaceC28601c1 interfaceC28601c1;
        C22957g c22957g;
        C2305k c2305k;
        int iM87266t;
        C28655q c28655q2;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        C28655q c28655q3;
        Composer composer;
        C0209i c0209i6;
        char c3;
        Composer composer2;
        long j7;
        C28655q c28655q4;
        NudgeType type;
        String strName;
        ThrottleLimit guideThrottleLimit;
        String strName2;
        String str;
        boolean zM65745e;
        float f13;
        Object objM87133R2;
        C28676v0 c28676v0;
        boolean zM87153g2;
        Object objM87133R3;
        C2307m c2307m;
        int iM87266t2;
        C0213j c0213j2;
        C0209i c0209i7;
        long j13;
        C0209i c0209i8;
        int iM87266t3;
        boolean z4;
        int iM87266t4;
        C0209i c0209i9;
        C0213j c0213j3;
        float f14;
        boolean zM87153g3;
        Object objM87133R4;
        C28655q c28655q5;
        boolean z13;
        boolean z14;
        int iM87266t5;
        C0213j c0213j4;
        C0209i c0209i10;
        int iM87266t6;
        Integer max;
        int iIntValue;
        String period;
        int i13;
        String str2;
        switch (this.f112764w) {
            case 0:
                C4861a c4861a = (C4861a) this.f112761E;
                Composer composer3 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) this.f112766y;
                if ((iIntValue2 & 11) == 2) {
                    C28655q c28655q6 = (C28655q) composer3;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        Nudge nudge2 = (Nudge) this.f112765x;
                        SimulationContext simulationContext2 = (SimulationContext) interfaceC28601c2.getValue();
                        c2320z = (C2320z) this.f112762F;
                        c28655q = (C28655q) composer3;
                        zM87153g = c28655q.m87153g(c2320z);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            objM87133R = new C27959f(c2320z, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        C27648a.m83583f(nudge2, simulationContext2, this.f112767z, (InterfaceC4339a) objM87133R, c28655q, 72);
                        AbstractC23124k3.m67100d(null, 0L, 0.0f, 0, c28655q, 7);
                        Nudge nudge3 = (Nudge) this.f112765x;
                        SimulationContext simulationContext3 = (SimulationContext) interfaceC28601c2.getValue();
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f112763G;
                        AbstractC5583n.m16779g(nudge3, simulationContext3, new C27960g(c4861a, interfaceC4339a, 0), new C27960g(c4861a, interfaceC4339a, 1), c28655q, 72);
                        AbstractC23124k3.m67100d(null, 0L, 0.0f, 0, c28655q, 7);
                        AbstractC4482w.m14007q((Nudge) this.f112765x, (SimulationContext) interfaceC28601c2.getValue(), c4861a, this.f112767z, c28655q, 584);
                    }
                } else {
                    Nudge nudge4 = (Nudge) this.f112765x;
                    SimulationContext simulationContext4 = (SimulationContext) interfaceC28601c2.getValue();
                    c2320z = (C2320z) this.f112762F;
                    c28655q = (C28655q) composer3;
                    zM87153g = c28655q.m87153g(c2320z);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C27959f(c2320z, 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C27959f(c2320z, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    C27648a.m83583f(nudge4, simulationContext4, this.f112767z, (InterfaceC4339a) objM87133R, c28655q, 72);
                    AbstractC23124k3.m67100d(null, 0L, 0.0f, 0, c28655q, 7);
                    Nudge nudge5 = (Nudge) this.f112765x;
                    SimulationContext simulationContext5 = (SimulationContext) interfaceC28601c2.getValue();
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f112763G;
                    AbstractC5583n.m16779g(nudge5, simulationContext5, new C27960g(c4861a, interfaceC4339a2, 0), new C27960g(c4861a, interfaceC4339a2, 1), c28655q, 72);
                    AbstractC23124k3.m67100d(null, 0L, 0.0f, 0, c28655q, 7);
                    AbstractC4482w.m14007q((Nudge) this.f112765x, (SimulationContext) interfaceC28601c2.getValue(), c4861a, this.f112767z, c28655q, 584);
                }
                return C23454a0.f92919a;
            case 1:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q7 = (C28655q) composer4;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        status = (DebugStatus) this.f112762F;
                        nudge = (Nudge) this.f112765x;
                        simulationContext = (SimulationContext) this.f112763G;
                        interfaceC28601c1 = (InterfaceC28601c1) this.f112766y;
                        C4861a c4861a2 = (C4861a) this.f112761E;
                        c22957g = AbstractC22977m.f90652c;
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer4, 0);
                        iM87266t = AbstractC28683x.m87266t(composer4);
                        c28655q2 = (C28655q) composer4;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer4, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(composer4, c0209i, c23010xM66775a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(composer4, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c0209i4 = c0209i2;
                        } else {
                            c0209i4 = c0209i2;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iM87266t))) {
                            }
                            c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(composer4, c0209i5, modifierM118962N);
                            c28655q2.m87152f0(3612900);
                            if (status != DebugStatus.SUCCESS) {
                                AbstractC22676k.m65750j(status, "status");
                                i13 = AbstractC27972s.f112805a[status.ordinal()];
                                if (i13 == 1) {
                                    str2 = null;
                                } else if (i13 != 2) {
                                    if (i13 != 3 && i13 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str2 = null;
                                } else {
                                    str2 = "Throttle limit reached";
                                }
                                if (str2 != null) {
                                    composer = composer4;
                                    c0209i6 = c0209i3;
                                    c28655q3 = c28655q2;
                                    c3 = '\b';
                                    AbstractC3269g.m9503g(status, str2, false, null, composer, 0, 12);
                                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                                } else {
                                    c28655q3 = c28655q2;
                                    composer = composer4;
                                    c0209i6 = c0209i3;
                                    c3 = '\b';
                                }
                            } else {
                                c28655q3 = c28655q2;
                                composer = composer4;
                                c0209i6 = c0209i3;
                                c3 = '\b';
                            }
                            c28655q3.m87173q(false);
                            long j14 = AbstractC35029g.f148260i;
                            composer2 = composer;
                            j7 = AbstractC35029g.f148255d;
                            c28655q4 = c28655q3;
                            AbstractC23149o4.m67127b("Throttle", null, j14, j7, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(AbstractC35029g.f148252a / 2, c2314t));
                            if (nudge != null) {
                                type = nudge.getType();
                            } else {
                                type = null;
                            }
                            if (type != null) {
                                strName = type.name();
                            } else {
                                strName = null;
                            }
                            if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                                if (simulationContext != null) {
                                    guideThrottleLimit = simulationContext.getSurveyThrottleLimit();
                                } else {
                                    guideThrottleLimit = null;
                                }
                            } else if (simulationContext != null) {
                                guideThrottleLimit = simulationContext.getGuideThrottleLimit();
                            } else {
                                guideThrottleLimit = null;
                            }
                            if (type != null) {
                                strName2 = type.name();
                            } else {
                                strName2 = null;
                            }
                            if (AbstractC22676k.m65745e(strName2, "SURVEY")) {
                                str = "Survey";
                            } else {
                                str = "Guide";
                            }
                            if (guideThrottleLimit != null) {
                                zM65745e = AbstractC22676k.m65745e(guideThrottleLimit.getEnabled(), Boolean.TRUE);
                            } else {
                                zM65745e = false;
                            }
                            if (zM65745e) {
                                c28655q4.m87152f0(3613955);
                                max = guideThrottleLimit.getMax();
                                if (max != null) {
                                    iIntValue = max.intValue();
                                } else {
                                    iIntValue = 1;
                                }
                                period = guideThrottleLimit.getPeriod();
                                if (period == null) {
                                    period = "unknown";
                                }
                                AbstractC3511b.m10374c(iIntValue + ' ' + str + "s per " + period, null, composer2, 0);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87152f0(3614151);
                                AbstractC3511b.m10374c("No limit", null, composer2, 6);
                                c28655q4.m87173q(false);
                            }
                            f13 = 12;
                            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(f13, c2314t));
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                            objM87133R2 = c28655q4.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
                            zM87153g2 = c28655q4.m87153g(interfaceC28601c1);
                            objM87133R3 = c28655q4.m87133R();
                            if (zM87153g2 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C25598e(4, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f2, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                            c2307m = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            iM87266t2 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3360e);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c0213j2 = c0213j;
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d);
                            c0209i7 = c0209i4;
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S) {
                                j13 = j7;
                            } else {
                                j13 = j7;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t2))) {
                                    c0209i8 = c0209i6;
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N2);
                                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                                C2306l c2306l = C2299e.f9108K;
                                C22949e c22949e = AbstractC22977m.f90650a;
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, composer2, 48);
                                iM87266t3 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer2, modifierM3409f3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j2);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m3);
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t3))) {
                                    AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N3);
                                if (1.0f > 0.0d) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, composer2, 48);
                                iM87266t4 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer2, layoutWeightElement);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j2);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a2);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m4);
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t4))) {
                                    AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N4);
                                c0209i9 = c0209i8;
                                c0213j3 = c0213j2;
                                AbstractC23149o4.m67127b("Ignore Throttle limits", null, j14, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                                f14 = 8;
                                AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                                zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                                objM87133R4 = c28655q4.m87133R();
                                if (zM87153g3 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C25598e(5, interfaceC28601c1);
                                    c28655q4.m87172p0(objM87133R4);
                                }
                                AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                                c28655q4.m87173q(true);
                                AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a2, 4), null, false, null, composer2, 0, 124);
                                c28655q4.m87173q(true);
                                c28655q4.m87152f0(3616406);
                                if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                                    float f15 = 16;
                                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f15, 0.0f, 2);
                                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                                    iM87266t5 = AbstractC28683x.m87266t(composer2);
                                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer2, modifierM3396r);
                                    c28655q4.m87158i0();
                                    if (c28655q4.f115903S) {
                                        c0213j4 = c0213j3;
                                        c28655q4.m87163l(c0213j4);
                                    } else {
                                        c0213j4 = c0213j3;
                                        c28655q4.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a2);
                                    AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m5);
                                    if (c28655q4.f115903S && AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t5))) {
                                        c0209i10 = c0209i9;
                                    } else {
                                        c0209i10 = c0209i9;
                                        AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                    }
                                    AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N5);
                                    long j15 = AbstractC35029g.f148271t;
                                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j15, AbstractC33253j.m105489e(f14)));
                                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                    iM87266t6 = AbstractC28683x.m87266t(composer2);
                                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(composer2, modifierM3394p);
                                    c28655q4.m87158i0();
                                    if (c28655q4.f115903S) {
                                        c28655q4.m87163l(c0213j4);
                                    } else {
                                        c28655q4.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d2);
                                    AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m6);
                                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t6))) {
                                        AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                    }
                                    AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N6);
                                    c28655q5 = c28655q4;
                                    z13 = true;
                                    AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                                    c28655q5.m87173q(true);
                                    z14 = false;
                                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f15, f14), 40, 0.0f, 2), j15, new C33249f()), composer2, 0);
                                    c28655q5.m87173q(true);
                                } else {
                                    c28655q5 = c28655q4;
                                    z13 = true;
                                    z14 = false;
                                }
                                AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                            }
                            c0209i8 = c0209i6;
                            AbstractC11266d.m30471y(iM87266t2, c28655q4, iM87266t2, c0209i8);
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N2);
                            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C2306l c2306l2 = C2299e.f9108K;
                            C22949e c22949e2 = AbstractC22977m.f90650a;
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l2, composer2, 48);
                            iM87266t3 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(composer2, modifierM3409f4);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a3);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m7);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N7);
                            if (1.0f > 0.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, composer2, 48);
                            iM87266t4 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(composer2, layoutWeightElement2);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a4);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m8);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N8);
                            c0209i9 = c0209i8;
                            c0213j3 = c0213j2;
                            AbstractC23149o4.m67127b("Ignore Throttle limits", null, j14, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                            f14 = 8;
                            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                            zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                            objM87133R4 = c28655q4.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                            c28655q4.m87173q(true);
                            AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a2, 4), null, false, null, composer2, 0, 124);
                            c28655q4.m87173q(true);
                            c28655q4.m87152f0(3616406);
                            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                                float f16 = 16;
                                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f16, 0.0f, 2);
                                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                                iM87266t5 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(composer2, modifierM3396r2);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a3);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m9);
                                if (c28655q4.f115903S) {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                } else {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N9);
                                long j16 = AbstractC35029g.f148271t;
                                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j16, AbstractC33253j.m105489e(f14)));
                                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                                iM87266t6 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                                Modifier modifierM118962N10 = AbstractC37056f.m118962N(composer2, modifierM3394p2);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d3);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m10);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                } else {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N10);
                                c28655q5 = c28655q4;
                                z13 = true;
                                AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                                c28655q5.m87173q(true);
                                z14 = false;
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f16, f14), 40, 0.0f, 2), j16, new C33249f()), composer2, 0);
                                c28655q5.m87173q(true);
                            } else {
                                c28655q5 = c28655q4;
                                z13 = true;
                                z14 = false;
                            }
                            AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                        }
                        AbstractC11266d.m30471y(iM87266t, c28655q2, iM87266t, c0209i3);
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(composer4, c0209i5, modifierM118962N);
                        c28655q2.m87152f0(3612900);
                        if (status != DebugStatus.SUCCESS) {
                            AbstractC22676k.m65750j(status, "status");
                            i13 = AbstractC27972s.f112805a[status.ordinal()];
                            if (i13 == 1) {
                                str2 = null;
                            } else if (i13 != 2) {
                                if (i13 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str2 = null;
                            } else {
                                str2 = "Throttle limit reached";
                            }
                            if (str2 != null) {
                                composer = composer4;
                                c0209i6 = c0209i3;
                                c28655q3 = c28655q2;
                                c3 = '\b';
                                AbstractC3269g.m9503g(status, str2, false, null, composer, 0, 12);
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                            } else {
                                c28655q3 = c28655q2;
                                composer = composer4;
                                c0209i6 = c0209i3;
                                c3 = '\b';
                            }
                        } else {
                            c28655q3 = c28655q2;
                            composer = composer4;
                            c0209i6 = c0209i3;
                            c3 = '\b';
                        }
                        c28655q3.m87173q(false);
                        long j17 = AbstractC35029g.f148260i;
                        composer2 = composer;
                        j7 = AbstractC35029g.f148255d;
                        c28655q4 = c28655q3;
                        AbstractC23149o4.m67127b("Throttle", null, j17, j7, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(AbstractC35029g.f148252a / 2, c2314t));
                        if (nudge != null) {
                            type = nudge.getType();
                        } else {
                            type = null;
                        }
                        if (type != null) {
                            strName = type.name();
                        } else {
                            strName = null;
                        }
                        if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                            if (simulationContext != null) {
                                guideThrottleLimit = simulationContext.getSurveyThrottleLimit();
                            } else {
                                guideThrottleLimit = null;
                            }
                        } else if (simulationContext != null) {
                            guideThrottleLimit = simulationContext.getGuideThrottleLimit();
                        } else {
                            guideThrottleLimit = null;
                        }
                        if (type != null) {
                            strName2 = type.name();
                        } else {
                            strName2 = null;
                        }
                        if (AbstractC22676k.m65745e(strName2, "SURVEY")) {
                            str = "Survey";
                        } else {
                            str = "Guide";
                        }
                        if (guideThrottleLimit != null) {
                            zM65745e = AbstractC22676k.m65745e(guideThrottleLimit.getEnabled(), Boolean.TRUE);
                        } else {
                            zM65745e = false;
                        }
                        if (zM65745e) {
                            c28655q4.m87152f0(3613955);
                            max = guideThrottleLimit.getMax();
                            if (max != null) {
                                iIntValue = max.intValue();
                            } else {
                                iIntValue = 1;
                            }
                            period = guideThrottleLimit.getPeriod();
                            if (period == null) {
                                period = "unknown";
                            }
                            AbstractC3511b.m10374c(iIntValue + ' ' + str + "s per " + period, null, composer2, 0);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87152f0(3614151);
                            AbstractC3511b.m10374c("No limit", null, composer2, 6);
                            c28655q4.m87173q(false);
                        }
                        f13 = 12;
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(f13, c2314t));
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R2 = c28655q4.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                        zM87153g2 = c28655q4.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q4.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = new C25598e(4, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C25598e(4, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3409f5, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                        c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iM87266t2 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(composer2, modifierM3360e2);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c0213j2 = c0213j;
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d4);
                        c0209i7 = c0209i4;
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m11);
                        if (c28655q4.f115903S) {
                            j13 = j7;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t2))) {
                                c0209i8 = c0209i6;
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N11);
                            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C2306l c2306l3 = C2299e.f9108K;
                            C22949e c22949e3 = AbstractC22977m.f90650a;
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e3, c2306l3, composer2, 48);
                            iM87266t3 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(composer2, modifierM3409f6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a5);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m12);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N12);
                            if (1.0f > 0.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e3, c2306l3, composer2, 48);
                            iM87266t4 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(composer2, layoutWeightElement3);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a6);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m13);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N13);
                            c0209i9 = c0209i8;
                            c0213j3 = c0213j2;
                            AbstractC23149o4.m67127b("Ignore Throttle limits", null, j17, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                            f14 = 8;
                            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                            zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                            objM87133R4 = c28655q4.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                            c28655q4.m87173q(true);
                            AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a2, 4), null, false, null, composer2, 0, 124);
                            c28655q4.m87173q(true);
                            c28655q4.m87152f0(3616406);
                            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                                float f17 = 16;
                                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f17, 0.0f, 2);
                                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                                iM87266t5 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                                Modifier modifierM118962N14 = AbstractC37056f.m118962N(composer2, modifierM3396r3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a4);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m14);
                                if (c28655q4.f115903S) {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                } else {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N14);
                                long j18 = AbstractC35029g.f148271t;
                                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j18, AbstractC33253j.m105489e(f14)));
                                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                                iM87266t6 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                                Modifier modifierM118962N15 = AbstractC37056f.m118962N(composer2, modifierM3394p3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d5);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m15);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                } else {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N15);
                                c28655q5 = c28655q4;
                                z13 = true;
                                AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                                c28655q5.m87173q(true);
                                z14 = false;
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f17, f14), 40, 0.0f, 2), j18, new C33249f()), composer2, 0);
                                c28655q5.m87173q(true);
                            } else {
                                c28655q5 = c28655q4;
                                z13 = true;
                                z14 = false;
                            }
                            AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                        } else {
                            j13 = j7;
                        }
                        c0209i8 = c0209i6;
                        AbstractC11266d.m30471y(iM87266t2, c28655q4, iM87266t2, c0209i8);
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N11);
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C2306l c2306l4 = C2299e.f9108K;
                        C22949e c22949e4 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e4, c2306l4, composer2, 48);
                        iM87266t3 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(composer2, modifierM3409f7);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a7);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m16);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N16);
                        if (1.0f > 0.0d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e4, c2306l4, composer2, 48);
                        iM87266t4 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(composer2, layoutWeightElement4);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m17);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N17);
                        c0209i9 = c0209i8;
                        c0213j3 = c0213j2;
                        AbstractC23149o4.m67127b("Ignore Throttle limits", null, j17, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                        f14 = 8;
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                        zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                        c28655q4.m87173q(true);
                        AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a2, 4), null, false, null, composer2, 0, 124);
                        c28655q4.m87173q(true);
                        c28655q4.m87152f0(3616406);
                        if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                            float f18 = 16;
                            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f18, 0.0f, 2);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                            iM87266t5 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(composer2, modifierM3396r4);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c0213j4 = c0213j3;
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c0213j4 = c0213j3;
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a5);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m18);
                            if (c28655q4.f115903S) {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            } else {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N18);
                            long j19 = AbstractC35029g.f148271t;
                            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j19, AbstractC33253j.m105489e(f14)));
                            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                            iM87266t6 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                            Modifier modifierM118962N19 = AbstractC37056f.m118962N(composer2, modifierM3394p4);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d6);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m19);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            } else {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N19);
                            c28655q5 = c28655q4;
                            z13 = true;
                            AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                            c28655q5.m87173q(true);
                            z14 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f18, f14), 40, 0.0f, 2), j19, new C33249f()), composer2, 0);
                            c28655q5.m87173q(true);
                        } else {
                            c28655q5 = c28655q4;
                            z13 = true;
                            z14 = false;
                        }
                        AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                    }
                } else {
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                    status = (DebugStatus) this.f112762F;
                    nudge = (Nudge) this.f112765x;
                    simulationContext = (SimulationContext) this.f112763G;
                    interfaceC28601c1 = (InterfaceC28601c1) this.f112766y;
                    C4861a c4861a3 = (C4861a) this.f112761E;
                    c22957g = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g, c2305k, composer4, 0);
                    iM87266t = AbstractC28683x.m87266t(composer4);
                    c28655q2 = (C28655q) composer4;
                    InterfaceC28653p1 interfaceC28653p1M87165m20 = c28655q2.m87165m();
                    Modifier modifierM118962N20 = AbstractC37056f.m118962N(composer4, modifierM3409f8);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(composer4, c0209i, c23010xM66775a6);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(composer4, c0209i2, interfaceC28653p1M87165m20);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i4 = c0209i2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iM87266t))) {
                        }
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(composer4, c0209i5, modifierM118962N20);
                        c28655q2.m87152f0(3612900);
                        if (status != DebugStatus.SUCCESS) {
                            AbstractC22676k.m65750j(status, "status");
                            i13 = AbstractC27972s.f112805a[status.ordinal()];
                            if (i13 == 1) {
                                str2 = null;
                            } else if (i13 != 2) {
                                if (i13 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str2 = null;
                            } else {
                                str2 = "Throttle limit reached";
                            }
                            if (str2 != null) {
                                composer = composer4;
                                c0209i6 = c0209i3;
                                c28655q3 = c28655q2;
                                c3 = '\b';
                                AbstractC3269g.m9503g(status, str2, false, null, composer, 0, 12);
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                            } else {
                                c28655q3 = c28655q2;
                                composer = composer4;
                                c0209i6 = c0209i3;
                                c3 = '\b';
                            }
                        } else {
                            c28655q3 = c28655q2;
                            composer = composer4;
                            c0209i6 = c0209i3;
                            c3 = '\b';
                        }
                        c28655q3.m87173q(false);
                        long j110 = AbstractC35029g.f148260i;
                        composer2 = composer;
                        j7 = AbstractC35029g.f148255d;
                        c28655q4 = c28655q3;
                        AbstractC23149o4.m67127b("Throttle", null, j110, j7, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(AbstractC35029g.f148252a / 2, c2314t));
                        if (nudge != null) {
                            type = nudge.getType();
                        } else {
                            type = null;
                        }
                        if (type != null) {
                            strName = type.name();
                        } else {
                            strName = null;
                        }
                        if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                            if (simulationContext != null) {
                                guideThrottleLimit = simulationContext.getSurveyThrottleLimit();
                            } else {
                                guideThrottleLimit = null;
                            }
                        } else if (simulationContext != null) {
                            guideThrottleLimit = simulationContext.getGuideThrottleLimit();
                        } else {
                            guideThrottleLimit = null;
                        }
                        if (type != null) {
                            strName2 = type.name();
                        } else {
                            strName2 = null;
                        }
                        if (AbstractC22676k.m65745e(strName2, "SURVEY")) {
                            str = "Survey";
                        } else {
                            str = "Guide";
                        }
                        if (guideThrottleLimit != null) {
                            zM65745e = AbstractC22676k.m65745e(guideThrottleLimit.getEnabled(), Boolean.TRUE);
                        } else {
                            zM65745e = false;
                        }
                        if (zM65745e) {
                            c28655q4.m87152f0(3613955);
                            max = guideThrottleLimit.getMax();
                            if (max != null) {
                                iIntValue = max.intValue();
                            } else {
                                iIntValue = 1;
                            }
                            period = guideThrottleLimit.getPeriod();
                            if (period == null) {
                                period = "unknown";
                            }
                            AbstractC3511b.m10374c(iIntValue + ' ' + str + "s per " + period, null, composer2, 0);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87152f0(3614151);
                            AbstractC3511b.m10374c("No limit", null, composer2, 6);
                            c28655q4.m87173q(false);
                        }
                        f13 = 12;
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(f13, c2314t));
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R2 = c28655q4.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R2;
                        zM87153g2 = c28655q4.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q4.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = new C25598e(4, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C25598e(4, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM3409f9, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                        c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                        iM87266t2 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(composer2, modifierM3360e3);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c0213j2 = c0213j;
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d7);
                        c0209i7 = c0209i4;
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m110);
                        if (c28655q4.f115903S) {
                            j13 = j7;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t2))) {
                                c0209i8 = c0209i6;
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N110);
                            Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                            C2306l c2306l5 = C2299e.f9108K;
                            C22949e c22949e5 = AbstractC22977m.f90650a;
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e5, c2306l5, composer2, 48);
                            iM87266t3 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(composer2, modifierM3409f10);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a9);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m111);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N111);
                            if (1.0f > 0.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e5, c2306l5, composer2, 48);
                            iM87266t4 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                            Modifier modifierM118962N112 = AbstractC37056f.m118962N(composer2, layoutWeightElement5);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j2);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a10);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m112);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N112);
                            c0209i9 = c0209i8;
                            c0213j3 = c0213j2;
                            AbstractC23149o4.m67127b("Ignore Throttle limits", null, j110, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                            f14 = 8;
                            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                            zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                            objM87133R4 = c28655q4.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C25598e(5, interfaceC28601c1);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                            c28655q4.m87173q(true);
                            AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a3, 4), null, false, null, composer2, 0, 124);
                            c28655q4.m87173q(true);
                            c28655q4.m87152f0(3616406);
                            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                                float f19 = 16;
                                Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f19, 0.0f, 2);
                                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                                iM87266t5 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q4.m87165m();
                                Modifier modifierM118962N113 = AbstractC37056f.m118962N(composer2, modifierM3396r5);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c0213j4 = c0213j3;
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a7);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m113);
                                if (c28655q4.f115903S) {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                } else {
                                    c0209i10 = c0209i9;
                                    AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N113);
                                long j111 = AbstractC35029g.f148271t;
                                Modifier modifierM3394p5 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j111, AbstractC33253j.m105489e(f14)));
                                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                                iM87266t6 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                                Modifier modifierM118962N114 = AbstractC37056f.m118962N(composer2, modifierM3394p5);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j4);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d8);
                                AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m114);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                } else {
                                    AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N114);
                                c28655q5 = c28655q4;
                                z13 = true;
                                AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                                c28655q5.m87173q(true);
                                z14 = false;
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f19, f14), 40, 0.0f, 2), j111, new C33249f()), composer2, 0);
                                c28655q5.m87173q(true);
                            } else {
                                c28655q5 = c28655q4;
                                z13 = true;
                                z14 = false;
                            }
                            AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                        } else {
                            j13 = j7;
                        }
                        c0209i8 = c0209i6;
                        AbstractC11266d.m30471y(iM87266t2, c28655q4, iM87266t2, c0209i8);
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N110);
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C2306l c2306l6 = C2299e.f9108K;
                        C22949e c22949e6 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e6, c2306l6, composer2, 48);
                        iM87266t3 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(composer2, modifierM3409f11);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a11);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m115);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N115);
                        if (1.0f > 0.0d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                        C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22949e6, c2306l6, composer2, 48);
                        iM87266t4 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(composer2, layoutWeightElement6);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a12);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m116);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N116);
                        c0209i9 = c0209i8;
                        c0213j3 = c0213j2;
                        AbstractC23149o4.m67127b("Ignore Throttle limits", null, j110, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                        f14 = 8;
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                        zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                        c28655q4.m87173q(true);
                        AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a3, 4), null, false, null, composer2, 0, 124);
                        c28655q4.m87173q(true);
                        c28655q4.m87152f0(3616406);
                        if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                            float f110 = 16;
                            Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f110, 0.0f, 2);
                            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                            iM87266t5 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                            Modifier modifierM118962N117 = AbstractC37056f.m118962N(composer2, modifierM3396r6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c0213j4 = c0213j3;
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c0213j4 = c0213j3;
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a8);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m117);
                            if (c28655q4.f115903S) {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            } else {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N117);
                            long j112 = AbstractC35029g.f148271t;
                            Modifier modifierM3394p6 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j112, AbstractC33253j.m105489e(f14)));
                            InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                            iM87266t6 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
                            Modifier modifierM118962N118 = AbstractC37056f.m118962N(composer2, modifierM3394p6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d9);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m118);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            } else {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N118);
                            c28655q5 = c28655q4;
                            z13 = true;
                            AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                            c28655q5.m87173q(true);
                            z14 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f110, f14), 40, 0.0f, 2), j112, new C33249f()), composer2, 0);
                            c28655q5.m87173q(true);
                        } else {
                            c28655q5 = c28655q4;
                            z13 = true;
                            z14 = false;
                        }
                        AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                    } else {
                        c0209i4 = c0209i2;
                    }
                    AbstractC11266d.m30471y(iM87266t, c28655q2, iM87266t, c0209i3);
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(composer4, c0209i5, modifierM118962N20);
                    c28655q2.m87152f0(3612900);
                    if (status != DebugStatus.SUCCESS) {
                        AbstractC22676k.m65750j(status, "status");
                        i13 = AbstractC27972s.f112805a[status.ordinal()];
                        if (i13 == 1) {
                            str2 = null;
                        } else if (i13 != 2) {
                            if (i13 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = null;
                        } else {
                            str2 = "Throttle limit reached";
                        }
                        if (str2 != null) {
                            composer = composer4;
                            c0209i6 = c0209i3;
                            c28655q3 = c28655q2;
                            c3 = '\b';
                            AbstractC3269g.m9503g(status, str2, false, null, composer, 0, 12);
                            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                        } else {
                            c28655q3 = c28655q2;
                            composer = composer4;
                            c0209i6 = c0209i3;
                            c3 = '\b';
                        }
                    } else {
                        c28655q3 = c28655q2;
                        composer = composer4;
                        c0209i6 = c0209i3;
                        c3 = '\b';
                    }
                    c28655q3.m87173q(false);
                    long j113 = AbstractC35029g.f148260i;
                    composer2 = composer;
                    j7 = AbstractC35029g.f148255d;
                    c28655q4 = c28655q3;
                    AbstractC23149o4.m67127b("Throttle", null, j113, j7, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(AbstractC35029g.f148252a / 2, c2314t));
                    if (nudge != null) {
                        type = nudge.getType();
                    } else {
                        type = null;
                    }
                    if (type != null) {
                        strName = type.name();
                    } else {
                        strName = null;
                    }
                    if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                        if (simulationContext != null) {
                            guideThrottleLimit = simulationContext.getSurveyThrottleLimit();
                        } else {
                            guideThrottleLimit = null;
                        }
                    } else if (simulationContext != null) {
                        guideThrottleLimit = simulationContext.getGuideThrottleLimit();
                    } else {
                        guideThrottleLimit = null;
                    }
                    if (type != null) {
                        strName2 = type.name();
                    } else {
                        strName2 = null;
                    }
                    if (AbstractC22676k.m65745e(strName2, "SURVEY")) {
                        str = "Survey";
                    } else {
                        str = "Guide";
                    }
                    if (guideThrottleLimit != null) {
                        zM65745e = AbstractC22676k.m65745e(guideThrottleLimit.getEnabled(), Boolean.TRUE);
                    } else {
                        zM65745e = false;
                    }
                    if (zM65745e) {
                        c28655q4.m87152f0(3613955);
                        max = guideThrottleLimit.getMax();
                        if (max != null) {
                            iIntValue = max.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        period = guideThrottleLimit.getPeriod();
                        if (period == null) {
                            period = "unknown";
                        }
                        AbstractC3511b.m10374c(iIntValue + ' ' + str + "s per " + period, null, composer2, 0);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87152f0(3614151);
                        AbstractC3511b.m10374c("No limit", null, composer2, 6);
                        c28655q4.m87173q(false);
                    }
                    f13 = 12;
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(f13, c2314t));
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R2 = c28655q4.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R2;
                    zM87153g2 = c28655q4.m87153g(interfaceC28601c1);
                    objM87133R3 = c28655q4.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = new C25598e(4, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C25598e(4, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM3409f12, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R3, 28);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, false);
                    iM87266t2 = AbstractC28683x.m87266t(composer2);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(composer2, modifierM3360e4);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c0213j2 = c0213j;
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d10);
                    c0209i7 = c0209i4;
                    AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m119);
                    if (c28655q4.f115903S) {
                        j13 = j7;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iM87266t2))) {
                            c0209i8 = c0209i6;
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N119);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C2306l c2306l7 = C2299e.f9108K;
                        C22949e c22949e7 = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22949e7, c2306l7, composer2, 48);
                        iM87266t3 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(composer2, modifierM3409f13);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a13);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1110);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1110);
                        if (1.0f > 0.0d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22949e7, c2306l7, composer2, 48);
                        iM87266t4 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(composer2, layoutWeightElement7);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a14);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1111);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1111);
                        c0209i9 = c0209i8;
                        c0213j3 = c0213j2;
                        AbstractC23149o4.m67127b("Ignore Throttle limits", null, j113, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                        f14 = 8;
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                        zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C25598e(5, interfaceC28601c1);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                        c28655q4.m87173q(true);
                        AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a3, 4), null, false, null, composer2, 0, 124);
                        c28655q4.m87173q(true);
                        c28655q4.m87152f0(3616406);
                        if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                            float f111 = 16;
                            Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f111, 0.0f, 2);
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                            iM87266t5 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q4.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(composer2, modifierM3396r7);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c0213j4 = c0213j3;
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c0213j4 = c0213j3;
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a9);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1112);
                            if (c28655q4.f115903S) {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            } else {
                                c0209i10 = c0209i9;
                                AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1112);
                            long j114 = AbstractC35029g.f148271t;
                            Modifier modifierM3394p7 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j114, AbstractC33253j.m105489e(f14)));
                            InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                            iM87266t6 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q4.m87165m();
                            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(composer2, modifierM3394p7);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j4);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d11);
                            AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1113);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            } else {
                                AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1113);
                            c28655q5 = c28655q4;
                            z13 = true;
                            AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                            c28655q5.m87173q(true);
                            z14 = false;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f111, f14), 40, 0.0f, 2), j114, new C33249f()), composer2, 0);
                            c28655q5.m87173q(true);
                        } else {
                            c28655q5 = c28655q4;
                            z13 = true;
                            z14 = false;
                        }
                        AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                    } else {
                        j13 = j7;
                    }
                    c0209i8 = c0209i6;
                    AbstractC11266d.m30471y(iM87266t2, c28655q4, iM87266t2, c0209i8);
                    AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N119);
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C2306l c2306l8 = C2299e.f9108K;
                    C22949e c22949e8 = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22949e8, c2306l8, composer2, 48);
                    iM87266t3 = AbstractC28683x.m87266t(composer2);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q4.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(composer2, modifierM3409f14);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a15);
                    AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1114);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iM87266t3, c28655q4, iM87266t3, c0209i8);
                    }
                    AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1114);
                    if (1.0f > 0.0d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
                    C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22949e8, c2306l8, composer2, 48);
                    iM87266t4 = AbstractC28683x.m87266t(composer2);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q4.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(composer2, layoutWeightElement8);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, c0209i, c22994r1M66759a16);
                    AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1115);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iM87266t4, c28655q4, iM87266t4, c0209i8);
                    }
                    AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1115);
                    c0209i9 = c0209i8;
                    c0213j3 = c0213j2;
                    AbstractC23149o4.m67127b("Ignore Throttle limits", null, j113, j13, C28780r.f116540G, 0L, null, 0L, 0, false, 0, 0, null, composer2, 200070, 0, 131026);
                    f14 = 8;
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3424u(f14, c2314t));
                    zM87153g3 = c28655q4.m87153g(interfaceC28601c1);
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87153g3) {
                        objM87133R4 = new C25598e(5, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C25598e(5, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    AbstractC23124k3.m67102f((InterfaceC4339a) objM87133R4, AbstractC1102d.m3419p(24, c2314t), false, null, AbstractC27956c.f112751a, composer2, 196656);
                    c28655q4.m87173q(true);
                    AbstractC1123d.m3465a(this.f112767z, new C21317a(c4861a3, 4), null, false, null, composer2, 0, 124);
                    c28655q4.m87173q(true);
                    c28655q4.m87152f0(3616406);
                    if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                        float f112 = 16;
                        Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(c2314t, 0.0f, -50, 1), f112, 0.0f, 2);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
                        iM87266t5 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q4.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(composer2, modifierM3396r8);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c0213j4 = c0213j3;
                            c28655q4.m87163l(c0213j4);
                        } else {
                            c0213j4 = c0213j3;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a10);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1116);
                        if (c28655q4.f115903S) {
                            c0209i10 = c0209i9;
                            AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                        } else {
                            c0209i10 = c0209i9;
                            AbstractC11266d.m30471y(iM87266t5, c28655q4, iM87266t5, c0209i10);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1116);
                        long j115 = AbstractC35029g.f148271t;
                        Modifier modifierM3394p8 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, j115, AbstractC33253j.m105489e(f14)));
                        InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
                        iM87266t6 = AbstractC28683x.m87266t(composer2);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q4.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(composer2, modifierM3394p8);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j4);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, c0209i, interfaceC39127r0M66763d12);
                        AbstractC28683x.m87239G(composer2, c0209i7, interfaceC28653p1M87165m1117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                        } else {
                            AbstractC11266d.m30471y(iM87266t6, c28655q4, iM87266t6, c0209i10);
                        }
                        AbstractC28683x.m87239G(composer2, c0209i5, modifierM118962N1117);
                        c28655q5 = c28655q4;
                        z13 = true;
                        AbstractC23149o4.m67127b("Throttle limits won't be enforced while testing", null, AbstractC35029g.f148262k, AbstractC35029g.f148254c, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                        c28655q5.m87173q(true);
                        z14 = false;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC1102d.m3421r(c2314t, f112, f14), 40, 0.0f, 2), j115, new C33249f()), composer2, 0);
                        c28655q5.m87173q(true);
                    } else {
                        c28655q5 = c28655q4;
                        z13 = true;
                        z14 = false;
                    }
                    AbstractC25012a.m73392y(c28655q5, z14, z13, z13);
                }
                return C23454a0.f92919a;
            default:
                ((Number) obj2).intValue();
                AbstractC31484o.m96950b(this.f112767z, (String) this.f112765x, (String) this.f112762F, (AbstractC22680m) this.f112761E, (C35031i) this.f112766y, (Modifier) this.f112763G, (Composer) obj, AbstractC28683x.m87244L(385));
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27961h(Nudge nudge, boolean z4, C2320z c2320z, int i13, C4861a c4861a, InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        super(2);
        this.f112765x = nudge;
        this.f112767z = z4;
        this.f112762F = c2320z;
        this.f112761E = c4861a;
        this.f112766y = interfaceC28601c1;
        this.f112763G = interfaceC4339a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27961h(boolean z4, String str, String str2, Function1 function1, C35031i c35031i, Modifier modifier, int i13) {
        super(2);
        this.f112767z = z4;
        this.f112765x = str;
        this.f112762F = str2;
        this.f112761E = (AbstractC22680m) function1;
        this.f112766y = c35031i;
        this.f112763G = modifier;
    }
}
