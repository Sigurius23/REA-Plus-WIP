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
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
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
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22961h;
import p291l0.C22994r1;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p739ui0.C35015q;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v01.C35509k;
import v31.C35608d;
import v41.C35658c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/profile/view/components/ContextHubTileViewState;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "ContextHubTile", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ContextHubTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewContextHubTile", "(Landroidx/compose/runtime/Composer;I)V", "sampleContextHubTileWithIcon", "Lcom/whoop/profile/view/components/ContextHubTileViewState;", "getSampleContextHubTileWithIcon", "()Lcom/whoop/profile/view/components/ContextHubTileViewState;", "sampleContextHubTileNoIcon", "getSampleContextHubTileNoIcon", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ContextHubTileKt {
    private static final ContextHubTileViewState sampleContextHubTileWithIcon = new ContextHubTileViewState("context_hub_tile", "MY MEMORY", EnumC16313m0.CARET_FORWARD, null);
    private static final ContextHubTileViewState sampleContextHubTileNoIcon = new ContextHubTileViewState("context_hub_tile_no_icon", "MY MEMORY", null, null);

    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:91:0x0229  */
    /* JADX WARN: Code duplicated, block: B:93:0x022c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0255  */
    /* JADX WARN: Code duplicated, block: B:99:0x0278  */
    public static final void ContextHubTile(Modifier modifier, ContextHubTileViewState state, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
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
        float f13;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        int iHashCode2;
        C38072d c38072d;
        int i16;
        EnumC16313m0 endIcon;
        Integer numValueOf;
        C27430e c27430eM107874S;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1533725316);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                f13 = 4;
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), 3, f13), AbstractC15673b0.m43978D(), null, 0.0f, 6);
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(state))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C35015q(state, function4, 8);
                    c28655q.m87172p0(objM87133R);
                }
                float f14 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC1772c1.m5391i(modifierM3357b, false, null, (InterfaceC4339a) objM87133R, 3));
                float f15 = 6 * f13;
                Modifier modifierM3413j = AbstractC1102d.m3413j(modifierM3394p, f15, 0.0f, 2);
                C22961h c22961h = AbstractC22977m.f90656g;
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3413j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
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
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f14, c2306l, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Function1 function5 = function4;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0), null, AbstractC1102d.m3419p(f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                    String title = state.getTitle();
                    c38072d = C38072d.f163053a;
                    i16 = C38072d.f163054b;
                    AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    endIcon = state.getEndIcon();
                    if (endIcon != null) {
                        numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        c28655q.m87150e0(-893673317);
                        c28655q.m87173q(false);
                        c27430eM107874S = null;
                    } else {
                        c28655q.m87150e0(-893673316);
                        c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    if (c27430eM107874S == null) {
                        c28655q.m87150e0(-893627840);
                        c28655q.m87173q(false);
                    } else {
                        AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC18489d0.m53365f(c28655q, -893627839, f13, f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 1.5d, f14, c2306l, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                Function1 function6 = function4;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0), null, AbstractC1102d.m3419p(f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                String title2 = state.getTitle();
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                AbstractC30795n.m94707h(title2, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                endIcon = state.getEndIcon();
                if (endIcon != null) {
                    numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q.m87150e0(-893673317);
                    c28655q.m87173q(false);
                    c27430eM107874S = null;
                } else {
                    c28655q.m87150e0(-893673316);
                    c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                    c28655q.m87173q(false);
                }
                if (c27430eM107874S == null) {
                    c28655q.m87150e0(-893627840);
                    c28655q.m87173q(false);
                } else {
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC18489d0.m53365f(c28655q, -893627839, f13, f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier3, state, function3, i13, i14, 2);
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
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            f13 = 4;
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), 3, f13), AbstractC15673b0.m43978D(), null, 0.0f, 6);
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C35015q(state, function4, 8);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C35015q(state, function4, 8);
                c28655q.m87172p0(objM87133R);
            }
            float f16 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f16, AbstractC1772c1.m5391i(modifierM3357b2, false, null, (InterfaceC4339a) objM87133R, 3));
            float f17 = 6 * f13;
            Modifier modifierM3413j2 = AbstractC1102d.m3413j(modifierM3394p2, f17, 0.0f, 2);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3413j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 1.5d, f16, c2306l2, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M53376q3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                Function1 function7 = function4;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                String title3 = state.getTitle();
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                AbstractC30795n.m94707h(title3, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                endIcon = state.getEndIcon();
                if (endIcon != null) {
                    numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q.m87150e0(-893673317);
                    c28655q.m87173q(false);
                    c27430eM107874S = null;
                } else {
                    c28655q.m87150e0(-893673316);
                    c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                    c28655q.m87173q(false);
                }
                if (c27430eM107874S == null) {
                    c28655q.m87150e0(-893627840);
                    c28655q.m87173q(false);
                } else {
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC18489d0.m53365f(c28655q, -893627839, f13, f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function7;
                modifier3 = modifier5;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q((float) 1.5d, f16, c2306l2, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            Function1 function8 = function4;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q, 0), null, AbstractC1102d.m3419p(f17, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            String title4 = state.getTitle();
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(title4, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            endIcon = state.getEndIcon();
            if (endIcon != null) {
                numValueOf = Integer.valueOf(endIcon.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                c28655q.m87150e0(-893673317);
                c28655q.m87173q(false);
                c27430eM107874S = null;
            } else {
                c28655q.m87150e0(-893673316);
                c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                c28655q.m87173q(false);
            }
            if (c27430eM107874S == null) {
                c28655q.m87150e0(-893627840);
                c28655q.m87173q(false);
            } else {
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC18489d0.m53365f(c28655q, -893627839, f13, f13, c2314t), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function8;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, state, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ContextHubTile$lambda$0$0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ContextHubTile$lambda$1$0(ContextHubTileViewState contextHubTileViewState, Function1 function1) {
        C9598e destination = contextHubTileViewState.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ContextHubTile$lambda$3(Modifier modifier, ContextHubTileViewState contextHubTileViewState, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        ContextHubTile(modifier, contextHubTileViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final void PreviewContextHubTile(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(385875968);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.components.ContextHubTileKt$PreviewContextHubTile$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(795908707);
                    ContextHubTileKt.ContextHubTile(null, ContextHubTileKt.getSampleContextHubTileWithIcon(), null, c28655q2, C9598e.f28134d << 3, 5);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewContextHubTile$lambda$1(int i13, Composer composer, int i14) {
        PreviewContextHubTile(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final ContextHubTileViewState getSampleContextHubTileNoIcon() {
        return sampleContextHubTileNoIcon;
    }

    public static final ContextHubTileViewState getSampleContextHubTileWithIcon() {
        return sampleContextHubTileWithIcon;
    }
}
