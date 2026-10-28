package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import bu2.C3657r;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15676d;
import gb1.AbstractC15679g;
import ge3.AbstractC15751g;
import hu1.C17650g;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.y */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lhy0/u;", "goalIndicatorItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Lhy0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhy0/z;", "style", "Li2/x;", "contentColor", "tintColor", "m", "(Lhy0/z;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "color", "Ly3/f;", "cornerRadius", "o", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;I)V", "g", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V", "Lhy0/t;", "q", "(Lhy0/z;Landroidx/compose/runtime/Composer;I)Lhy0/t;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17803y {

    /* JADX INFO: renamed from: hy0.y$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69234a;

        static {
            int[] iArr = new int[EnumC17806z.values().length];
            try {
                iArr[EnumC17806z.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17806z.CURRENT_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17806z.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17806z.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17806z.ACTIVITY_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17806z.BEHAVIOR_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17806z.INCOMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f69234a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m51162g(Modifier modifier, long j7, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1973161471);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifier, j7, AbstractC33253j.f138651a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3657r(i13, 2, j7, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51163h(Modifier modifier, long j7, int i13, Composer composer, int i14) {
        m51162g(modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m51164i(C17791u goalIndicatorItemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int i18;
        long jM95624D;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(goalIndicatorItemState, "goalIndicatorItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1746470572);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(goalIndicatorItemState) : c28655q.m87157i(goalIndicatorItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C17650g(3);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    i18 = a.f69234a[goalIndicatorItemState.getStyle().ordinal()];
                    if (i18 != 1 || i18 == 2) {
                        c28655q.m87150e0(974001310);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(974002747);
                        jM95624D = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j7 = jM95624D;
                    C17788t c17788tM51172q = m51172q(goalIndicatorItemState.getStyle(), c28655q, 0);
                    C2305k c2305k = C2299e.f9111N;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(goalIndicatorItemState))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifier5 = modifier4;
                    Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), "PlanOverview_DayCircle_" + AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44101d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH6(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, c2314t));
                    m51168m(goalIndicatorItemState.getStyle(), c17788tM51172q.getContentColor(), c17788tM51172q.getTintColor(), null, c28655q, 0, 8);
                    c28655q.m87173q(true);
                    function3 = function4;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17794v(i13, i14, 0, (Object) goalIndicatorItemState, (Object) modifier3, (InterfaceC23459e) function3);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17650g(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                i18 = a.f69234a[goalIndicatorItemState.getStyle().ordinal()];
                if (i18 != 1) {
                    c28655q.m87150e0(974001310);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(974001310);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j13 = jM95624D;
                C17788t c17788tM51172q2 = m51172q(goalIndicatorItemState.getStyle(), c28655q, 0);
                C2305k c2305k2 = C2299e.f9111N;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier6 = modifier4;
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), "PlanOverview_DayCircle_" + AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44101d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH6(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, c2314t));
                m51168m(goalIndicatorItemState.getStyle(), c17788tM51172q2.getContentColor(), c17788tM51172q2.getTintColor(), null, c28655q, 0, 8);
                c28655q.m87173q(true);
                function3 = function4;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 0, (Object) goalIndicatorItemState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17650g(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                i18 = a.f69234a[goalIndicatorItemState.getStyle().ordinal()];
                if (i18 != 1) {
                    c28655q.m87150e0(974001310);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(974001310);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j14 = jM95624D;
                C17788t c17788tM51172q3 = m51172q(goalIndicatorItemState.getStyle(), c28655q, 0);
                C2305k c2305k3 = C2299e.f9111N;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier7 = modifier4;
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), "PlanOverview_DayCircle_" + AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44101d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0), null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH6(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, c2314t));
                m51168m(goalIndicatorItemState.getStyle(), c17788tM51172q3.getContentColor(), c17788tM51172q3.getTintColor(), null, c28655q, 0, 8);
                c28655q.m87173q(true);
                function3 = function4;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 0, (Object) goalIndicatorItemState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17650g(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            i18 = a.f69234a[goalIndicatorItemState.getStyle().ordinal()];
            if (i18 != 1) {
                c28655q.m87150e0(974001310);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(974001310);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j15 = jM95624D;
            C17788t c17788tM51172q4 = m51172q(goalIndicatorItemState.getStyle(), c28655q, 0);
            C2305k c2305k4 = C2299e.f9111N;
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13989w1(28, function4, goalIndicatorItemState);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifier8 = modifier4;
            Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), "PlanOverview_DayCircle_" + AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44101d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(goalIndicatorItemState.getDay(), c28655q, 0), null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH6(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * 4, c2314t));
            m51168m(goalIndicatorItemState.getStyle(), c17788tM51172q4.getContentColor(), c17788tM51172q4.getTintColor(), null, c28655q, 0, 8);
            c28655q.m87173q(true);
            function3 = function4;
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 0, (Object) goalIndicatorItemState, (Object) modifier3, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51165j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51166k(Function1 function1, C17791u c17791u) {
        function1.invoke(c17791u.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51167l(C17791u c17791u, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51164i(c17791u, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m51168m(EnumC17806z style, long j7, long j13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int[] iArr;
        int i17;
        Modifier modifier5;
        Modifier modifierM44107d;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        long j14 = j7;
        AbstractC22676k.m65750j(style, "style");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-764943393);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87149e(style.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87151f(j14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87151f(j13) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                modifier4 = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = modifier2;
                }
                iArr = a.f69234a;
                i17 = iArr[style.ordinal()];
                if (i17 != 2 || i17 == 3) {
                    float f14 = 4;
                    float f15 = ((float) 0.5d) * f14;
                    modifier5 = modifier4;
                    modifierM44107d = AbstractC15679g.m44107d(modifier4, f15, j14, AbstractC33253j.f138651a, f14 * ((float) 1.5d), f15);
                } else {
                    modifierM44107d = AbstractC15751g.m44455h(modifier4, ((float) 0.5d) * 4, j14, AbstractC33253j.f138651a);
                    modifier5 = modifier4;
                }
                modifier3 = modifier4;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM44107d, j13, AbstractC33253j.f138651a);
                float f16 = 8;
                f13 = 4;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.25d) * f16, AbstractC1102d.m3419p(f16 * f13, modifierM3358c));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                switch (iArr[style.ordinal()]) {
                    case 1:
                        j14 = j7;
                        c28655q = c28655q2;
                        c28655q.m87150e0(-778937585);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                        c28655q.m87173q(false);
                        break;
                    case 2:
                        j14 = j7;
                        c28655q = c28655q2;
                        c28655q.m87150e0(-778935217);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                        c28655q.m87173q(false);
                        break;
                    case 3:
                        j14 = j7;
                        c28655q = c28655q2;
                        c28655q.m87150e0(-778939697);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                        c28655q.m87173q(false);
                        break;
                    case 4:
                        j14 = j7;
                        c28655q = c28655q2;
                        c28655q.m87150e0(-778950193);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                        c28655q.m87173q(false);
                        break;
                    case 5:
                    case 6:
                        j14 = j7;
                        c28655q = c28655q2;
                        c28655q.m87150e0(-778947128);
                        m51162g(AbstractC1102d.m3407d(1.0f, modifier5), j14, c28655q, (i16 & 112) | 6);
                        c28655q.m87173q(false);
                        break;
                    case 7:
                        c28655q2.m87150e0(-778944072);
                        c28655q = c28655q2;
                        m51170o(AbstractC1102d.m3411h(((float) 0.5d) * f13, AbstractC1102d.m3409f(1.0f, modifier5)), j7, ((float) 0.25d) * f13, c28655q, (i16 & 112) | 390);
                        j14 = j7;
                        c28655q.m87173q(false);
                        break;
                    default:
                        throw AbstractC11895b.m32003v(-778950893, c28655q2, false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17797w(style, j14, j13, modifier3, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            modifier4 = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = modifier2;
            }
            iArr = a.f69234a;
            i17 = iArr[style.ordinal()];
            if (i17 != 2) {
                float f17 = 4;
                float f18 = ((float) 0.5d) * f17;
                modifier5 = modifier4;
                modifierM44107d = AbstractC15679g.m44107d(modifier4, f18, j14, AbstractC33253j.f138651a, f17 * ((float) 1.5d), f18);
            } else {
                float f19 = 4;
                float f110 = ((float) 0.5d) * f19;
                modifier5 = modifier4;
                modifierM44107d = AbstractC15679g.m44107d(modifier4, f110, j14, AbstractC33253j.f138651a, f19 * ((float) 1.5d), f110);
            }
            modifier3 = modifier4;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM44107d, j13, AbstractC33253j.f138651a);
            float f111 = 8;
            f13 = 4;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.25d) * f111, AbstractC1102d.m3419p(f111 * f13, modifierM3358c2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            switch (iArr[style.ordinal()]) {
                case 1:
                    j14 = j7;
                    c28655q = c28655q2;
                    c28655q.m87150e0(-778937585);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                    c28655q.m87173q(false);
                    break;
                case 2:
                    j14 = j7;
                    c28655q = c28655q2;
                    c28655q.m87150e0(-778935217);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                    c28655q.m87173q(false);
                    break;
                case 3:
                    j14 = j7;
                    c28655q = c28655q2;
                    c28655q.m87150e0(-778939697);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                    c28655q.m87173q(false);
                    break;
                case 4:
                    j14 = j7;
                    c28655q = c28655q2;
                    c28655q.m87150e0(-778950193);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, modifier5));
                    c28655q.m87173q(false);
                    break;
                case 5:
                case 6:
                    j14 = j7;
                    c28655q = c28655q2;
                    c28655q.m87150e0(-778947128);
                    m51162g(AbstractC1102d.m3407d(1.0f, modifier5), j14, c28655q, (i16 & 112) | 6);
                    c28655q.m87173q(false);
                    break;
                case 7:
                    c28655q2.m87150e0(-778944072);
                    c28655q = c28655q2;
                    m51170o(AbstractC1102d.m3411h(((float) 0.5d) * f13, AbstractC1102d.m3409f(1.0f, modifier5)), j7, ((float) 0.25d) * f13, c28655q, (i16 & 112) | 390);
                    j14 = j7;
                    c28655q.m87173q(false);
                    break;
                default:
                    throw AbstractC11895b.m32003v(-778950893, c28655q2, false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17797w(style, j14, j13, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51169n(EnumC17806z enumC17806z, long j7, long j13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m51168m(enumC17806z, j7, j13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m51170o(Modifier modifier, long j7, float f13, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-832858590);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifier, j7, AbstractC33253j.m105489e(f13)), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17800x(modifier, j7, f13, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m51171p(Modifier modifier, long j7, float f13, int i13, Composer composer, int i14) {
        m51170o(modifier, j7, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final C17788t m51172q(EnumC17806z enumC17806z, Composer composer, int i13) {
        switch (a.f69234a[enumC17806z.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-84216336);
                C17788t c17788t = new C17788t(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), C17919x.f69637n, null);
                c28655q.m87173q(false);
                return c17788t;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-84212403);
                C17788t c17788t2 = new C17788t(C38072d.f163053a.m121949b(c28655q2, 6).getWhite20(), C17919x.f69637n, null);
                c28655q2.m87173q(false);
                return c17788t2;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(-84219923);
                C17788t c17788t3 = new C17788t(C38072d.f163053a.m121949b(c28655q3, 6).getWhite20(), C17919x.f69637n, null);
                c28655q3.m87173q(false);
                return c17788t3;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(-84236979);
                C17788t c17788t4 = new C17788t(C38072d.f163053a.m121949b(c28655q4, 6).getWhite20(), C17919x.f69637n, null);
                c28655q4.m87173q(false);
                return c17788t4;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(-84233050);
                C38072d c38072d = C38072d.f163053a;
                C17788t c17788t5 = new C17788t(c38072d.m121949b(c28655q5, 6).getStrain(), C17919x.m51541c(0.2f, c38072d.m121949b(c28655q5, 6).getStrain()), null);
                c28655q5.m87173q(false);
                return c17788t5;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(-84228342);
                C38072d c38072d2 = C38072d.f163053a;
                C17788t c17788t6 = new C17788t(c38072d2.m121949b(c28655q6, 6).getRecovery(), C17919x.m51541c(0.2f, c38072d2.m121949b(c28655q6, 6).getRecovery()), null);
                c28655q6.m87173q(false);
                return c17788t6;
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(-84223755);
                C38072d c38072d3 = C38072d.f163053a;
                C17788t c17788t7 = new C17788t(c38072d3.m121949b(c28655q7, 6).getWhite50(), c38072d3.m121949b(c28655q7, 6).getWhite20(), null);
                c28655q7.m87173q(false);
                return c17788t7;
            default:
                throw AbstractC11895b.m32003v(-84237259, (C28655q) composer, false);
        }
    }
}
