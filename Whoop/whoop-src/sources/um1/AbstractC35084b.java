package um1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.C3029l;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import k31.AbstractC22173c;
import k31.C22174d;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import o01.AbstractC27346b;
import o01.C27347c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: um1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lo01/c;", "aiChatEntryPointItem", "", "shouldShowReplayButton", "shouldAnimateReplayButton", "Lk31/d;", "replayViewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Lo01/c;ZZLk31/d;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35084b {
    /* JADX WARN: Code duplicated, block: B:101:0x020d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0188  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    /* JADX INFO: renamed from: c */
    public static final void m110939c(final C27347c c27347c, final boolean z4, final boolean z13, final C22174d c22174d, final InterfaceC4339a onClick, Composer composer, final int i13) {
        int i14;
        int i15;
        C0209i c0209i;
        int iHashCode;
        C2306l c2306l;
        ?? r14;
        int iHashCode2;
        boolean z14;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2106911387);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c27347c) : c28655q.m87157i(c27347c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c22174d) : c28655q.m87157i(c22174d) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            C23465k c23465k = z13 ? new C23465k(AbstractC1091c.m3355a(c2314t, null, 3), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(100, 500, null, 4), 2)) : new C23465k(c2314t, AbstractC3730c1.f15251a);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22949e c22949e = AbstractC22977m.f90651b;
            C2306l c2306l2 = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l2, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (c27347c == null) {
                    c28655q.m87150e0(-734356028);
                    c28655q.m87173q(false);
                    r14 = 0;
                    c2306l = c2306l2;
                } else {
                    c28655q.m87150e0(-734356027);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    c2306l = c2306l2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    r14 = 0;
                    AbstractC27346b.m82499g(c27347c, onClick, c28655q, C27347c.f109538k | ((i15 >> 9) & 112), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                if (c22174d == null) {
                    c28655q.m87150e0(-734160883);
                    c28655q.m87173q(r14);
                    z14 = true;
                } else {
                    c28655q.m87150e0(-734160882);
                    Modifier modifier = (Modifier) c23465k.f92937w;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, r14);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                    if (z4 || c27347c == null) {
                        c28655q.m87150e0(-2062189240);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-482165532);
                        AbstractC31061c.m95650z(3, 4, c2314t, c28655q, false);
                    }
                    AbstractC1090b.m3352g(z4, null, (AbstractC3730c1) c23465k.f92938x, AbstractC3736e1.f15289a, null, AbstractC37817c.m121344e(1781272146, c28655q, new C3029l(c22174d, 7)), c28655q, 1572870 | (i15 & 112), 18);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (c27347c == null) {
                c28655q.m87150e0(-734356028);
                c28655q.m87173q(false);
                r14 = 0;
                c2306l = c2306l2;
            } else {
                c28655q.m87150e0(-734356027);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                c2306l = c2306l2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
                r14 = 0;
                AbstractC27346b.m82499g(c27347c, onClick, c28655q, C27347c.f109538k | ((i15 >> 9) & 112), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            if (c22174d == null) {
                c28655q.m87150e0(-734160883);
                c28655q.m87173q(r14);
                z14 = true;
            } else {
                c28655q.m87150e0(-734160882);
                Modifier modifier2 = (Modifier) c23465k.f92937w;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, r14);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifier2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                if (z4) {
                    c28655q.m87150e0(-2062189240);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2062189240);
                    c28655q.m87173q(false);
                }
                AbstractC1090b.m3352g(z4, null, (AbstractC3730c1) c23465k.f92938x, AbstractC3736e1.f15289a, null, AbstractC37817c.m121344e(1781272146, c28655q, new C3029l(c22174d, 7)), c28655q, 1572870 | (i15 & 112), 18);
                z14 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: um1.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35084b.m110941e(c27347c, z4, z13, c22174d, onClick, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m110940d(C22174d c22174d, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC22173c.m63470b(c22174d, composer, C22174d.f85992f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m110941e(C27347c c27347c, boolean z4, boolean z13, C22174d c22174d, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m110939c(c27347c, z4, z13, c22174d, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
