package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17766l1;
import java.util.Iterator;
import kd1.AbstractC22399k;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
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
import p736sz0.AbstractC33165b;
import p736sz0.C33168c;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import wb3.AbstractC37056f;
import yb0.C39382e;

/* JADX INFO: renamed from: zc1.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "d", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40427p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m130566d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1230945252);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2305k c2305k = C2299e.f9110M;
            float f13 = 2;
            float f14 = 8;
            float f15 = f13 * f14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 54);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC22399k.m64473c("Interactive Markdown Text", c28655q, 6);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("## Markdown Text\n\nThis is a sample markdown text with **bold** and *italic* formatting.");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC33165b.m105044b(AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2), new C33168c((String) interfaceC28601c1.getValue(), ((Boolean) interfaceC28601c2.getValue()).booleanValue()), c28655q, (C33168c.f138318c << 3) | 6, 0);
            float f16 = 4 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 2.5d) * f14, 0.0f, 2);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Input Markdown Text");
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("## Markdown Text\n\nThis is a sample markdown text with **bold** and *italic* formatting.");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Please input valid Markdown Text");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39382e(15, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            int i14 = TextResource.$stable;
            AbstractC17766l1.m50964e(modifierM3396r, textResourceM21278l, textResourceM21267a, textResourceM21278l2, textResourceM21278l3, ErrorCodes.WebsocketMethodErrors.cServerErrors, 5, false, true, false, null, false, (Function1) objM87133R3, c28655q, (i14 << 3) | 920322054 | (i14 << 6) | (i14 << 9) | (i14 << 12), 384, 3072);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Show Divider");
            AbstractC33088k.g gVar = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            boolean zBooleanValue = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C39382e(16, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC33087j.m104824f(textResourceM21278l4, gVar, zBooleanValue, true, 1, 0L, null, null, false, 0L, (Function1) objM87133R4, c28655q, i14 | 27648 | (AbstractC33088k.g.f137992d << 3), 6, 992);
            AbstractC22399k.m64473c("Medical Disclaimer - Variants", c28655q, 6);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-1837073977);
            Iterator<T> it = AbstractC33165b.m105049g().iterator();
            while (it.hasNext()) {
                AbstractC33165b.m105044b(null, (C33168c) it.next(), c28655q, C33168c.f138318c << 3, 1);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m130567e(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130568f(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m130569g(int i13, Composer composer, int i14) {
        m130566d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
