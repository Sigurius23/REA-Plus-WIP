package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.service.network.model.UserSessionDto;
import i93.C18283i;
import i93.C18284j;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import u31.AbstractC34504e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.q7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "d", "(Landroidx/compose/runtime/Composer;I)V", "", "selectedNumber", "selectedHeight", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40445q7 {
    /* JADX INFO: renamed from: d */
    public static final void m130694d(Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1535487740);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("--");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z("5 ft");
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            AbstractC22399k.m64473c("Spinner Selector – Numbers", c28655q, 6);
            List listM118959K = AbstractC37056f.m118959K("--", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "2", "3", "4", "5");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40413n5(20, interfaceC28601c2);
                c28655q.m87172p0(objM87133R3);
            }
            C23016z c23016z = C23016z.f90757a;
            AbstractC34504e.m109045j(c23016z, listM118959K, 0, null, 0.0f, 0, false, null, false, false, null, (Function1) objM87133R3, c28655q, 54, 48, 1022);
            String strM30461o = AbstractC11266d.m30461o("Selected: ", m130695e(interfaceC28601c2));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM30461o, null, c38072d.m121949b(c28655q, i14).getStrainZone1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            float f13 = 5 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Spinner Selector – Custom Height & Style", c28655q, 6);
            C18284j c18284j = new C18284j(3, 7, 1);
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284j, 10));
            Iterator it = c18284j.iterator();
            while (((C18283i) it).f71138y) {
                arrayList.add(((AbstractC25243e0) it).nextInt() + " ft");
            }
            float f14 = 40;
            C38072d c38072d2 = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d2.m121952e(c28655q, i15).getB1();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c3;
                objM87133R4 = new C40413n5(21, interfaceC28601c1);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c1 = interfaceC28601c3;
            }
            int i16 = C2886a.f11498d;
            AbstractC34504e.m109045j(c23016z, arrayList, 0, c2886aM8420a, f14, 0, false, null, false, false, null, (Function1) objM87133R4, c28655q, 24582 | (i16 << 9), 48, MessageListItemViewType.ERROR_MESSAGE);
            AbstractC30795n.m94707h(AbstractC11266d.m30461o("Selected: ", m130697g(interfaceC28601c1)), null, c38072d2.m121949b(c28655q, i15).getStrainZone1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i15).getH3(), null, c28655q, 0, i16 << 18, 196602);
            c28655q = c28655q;
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 28);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final String m130695e(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m130696f(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: g */
    private static final String m130697g(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m130698h(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130699i(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m130696f(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m130700j(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m130698h(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m130701k(int i13, Composer composer, int i14) {
        m130694d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
