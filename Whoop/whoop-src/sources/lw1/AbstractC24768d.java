package lw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.membership.extensions.domain.models.OrderOption;
import l72.C23401h;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pv1.AbstractC29578a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lw1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "viewState", "Lkotlin/Function1;", "Ll83/a0;", "updateOption", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/OrderOption;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isSelected", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24768d {
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m72529d(Modifier modifier, OrderOption viewState, Function1 function1, Composer composer, int i13, int i14) {
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
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(638279590);
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
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
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
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24174a(22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getSelected()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C18656a0(function4, viewState, interfaceC28601c1, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                Modifier modifier5 = modifier4;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (m72531f(interfaceC28601c1)) {
                    i16 = AbstractC29578a.f120721a;
                } else {
                    i16 = AbstractC29578a.f120722b;
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i16, c28655q, 6), null, null, C17919x.f69637n, c28655q, 3120, 4);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14);
                String strM21275i = AbstractC8693b.m21275i(viewState.getLabel(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21275i, modifierM3398t, c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
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
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 24, (Object) modifier3, (Object) viewState, function3);
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
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24174a(22);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getSelected()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C18656a0(function4, viewState, interfaceC28601c1, 23);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C18656a0(function4, viewState, interfaceC28601c1, 23);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            Modifier modifier6 = modifier4;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (m72531f(interfaceC28601c1)) {
                i16 = AbstractC29578a.f120721a;
            } else {
                i16 = AbstractC29578a.f120722b;
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i16, c28655q, 6), null, null, C17919x.f69637n, c28655q, 3120, 4);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14);
            String strM21275i2 = AbstractC8693b.m21275i(viewState.getLabel(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i2, modifierM3398t2, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
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
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 24, (Object) modifier3, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m72530e(OrderOption orderOption) {
        AbstractC22676k.m65750j(orderOption, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m72531f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m72532g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m72533h(Function1 function1, OrderOption orderOption, InterfaceC28601c1 interfaceC28601c1) {
        m72532g(interfaceC28601c1, !m72531f(interfaceC28601c1));
        function1.invoke(OrderOption.copy$default(orderOption, null, m72531f(interfaceC28601c1), null, 5, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72534i(Modifier modifier, OrderOption orderOption, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m72529d(modifier, orderOption, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
