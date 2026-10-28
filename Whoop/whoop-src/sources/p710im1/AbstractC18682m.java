package p710im1;

import a11.C0127e;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c03.C3815c;
import c41.C4069m0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import em1.C13348v;
import em1.EnumC13339m;
import fl1.AbstractC14569b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.Function0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: im1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lem1/v;", "homeViewState", "Lkotlin/Function0;", "Ll83/a0;", "onErrorRetry", "Lkotlin/Function1;", "", "onWhoopStatusClick", "Lc03/c;", "statusViewState", "k", "(Lem1/v;Lc93/a;Lkotlin/jvm/functions/Function1;Lc03/c;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18682m {

    /* JADX INFO: renamed from: im1.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73297a;

        static {
            int[] iArr = new int[EnumC13339m.values().length];
            try {
                iArr[EnumC13339m.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13339m.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13339m.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13339m.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73297a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m54244g(final Modifier modifier, C3815c statusViewState, Function1 onWhoopStatusClick, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(statusViewState, "statusViewState");
        AbstractC22676k.m65750j(onWhoopStatusClick, "onWhoopStatusClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-554134616);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(statusViewState) : c28655q.m87157i(statusViewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onWhoopStatusClick) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C4069m0 c4069m0M11684a = statusViewState.getAlertTileViewState();
            if (!statusViewState.getShouldDisplay() || c4069m0M11684a == null) {
                c28655q.m87150e0(1630384986);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1630216625);
                Function3 function3 = new Function3() { // from class: im1.j
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC18682m.m54245h(modifier, (C4069m0) obj, (Composer) obj2, iIntValue);
                    }
                };
                boolean z4 = (i15 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C18678k(onWhoopStatusClick, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(c4069m0M11684a, null, function3, (Function1) objM87133R, c28655q, C4069m0.f16535h, 2);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18680l(modifier2, statusViewState, onWhoopStatusClick, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m54245h(Modifier modifier, C4069m0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1242547359);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m54246i(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke("Error Screen");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m54247j(Modifier modifier, C3815c c3815c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m54244g(modifier, c3815c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m54248k(C13348v homeViewState, InterfaceC4339a onErrorRetry, Function1 onWhoopStatusClick, C3815c statusViewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(homeViewState, "homeViewState");
        AbstractC22676k.m65750j(onErrorRetry, "onErrorRetry");
        AbstractC22676k.m65750j(onWhoopStatusClick, "onWhoopStatusClick");
        AbstractC22676k.m65750j(statusViewState, "statusViewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1160865705);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(homeViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onErrorRetry) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onWhoopStatusClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q2.m87153g(statusViewState) : c28655q2.m87157i(statusViewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i15 = a.f73297a[homeViewState.getErrorState().ordinal()];
            if (i15 != 1) {
                C2314t c2314t = C2314t.f9131w;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (i15 == 2) {
                    int i16 = i14;
                    c28655q2.m87150e0(-273215151);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    int i17 = i16 & 896;
                    boolean z4 = i17 == 256;
                    Object objM87133R = c28655q2.m87133R();
                    if (z4 || objM87133R == c28676v0) {
                        objM87133R = new C18674i(onWhoopStatusClick, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function0.m105267i(onErrorRetry, (InterfaceC4339a) objM87133R, c28655q2, (i16 >> 3) & 14, 0);
                    m54244g(AbstractC1099a.m3394p(2 * 8, c2314t), statusViewState, onWhoopStatusClick, c28655q2, ((i16 >> 6) & 112) | (C3815c.f15649d << 3) | 6 | i17, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else if (i15 == 3) {
                    c28655q2.m87150e0(-272798387);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC14569b.f53576j), false, null, 6, null);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC14569b.f53574h);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC14569b.f53575i);
                    boolean z13 = (i14 & 112) == 32;
                    Object objM87133R2 = c28655q2.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C18660b1(onErrorRetry, 1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    int i18 = AbstractC33208p0.b.f138467h;
                    int i19 = TextResource.C8688b.f25889c;
                    int i24 = i14;
                    AbstractC33199m0.m105214F(bVar, c8688bM21277k, null, c8688bM21277k2, interfaceC4339a, false, false, null, null, null, false, false, c28655q2, i18 | (i19 << 3) | (i19 << 9), 0, 4068);
                    m54244g(AbstractC1099a.m3394p(2 * 8, c2314t), statusViewState, onWhoopStatusClick, c28655q2, (C3815c.f15649d << 3) | 6 | ((i24 >> 6) & 112) | (i24 & 896), 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (i15 != 4) {
                        throw AbstractC11895b.m32003v(1099560770, c28655q2, false);
                    }
                    c28655q2.m87150e0(-272183223);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-273323279);
                Function0.m105271m(onErrorRetry, c28655q, (i14 >> 3) & 14, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0127e(homeViewState, onErrorRetry, onWhoopStatusClick, statusViewState, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m54249l(Function1 function1) {
        function1.invoke("Error Screen");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m54250m(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m54251n(C13348v c13348v, InterfaceC4339a interfaceC4339a, Function1 function1, C3815c c3815c, int i13, Composer composer, int i14) {
        m54248k(c13348v, interfaceC4339a, function1, c3815c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
