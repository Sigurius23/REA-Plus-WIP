package com.whoop.bot.settings;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
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
import f31.AbstractC14046c;
import f31.C14044a;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.C25235a0;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachingMode;", "selectedMode", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "Lkotlin/Function1;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "onViewEvent", "CoachingModeContent", "(Lcom/whoop/bot/settings/CoachingMode;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CoachingModeContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsCoachingModeKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoachingMode.values().length];
            try {
                iArr[CoachingMode.CUSTOMIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoachingMode.EDUCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0217  */
    /* JADX WARN: Code duplicated, block: B:67:0x0222  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void CoachingModeContent(CoachingMode coachingMode, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2054807174);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(coachingMode == null ? -1 : coachingMode.ordinal()) ? 4 : 2) | i13;
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
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4744f(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4769a(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM44008S = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "CoachingModeScreen")));
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    float f13 = 8;
                    float f14 = 2 * f13;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159625I0);
                    C38072d c38072d = C38072d.f163053a;
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                    function3 = function4;
                    AbstractC6719b.m20143d(modifierM3398t, new AbstractC6721d.a(c8688bM21277k, null, AbstractC13673n.m38561h(c38072d), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a5, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                    String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159623H0, c28655q, 0);
                    int i19 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21273g, modifierM3396r, c38072d.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    float f15 = 4 * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                    AbstractC14046c.m39968h(AbstractC25260n.m74049W0(CoachingMode.values()), coachingMode, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), null, AbstractC22977m.m66746i(f15), AbstractC37817c.m121344e(-152489230, c28655q, new C6071a(function3, 0)), c28655q, ((i15 << 3) & 112) | 221568, 8);
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(coachingMode, interfaceC4339a3, function3, i13, i14, 14);
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4769a(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM44008S2 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t2, "CoachingModeScreen")));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44008S2);
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
                float f16 = 8;
                float f17 = 2 * f16;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f17, 0.0f, 0.0f, 13);
                TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC37336b.f159625I0);
                C38072d c38072d2 = C38072d.f163053a;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                function3 = function4;
                AbstractC6719b.m20143d(modifierM3398t2, new AbstractC6721d.a(c8688bM21277k2, null, AbstractC13673n.m38561h(c38072d2), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a6, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f17, 0.0f, 2);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159623H0, c28655q, 0);
                int i110 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21273g2, modifierM3396r2, c38072d2.m121949b(c28655q, i110).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                float f18 = 4 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                AbstractC14046c.m39968h(AbstractC25260n.m74049W0(CoachingMode.values()), coachingMode, AbstractC1099a.m3396r(c2314t2, f17, 0.0f, 2), null, AbstractC22977m.m66746i(f18), AbstractC37817c.m121344e(-152489230, c28655q, new C6071a(function3, 0)), c28655q, ((i15 << 3) & 112) | 221568, 8);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(coachingMode, interfaceC4339a3, function3, i13, i14, 14);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4744f(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4769a(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM44008S3 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t3, "CoachingModeScreen")));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44008S3);
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
                float f19 = 8;
                float f110 = 2 * f19;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, 0.0f, f110, 0.0f, 0.0f, 13);
                TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC37336b.f159625I0);
                C38072d c38072d3 = C38072d.f163053a;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                function3 = function4;
                AbstractC6719b.m20143d(modifierM3398t3, new AbstractC6721d.a(c8688bM21277k3, null, AbstractC13673n.m38561h(c38072d3), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a7, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t3, f110, 0.0f, 2);
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC37336b.f159623H0, c28655q, 0);
                int i111 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21273g3, modifierM3396r3, c38072d3.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i111).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                float f111 = 4 * f19;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t3));
                AbstractC14046c.m39968h(AbstractC25260n.m74049W0(CoachingMode.values()), coachingMode, AbstractC1099a.m3396r(c2314t3, f110, 0.0f, 2), null, AbstractC22977m.m66746i(f111), AbstractC37817c.m121344e(-152489230, c28655q, new C6071a(function3, 0)), c28655q, ((i15 << 3) & 112) | 221568, 8);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(coachingMode, interfaceC4339a3, function3, i13, i14, 14);
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
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4744f(15);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C4769a(21);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM44008S4 = AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t4, "CoachingModeScreen")));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44008S4);
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
            float f112 = 8;
            float f113 = 2 * f112;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t4, 0.0f, f113, 0.0f, 0.0f, 13);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC37336b.f159625I0);
            C38072d c38072d4 = C38072d.f163053a;
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
            function3 = function4;
            AbstractC6719b.m20143d(modifierM3398t4, new AbstractC6721d.a(c8688bM21277k4, null, AbstractC13673n.m38561h(c38072d4), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a8, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168), 52);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t4, f113, 0.0f, 2);
            String strM21273g4 = AbstractC8693b.m21273g(AbstractC37336b.f159623H0, c28655q, 0);
            int i112 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g4, modifierM3396r4, c38072d4.m121949b(c28655q, i112).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i112).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            float f114 = 4 * f112;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f114, c2314t4));
            AbstractC14046c.m39968h(AbstractC25260n.m74049W0(CoachingMode.values()), coachingMode, AbstractC1099a.m3396r(c2314t4, f113, 0.0f, 2), null, AbstractC22977m.m66746i(f114), AbstractC37817c.m121344e(-152489230, c28655q, new C6071a(function3, 0)), c28655q, ((i15 << 3) & 112) | 221568, 8);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(coachingMode, interfaceC4339a3, function3, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachingModeContent$lambda$1$0(CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachingModeContent$lambda$2$0(Function1 function1, InterfaceC1103a RadioGroupVertical, CoachingMode mode, C14044a state, Composer composer, int i13) {
        int i14;
        int i15;
        int i16;
        AbstractC22676k.m65750j(RadioGroupVertical, "$this$RadioGroupVertical");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(state, "state");
        if ((i13 & 48) == 0) {
            i14 = (((C28655q) composer).m87149e(mode.ordinal()) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 1169) != 1168)) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i17 = iArr[mode.ordinal()];
            if (i17 == 1) {
                i15 = AbstractC37336b.f159617E0;
            } else {
                if (i17 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = AbstractC37336b.f159621G0;
            }
            int i18 = iArr[mode.ordinal()];
            if (i18 == 1) {
                i16 = AbstractC37336b.f159615D0;
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i16 = AbstractC37336b.f159619F0;
            }
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(i15);
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            boolean zM39960c = state.getIsSelected();
            boolean zM87153g = ((i14 & 896) == 256 || ((i14 & 512) != 0 && c28655q.m87157i(state))) | c28655q.m87153g(function1) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C29656q((Object) state, function1, (Object) mode, 18);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, c8688bM21277k, enumC27250e0, 0L, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.C8688b.f25889c << 3) | 384, 233);
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, ((float) 12.5d) * 4, 0.0f, 0.0f, 0.0f, 14);
            String strM21273g = AbstractC8693b.m21273g(i16, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g, modifierM3398t, c38072d.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachingModeContent$lambda$2$0$0$0(C14044a c14044a, Function1 function1, CoachingMode coachingMode, boolean z4) {
        if (!c14044a.getIsSelected() && z4) {
            function1.invoke(new CoachSettingsViewEvent.Toggle("WHOOP_COACH_DATA", coachingMode == CoachingMode.CUSTOMIZED));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachingModeContent$lambda$3(CoachingMode coachingMode, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        CoachingModeContent(coachingMode, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    public static final void CoachingModeContentPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-613966630);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.bot.settings.CoachSettingsCoachingModeKt$CoachingModeContentPreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(-844566611);
                    CoachSettingsCoachingModeKt.CoachingModeContent(null, null, null, c28655q2, 6, 6);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CoachingModeContentPreview$lambda$1(int i13, Composer composer, int i14) {
        CoachingModeContentPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
