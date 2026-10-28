package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22399k;
import l83.C23454a0;
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
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.Function0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.z6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40534z6 {
    /* JADX INFO: renamed from: h */
    public static final void m131327h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(43137468);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            AbstractC22399k.m64473c("Text", c28655q, 6);
            AbstractC22399k.m64475e("Small", c28655q, 6);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C40387l1(context, 24);
                c28655q.m87172p0(objM87133R);
            }
            Function0.m90940t0((InterfaceC4339a) objM87133R, c28655q, 0, 0);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Medium", c28655q, 6);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C40387l1(context, 25);
                c28655q.m87172p0(objM87133R2);
            }
            Function0.m90926m0((InterfaceC4339a) objM87133R2, c28655q, 0, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Large", c28655q, 6);
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C40387l1(context, 26);
                c28655q.m87172p0(objM87133R3);
            }
            Function0.m90912f0((InterfaceC4339a) objM87133R3, c28655q, 0, 0);
            AbstractC18489d0.m53380u(8, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Numbers", c28655q, 6);
            AbstractC22399k.m64475e("Small", c28655q, 6);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C40387l1(context, 27);
                c28655q.m87172p0(objM87133R4);
            }
            Function0.m90899Y((InterfaceC4339a) objM87133R4, c28655q, 0, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Medium", c28655q, 6);
            boolean zM87157i5 = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C40387l1(context, 28);
                c28655q.m87172p0(objM87133R5);
            }
            Function0.m90892R((InterfaceC4339a) objM87133R5, c28655q, 0, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Large", c28655q, 6);
            boolean zM87157i6 = c28655q.m87157i(context);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new C40387l1(context, 29);
                c28655q.m87172p0(objM87133R6);
            }
            Function0.m90885K((InterfaceC4339a) objM87133R6, c28655q, 0, 0);
            AbstractC25012a.m73389v(c2314t, f14, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m131328i(Context context) {
        Toast.makeText(context, "Text - Small Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m131329j(Context context) {
        Toast.makeText(context, "Text - Medium Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m131330k(Context context) {
        Toast.makeText(context, "Text - Large Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m131331l(Context context) {
        Toast.makeText(context, "Number - Small Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m131332m(Context context) {
        Toast.makeText(context, "Number - Medium Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m131333n(Context context) {
        Toast.makeText(context, "Number - Large Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m131334o(int i13, Composer composer, int i14) {
        m131327h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
