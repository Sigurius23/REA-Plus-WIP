package p370oj;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeLifecycleConfig;
import com.amplitude.android.engagement.types.SimulationContext;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p035bp.AbstractC3511b;
import p043c4.C3955e;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p292l1.AbstractC23149o4;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p525uj.AbstractC35029g;
import p602x1.AbstractC37817c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C27965l extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f112779E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f112780F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DebugStatus f112781w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27968o f112782x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SimulationContext f112783y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Nudge f112784z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27965l(DebugStatus debugStatus, C27968o c27968o, SimulationContext simulationContext, Nudge nudge, InterfaceC4339a interfaceC4339a, int i13) {
        super(2);
        this.f112781w = debugStatus;
        this.f112782x = c27968o;
        this.f112783y = simulationContext;
        this.f112784z = nudge;
        this.f112779E = interfaceC4339a;
        this.f112780F = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0188  */
    /* JADX WARN: Code duplicated, block: B:64:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:82:0x0233  */
    /* JADX WARN: Code duplicated, block: B:85:0x024a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0253  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C2314t c2314t;
        C27968o c27968o;
        String str;
        C22957g c22957g;
        C2305k c2305k;
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        DebugStatus debugStatus;
        DebugStatus debugStatus2;
        C0209i c0209i5;
        C0209i c0209i6;
        C0209i c0209i7;
        Object obj3;
        long j7;
        long j13;
        C0209i c0209i8;
        float f13;
        float f14;
        Nudge nudge;
        Boolean stopShowingIfCompleted;
        Boolean stopShowingIfDismissed;
        Boolean bool;
        C28655q c28655q2;
        int iM87266t2;
        boolean z4;
        Object obj4;
        boolean z13;
        NudgeLifecycleConfig lifecycleConfig;
        NudgeLifecycleConfig lifecycleConfig2;
        int i13;
        String str2;
        SimulationContext simulationContext;
        String str3;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            C28655q c28655q3 = (C28655q) composer;
            if (c28655q3.m87121F()) {
                c28655q3.m87138X();
            } else {
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                c27968o = this.f112782x;
                str = c27968o.f112791a;
                c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
                c28655q.m87152f0(2094636256);
                debugStatus = DebugStatus.SUCCESS;
                debugStatus2 = this.f112781w;
                if (debugStatus2 == debugStatus) {
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i3;
                    c0209i7 = c0209i;
                    obj3 = null;
                } else {
                    i13 = AbstractC27967n.f112790a[debugStatus2.ordinal()];
                    if (i13 == 1) {
                        if (i13 != 2) {
                            simulationContext = this.f112783y;
                            if (simulationContext == null && !simulationContext.getPassesSnoozedConditions()) {
                                str3 = "User has snoozed this";
                            } else if (simulationContext != null || simulationContext.getPassesCooldown()) {
                                str3 = c27968o.f112792b;
                                if (str3 != null) {
                                }
                                if (str2 != null) {
                                    c0209i7 = c0209i;
                                    c0209i6 = c0209i3;
                                    c0209i5 = c0209i2;
                                    obj3 = null;
                                    AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                                } else {
                                    c0209i5 = c0209i2;
                                    c0209i6 = c0209i3;
                                    c0209i7 = c0209i;
                                    obj3 = null;
                                }
                            } else {
                                str3 = "User has already interacted with this";
                            }
                            str2 = str3;
                            if (str2 != null) {
                                c0209i7 = c0209i;
                                c0209i6 = c0209i3;
                                c0209i5 = c0209i2;
                                obj3 = null;
                                AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                            } else {
                                c0209i5 = c0209i2;
                                c0209i6 = c0209i3;
                                c0209i7 = c0209i;
                                obj3 = null;
                            }
                        } else if (i13 != 3 && i13 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                        c0209i7 = c0209i;
                        c0209i6 = c0209i3;
                        c0209i5 = c0209i2;
                        obj3 = null;
                        AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                    } else {
                        c0209i5 = c0209i2;
                        c0209i6 = c0209i3;
                        c0209i7 = c0209i;
                        obj3 = null;
                    }
                }
                c28655q.m87173q(false);
                j7 = AbstractC35029g.f148260i;
                j13 = AbstractC35029g.f148255d;
                c0209i8 = c0209i7;
                AbstractC23149o4.m67127b("Limit", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                f13 = AbstractC35029g.f148252a;
                f14 = f13 / 2;
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                nudge = this.f112784z;
                if (nudge != null || (lifecycleConfig2 = nudge.getLifecycleConfig()) == null) {
                    stopShowingIfCompleted = null;
                } else {
                    stopShowingIfCompleted = lifecycleConfig2.getStopShowingIfCompleted();
                }
                if (nudge != null || (lifecycleConfig = nudge.getLifecycleConfig()) == null) {
                    stopShowingIfDismissed = null;
                } else {
                    stopShowingIfDismissed = lifecycleConfig.getStopShowingIfDismissed();
                }
                bool = Boolean.TRUE;
                if (!AbstractC22676k.m65745e(stopShowingIfCompleted, bool) || AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                    c28655q2 = c28655q;
                    c28655q2.m87152f0(2094637448);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, C17919x.f69629f, AbstractC33253j.m105489e(f13)));
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
                    iM87266t2 = AbstractC28683x.m87266t(composer);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3394p);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer, c0209i8, c23010xM66775a2);
                    AbstractC28683x.m87239G(composer, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iM87266t2))) {
                        AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i6);
                    }
                    AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
                    c28655q2.m87152f0(-1386758491);
                    if (AbstractC22676k.m65745e(stopShowingIfCompleted, bool)) {
                        AbstractC3511b.m10374c("Stop showing when completed", null, composer, 6);
                        if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
                        }
                    }
                    z4 = false;
                    c28655q2.m87173q(false);
                    c28655q2.m87152f0(2094638159);
                    if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                        obj4 = null;
                        AbstractC3511b.m10374c("Stop showing when dismissed", null, composer, 6);
                    } else {
                        obj4 = null;
                    }
                    z13 = true;
                    AbstractC25012a.m73392y(c28655q2, false, true, false);
                } else {
                    c28655q2 = c28655q;
                    c28655q2.m87152f0(2094638334);
                    obj4 = null;
                    AbstractC3511b.m10374c("No limits", null, composer, 6);
                    c28655q2.m87173q(false);
                    z4 = false;
                    z13 = true;
                }
                c28655q2.m87152f0(29352014);
                if (!AbstractC22676k.m65745e(str, "No limit")) {
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
                    AbstractC23149o4.m67127b("Cooldown", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                    z4 = false;
                    AbstractC3511b.m10374c(str, null, composer, 0);
                    c28655q2 = c28655q2;
                }
                c28655q2.m87173q(z4);
                c28655q2.m87173q(true);
            }
        } else {
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            c27968o = this.f112782x;
            str = c27968o.f112791a;
            c22957g = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i3);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N3);
            c28655q.m87152f0(2094636256);
            debugStatus = DebugStatus.SUCCESS;
            debugStatus2 = this.f112781w;
            if (debugStatus2 == debugStatus) {
                c0209i5 = c0209i2;
                c0209i6 = c0209i3;
                c0209i7 = c0209i;
                obj3 = null;
            } else {
                i13 = AbstractC27967n.f112790a[debugStatus2.ordinal()];
                if (i13 == 1) {
                    if (i13 != 2) {
                        simulationContext = this.f112783y;
                        if (simulationContext == null) {
                            if (simulationContext != null) {
                                str3 = c27968o.f112792b;
                                if (str3 != null) {
                                }
                                if (str2 != null) {
                                    c0209i7 = c0209i;
                                    c0209i6 = c0209i3;
                                    c0209i5 = c0209i2;
                                    obj3 = null;
                                    AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                                } else {
                                    c0209i5 = c0209i2;
                                    c0209i6 = c0209i3;
                                    c0209i7 = c0209i;
                                    obj3 = null;
                                }
                            } else {
                                str3 = c27968o.f112792b;
                                if (str3 != null) {
                                }
                                if (str2 != null) {
                                    c0209i7 = c0209i;
                                    c0209i6 = c0209i3;
                                    c0209i5 = c0209i2;
                                    obj3 = null;
                                    AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                                } else {
                                    c0209i5 = c0209i2;
                                    c0209i6 = c0209i3;
                                    c0209i7 = c0209i;
                                    obj3 = null;
                                }
                            }
                        } else if (simulationContext != null) {
                            str3 = c27968o.f112792b;
                            if (str3 != null) {
                            }
                            if (str2 != null) {
                                c0209i7 = c0209i;
                                c0209i6 = c0209i3;
                                c0209i5 = c0209i2;
                                obj3 = null;
                                AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                            } else {
                                c0209i5 = c0209i2;
                                c0209i6 = c0209i3;
                                c0209i7 = c0209i;
                                obj3 = null;
                            }
                        } else {
                            str3 = c27968o.f112792b;
                            if (str3 != null) {
                            }
                            if (str2 != null) {
                                c0209i7 = c0209i;
                                c0209i6 = c0209i3;
                                c0209i5 = c0209i2;
                                obj3 = null;
                                AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                            } else {
                                c0209i5 = c0209i2;
                                c0209i6 = c0209i3;
                                c0209i7 = c0209i;
                                obj3 = null;
                            }
                        }
                        str2 = str3;
                        if (str2 != null) {
                            c0209i7 = c0209i;
                            c0209i6 = c0209i3;
                            c0209i5 = c0209i2;
                            obj3 = null;
                            AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                        } else {
                            c0209i5 = c0209i2;
                            c0209i6 = c0209i3;
                            c0209i7 = c0209i;
                            obj3 = null;
                        }
                    } else if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                str2 = null;
                if (str2 != null) {
                    c0209i7 = c0209i;
                    c0209i6 = c0209i3;
                    c0209i5 = c0209i2;
                    obj3 = null;
                    AbstractC3269g.m9503g(debugStatus2, str2, false, AbstractC37817c.m121341b(2080422471, composer, new C3955e(this.f112779E, this.f112780F, 6)), composer, 3072, 4);
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(8, c2314t));
                } else {
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i3;
                    c0209i7 = c0209i;
                    obj3 = null;
                }
            }
            c28655q.m87173q(false);
            j7 = AbstractC35029g.f148260i;
            j13 = AbstractC35029g.f148255d;
            c0209i8 = c0209i7;
            AbstractC23149o4.m67127b("Limit", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
            f13 = AbstractC35029g.f148252a;
            f14 = f13 / 2;
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
            nudge = this.f112784z;
            if (nudge != null) {
                stopShowingIfCompleted = null;
            } else {
                stopShowingIfCompleted = null;
            }
            if (nudge != null) {
                stopShowingIfDismissed = null;
            } else {
                stopShowingIfDismissed = null;
            }
            bool = Boolean.TRUE;
            if (AbstractC22676k.m65745e(stopShowingIfCompleted, bool)) {
                c28655q2 = c28655q;
                c28655q2.m87152f0(2094637448);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, C17919x.f69629f, AbstractC33253j.m105489e(f13)));
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
                iM87266t2 = AbstractC28683x.m87266t(composer);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer, modifierM3394p2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(composer, c0209i8, c23010xM66775a4);
                AbstractC28683x.m87239G(composer, c0209i5, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i6);
                }
                AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N4);
                c28655q2.m87152f0(-1386758491);
                if (AbstractC22676k.m65745e(stopShowingIfCompleted, bool)) {
                    AbstractC3511b.m10374c("Stop showing when completed", null, composer, 6);
                    if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
                    }
                }
                z4 = false;
                c28655q2.m87173q(false);
                c28655q2.m87152f0(2094638159);
                if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                    obj4 = null;
                    AbstractC3511b.m10374c("Stop showing when dismissed", null, composer, 6);
                } else {
                    obj4 = null;
                }
                z13 = true;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
            } else {
                c28655q2 = c28655q;
                c28655q2.m87152f0(2094637448);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(c2314t, C17919x.f69629f, AbstractC33253j.m105489e(f13)));
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, composer, 0);
                iM87266t2 = AbstractC28683x.m87266t(composer);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer, modifierM3394p3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(composer, c0209i8, c23010xM66775a5);
                AbstractC28683x.m87239G(composer, c0209i5, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i6);
                }
                AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N5);
                c28655q2.m87152f0(-1386758491);
                if (AbstractC22676k.m65745e(stopShowingIfCompleted, bool)) {
                    AbstractC3511b.m10374c("Stop showing when completed", null, composer, 6);
                    if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
                    }
                }
                z4 = false;
                c28655q2.m87173q(false);
                c28655q2.m87152f0(2094638159);
                if (AbstractC22676k.m65745e(stopShowingIfDismissed, bool)) {
                    obj4 = null;
                    AbstractC3511b.m10374c("Stop showing when dismissed", null, composer, 6);
                } else {
                    obj4 = null;
                }
                z13 = true;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
            }
            c28655q2.m87152f0(29352014);
            if (!AbstractC22676k.m65745e(str, "No limit")) {
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13, c2314t));
                AbstractC23149o4.m67127b("Cooldown", null, j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, composer, 3462, 0, 131058);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f14, c2314t));
                z4 = false;
                AbstractC3511b.m10374c(str, null, composer, 0);
                c28655q2 = c28655q2;
            }
            c28655q2.m87173q(z4);
            c28655q2.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
