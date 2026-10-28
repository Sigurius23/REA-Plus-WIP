package p292l1;

import am2.C1040r;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import com.whoop.android.R;
import ht2.C17632d;
import i93.C18284j;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24917o;
import p316m1.C24920r;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23193w0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C18284j f91752E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C24920r f91753F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23142n3 f91754G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC24917o f91755H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C23204y f91756I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f91757w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f91758x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f91759y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26068u f91760z;

    public C23193w0(long j7, InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, C26068u c26068u, C18284j c18284j, C24920r c24920r, InterfaceC23142n3 interfaceC23142n3, AbstractC24917o abstractC24917o, C23204y c23204y) {
        this.f91757w = j7;
        this.f91758x = interfaceC28601c1;
        this.f91759y = interfaceC2994c0;
        this.f91760z = c26068u;
        this.f91752E = c18284j;
        this.f91753F = c24920r;
        this.f91754G = interfaceC23142n3;
        this.f91755H = abstractC24917o;
        this.f91756I = c23204y;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        String strM73002i = AbstractC24899e0.m73002i(composer, R.string.m3c_date_picker_year_picker_pane_title);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(strM73002i);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C17632d(strM73002i, 15);
            c28655q.m87172p0(objM87133R);
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
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
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3414k((AbstractC23092f1.f91167a * 7) - AbstractC23128l1.f91374a, c2314t), AbstractC23092f1.f91169c, 0.0f, 2);
        InterfaceC28601c1 interfaceC28601c1 = this.f91758x;
        boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
        InterfaceC2994c0 interfaceC2994c0 = this.f91759y;
        boolean zM87157i = zM87153g2 | c28655q.m87157i(interfaceC2994c0);
        C26068u c26068u = this.f91760z;
        boolean zM87153g3 = zM87157i | c28655q.m87153g(c26068u);
        C18284j c18284j = this.f91752E;
        boolean zM87157i2 = zM87153g3 | c28655q.m87157i(c18284j);
        C24920r c24920r = this.f91753F;
        boolean zM87153g4 = zM87157i2 | c28655q.m87153g(c24920r);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g4 || objM87133R2 == c28676v0) {
            C1040r c1040r = new C1040r(interfaceC2994c0, interfaceC28601c1, c26068u, c18284j, c24920r, 21, false);
            c28655q.m87172p0(c1040r);
            objM87133R2 = c1040r;
        }
        long j7 = this.f91757w;
        InterfaceC23142n3 interfaceC23142n3 = this.f91754G;
        AbstractC24917o abstractC24917o = this.f91755H;
        C23204y c23204y = this.f91756I;
        AbstractC23092f1.m67080n(modifierM3396r, j7, (Function1) objM87133R2, interfaceC23142n3, abstractC24917o, c18284j, c23204y, c28655q, 6);
        AbstractC23124k3.m67100d(null, c23204y.f91850x, 0.0f, 0, c28655q, 3);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }
}
