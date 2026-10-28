package androidx.compose.p018ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import hb3.AbstractC17104a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.C0230n0;
import p005a3.C0244q2;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2316v;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2404l2;
import p028b4.AbstractC2701l;
import p028b4.C2692c;
import p028b4.C2704o;
import p028b4.C2705p;
import p028b4.C2706q;
import p028b4.C2711v;
import p031b9.AbstractC2875y;
import p164g2.C15252x;
import p245j8.AbstractC21412c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28647o;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p399pb.InterfaceC29049f;
import p401pj.C29280n;
import p419qb.AbstractC30178a;
import p634y1.AbstractC39035h;
import p634y1.InterfaceC39033f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1137a {
    /* JADX INFO: renamed from: a */
    public static final void m3601a(Function1 function1, Modifier modifier, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function3;
        C2692c c2692c = C2692c.f10591E;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1783766393);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            Function1 function4 = i17 != 0 ? c2692c : function2;
            m3602b(function1, modifier3, null, c2692c, function4, c28655q, (i15 & 14) | 3072 | (i15 & 112) | (57344 & (i15 << 6)), 4);
            modifier2 = modifier3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function3 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29280n(function1, modifier2, function3, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m3602b(Function1 function1, Modifier modifier, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function5;
        boolean z4;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        Modifier modifierM118962N;
        InterfaceC39171c interfaceC39171c;
        EnumC39181m enumC39181m;
        InterfaceC28653p1 interfaceC28653p1M87165m;
        InterfaceC1585g0 interfaceC1585g0;
        InterfaceC29049f interfaceC29049f;
        Function1 function7;
        InterfaceC4339a interfaceC4339aM3604d;
        InterfaceC4339a interfaceC4339aM3604d2;
        int i16;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-180024211);
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                i15 |= c28655q.m87157i(function5) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function3)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function4)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    function5 = null;
                }
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierMo3471e = modifier.mo3471e(FocusGroupPropertiesElement.f4988w);
                FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC0207h1() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                    @Override // p005a3.AbstractC0207h1
                    public final AbstractC2316v create() {
                        return new C15252x(null, 0, 7);
                    }

                    public final boolean equals(Object obj) {
                        return obj == this;
                    }

                    public final int hashCode() {
                        return 1739042953;
                    }

                    @Override // p005a3.AbstractC0207h1
                    public final void inspectableProperties(C2404l2 c2404l2) {
                        c2404l2.f9457a = "focusTarget";
                    }

                    @Override // p005a3.AbstractC0207h1
                    public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
                    }
                };
                modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e.mo3471e(focusTargetNode$FocusTargetElement).mo3471e(FocusTargetPropertiesElement.f4989w).mo3471e(focusTargetNode$FocusTargetElement));
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
                interfaceC28653p1M87165m = c28655q.m87165m();
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                interfaceC29049f = (InterfaceC29049f) c28655q.m87161k(AbstractC30178a.f123552a);
                if (function5 != null) {
                    c28655q.m87150e0(1313943160);
                    interfaceC4339aM3604d2 = m3604d(function1, c28655q, i15 & 14);
                    if (abstractC17104a0 instanceof C0244q2) {
                        AbstractC28683x.m87269w();
                        throw null;
                    }
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(interfaceC4339aM3604d2);
                    } else {
                        c28655q.m87178s0();
                    }
                    function7 = function5;
                    m3605e(c28655q, modifierM118962N, iHashCode, interfaceC39171c, interfaceC1585g0, interfaceC29049f, enumC39181m, interfaceC28653p1M87165m);
                    AbstractC28683x.m87239G(c28655q, C2704o.f10654x, function7);
                    AbstractC28683x.m87239G(c28655q, C2704o.f10655y, function4);
                    AbstractC28683x.m87239G(c28655q, C2704o.f10656z, function3);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function7 = function5;
                    c28655q.m87150e0(1314800527);
                    interfaceC4339aM3604d = m3604d(function1, c28655q, i15 & 14);
                    if (abstractC17104a0 instanceof C0244q2) {
                        AbstractC28683x.m87269w();
                        throw null;
                    }
                    c28655q.m87146c0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(interfaceC4339aM3604d);
                    } else {
                        c28655q.m87178s0();
                    }
                    m3605e(c28655q, modifierM118962N, iHashCode, interfaceC39171c, interfaceC1585g0, interfaceC29049f, enumC39181m, interfaceC28653p1M87165m);
                    AbstractC28683x.m87239G(c28655q, C2704o.f10647E, function4);
                    AbstractC28683x.m87239G(c28655q, C2704o.f10648F, function3);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                function6 = function7;
            } else {
                c28655q.m87138X();
                function6 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2705p(function1, modifier, function6, function3, function4, i13, i14);
            }
        }
        i15 |= 384;
        function5 = function2;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(function3)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(function4)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                function5 = null;
            }
            iHashCode = Long.hashCode(c28655q.f115904T);
            Modifier modifierMo3471e2 = modifier.mo3471e(FocusGroupPropertiesElement.f4988w);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement2 = new AbstractC0207h1() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // p005a3.AbstractC0207h1
                public final AbstractC2316v create() {
                    return new C15252x(null, 0, 7);
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // p005a3.AbstractC0207h1
                public final void inspectableProperties(C2404l2 c2404l2) {
                    c2404l2.f9457a = "focusTarget";
                }

                @Override // p005a3.AbstractC0207h1
                public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
                }
            };
            modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e2.mo3471e(focusTargetNode$FocusTargetElement2).mo3471e(FocusTargetPropertiesElement.f4989w).mo3471e(focusTargetNode$FocusTargetElement2));
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
            interfaceC28653p1M87165m = c28655q.m87165m();
            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            interfaceC29049f = (InterfaceC29049f) c28655q.m87161k(AbstractC30178a.f123552a);
            if (function5 != null) {
                c28655q.m87150e0(1313943160);
                interfaceC4339aM3604d2 = m3604d(function1, c28655q, i15 & 14);
                if (abstractC17104a0 instanceof C0244q2) {
                    AbstractC28683x.m87269w();
                    throw null;
                }
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(interfaceC4339aM3604d2);
                } else {
                    c28655q.m87178s0();
                }
                function7 = function5;
                m3605e(c28655q, modifierM118962N, iHashCode, interfaceC39171c, interfaceC1585g0, interfaceC29049f, enumC39181m, interfaceC28653p1M87165m);
                AbstractC28683x.m87239G(c28655q, C2704o.f10654x, function7);
                AbstractC28683x.m87239G(c28655q, C2704o.f10655y, function4);
                AbstractC28683x.m87239G(c28655q, C2704o.f10656z, function3);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function7 = function5;
                c28655q.m87150e0(1314800527);
                interfaceC4339aM3604d = m3604d(function1, c28655q, i15 & 14);
                if (abstractC17104a0 instanceof C0244q2) {
                    AbstractC28683x.m87269w();
                    throw null;
                }
                c28655q.m87146c0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(interfaceC4339aM3604d);
                } else {
                    c28655q.m87178s0();
                }
                m3605e(c28655q, modifierM118962N, iHashCode, interfaceC39171c, interfaceC1585g0, interfaceC29049f, enumC39181m, interfaceC28653p1M87165m);
                AbstractC28683x.m87239G(c28655q, C2704o.f10647E, function4);
                AbstractC28683x.m87239G(c28655q, C2704o.f10648F, function3);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            function6 = function7;
        } else {
            c28655q.m87138X();
            function6 = function5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2705p(function1, modifier, function6, function3, function4, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C2711v m3603c(C0230n0 c0230n0) {
        AbstractC2701l abstractC2701l = c0230n0.f766N;
        if (abstractC2701l != null) {
            return (C2711v) abstractC2701l;
        }
        throw AbstractC2875y.m8310w("Required value was null.");
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4339a m3604d(Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        C28647o c28647oM87237E = AbstractC28683x.m87237E(c28655q);
        InterfaceC39033f interfaceC39033f = (InterfaceC39033f) c28655q.m87161k(AbstractC39035h.f168004a);
        View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
        boolean zM87157i = ((((i13 & 14) ^ 6) > 4 && c28655q.m87153g(function1)) || (i13 & 6) == 4) | c28655q.m87157i(context) | c28655q.m87157i(c28647oM87237E) | c28655q.m87157i(interfaceC39033f) | c28655q.m87149e(iHashCode) | c28655q.m87157i(view);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            C2706q c2706q = new C2706q(context, function1, c28647oM87237E, interfaceC39033f, iHashCode, view);
            c28655q.m87172p0(c2706q);
            objM87133R = c2706q;
        }
        return (InterfaceC4339a) objM87133R;
    }

    /* JADX INFO: renamed from: e */
    public static final void m3605e(Composer composer, Modifier modifier, int i13, InterfaceC39171c interfaceC39171c, InterfaceC1585g0 interfaceC1585g0, InterfaceC29049f interfaceC29049f, EnumC39181m enumC39181m, InterfaceC28653p1 interfaceC28653p1) {
        InterfaceC0221l.f734a.getClass();
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1);
        AbstractC28683x.m87239G(composer, C2704o.f10649G, modifier);
        AbstractC28683x.m87239G(composer, C2704o.f10650H, interfaceC39171c);
        AbstractC28683x.m87239G(composer, C2704o.f10651I, interfaceC1585g0);
        AbstractC28683x.m87239G(composer, C2704o.f10652J, interfaceC29049f);
        AbstractC28683x.m87239G(composer, C2704o.f10653K, enumC39181m);
        C0209i c0209i = C0217k.f732j;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(i13))) {
            AbstractC11266d.m30471y(i13, c28655q, i13, c0209i);
        }
    }
}
