package p292l1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b30.C2647w2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import ih0.C18508r;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import kf0.C22432g;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11344e;
import p077d0.C11409v1;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22940b2;
import p294l3.C23285v0;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p316m1.C24907i0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23135m2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91479E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f91480F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f91481G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f91482H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f91483I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91484w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f91485x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f91486y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f91487z;

    public C23135m2(InterfaceC4351m interfaceC4351m, C11344e c11344e, C23196w3 c23196w3, InterfaceC4351m interfaceC4351m2, C37816b c37816b, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, boolean z4) {
        this.f91485x = interfaceC4351m;
        this.f91481G = c11344e;
        this.f91486y = c23196w3;
        this.f91482H = interfaceC4351m2;
        this.f91483I = c37816b;
        this.f91487z = interfaceC4339a;
        this.f91479E = interfaceC2994c0;
        this.f91480F = z4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91484w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f91479E;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f91487z;
                C23196w3 c23196w3 = (C23196w3) this.f91486y;
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM87153g = c28655q.m87153g(c23196w3) | c28655q.m87153g(interfaceC4339a) | c28655q.m87157i(interfaceC2994c0);
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C22432g(c23196w3, interfaceC4339a, interfaceC2994c0);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3361f = AbstractC1092a.m3361f(C2314t.f9131w, false, null, (InterfaceC4339a) objM87133R, 7);
                    boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(interfaceC4339a) | c28655q.m87155h(this.f91480F) | c28655q.m87153g(c23196w3) | c28655q.m87153g((String) this.f91481G) | c28655q.m87153g((String) this.f91482H) | c28655q.m87153g((String) this.f91483I);
                    String str = (String) this.f91481G;
                    String str2 = (String) this.f91482H;
                    String str3 = (String) this.f91483I;
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f91487z;
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f91479E;
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        C18508r c18508r = new C18508r(this.f91480F, c23196w3, str, str2, str3, interfaceC4339a2, interfaceC2994c1);
                        c28655q.m87172p0(c18508r);
                        objM87133R2 = c18508r;
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3361f, true, (Function1) objM87133R2);
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f91485x;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC11895b.m32007z(0, interfaceC4351m, c28655q, true);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                C23196w3 c23196w4 = (C23196w3) this.f91486y;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C11344e c11344e = (C11344e) this.f91481G;
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Modifier modifierM66727p = AbstractC22953f.m66727p(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), (InterfaceC22940b2) ((InterfaceC4351m) this.f91485x).invoke(c28655q2, 0));
                    boolean zM87157i2 = c28655q2.m87157i(c11344e);
                    Object objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R3 == C28635l.f115821a) {
                        objM87133R3 = new C19962a(c11344e, 24);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(AbstractC1127a.m3486a(modifierM66727p, (Function1) objM87133R3), new C23084e(c23196w4, 1));
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) this.f91482H;
                    C37816b c37816b = (C37816b) this.f91483I;
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) this.f91487z;
                    InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) this.f91479E;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3486a);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    if (interfaceC4351m2 != null) {
                        c28655q2.m87150e0(1352934765);
                        AbstractC23178t3.m67142a(AbstractC37817c.m121344e(2000500644, c28655q2, new C23135m2(c23196w4, interfaceC4339a3, interfaceC2994c2, this.f91480F, AbstractC24899e0.m73002i(c28655q2, R.string.m3c_bottom_sheet_dismiss_description), AbstractC24899e0.m73002i(c28655q2, R.string.m3c_bottom_sheet_expand_description), AbstractC24899e0.m73002i(c28655q2, R.string.m3c_bottom_sheet_collapse_description), interfaceC4351m2)), c28655q2, 54);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1356009965);
                        c28655q2.m87173q(false);
                    }
                    c37816b.invoke(C23016z.f90757a, c28655q2, 6);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C23285v0 c23285v0M60671a0 = AbstractC21598x.m60671a0((C23285v0) this.f91486y, (C23285v0) this.f91487z, ((Number) ((InterfaceC28670t2) this.f91479E).getValue()).floatValue());
                    InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f91482H;
                    if (this.f91480F) {
                        c23285v0M60671a0 = C23285v0.m67364b(c23285v0M60671a0, ((C17919x) interfaceC28670t2.getValue()).f69639a, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                    }
                    AbstractC24913l0.m73014b(((C17919x) ((InterfaceC28670t2) this.f91481G).getValue()).f69639a, c23285v0M60671a0, AbstractC37817c.m121344e(1157484991, c28655q3, new C2647w2(23, (Function3) this.f91483I, (C24907i0) this.f91485x)), c28655q3, 384);
                } else {
                    c28655q3.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C23135m2(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, boolean z4, String str, String str2, String str3, InterfaceC4351m interfaceC4351m) {
        this.f91486y = c23196w3;
        this.f91487z = interfaceC4339a;
        this.f91479E = interfaceC2994c0;
        this.f91480F = z4;
        this.f91481G = str;
        this.f91482H = str2;
        this.f91483I = str3;
        this.f91485x = interfaceC4351m;
    }

    public C23135m2(C23285v0 c23285v0, C23285v0 c23285v1, C11409v1 c11409v1, C11409v1 c11409v2, boolean z4, C11409v1 c11409v3, Function3 function3, C24907i0 c24907i0) {
        this.f91486y = c23285v0;
        this.f91487z = c23285v1;
        this.f91479E = c11409v1;
        this.f91481G = c11409v2;
        this.f91480F = z4;
        this.f91482H = c11409v3;
        this.f91483I = function3;
        this.f91485x = c24907i0;
    }
}
