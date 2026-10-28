package p748zc1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
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
import pz0.AbstractC29641d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.y6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "d", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "searchQuery", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40524y6 {
    /* JADX INFO: renamed from: d */
    public static final void m131224d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(301763260);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(AbstractC8693b.m21267a());
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC22399k.m64473c("Search Field", c28655q, 6);
            TextResource textResourceM131225e = m131225e(interfaceC28601c2);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Placeholder text...");
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40413n5(13, interfaceC28601c2);
                c28655q.m87172p0(objM87133R3);
            }
            int i14 = TextResource.$stable;
            AbstractC17795v0.m51127j(null, textResourceM131225e, textResourceM21278l, null, 0L, 0, zBooleanValue, null, 0L, false, null, false, false, null, (Function1) objM87133R3, c28655q, (i14 << 3) | (i14 << 6), 24576, 16313);
            c28655q = c28655q;
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40413n5(14, interfaceC28601c1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC29641d.m91043e(null, zBooleanValue2, false, 0L, null, null, (Function1) objM87133R4, c28655q, 1572864, 61);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 13);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final TextResource m131225e(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m131226f(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m131227g(InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            m131226f(interfaceC28601c1, AbstractC8693b.m21267a());
        } else if (event instanceof AbstractC17801x0.c) {
            m131226f(interfaceC28601c1, AbstractC8693b.m21278l(((AbstractC17801x0.c) event).getNewText()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m131228h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m131229i(int i13, Composer composer, int i14) {
        m131224d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
