package p370oj;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.ElementSelector;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.PageTargetingConfig;
import com.amplitude.android.engagement.types.PinFormFactor;
import com.amplitude.android.engagement.types.SimulationContext;
import com.amplitude.android.engagement.types.TargetingConfig;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p035bp.AbstractC3511b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p292l1.AbstractC23149o4;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p525uj.AbstractC35029g;
import p602x1.AbstractC37817c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oj.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C27977x extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C27960g f112815E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C27960g f112816F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DebugStatus f112817w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SimulationContext f112818x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Nudge f112819y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23471q f112820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27977x(DebugStatus debugStatus, SimulationContext simulationContext, Nudge nudge, C23471q c23471q, C27960g c27960g, C27960g c27960g2) {
        super(2);
        this.f112817w = debugStatus;
        this.f112818x = simulationContext;
        this.f112819y = nudge;
        this.f112820z = c23471q;
        this.f112815E = c27960g;
        this.f112816F = c27960g2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:10:0x0050  */
    /* JADX WARN: Code duplicated, block: B:111:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x040b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0460  */
    /* JADX WARN: Code duplicated, block: B:119:0x046c  */
    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    /* JADX WARN: Code duplicated, block: B:120:0x046f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0483  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:149:0x053b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0544  */
    /* JADX WARN: Code duplicated, block: B:158:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:171:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0227  */
    /* JADX WARN: Code duplicated, block: B:65:0x0243  */
    /* JADX WARN: Code duplicated, block: B:68:0x0262  */
    /* JADX WARN: Code duplicated, block: B:74:0x0288  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x0305  */
    /* JADX WARN: Code duplicated, block: B:88:0x0330  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:91:0x0341  */
    /* JADX WARN: Code duplicated, block: B:93:0x034d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0359  */
    /* JADX WARN: Code duplicated, block: B:98:0x039b  */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C2314t c2314t;
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        DebugStatus debugStatus;
        DebugStatus status;
        SimulationContext simulationContext;
        Nudge nudge;
        SimulationContext simulationContext2;
        Nudge nudge2;
        long j7;
        long j13;
        Composer composer;
        float f13;
        float f14;
        boolean z4;
        String str;
        PageTargetingConfig pageTargeting;
        float f15;
        PageTargetingConfig pageTargetingConfig;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2314t c2314t2;
        ArrayList<TargetingConfig> arrayList3;
        ArrayList<TargetingConfig> arrayList4;
        C28655q c28655q2;
        PageTargetingConfig pageTargetingConfig2;
        C2314t c2314t3;
        C2314t c2314t4;
        String strName;
        String strName2;
        PageTargetingConfig temporarilyHideTargeting;
        C28655q c28655q3;
        C2314t c2314t5;
        boolean z13;
        String str2;
        String strName3;
        C28655q c28655q4;
        boolean z14;
        String selector;
        List<NudgeStep> steps;
        NudgeStep nudgeStep;
        FormFactor formFactor;
        ElementSelector anchorSelector;
        int i13;
        C23465k c23465k;
        String str3;
        Object obj3;
        boolean z15;
        Composer composer2 = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            C28655q c28655q5 = (C28655q) composer2;
            if (c28655q5.m87121F()) {
                c28655q5.m87138X();
            } else {
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer2, 0);
                iM87266t = AbstractC28683x.m87266t(composer2);
                c28655q = (C28655q) composer2;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
                c28655q.m87152f0(-811208146);
                debugStatus = DebugStatus.SUCCESS;
                status = this.f112817w;
                simulationContext = this.f112818x;
                nudge = this.f112819y;
                if (status != debugStatus) {
                    Object obj4 = AbstractC27975v.f112809a;
                    AbstractC22676k.m65750j(status, "status");
                    i13 = AbstractC27974u.f112808b[status.ordinal()];
                    if (i13 == 1) {
                        c23465k = null;
                    } else if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c23465k = null;
                        } else {
                            obj3 = AbstractC27975v.m84395a(nudge).f92949y;
                            if (obj3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            c23465k = new C23465k(obj3, Boolean.valueOf(z15));
                        }
                    } else if (simulationContext == null && !simulationContext.getPassesPageTargeting()) {
                        c23465k = new C23465k("Screen targeting failed", Boolean.FALSE);
                    } else if (simulationContext == null && !simulationContext.getPassesPinnedElement()) {
                        c23465k = new C23465k("Pin target element not visible on this screen", Boolean.FALSE);
                    } else if (simulationContext == null && simulationContext.getShouldTemporarilyHide()) {
                        c23465k = new C23465k("Temporarily hidden", Boolean.FALSE);
                    } else {
                        c23465k = null;
                    }
                    if (c23465k != null) {
                        str3 = (String) c23465k.f92937w;
                        if (str3 == null) {
                            str3 = "";
                        }
                        simulationContext2 = simulationContext;
                        nudge2 = nudge;
                        AbstractC3269g.m9503g(status, str3, ((Boolean) c23465k.f92938x).booleanValue(), AbstractC37817c.m121341b(1673240091, composer2, new C27976w(status, nudge, this.f112815E, this.f112816F)), composer2, 3072, 0);
                        AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(8, c2314t));
                    } else {
                        simulationContext2 = simulationContext;
                        nudge2 = nudge;
                    }
                } else {
                    simulationContext2 = simulationContext;
                    nudge2 = nudge;
                }
                c28655q.m87173q(false);
                j7 = AbstractC35029g.f148260i;
                j13 = AbstractC35029g.f148255d;
                AbstractC23149o4.m67127b("Trigger", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
                composer = composer2;
                f13 = 2;
                f14 = AbstractC35029g.f148252a / f13;
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                C23471q c23471q = this.f112820z;
                z4 = false;
                AbstractC3511b.m10374c((String) c23471q.f92947w, null, composer, 0);
                str = (String) c23471q.f92948x;
                c28655q.m87152f0(-811206009);
                if (str != null) {
                    AbstractC3511b.m10374c(str, null, composer, 0);
                }
                c28655q.m87173q(false);
                if (nudge2 != null) {
                    pageTargeting = nudge2.getPageTargeting();
                } else {
                    pageTargeting = null;
                }
                c28655q.m87152f0(-811205858);
                if (pageTargeting == null) {
                    f15 = f13;
                    c2314t3 = c2314t;
                    pageTargetingConfig2 = null;
                    c28655q2 = c28655q;
                } else {
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                    f15 = f13;
                    AbstractC23149o4.m67127b("Screen Conditions", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                    if (pageTargeting.getConfigs().isEmpty()) {
                        composer = composer;
                        c28655q.m87152f0(52452319);
                        AbstractC3511b.m10374c("On all screens", null, composer, 6);
                        c28655q.m87173q(false);
                        z4 = false;
                        c2314t3 = c2314t;
                        c28655q2 = c28655q;
                        pageTargetingConfig2 = null;
                    } else {
                        composer = composer;
                        pageTargetingConfig = null;
                        c28655q.m87152f0(52452405);
                        List<TargetingConfig> configs = pageTargeting.getConfigs();
                        arrayList = new ArrayList();
                        for (Object obj5 : configs) {
                            if (!((TargetingConfig) obj5).isExclude()) {
                                arrayList.add(obj5);
                            }
                        }
                        List<TargetingConfig> configs2 = pageTargeting.getConfigs();
                        arrayList2 = new ArrayList();
                        for (Object obj6 : configs2) {
                            if (((TargetingConfig) obj6).isExclude()) {
                                arrayList2.add(obj6);
                            }
                        }
                        c28655q.m87152f0(52452603);
                        if (arrayList.isEmpty()) {
                            c2314t2 = c2314t;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            c28655q2 = c28655q;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            c2314t2 = c2314t;
                            AbstractC23149o4.m67127b("Include on screens where", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                            composer = composer;
                            for (TargetingConfig targetingConfig : arrayList3) {
                                strName2 = (String) AbstractC27975v.f112809a.get(targetingConfig.getMatchType().name());
                                if (strName2 == null) {
                                    strName2 = targetingConfig.getMatchType().name();
                                }
                                AbstractC3511b.m10374c(strName2 + ' ' + targetingConfig.getUrl(), null, composer, 0);
                            }
                            pageTargetingConfig = null;
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(false);
                        if (arrayList4.isEmpty()) {
                            z4 = false;
                            pageTargetingConfig2 = pageTargetingConfig;
                            c2314t3 = c2314t2;
                        } else {
                            c28655q2.m87152f0(52453353);
                            if (arrayList3.isEmpty()) {
                                c2314t4 = c2314t2;
                            } else {
                                c2314t4 = c2314t2;
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(4, c2314t4));
                            }
                            c28655q2.m87173q(false);
                            Composer composer3 = composer;
                            C28655q c28655q6 = c28655q2;
                            c2314t3 = c2314t4;
                            AbstractC23149o4.m67127b("Exclude on screens where", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer3, 3462, 0, 131058);
                            composer = composer3;
                            for (TargetingConfig targetingConfig2 : arrayList4) {
                                strName = (String) AbstractC27975v.f112809a.get(targetingConfig2.getMatchType().name());
                                if (strName == null) {
                                    strName = targetingConfig2.getMatchType().name();
                                }
                                AbstractC3511b.m10374c(strName + ' ' + targetingConfig2.getUrl(), null, composer, 0);
                            }
                            pageTargetingConfig2 = null;
                            z4 = false;
                            c28655q2 = c28655q6;
                        }
                        c28655q2.m87173q(z4);
                    }
                }
                c28655q2.m87173q(z4);
                if (nudge2 != null) {
                    temporarilyHideTargeting = nudge2.getTemporarilyHideTargeting();
                } else {
                    temporarilyHideTargeting = pageTargetingConfig2;
                }
                c28655q2.m87152f0(-811203524);
                if (temporarilyHideTargeting == null) {
                    c2314t5 = c2314t3;
                    z13 = false;
                } else {
                    if (temporarilyHideTargeting.getConfigs().isEmpty()) {
                        c28655q3 = c28655q2;
                        c2314t5 = c2314t3;
                    } else {
                        C2314t c2314t6 = c2314t3;
                        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t6));
                        Composer composer4 = composer;
                        c28655q3 = c28655q2;
                        c2314t5 = c2314t6;
                        AbstractC23149o4.m67127b("Temporarily hide if", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer4, 3462, 0, 131058);
                        composer = composer4;
                        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35029g.f148252a / f15, c2314t5));
                        for (TargetingConfig targetingConfig3 : temporarilyHideTargeting.getConfigs()) {
                            if (targetingConfig3.isExclude()) {
                                str2 = "∌";
                            } else {
                                str2 = "∋";
                            }
                            strName3 = (String) AbstractC27975v.f112809a.get(targetingConfig3.getMatchType().name());
                            if (strName3 == null) {
                                strName3 = targetingConfig3.getMatchType().name();
                            }
                            AbstractC3511b.m10374c(str2 + ' ' + strName3 + ' ' + targetingConfig3.getUrl(), null, composer, 0);
                        }
                        pageTargetingConfig2 = null;
                    }
                    z13 = false;
                    c28655q2 = c28655q3;
                }
                c28655q2.m87173q(z13);
                c28655q2.m87152f0(-806961281);
                if (simulationContext2 == null && simulationContext2.isAnchorableStep()) {
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t5));
                    Composer composer5 = composer;
                    c28655q4 = c28655q2;
                    AbstractC23149o4.m67127b("Pin target element", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer5, 3462, 0, 131058);
                    AbstractC22953f.m66715b(composer5, AbstractC1102d.m3411h(AbstractC35029g.f148252a / f15, c2314t5));
                    int currentStepIndex = simulationContext2.getCurrentStepIndex();
                    if (nudge2 == null || (steps = nudge2.getSteps()) == null || (nudgeStep = (NudgeStep) AbstractC25265s.m74102I0(currentStepIndex, steps)) == null || (formFactor = nudgeStep.getFormFactor()) == null) {
                        selector = "";
                    } else {
                        selector = (!(formFactor instanceof PinFormFactor) || (anchorSelector = ((PinFormFactor) formFactor).getAnchorSelector()) == null) ? null : anchorSelector.getSelector();
                        if (selector == null) {
                            selector = "";
                        }
                    }
                    z14 = false;
                    AbstractC3511b.m10374c(selector, null, composer5, 0);
                } else {
                    c28655q4 = c28655q2;
                    z14 = false;
                }
                C28655q c28655q7 = c28655q4;
                c28655q7.m87173q(z14);
                c28655q7.m87173q(true);
            }
        } else {
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer2, 0);
            iM87266t = AbstractC28683x.m87266t(composer2);
            c28655q = (C28655q) composer2;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            }
            AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N2);
            c28655q.m87152f0(-811208146);
            debugStatus = DebugStatus.SUCCESS;
            status = this.f112817w;
            simulationContext = this.f112818x;
            nudge = this.f112819y;
            if (status != debugStatus) {
                Object obj7 = AbstractC27975v.f112809a;
                AbstractC22676k.m65750j(status, "status");
                i13 = AbstractC27974u.f112808b[status.ordinal()];
                if (i13 == 1) {
                    c23465k = null;
                } else if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c23465k = null;
                    } else {
                        obj3 = AbstractC27975v.m84395a(nudge).f92949y;
                        if (obj3 != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c23465k = new C23465k(obj3, Boolean.valueOf(z15));
                    }
                } else if (simulationContext == null) {
                    if (simulationContext == null) {
                        if (simulationContext == null) {
                            c23465k = null;
                        } else {
                            c23465k = null;
                        }
                    } else if (simulationContext == null) {
                        c23465k = null;
                    } else {
                        c23465k = null;
                    }
                } else if (simulationContext == null) {
                    if (simulationContext == null) {
                        c23465k = null;
                    } else {
                        c23465k = null;
                    }
                } else if (simulationContext == null) {
                    c23465k = null;
                } else {
                    c23465k = null;
                }
                if (c23465k != null) {
                    str3 = (String) c23465k.f92937w;
                    if (str3 == null) {
                        str3 = "";
                    }
                    simulationContext2 = simulationContext;
                    nudge2 = nudge;
                    AbstractC3269g.m9503g(status, str3, ((Boolean) c23465k.f92938x).booleanValue(), AbstractC37817c.m121341b(1673240091, composer2, new C27976w(status, nudge, this.f112815E, this.f112816F)), composer2, 3072, 0);
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(8, c2314t));
                } else {
                    simulationContext2 = simulationContext;
                    nudge2 = nudge;
                }
            } else {
                simulationContext2 = simulationContext;
                nudge2 = nudge;
            }
            c28655q.m87173q(false);
            j7 = AbstractC35029g.f148260i;
            j13 = AbstractC35029g.f148255d;
            AbstractC23149o4.m67127b("Trigger", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer2, 3462, 0, 131058);
            composer = composer2;
            f13 = 2;
            f14 = AbstractC35029g.f148252a / f13;
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
            C23471q c23471q2 = this.f112820z;
            z4 = false;
            AbstractC3511b.m10374c((String) c23471q2.f92947w, null, composer, 0);
            str = (String) c23471q2.f92948x;
            c28655q.m87152f0(-811206009);
            if (str != null) {
                AbstractC3511b.m10374c(str, null, composer, 0);
            }
            c28655q.m87173q(false);
            if (nudge2 != null) {
                pageTargeting = nudge2.getPageTargeting();
            } else {
                pageTargeting = null;
            }
            c28655q.m87152f0(-811205858);
            if (pageTargeting == null) {
                f15 = f13;
                c2314t3 = c2314t;
                pageTargetingConfig2 = null;
                c28655q2 = c28655q;
            } else {
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                f15 = f13;
                AbstractC23149o4.m67127b("Screen Conditions", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                if (pageTargeting.getConfigs().isEmpty()) {
                    composer = composer;
                    c28655q.m87152f0(52452319);
                    AbstractC3511b.m10374c("On all screens", null, composer, 6);
                    c28655q.m87173q(false);
                    z4 = false;
                    c2314t3 = c2314t;
                    c28655q2 = c28655q;
                    pageTargetingConfig2 = null;
                } else {
                    composer = composer;
                    pageTargetingConfig = null;
                    c28655q.m87152f0(52452405);
                    List<TargetingConfig> configs3 = pageTargeting.getConfigs();
                    arrayList = new ArrayList();
                    while (r3.hasNext()) {
                        if (!((TargetingConfig) obj5).isExclude()) {
                            arrayList.add(obj5);
                        }
                    }
                    List<TargetingConfig> configs4 = pageTargeting.getConfigs();
                    arrayList2 = new ArrayList();
                    while (r3.hasNext()) {
                        if (((TargetingConfig) obj6).isExclude()) {
                            arrayList2.add(obj6);
                        }
                    }
                    c28655q.m87152f0(52452603);
                    if (arrayList.isEmpty()) {
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        c2314t2 = c2314t;
                        AbstractC23149o4.m67127b("Include on screens where", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                        composer = composer;
                        while (r1.hasNext()) {
                            strName2 = (String) AbstractC27975v.f112809a.get(targetingConfig.getMatchType().name());
                            if (strName2 == null) {
                                strName2 = targetingConfig.getMatchType().name();
                            }
                            AbstractC3511b.m10374c(strName2 + ' ' + targetingConfig.getUrl(), null, composer, 0);
                        }
                        pageTargetingConfig = null;
                        c28655q2 = c28655q;
                    } else {
                        c2314t2 = c2314t;
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(false);
                    if (arrayList4.isEmpty()) {
                        c28655q2.m87152f0(52453353);
                        if (arrayList3.isEmpty()) {
                            c2314t4 = c2314t2;
                            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(4, c2314t4));
                        } else {
                            c2314t4 = c2314t2;
                        }
                        c28655q2.m87173q(false);
                        Composer composer6 = composer;
                        C28655q c28655q8 = c28655q2;
                        c2314t3 = c2314t4;
                        AbstractC23149o4.m67127b("Exclude on screens where", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer6, 3462, 0, 131058);
                        composer = composer6;
                        while (r1.hasNext()) {
                            strName = (String) AbstractC27975v.f112809a.get(targetingConfig2.getMatchType().name());
                            if (strName == null) {
                                strName = targetingConfig2.getMatchType().name();
                            }
                            AbstractC3511b.m10374c(strName + ' ' + targetingConfig2.getUrl(), null, composer, 0);
                        }
                        pageTargetingConfig2 = null;
                        z4 = false;
                        c28655q2 = c28655q8;
                    } else {
                        z4 = false;
                        pageTargetingConfig2 = pageTargetingConfig;
                        c2314t3 = c2314t2;
                    }
                    c28655q2.m87173q(z4);
                }
            }
            c28655q2.m87173q(z4);
            if (nudge2 != null) {
                temporarilyHideTargeting = nudge2.getTemporarilyHideTargeting();
            } else {
                temporarilyHideTargeting = pageTargetingConfig2;
            }
            c28655q2.m87152f0(-811203524);
            if (temporarilyHideTargeting == null) {
                c2314t5 = c2314t3;
                z13 = false;
            } else {
                if (temporarilyHideTargeting.getConfigs().isEmpty()) {
                    C2314t c2314t7 = c2314t3;
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t7));
                    Composer composer7 = composer;
                    c28655q3 = c28655q2;
                    c2314t5 = c2314t7;
                    AbstractC23149o4.m67127b("Temporarily hide if", null, AbstractC35029g.f148260i, AbstractC35029g.f148255d, null, 0L, null, 0L, 0, false, 0, 0, null, composer7, 3462, 0, 131058);
                    composer = composer7;
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(AbstractC35029g.f148252a / f15, c2314t5));
                    while (r1.hasNext()) {
                        if (targetingConfig3.isExclude()) {
                            str2 = "∌";
                        } else {
                            str2 = "∋";
                        }
                        strName3 = (String) AbstractC27975v.f112809a.get(targetingConfig3.getMatchType().name());
                        if (strName3 == null) {
                            strName3 = targetingConfig3.getMatchType().name();
                        }
                        AbstractC3511b.m10374c(str2 + ' ' + strName3 + ' ' + targetingConfig3.getUrl(), null, composer, 0);
                    }
                    pageTargetingConfig2 = null;
                } else {
                    c28655q3 = c28655q2;
                    c2314t5 = c2314t3;
                }
                z13 = false;
                c28655q2 = c28655q3;
            }
            c28655q2.m87173q(z13);
            c28655q2.m87152f0(-806961281);
            if (simulationContext2 == null) {
                c28655q4 = c28655q2;
                z14 = false;
            } else {
                c28655q4 = c28655q2;
                z14 = false;
            }
            C28655q c28655q9 = c28655q4;
            c28655q9.m87173q(z14);
            c28655q9.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
