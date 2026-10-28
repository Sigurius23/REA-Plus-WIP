package p163g1;

import a30.C0327u;
import am2.C1023i0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.room.C1845y0;
import b30.C2571m0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import g00.AbstractC14930a;
import h00.AbstractC16517n0;
import h00.EnumC16519o0;
import i20.C17930b1;
import java.util.ArrayList;
import l83.C23454a0;
import o00.C27343a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p006a4.AbstractC0355b;
import p023ay.C2140n;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p077d0.C11376m;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p164g2.InterfaceC15237i;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p479s4.AbstractC32128i;
import p547v8.AbstractC35785b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import q00.EnumC29733p;
import q83.InterfaceC30057d;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.j6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15052j6 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56348E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56349F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f56351x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56352y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56353z;

    public /* synthetic */ C15052j6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f56350w = i13;
        this.f56351x = obj;
        this.f56352y = obj2;
        this.f56353z = obj3;
        this.f56348E = obj4;
        this.f56349F = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:38:0x0120  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        Object c0327u;
        C11344e c11344e;
        C41210b c41210bM100054h;
        C28655q c28655q;
        C2314t c2314t;
        InterfaceC41211c interfaceC41211c;
        EnumC16519o0 enumC16519o0;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87153g;
        Object objM87133R2;
        switch (this.f56350w) {
            case 0:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                String str = (String) this.f56349F;
                C15178w2 c15178w2 = (C15178w2) this.f56348E;
                C15072l6 c15072l6 = (C15072l6) this.f56351x;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87157i(interfaceC4351m) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zM65745e = AbstractC22676k.m65745e(c15072l6, (C15072l6) this.f56352y);
                    int i13 = zM65745e ? 150 : 75;
                    int i14 = (!zM65745e || AbstractC0355b.m987a((ArrayList) this.f56353z).size() == 1) ? 0 : 75;
                    C11347e2 c11347e2 = new C11347e2(i13, i14, AbstractC11333b0.f36312c);
                    boolean zM87157i2 = c28655q2.m87157i(c15072l6) | c28655q2.m87157i(c15178w2);
                    Object objM87133R3 = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87157i2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C13989w1(10, c15072l6, c15178w2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    Object objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC11348f.m30553a(!zM65745e ? 1.0f : 0.0f);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    C11344e c11344e2 = (C11344e) objM87133R4;
                    Boolean boolValueOf = Boolean.valueOf(zM65745e);
                    boolean zM87157i3 = c28655q2.m87157i(c11344e2) | c28655q2.m87155h(zM65745e) | c28655q2.m87157i(c11347e2) | c28655q2.m87153g(interfaceC4339a);
                    Object objM87133R5 = c28655q2.m87133R();
                    if (zM87157i3 || objM87133R5 == c28676v0) {
                        bool = boolValueOf;
                        c11344e = c11344e2;
                        c0327u = new C0327u(c11344e, zM65745e, c11347e2, interfaceC4339a, (InterfaceC30057d) null);
                        c28655q2.m87172p0(c0327u);
                    } else {
                        c0327u = objM87133R5;
                        bool = boolValueOf;
                        c11344e = c11344e2;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) c0327u, bool);
                    C11376m c11376m = c11344e.f36343c;
                    C11347e2 c11347e3 = new C11347e2(i13, i14, AbstractC11333b0.f36310a);
                    Object objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC11348f.m30553a(zM65745e ? 0.8f : 1.0f);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    C11344e c11344e3 = (C11344e) objM87133R6;
                    Boolean boolValueOf2 = Boolean.valueOf(zM65745e);
                    boolean zM87157i4 = c28655q2.m87157i(c11344e3) | c28655q2.m87155h(zM65745e) | c28655q2.m87157i(c11347e3);
                    Object objM87133R7 = c28655q2.m87133R();
                    if (zM87157i4 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C1845y0(c11344e3, zM65745e, c11347e3, null, 2);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, boolValueOf2);
                    C11376m c11376m2 = c11344e3.f36343c;
                    Modifier modifierM3487b = AbstractC1127a.m3487b(C2314t.f9131w, ((Number) c11376m2.f36471x.getValue()).floatValue(), ((Number) c11376m2.f36471x.getValue()).floatValue(), ((Number) c11376m.f36471x.getValue()).floatValue(), 0.0f, null, 131064);
                    boolean zM87155h = c28655q2.m87155h(zM65745e) | c28655q2.m87153g(str) | c28655q2.m87157i(c15072l6);
                    Object objM87133R8 = c28655q2.m87133R();
                    if (zM87155h || objM87133R8 == c28676v0) {
                        objM87133R8 = new C1023i0(zM65745e, str, c15072l6, 5);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3487b, false, (Function1) objM87133R8);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM51775c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    AbstractC11895b.m32007z(iIntValue & 14, interfaceC4351m, c28655q2, true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                InterfaceC23013y ScrollableTopLevelColumn = (InterfaceC23013y) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f56348E;
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) this.f56353z;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) this.f56352y;
                C27343a c27343a = (C27343a) this.f56351x;
                AbstractC22676k.m65750j(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        c41210bM100054h = null;
                        AbstractC14930a.m43026a(null, AbstractC37817c.m121344e(-1950742136, composer2, new C2140n((C2571m0) this.f56349F, 7)), composer2, 48, 1);
                        if (c27343a.f109522d && !c27343a.m82485b()) {
                            c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_link_update_card_default_card);
                        }
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(-2147175985);
                        c2314t = C2314t.f9131w;
                        if (c41210bM100054h == null) {
                            AbstractC32417h.m101203l(c41210bM100054h, EnumC29733p.f121597x, AbstractC1099a.m3398t(c2314t, 0.0f, 16, 0.0f, 0.0f, 13), c28655q, 432);
                        }
                        c28655q.m87173q(false);
                        interfaceC41211c = c27343a.f109525g;
                        c28655q.m87150e0(-2147168691);
                        if (interfaceC41211c != null) {
                            AbstractC22674j.m65716b(AbstractC35785b.m113396S(interfaceC41211c, c28655q), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13), null, null, c28655q, 48, 12);
                        }
                        c28655q.m87173q(false);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 16, 1);
                        String strM113396S = AbstractC35785b.m113396S(c27343a.f109521c, c28655q);
                        if (c27343a.f109523e != null) {
                            enumC16519o0 = EnumC16519o0.Disabled;
                        } else if (c27343a.f109526h) {
                            enumC16519o0 = EnumC16519o0.Processing;
                        } else {
                            enumC16519o0 = EnumC16519o0.Enabled;
                        }
                        EnumC16519o0 enumC16519o1 = enumC16519o0;
                        c28655q.m87150e0(-2147154115);
                        zM87157i = c28655q.m87157i(interfaceC15237i) | c28655q.m87153g(interfaceC4339a3);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (zM87157i || objM87133R == c28676v1) {
                            objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a3, 3);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        c28655q.m87173q(false);
                        c28655q.m87150e0(-2147150021);
                        zM87153g = c28655q.m87153g(interfaceC4339a2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v1) {
                            objM87133R2 = new C24679k(interfaceC4339a2, 24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC16517n0.m46673b(modifierM3396r, strM113396S, enumC16519o1, interfaceC4339a4, true, (InterfaceC4339a) objM87133R2, c28655q, 24582, 192);
                    }
                } else {
                    c41210bM100054h = null;
                    AbstractC14930a.m43026a(null, AbstractC37817c.m121344e(-1950742136, composer2, new C2140n((C2571m0) this.f56349F, 7)), composer2, 48, 1);
                    if (c27343a.f109522d) {
                        c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_link_update_card_default_card);
                    }
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(-2147175985);
                    c2314t = C2314t.f9131w;
                    if (c41210bM100054h == null) {
                        AbstractC32417h.m101203l(c41210bM100054h, EnumC29733p.f121597x, AbstractC1099a.m3398t(c2314t, 0.0f, 16, 0.0f, 0.0f, 13), c28655q, 432);
                    }
                    c28655q.m87173q(false);
                    interfaceC41211c = c27343a.f109525g;
                    c28655q.m87150e0(-2147168691);
                    if (interfaceC41211c != null) {
                        AbstractC22674j.m65716b(AbstractC35785b.m113396S(interfaceC41211c, c28655q), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13), null, null, c28655q, 48, 12);
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, 16, 1);
                    String strM113396S2 = AbstractC35785b.m113396S(c27343a.f109521c, c28655q);
                    if (c27343a.f109523e != null) {
                        enumC16519o0 = EnumC16519o0.Disabled;
                    } else if (c27343a.f109526h) {
                        enumC16519o0 = EnumC16519o0.Processing;
                    } else {
                        enumC16519o0 = EnumC16519o0.Enabled;
                    }
                    EnumC16519o0 enumC16519o2 = enumC16519o0;
                    c28655q.m87150e0(-2147154115);
                    zM87157i = c28655q.m87157i(interfaceC15237i) | c28655q.m87153g(interfaceC4339a3);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (zM87157i) {
                        objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a3, 3);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a3, 3);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-2147150021);
                    zM87153g = c28655q.m87153g(interfaceC4339a2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C24679k(interfaceC4339a2, 24);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C24679k(interfaceC4339a2, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC16517n0.m46673b(modifierM3396r2, strM113396S2, enumC16519o2, interfaceC4339a5, true, (InterfaceC4339a) objM87133R2, c28655q, 24582, 192);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
