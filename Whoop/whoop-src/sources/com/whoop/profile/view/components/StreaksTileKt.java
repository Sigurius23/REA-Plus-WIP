package com.whoop.profile.view.components;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import fy1.C14873i;
import gy0.AbstractC16272a;
import gy0.AbstractC16276e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.C25235a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p739ui0.C35015q;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v01.C35509k;
import v31.C35608d;
import v41.AbstractC35684p;
import v41.C35658c;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/profile/view/components/StreaksTileViewState;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "StreaksTile", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewStreaksTile", "(Landroidx/compose/runtime/Composer;I)V", "", "sampleStreaksTileStates", "Ljava/util/List;", "getSampleStreaksTileStates", "()Ljava/util/List;", "sampleStreaksTileWithStreak", "Lcom/whoop/profile/view/components/StreaksTileViewState;", "getSampleStreaksTileWithStreak", "()Lcom/whoop/profile/view/components/StreaksTileViewState;", "sampleStreaksTileNoStreak", "getSampleStreaksTileNoStreak", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StreaksTileKt {
    private static final StreaksTileViewState sampleStreaksTileNoStreak;
    private static final List<StreaksTileViewState> sampleStreaksTileStates;
    private static final StreaksTileViewState sampleStreaksTileWithStreak;

    static {
        InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        List<StreaksTileViewState> listM118959K = AbstractC37056f.m118959K(new StreaksTileViewState("data_streak", "DATA STREAK", "280 Days", dVarM113128a, null, enumC16313m0, null), new StreaksTileViewState("data_streak_zero", "DATA STREAK", "0 Days", null, null, enumC16313m0, null), new StreaksTileViewState("data_streak_no_icon", "DATA STREAK", "150 Days", InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b("https://app-cdn.dev.whoop.com/alwayson/streaks/red_flame_stop_v2.json")), null, null, null), new StreaksTileViewState("data_streak_with_image", "DATA STREAK", "42 Days", null, new AbstractC22403o.a(AbstractC16272a.f61988Q4), enumC16313m0, null));
        sampleStreaksTileStates = listM118959K;
        sampleStreaksTileWithStreak = listM118959K.get(0);
        sampleStreaksTileNoStreak = listM118959K.get(1);
    }

    public static final void PreviewStreaksTile(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1773403374);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.components.StreaksTileKt$PreviewStreaksTile$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) throws XmlPullParserException, IOException {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-521429908);
                    float f13 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q2, 6);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    c28655q2.m87150e0(-1826376513);
                    Iterator<T> it = StreaksTileKt.getSampleStreaksTileStates().iterator();
                    while (it.hasNext()) {
                        StreaksTileKt.StreaksTile(null, (StreaksTileViewState) it.next(), null, c28655q2, 0, 5);
                    }
                    AbstractC25012a.m73392y(c28655q2, false, true, false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewStreaksTile$lambda$1(int i13, Composer composer, int i14) {
        PreviewStreaksTile(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0317  */
    /* JADX WARN: Code duplicated, block: B:103:0x0320  */
    /* JADX WARN: Code duplicated, block: B:105:0x0324  */
    /* JADX WARN: Code duplicated, block: B:106:0x0330  */
    /* JADX WARN: Code duplicated, block: B:108:0x0344  */
    /* JADX WARN: Code duplicated, block: B:109:0x034f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0386  */
    /* JADX WARN: Code duplicated, block: B:114:0x0391  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0225  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235  */
    /* JADX WARN: Code duplicated, block: B:86:0x0243  */
    /* JADX WARN: Code duplicated, block: B:91:0x0256  */
    /* JADX WARN: Code duplicated, block: B:92:0x0265  */
    /* JADX WARN: Code duplicated, block: B:94:0x028b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ca  */
    public static final void StreaksTile(Modifier modifier, StreaksTileViewState state, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        C38072d c38072d;
        int i16;
        float f13;
        float f14;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        float f15;
        int iHashCode2;
        C28655q c28655q;
        int iHashCode3;
        InterfaceC35689r0 lottieUrl;
        boolean z15;
        float f16;
        C23454a0 c23454a0;
        EnumC16313m0 endIcon;
        Integer numValueOf;
        C27430e c27430eM107874S;
        boolean z16;
        AbstractC22403o image;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-363818855);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(14);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                f13 = 4;
                f14 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC31061c.m95629e(modifierM3409f, 3, f13, c38072d.m121949b(c28655q2, i16).getWhite10()));
                boolean zM87157i = c28655q2.m87157i(state);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C35015q(state, function4, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierM3394p, false, null, (InterfaceC4339a) objM87133R, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM5391i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    f15 = 6 * f13;
                    Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                    C22961h c22961h = AbstractC22977m.f90656g;
                    C2306l c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3413j);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    String title = state.getTitle();
                    C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i16).getH5();
                    long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
                    int i19 = C2886a.f11498d << 18;
                    Function1 function5 = function4;
                    AbstractC30795n.m94707h(title, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 0, i19, 196602);
                    c28655q = c28655q2;
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    lottieUrl = state.getLottieUrl();
                    if (lottieUrl == null) {
                        c28655q.m87150e0(1641318145);
                        z15 = false;
                        c28655q.m87173q(false);
                        c23454a0 = null;
                        f16 = f15;
                    } else {
                        z15 = false;
                        c28655q.m87150e0(1641318146);
                        f16 = f15;
                        AbstractC35684p.m113047h(AbstractC1102d.m3419p(f16, c2314t), lottieUrl, false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                        c28655q.m87173q(false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q = c28655q;
                        c28655q.m87150e0(1641547794);
                        image = state.getImage();
                        if (image == null) {
                            c28655q.m87150e0(1641547793);
                            c28655q.m87173q(z15);
                        } else {
                            c28655q.m87150e0(1641547794);
                            C28655q c28655q3 = c28655q;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f16, c2314t), null, null, 0.0f, null, c28655q3, 432, 120);
                            c28655q = c28655q3;
                            c28655q.m87173q(z15);
                        }
                        c28655q.m87173q(z15);
                    } else {
                        c28655q = c28655q;
                        c28655q.m87150e0(1576966151);
                        c28655q.m87173q(z15);
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q4, 0, i19, 196602);
                    c28655q2 = c28655q4;
                    endIcon = state.getEndIcon();
                    if (endIcon != null) {
                        numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        c28655q2.m87150e0(1642045808);
                        c28655q2.m87173q(z15);
                        c27430eM107874S = null;
                    } else {
                        c28655q2.m87150e0(1642045809);
                        c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q2, 6);
                        c28655q2.m87173q(z15);
                    }
                    if (c27430eM107874S == null) {
                        c28655q2.m87150e0(1642095718);
                        c28655q2.m87173q(z15);
                        z16 = true;
                    } else {
                        c28655q2.m87150e0(1642095719);
                        z16 = true;
                        AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14)), c38072d.m121949b(c28655q2, i16).getWhite50(), c28655q2, 432, 0);
                        c28655q2.m87173q(z15);
                    }
                    AbstractC25012a.m73392y(c28655q2, z16, z16, z16);
                    modifier3 = modifier5;
                    function3 = function5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                f15 = 6 * f13;
                Modifier modifierM3413j2 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                C22961h c22961h2 = AbstractC22977m.f90656g;
                C2306l c2306l2 = C2299e.f9108K;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3413j2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                String title2 = state.getTitle();
                C2886a c2886aM8438s2 = c38072d.m121952e(c28655q2, i16).getH5();
                long jM125430y2 = c38072d.m121949b(c28655q2, i16).getBrandWhite();
                int i110 = C2886a.f11498d << 18;
                Function1 function6 = function4;
                AbstractC30795n.m94707h(title2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q2, 0, i110, 196602);
                c28655q = c28655q2;
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l2, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                lottieUrl = state.getLottieUrl();
                if (lottieUrl == null) {
                    c28655q.m87150e0(1641318145);
                    z15 = false;
                    c28655q.m87173q(false);
                    c23454a0 = null;
                    f16 = f15;
                } else {
                    z15 = false;
                    c28655q.m87150e0(1641318146);
                    f16 = f15;
                    AbstractC35684p.m113047h(AbstractC1102d.m3419p(f16, c2314t), lottieUrl, false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(1641547794);
                    image = state.getImage();
                    if (image == null) {
                        c28655q.m87150e0(1641547793);
                        c28655q.m87173q(z15);
                    } else {
                        c28655q.m87150e0(1641547794);
                        C28655q c28655q5 = c28655q;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q5, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f16, c2314t), null, null, 0.0f, null, c28655q5, 432, 120);
                        c28655q = c28655q5;
                        c28655q.m87173q(z15);
                    }
                    c28655q.m87173q(z15);
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(1576966151);
                    c28655q.m87173q(z15);
                }
                C28655q c28655q6 = c28655q;
                AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q6, 0, i110, 196602);
                c28655q2 = c28655q6;
                endIcon = state.getEndIcon();
                if (endIcon != null) {
                    numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q2.m87150e0(1642045808);
                    c28655q2.m87173q(z15);
                    c27430eM107874S = null;
                } else {
                    c28655q2.m87150e0(1642045809);
                    c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q2, 6);
                    c28655q2.m87173q(z15);
                }
                if (c27430eM107874S == null) {
                    c28655q2.m87150e0(1642095718);
                    c28655q2.m87173q(z15);
                    z16 = true;
                } else {
                    c28655q2.m87150e0(1642095719);
                    z16 = true;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14)), c38072d.m121949b(c28655q2, i16).getWhite50(), c28655q2, 432, 0);
                    c28655q2.m87173q(z15);
                }
                AbstractC25012a.m73392y(c28655q2, z16, z16, z16);
                modifier3 = modifier5;
                function3 = function6;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier3, state, function3, i13, i14, 4);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(14);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            f13 = 4;
            f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f14, AbstractC31061c.m95629e(modifierM3409f2, 3, f13, c38072d.m121949b(c28655q2, i16).getWhite10()));
            boolean zM87157i2 = c28655q2.m87157i(state);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C35015q(state, function4, 10);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35015q(state, function4, 10);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifierM3394p2, false, null, (InterfaceC4339a) objM87133R, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM5391i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N6);
                f15 = 6 * f13;
                Modifier modifierM3413j3 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
                C22961h c22961h3 = AbstractC22977m.f90656g;
                C2306l c2306l3 = C2299e.f9108K;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h3, c2306l3, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3413j3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N7);
                String title3 = state.getTitle();
                C2886a c2886aM8438s3 = c38072d.m121952e(c28655q2, i16).getH5();
                long jM125430y3 = c38072d.m121949b(c28655q2, i16).getBrandWhite();
                int i111 = C2886a.f11498d << 18;
                Function1 function7 = function4;
                AbstractC30795n.m94707h(title3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s3, null, c28655q2, 0, i111, 196602);
                c28655q = c28655q2;
                C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l3, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M53376q3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                lottieUrl = state.getLottieUrl();
                if (lottieUrl == null) {
                    c28655q.m87150e0(1641318145);
                    z15 = false;
                    c28655q.m87173q(false);
                    c23454a0 = null;
                    f16 = f15;
                } else {
                    z15 = false;
                    c28655q.m87150e0(1641318146);
                    f16 = f15;
                    AbstractC35684p.m113047h(AbstractC1102d.m3419p(f16, c2314t), lottieUrl, false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(1641547794);
                    image = state.getImage();
                    if (image == null) {
                        c28655q.m87150e0(1641547793);
                        c28655q.m87173q(z15);
                    } else {
                        c28655q.m87150e0(1641547794);
                        C28655q c28655q7 = c28655q;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q7, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f16, c2314t), null, null, 0.0f, null, c28655q7, 432, 120);
                        c28655q = c28655q7;
                        c28655q.m87173q(z15);
                    }
                    c28655q.m87173q(z15);
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(1576966151);
                    c28655q.m87173q(z15);
                }
                C28655q c28655q8 = c28655q;
                AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q8, 0, i111, 196602);
                c28655q2 = c28655q8;
                endIcon = state.getEndIcon();
                if (endIcon != null) {
                    numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q2.m87150e0(1642045808);
                    c28655q2.m87173q(z15);
                    c27430eM107874S = null;
                } else {
                    c28655q2.m87150e0(1642045809);
                    c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q2, 6);
                    c28655q2.m87173q(z15);
                }
                if (c27430eM107874S == null) {
                    c28655q2.m87150e0(1642095718);
                    c28655q2.m87173q(z15);
                    z16 = true;
                } else {
                    c28655q2.m87150e0(1642095719);
                    z16 = true;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14)), c38072d.m121949b(c28655q2, i16).getWhite50(), c28655q2, 432, 0);
                    c28655q2.m87173q(z15);
                }
                AbstractC25012a.m73392y(c28655q2, z16, z16, z16);
                modifier3 = modifier5;
                function3 = function7;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            f15 = 6 * f13;
            Modifier modifierM3413j4 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2);
            C22961h c22961h4 = AbstractC22977m.f90656g;
            C2306l c2306l4 = C2299e.f9108K;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h4, c2306l4, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3413j4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N9);
            String title4 = state.getTitle();
            C2886a c2886aM8438s4 = c38072d.m121952e(c28655q2, i16).getH5();
            long jM125430y4 = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            int i112 = C2886a.f11498d << 18;
            Function1 function8 = function4;
            AbstractC30795n.m94707h(title4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s4, null, c28655q2, 0, i112, 196602);
            c28655q = c28655q2;
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l4, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
            lottieUrl = state.getLottieUrl();
            if (lottieUrl == null) {
                c28655q.m87150e0(1641318145);
                z15 = false;
                c28655q.m87173q(false);
                c23454a0 = null;
                f16 = f15;
            } else {
                z15 = false;
                c28655q.m87150e0(1641318146);
                f16 = f15;
                AbstractC35684p.m113047h(AbstractC1102d.m3419p(f16, c2314t), lottieUrl, false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q = c28655q;
                c28655q.m87150e0(1641547794);
                image = state.getImage();
                if (image == null) {
                    c28655q.m87150e0(1641547793);
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(1641547794);
                    C28655q c28655q9 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q9, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f16, c2314t), null, null, 0.0f, null, c28655q9, 432, 120);
                    c28655q = c28655q9;
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(z15);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(1576966151);
                c28655q.m87173q(z15);
            }
            C28655q c28655q10 = c28655q;
            AbstractC30795n.m94707h(state.getSubtitle(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q10, 0, i112, 196602);
            c28655q2 = c28655q10;
            endIcon = state.getEndIcon();
            if (endIcon != null) {
                numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                c28655q2.m87150e0(1642045808);
                c28655q2.m87173q(z15);
                c27430eM107874S = null;
            } else {
                c28655q2.m87150e0(1642045809);
                c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q2, 6);
                c28655q2.m87173q(z15);
            }
            if (c27430eM107874S == null) {
                c28655q2.m87150e0(1642095718);
                c28655q2.m87173q(z15);
                z16 = true;
            } else {
                c28655q2.m87150e0(1642095719);
                z16 = true;
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14)), c38072d.m121949b(c28655q2, i16).getWhite50(), c28655q2, 432, 0);
                c28655q2.m87173q(z15);
            }
            AbstractC25012a.m73392y(c28655q2, z16, z16, z16);
            modifier3 = modifier5;
            function3 = function8;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, state, function3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 StreaksTile$lambda$0$0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 StreaksTile$lambda$1$0(StreaksTileViewState streaksTileViewState, Function1 function1) {
        C9598e destination = streaksTileViewState.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 StreaksTile$lambda$3(Modifier modifier, StreaksTileViewState streaksTileViewState, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        StreaksTile(modifier, streaksTileViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final StreaksTileViewState getSampleStreaksTileNoStreak() {
        return sampleStreaksTileNoStreak;
    }

    public static final List<StreaksTileViewState> getSampleStreaksTileStates() {
        return sampleStreaksTileStates;
    }

    public static final StreaksTileViewState getSampleStreaksTileWithStreak() {
        return sampleStreaksTileWithStreak;
    }
}
