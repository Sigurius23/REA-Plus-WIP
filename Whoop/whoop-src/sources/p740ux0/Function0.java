package p740ux0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15050j4;
import p163g1.AbstractC15166v0;
import p163g1.C15043i8;
import p163g1.C15077m1;
import p163g1.C15197y1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p705ea2.C12907g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj2.C29308g;
import q12.C29802c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ux0.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onNavigateBack", "Lkotlin/Function1;", "", "onShowSheet", "d", "(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "path", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: d */
    public static final void m112211d(InterfaceC4339a onNavigateBack, Function1 function1, Composer composer, int i13) {
        int i14;
        int i15;
        Function1 onShowSheet = function1;
        AbstractC22676k.m65750j(onNavigateBack, "onNavigateBack");
        AbstractC22676k.m65750j(onShowSheet, "onShowSheet");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2057186885);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onNavigateBack) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onShowSheet) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("/test/share/path");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("SHARE DEBUG");
            C38072d c38072d = C38072d.f163053a;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(textResourceM21278l, null, Integer.valueOf(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onNavigateBack, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i16 << 9) & 7168), 53);
            float f13 = 16;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            String strM112212e = m112212e(interfaceC28601c1);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C15043i8 c15043i8 = C15043i8.f56313a;
            int i17 = C38072d.f163054b;
            int i18 = 18;
            i15 = 2;
            C15197y1 c15197y1M43129g = C15043i8.m43129g(c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, 0L, c38072d.m121949b(c28655q, i17).getBrandWhite(), c38072d.m121949b(c28655q, i17).getBrandWhite(), AbstractC13673n.m38559f(c38072d, c28655q, i17, 0.6f), 0L, 0L, c28655q, 2097046);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29802c(i18, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            C35365a c35365a = C35365a.f150638a;
            AbstractC15050j4.m43135a(strM112212e, (Function1) objM87133R2, modifierM3409f, false, false, null, c35365a.m112206c(), null, null, false, null, null, null, false, 0, 0, null, c15197y1M43129g, c28655q, 1573296, 0, 524216);
            boolean z4 = (i16 & 112) == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                onShowSheet = function1;
                objM87133R3 = new C29308g(onShowSheet, interfaceC28601c1, 7);
                c28655q.m87172p0(objM87133R3);
            } else {
                onShowSheet = function1;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getStrainZone3(), 0L, 0L, 0L, c28655q, 0, 14);
            c28655q = c28655q;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R3, modifierM3409f2, false, null, null, null, c15077m1M43196a, null, c35365a.m112207d(), c28655q, 805306416, 380);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            i15 = 2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12907g0(onNavigateBack, onShowSheet, i13, i15);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final String m112212e(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m112213f(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m112214g(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m112213f(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112215h(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m112212e(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m112216i(InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m112211d(interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
