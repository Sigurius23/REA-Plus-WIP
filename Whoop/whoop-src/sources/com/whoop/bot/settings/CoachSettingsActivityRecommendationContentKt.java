package com.whoop.bot.settings;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import be1.C3169c;
import bz0.C3713c;
import c13.AbstractC3855a;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj0.C4744f;
import cj2.C4769a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "Lkotlin/Function1;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "onViewEvent", "CoachSettingsActivityRecommendationContent", "(Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CoachSettingsActivityRecommendationContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsActivityRecommendationContentKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x029c  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void CoachSettingsActivityRecommendationContent(CoachSettingsRecommendedActivitiesState viewState, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        int i17;
        boolean z4;
        Function1 function2;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2046222753);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87157i(function1)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4769a(20);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function1;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM44008S = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44008S);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f13 = 8;
                    float f14 = 2 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    TextResource title = viewState.getTitle();
                    C38072d c38072d = C38072d.f163053a;
                    Function1 function4 = function3;
                    AbstractC6719b.m20143d(modifierM3398t, new AbstractC6721d.a(title, null, AbstractC13673n.m38561h(c38072d), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    TextResource title2 = viewState.getTitle();
                    int i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(title2, c28655q, i19);
                    int i24 = C38072d.f163054b;
                    C2886a c2886aM8420a = c38072d.m121952e(c28655q, i24).getB1();
                    long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    int i25 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i25, 196600);
                    AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i24).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(2135288992, c28655q, new C0003a0(15, viewState, function4)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getBody(), c28655q, i19), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), c38072d.m121949b(c28655q, i24).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 48, i25, 196600);
                    c28655q = c28655q;
                    AbstractC31061c.m95650z(4, f13, c2314t, c28655q, true);
                    function2 = function4;
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q.m87138X();
                    function2 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(viewState, interfaceC4339a3, function2, i13, i14, 13);
                }
            }
            i15 |= 384;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4769a(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM44008S2 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t2));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44008S2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                float f15 = 8;
                float f16 = 2 * f15;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f16, 0.0f, 0.0f, 13);
                TextResource title3 = viewState.getTitle();
                C38072d c38072d2 = C38072d.f163053a;
                Function1 function5 = function3;
                AbstractC6719b.m20143d(modifierM3398t2, new AbstractC6721d.a(title3, null, AbstractC13673n.m38561h(c38072d2), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3) | 6, 52);
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f16, 0.0f, 2);
                TextResource title4 = viewState.getTitle();
                int i110 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(title4, c28655q, i110);
                int i26 = C38072d.f163054b;
                C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i26).getB1();
                long jM125430y2 = c38072d2.m121949b(c28655q, i26).getBrandWhite();
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, modifierM3396r2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 48, i27, 196600);
                AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i26).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(2135288992, c28655q, new C0003a0(15, viewState, function5)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getBody(), c28655q, i110), AbstractC1099a.m3396r(c2314t2, f16, 0.0f, 2), c38072d2.m121949b(c28655q, i26).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getB1(), null, c28655q, 48, i27, 196600);
                c28655q = c28655q;
                AbstractC31061c.m95650z(4, f15, c2314t2, c28655q, true);
                function2 = function5;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(viewState, interfaceC4339a3, function2, i13, i14, 13);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4769a(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM44008S3 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t3));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM44008S3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                float f17 = 8;
                float f18 = 2 * f17;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, 0.0f, f18, 0.0f, 0.0f, 13);
                TextResource title5 = viewState.getTitle();
                C38072d c38072d3 = C38072d.f163053a;
                Function1 function6 = function3;
                AbstractC6719b.m20143d(modifierM3398t3, new AbstractC6721d.a(title5, null, AbstractC13673n.m38561h(c38072d3), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3) | 6, 52);
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t3, f18, 0.0f, 2);
                TextResource title6 = viewState.getTitle();
                int i111 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(title6, c28655q, i111);
                int i28 = C38072d.f163054b;
                C2886a c2886aM8420a3 = c38072d3.m121952e(c28655q, i28).getB1();
                long jM125430y3 = c38072d3.m121949b(c28655q, i28).getBrandWhite();
                int i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, modifierM3396r3, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a3, null, c28655q, 48, i29, 196600);
                AbstractC39330c.m125320b(0L, c38072d3.m121949b(c28655q, i28).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(2135288992, c28655q, new C0003a0(15, viewState, function6)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getBody(), c28655q, i111), AbstractC1099a.m3396r(c2314t3, f18, 0.0f, 2), c38072d3.m121949b(c28655q, i28).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i28).getB1(), null, c28655q, 48, i29, 196600);
                c28655q = c28655q;
                AbstractC31061c.m95650z(4, f17, c2314t3, c28655q, true);
                function2 = function6;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                function2 = function1;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(viewState, interfaceC4339a3, function2, i13, i14, 13);
            }
        }
        i15 |= 384;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4744f(14);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C4769a(20);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM44008S4 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t4));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM44008S4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            float f19 = 8;
            float f110 = 2 * f19;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t4, 0.0f, f110, 0.0f, 0.0f, 13);
            TextResource title7 = viewState.getTitle();
            C38072d c38072d4 = C38072d.f163053a;
            Function1 function7 = function3;
            AbstractC6719b.m20143d(modifierM3398t4, new AbstractC6721d.a(title7, null, AbstractC13673n.m38561h(c38072d4), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3) | 6, 52);
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t4, f110, 0.0f, 2);
            TextResource title8 = viewState.getTitle();
            int i112 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(title8, c28655q, i112);
            int i210 = C38072d.f163054b;
            C2886a c2886aM8420a4 = c38072d4.m121952e(c28655q, i210).getB1();
            long jM125430y4 = c38072d4.m121949b(c28655q, i210).getBrandWhite();
            int i211 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h4, modifierM3396r4, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a4, null, c28655q, 48, i211, 196600);
            AbstractC39330c.m125320b(0L, c38072d4.m121949b(c28655q, i210).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(2135288992, c28655q, new C0003a0(15, viewState, function7)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getBody(), c28655q, i112), AbstractC1099a.m3396r(c2314t4, f110, 0.0f, 2), c38072d4.m121949b(c28655q, i210).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i210).getB1(), null, c28655q, 48, i211, 196600);
            c28655q = c28655q;
            AbstractC31061c.m95650z(4, f19, c2314t4, c28655q, true);
            function2 = function7;
            interfaceC4339a3 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            function2 = function1;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(viewState, interfaceC4339a3, function2, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsActivityRecommendationContent$lambda$1$0(CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsActivityRecommendationContent$lambda$2$0$0(CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean z4 = coachSettingsRecommendedActivitiesState.getSelectedState() == RecommendedActivitiesMode.ON;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(coachSettingsRecommendedActivitiesState);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3169c(function1, coachSettingsRecommendedActivitiesState, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, z4, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsActivityRecommendationContent$lambda$2$0$0$0$0(Function1 function1, CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState, boolean z4) {
        function1.invoke(new CoachSettingsViewEvent.Toggle(coachSettingsRecommendedActivitiesState.getKey(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsActivityRecommendationContent$lambda$3(CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        CoachSettingsActivityRecommendationContent(coachSettingsRecommendedActivitiesState, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void CoachSettingsActivityRecommendationContentPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2109563030);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.bot.settings.CoachSettingsActivityRecommendationContentKt$CoachSettingsActivityRecommendationContentPreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(1260537728);
                    CoachSettingsActivityRecommendationContentKt.CoachSettingsActivityRecommendationContent(new CoachSettingsRecommendedActivitiesState(AbstractC8693b.m21278l("Activity Recommendations"), null, null, true, "WHOOP_COACH_RECOMMENDED_ACTIVITIES", 6, null), null, null, c28655q2, TextResource.$stable, 6);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachSettingsActivityRecommendationContentPreview$lambda$1(int i13, Composer composer, int i14) {
        CoachSettingsActivityRecommendationContentPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
