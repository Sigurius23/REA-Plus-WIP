package p741vn1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.C3029l;
import bp0.C3520h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC14976c7;
import p163g1.C14949a2;
import p163g1.C14972c3;
import p163g1.EnumC14960b2;
import p163g1.EnumC15207z1;
import p163g1.InterfaceC15022g9;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28761b0;
import p411q2.InterfaceC29805a;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vb1.C35868a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vn1.s */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "cardId", "", "swipeEnabled", "Lkotlin/Function0;", "Ll83/a0;", "onSwipeDismiss", "Landroidx/compose/ui/Modifier;", "modifier", "content", "g", "(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36215s {
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m115274g(final String cardId, final boolean z4, final InterfaceC4339a onSwipeDismiss, Modifier modifier, final InterfaceC4351m content, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        String str;
        InterfaceC4339a interfaceC4339a;
        InterfaceC4351m interfaceC4351m;
        C28655q c28655q;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m2;
        final Modifier modifier4;
        InterfaceC29805a interfaceC29805a;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        AbstractC22676k.m65750j(cardId, "cardId");
        AbstractC22676k.m65750j(onSwipeDismiss, "onSwipeDismiss");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-73620939);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(cardId) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onSwipeDismiss) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(content)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (z4) {
                    str = cardId;
                    interfaceC4339a = onSwipeDismiss;
                    Modifier modifier5 = modifier4;
                    interfaceC4351m = content;
                    c28655q2.m87150e0(1487204013);
                    c28655q2.m87173q(false);
                    c28655q2.m87144b0(-2030234388, str);
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    zM87157i = c28655q2.m87157i(interfaceC29805a) | ((i15 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C28761b0(16, interfaceC4339a, interfaceC29805a);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q = c28655q2;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier5), null, false, AbstractC37817c.m121344e(-1843060718, c28655q2, new C3520h(5, AbstractC14976c7.m43097b((Function1) objM87133R, c28655q2), interfaceC4351m)), c28655q, 3072, 6);
                    c28655q.m87173q(false);
                    modifier3 = modifier5;
                } else {
                    c28655q2.m87150e0(1487104069);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
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
                    content.invoke(c28655q2, Integer.valueOf((i15 >> 12) & 14));
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i18 = 0;
                    interfaceC4351m2 = new InterfaceC4351m() { // from class: vn1.r
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC36215s.m115275h(cardId, z4, onSwipeDismiss, modifier4, content, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC36215s.m115280m(cardId, z4, onSwipeDismiss, modifier4, content, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
            str = cardId;
            interfaceC4339a = onSwipeDismiss;
            interfaceC4351m = content;
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i19 = 1;
                final String str2 = str;
                final InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
                final InterfaceC4351m interfaceC4351m3 = interfaceC4351m;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: vn1.r
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i19) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC36215s.m115275h(str2, z4, interfaceC4339a2, modifier3, interfaceC4351m3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC36215s.m115280m(str2, z4, interfaceC4339a2, modifier3, interfaceC4351m3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m2;
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(content)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (z4) {
                c28655q2.m87150e0(1487104069);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
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
                content.invoke(c28655q2, Integer.valueOf((i15 >> 12) & 14));
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 0;
                interfaceC4351m2 = new InterfaceC4351m() { // from class: vn1.r
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC36215s.m115275h(cardId, z4, onSwipeDismiss, modifier4, content, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC36215s.m115280m(cardId, z4, onSwipeDismiss, modifier4, content, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                str = cardId;
                interfaceC4339a = onSwipeDismiss;
                Modifier modifier6 = modifier4;
                interfaceC4351m = content;
                c28655q2.m87150e0(1487204013);
                c28655q2.m87173q(false);
                c28655q2.m87144b0(-2030234388, str);
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                zM87157i = c28655q2.m87157i(interfaceC29805a) | ((i15 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C28761b0(16, interfaceC4339a, interfaceC29805a);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28761b0(16, interfaceC4339a, interfaceC29805a);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier6), null, false, AbstractC37817c.m121344e(-1843060718, c28655q2, new C3520h(5, AbstractC14976c7.m43097b((Function1) objM87133R, c28655q2), interfaceC4351m)), c28655q, 3072, 6);
                c28655q.m87173q(false);
                modifier3 = modifier6;
            }
            c28677v1M87180u.f115982d = interfaceC4351m2;
        }
        str = cardId;
        interfaceC4339a = onSwipeDismiss;
        interfaceC4351m = content;
        c28655q = c28655q2;
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i111 = 1;
            final String str3 = str;
            final InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
            final InterfaceC4351m interfaceC4351m4 = interfaceC4351m;
            interfaceC4351m2 = new InterfaceC4351m() { // from class: vn1.r
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i111) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36215s.m115275h(str3, z4, interfaceC4339a3, modifier3, interfaceC4351m4, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC36215s.m115280m(str3, z4, interfaceC4339a3, modifier3, interfaceC4351m4, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m115275h(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m115274g(str, z4, interfaceC4339a, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final boolean m115276i(InterfaceC4339a interfaceC4339a, InterfaceC29805a interfaceC29805a, EnumC14960b2 dismissValue) {
        AbstractC22676k.m65750j(dismissValue, "dismissValue");
        int iOrdinal = dismissValue.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            return false;
        }
        interfaceC4339a.invoke();
        interfaceC29805a.mo7428a(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m115277j(C14949a2 c14949a2, InterfaceC4351m interfaceC4351m, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (Float.compare(((C1101c) BoxWithConstraints).m3403d(), 0) > 0) {
            c28655q.m87150e0(240124996);
            Set setM74059b1 = AbstractC25260n.m74059b1(new EnumC15207z1[]{EnumC15207z1.f57097x, EnumC15207z1.f57096w});
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C35868a(7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC14976c7.m43096a(c14949a2, null, setM74059b1, (Function1) objM87133R, C36202f.f155001a.m115205b(), AbstractC37817c.m121344e(1753784648, c28655q, new C3029l(interfaceC4351m, 8)), c28655q, 224640, 2);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(240465159);
            interfaceC4351m.invoke(c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC15022g9 m115278k(EnumC15207z1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C14972c3(0.6f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m115279l(InterfaceC4351m interfaceC4351m, InterfaceC22997s1 SwipeToDismiss, Composer composer, int i13) {
        AbstractC22676k.m65750j(SwipeToDismiss, "$this$SwipeToDismiss");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m115280m(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m115274g(str, z4, interfaceC4339a, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
