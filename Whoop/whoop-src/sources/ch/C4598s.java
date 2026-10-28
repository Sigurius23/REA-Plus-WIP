package ch;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2591o4;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import coil.compose.AsyncImagePainter;
import ec3.C13045h2;
import g00.AbstractC14930a;
import h00.AbstractC16517n0;
import h00.EnumC16519o0;
import i20.C17930b1;
import l83.C23454a0;
import m00.C24869a;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p163g1.C15001f;
import p164g2.InterfaceC15237i;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p341nh.InterfaceC26715i;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p547v8.AbstractC35785b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39105k;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32416g;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: ch.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C4598s implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f18491E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f18492F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f18493G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18494w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18495x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18496y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18497z;

    public /* synthetic */ C4598s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        this.f18494w = i13;
        this.f18496y = obj;
        this.f18497z = obj2;
        this.f18491E = obj3;
        this.f18495x = obj4;
        this.f18492F = obj5;
        this.f18493G = obj6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:13:0x007f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
    /* JADX WARN: Code duplicated, block: B:44:0x0187  */
    /* JADX WARN: Code duplicated, block: B:45:0x0189  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x023d  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z4;
        C28655q c28655q;
        boolean zM87157i;
        Object objM87133R;
        C28655q c28655q2;
        boolean zM87157i2;
        Object objM87133R2;
        AbstractC38794c0 abstractC38794c0;
        boolean zM87157i3;
        Object objM87133R3;
        final AbstractC38794c0 abstractC38794c1;
        boolean zM87157i4;
        Object objM87133R4;
        switch (this.f18494w) {
            case 0:
                InterfaceC23004v interfaceC23004v = (InterfaceC23004v) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((C28655q) composer).m87153g(interfaceC23004v) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        C4595p c4595p = (C4595p) ((InterfaceC26715i) this.f18496y);
                        long j7 = ((C1101c) interfaceC23004v).f4585b;
                        C13045h2 c13045h2 = c4595p.f18484w;
                        C39169a c39169a = new C39169a(j7);
                        c13045h2.getClass();
                        c13045h2.m36571k(null, c39169a);
                        ((C37816b) this.f18497z).invoke(new C4597r(interfaceC23004v, (AsyncImagePainter) this.f18491E, (String) this.f18495x, (InterfaceC2302h) this.f18492F, (InterfaceC39105k) this.f18493G), composer, 0);
                    }
                } else {
                    C4595p c4595p2 = (C4595p) ((InterfaceC26715i) this.f18496y);
                    long j13 = ((C1101c) interfaceC23004v).f4585b;
                    C13045h2 c13045h3 = c4595p2.f18484w;
                    C39169a c39169a2 = new C39169a(j13);
                    c13045h3.getClass();
                    c13045h3.m36571k(null, c39169a2);
                    ((C37816b) this.f18497z).invoke(new C4597r(interfaceC23004v, (AsyncImagePainter) this.f18491E, (String) this.f18495x, (InterfaceC2302h) this.f18492F, (InterfaceC39105k) this.f18493G), composer, 0);
                }
                break;
            case 1:
                InterfaceC23013y ScrollableTopLevelColumn = (InterfaceC23013y) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f18491E;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) this.f18497z;
                C24869a c24869a = (C24869a) this.f18496y;
                AbstractC22676k.m65750j(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(ScrollableTopLevelColumn) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC14930a.m43026a(null, AbstractC37817c.m121344e(-2047763144, composer2, new C15001f((String) this.f18495x, c24869a, (Function1) this.f18493G, 9)), composer2, 48, 1);
                        if (c24869a.f97422g != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        C2314t c2314t = C2314t.f9131w;
                        AbstractC1090b.m3350e(ScrollableTopLevelColumn, z4, AbstractC1102d.m3409f(1.0f, c2314t), null, null, null, AbstractC37817c.m121344e(1484717243, composer2, new C2591o4(c24869a, 10)), composer2, (iIntValue2 & 14) | 1573248, 28);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 16, 1);
                        String strM113396S = AbstractC35785b.m113396S(c24869a.f97419d, composer2);
                        EnumC16519o0 enumC16519o0 = c24869a.f97418c;
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(703935556);
                        zM87157i = c28655q.m87157i(interfaceC15237i) | c28655q.m87153g(interfaceC4339a);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a, 2);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC16517n0.m46673b(modifierM3396r, strM113396S, enumC16519o0, (InterfaceC4339a) objM87133R, true, (InterfaceC4339a) this.f18492F, c28655q, 24582, 192);
                    }
                } else {
                    AbstractC14930a.m43026a(null, AbstractC37817c.m121344e(-2047763144, composer2, new C15001f((String) this.f18495x, c24869a, (Function1) this.f18493G, 9)), composer2, 48, 1);
                    if (c24869a.f97422g != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    AbstractC1090b.m3350e(ScrollableTopLevelColumn, z4, AbstractC1102d.m3409f(1.0f, c2314t2), null, null, null, AbstractC37817c.m121344e(1484717243, composer2, new C2591o4(c24869a, 10)), composer2, (iIntValue2 & 14) | 1573248, 28);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, 0.0f, 16, 1);
                    String strM113396S2 = AbstractC35785b.m113396S(c24869a.f97419d, composer2);
                    EnumC16519o0 enumC16519o1 = c24869a.f97418c;
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(703935556);
                    zM87157i = c28655q.m87157i(interfaceC15237i) | c28655q.m87153g(interfaceC4339a);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a, 2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC16517n0.m46673b(modifierM3396r2, strM113396S2, enumC16519o1, (InterfaceC4339a) objM87133R, true, (InterfaceC4339a) this.f18492F, c28655q, 24582, 192);
                }
                break;
            default:
                InterfaceC23013y showBottomSheetContent = (InterfaceC23013y) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                final Function1 function1 = (Function1) this.f18493G;
                final Function1 function2 = (Function1) this.f18492F;
                final Function1 function3 = (Function1) this.f18495x;
                final AbstractC38794c0 abstractC38794c2 = (AbstractC38794c0) this.f18496y;
                final Function1 function4 = (Function1) this.f18491E;
                final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f18497z;
                AbstractC22676k.m65750j(showBottomSheetContent, "$this$showBottomSheetContent");
                if ((iIntValue3 & 17) == 16) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_menu_sheet_tag");
                        AbstractC38794c0 abstractC38794c3 = (AbstractC38794c0) this.f18496y;
                        c28655q2 = (C28655q) composer3;
                        c28655q2.m87150e0(1401468616);
                        zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function3) | c28655q2.m87157i(abstractC38794c2);
                        objM87133R2 = c28655q2.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (!zM87157i2 || objM87133R2 == c28676v0) {
                            final int i13 = 0;
                            InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: q00.d0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 0), 3);
                                            break;
                                        case 1:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 1), 3);
                                            break;
                                        default:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 2), 3);
                                            break;
                                    }
                                    return C23454a0.f92919a;
                                }
                            };
                            abstractC38794c0 = abstractC38794c2;
                            c28655q2.m87172p0(interfaceC4339a2);
                            objM87133R2 = interfaceC4339a2;
                        } else {
                            abstractC38794c0 = abstractC38794c2;
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(1401477828);
                        zM87157i3 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function2) | c28655q2.m87157i(abstractC38794c0);
                        objM87133R3 = c28655q2.m87133R();
                        if (!zM87157i3 || objM87133R3 == c28676v0) {
                            final int i14 = 1;
                            abstractC38794c1 = abstractC38794c0;
                            InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: q00.d0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 0), 3);
                                            break;
                                        case 1:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 1), 3);
                                            break;
                                        default:
                                            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 2), 3);
                                            break;
                                    }
                                    return C23454a0.f92919a;
                                }
                            };
                            interfaceC2994c0 = interfaceC2994c0;
                            c28655q2.m87172p0(interfaceC4339a4);
                            objM87133R3 = interfaceC4339a4;
                        } else {
                            abstractC38794c1 = abstractC38794c0;
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(1401486916);
                        zM87157i4 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function1) | c28655q2.m87157i(abstractC38794c1);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i4 || objM87133R4 == c28676v0) {
                            final int i15 = 2;
                            final AbstractC38794c0 abstractC38794c4 = abstractC38794c1;
                            final InterfaceC2994c0 interfaceC2994c1 = interfaceC2994c0;
                            InterfaceC4339a interfaceC4339a6 = new InterfaceC4339a() { // from class: q00.d0
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29712e0(function4, function1, abstractC38794c4, null, 0), 3);
                                            break;
                                        case 1:
                                            AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29712e0(function4, function1, abstractC38794c4, null, 1), 3);
                                            break;
                                        default:
                                            AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C29712e0(function4, function1, abstractC38794c4, null, 2), 3);
                                            break;
                                    }
                                    return C23454a0.f92919a;
                                }
                            };
                            c28655q2.m87172p0(interfaceC4339a6);
                            objM87133R4 = interfaceC4339a6;
                        }
                        c28655q2.m87173q(false);
                        AbstractC32416g.m101157n(modifierM3599a, abstractC38794c3, interfaceC4339a3, interfaceC4339a5, (InterfaceC4339a) objM87133R4, c28655q2, 6);
                    }
                } else {
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_menu_sheet_tag");
                    AbstractC38794c0 abstractC38794c5 = (AbstractC38794c0) this.f18496y;
                    c28655q2 = (C28655q) composer3;
                    c28655q2.m87150e0(1401468616);
                    zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function3) | c28655q2.m87157i(abstractC38794c2);
                    objM87133R2 = c28655q2.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87157i2) {
                        final int i16 = 0;
                        InterfaceC4339a interfaceC4339a7 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        abstractC38794c0 = abstractC38794c2;
                        c28655q2.m87172p0(interfaceC4339a7);
                        objM87133R2 = interfaceC4339a7;
                    } else {
                        final int i17 = 0;
                        InterfaceC4339a interfaceC4339a8 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function3, abstractC38794c2, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        abstractC38794c0 = abstractC38794c2;
                        c28655q2.m87172p0(interfaceC4339a8);
                        objM87133R2 = interfaceC4339a8;
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R2;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(1401477828);
                    zM87157i3 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function2) | c28655q2.m87157i(abstractC38794c0);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i3) {
                        final int i18 = 1;
                        abstractC38794c1 = abstractC38794c0;
                        InterfaceC4339a interfaceC4339a10 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        interfaceC2994c0 = interfaceC2994c0;
                        c28655q2.m87172p0(interfaceC4339a10);
                        objM87133R3 = interfaceC4339a10;
                    } else {
                        final int i19 = 1;
                        abstractC38794c1 = abstractC38794c0;
                        InterfaceC4339a interfaceC4339a11 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C29712e0(function4, function2, abstractC38794c1, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        interfaceC2994c0 = interfaceC2994c0;
                        c28655q2.m87172p0(interfaceC4339a11);
                        objM87133R3 = interfaceC4339a11;
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R3;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(1401486916);
                    zM87157i4 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function4) | c28655q2.m87153g(function1) | c28655q2.m87157i(abstractC38794c1);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i4) {
                        final int i110 = 2;
                        final AbstractC38794c0 abstractC38794c6 = abstractC38794c1;
                        final InterfaceC2994c0 interfaceC2994c2 = interfaceC2994c0;
                        InterfaceC4339a interfaceC4339a13 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c2, null, null, new C29712e0(function4, function1, abstractC38794c6, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c2, null, null, new C29712e0(function4, function1, abstractC38794c6, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c2, null, null, new C29712e0(function4, function1, abstractC38794c6, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a13);
                        objM87133R4 = interfaceC4339a13;
                    } else {
                        final int i111 = 2;
                        final AbstractC38794c0 abstractC38794c7 = abstractC38794c1;
                        final InterfaceC2994c0 interfaceC2994c3 = interfaceC2994c0;
                        InterfaceC4339a interfaceC4339a14 = new InterfaceC4339a() { // from class: q00.d0
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i111) {
                                    case 0:
                                        AbstractC3006f0.m8732z(interfaceC2994c3, null, null, new C29712e0(function4, function1, abstractC38794c7, null, 0), 3);
                                        break;
                                    case 1:
                                        AbstractC3006f0.m8732z(interfaceC2994c3, null, null, new C29712e0(function4, function1, abstractC38794c7, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC3006f0.m8732z(interfaceC2994c3, null, null, new C29712e0(function4, function1, abstractC38794c7, null, 2), 3);
                                        break;
                                }
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a14);
                        objM87133R4 = interfaceC4339a14;
                    }
                    c28655q2.m87173q(false);
                    AbstractC32416g.m101157n(modifierM3599a2, abstractC38794c5, interfaceC4339a9, interfaceC4339a12, (InterfaceC4339a) objM87133R4, c28655q2, 6);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C4598s(C24869a c24869a, InterfaceC15237i interfaceC15237i, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, String str, Function1 function1) {
        this.f18494w = 1;
        this.f18496y = c24869a;
        this.f18497z = interfaceC15237i;
        this.f18491E = interfaceC4339a;
        this.f18492F = interfaceC4339a2;
        this.f18495x = str;
        this.f18493G = function1;
    }
}
