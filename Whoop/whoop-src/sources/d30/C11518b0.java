package d30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import h00.AbstractC16517n0;
import h00.EnumC16519o0;
import h20.C16687l;
import i20.C17954j1;
import java.util.List;
import l83.C23454a0;
import m63.C25126d;
import m83.C25235a0;
import n00.C26075c;
import n53.C26318e;
import p000.C33241t;
import p003a1.C0109h;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.C11344e;
import p077d0.C11376m;
import p097ds.AbstractC12314q;
import p133f1.AbstractC13976s0;
import p162g0.C14926c;
import p162g0.C14927d;
import p163g1.AbstractC15011f9;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p40.C28826a;
import p479s4.AbstractC32131l;
import p510u0.C34331k1;
import p512u2.AbstractC34452c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import se.AbstractC32411b;
import sg2.C32469t;

/* JADX INFO: renamed from: d30.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11518b0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37095w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f37096x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37097y;

    public /* synthetic */ C11518b0(int i13, Object obj, Object obj2) {
        this.f37095w = i13;
        this.f37096x = obj;
        this.f37097y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x032e  */
    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0189  */
    /* JADX WARN: Code duplicated, block: B:51:0x019a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x020c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28655q c28655q;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87153g;
        Object objM87133R2;
        switch (this.f37095w) {
            case 0:
                InterfaceC22997s1 SavedPaymentMethodRowButton = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC12314q.m34330j((C16687l) this.f37096x, ((C11570x) ((InterfaceC28601c1) this.f37097y).getValue()).f37345c, composer, 0);
                    }
                } else {
                    AbstractC12314q.m34330j((C16687l) this.f37096x, ((C11570x) ((InterfaceC28601c1) this.f37097y).getValue()).f37345c, composer, 0);
                }
                return C23454a0.f92919a;
            case 1:
                ((Number) obj3).intValue();
                C28655q c28655q3 = (C28655q) ((Composer) obj2);
                c28655q3.m87150e0(759876635);
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f37096x;
                Object objM87133R3 = c28655q3.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (objM87133R3 == c28676v1) {
                    objM87133R3 = AbstractC28683x.m87264r(interfaceC4339a);
                    c28655q3.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                Object objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C11344e(new C16617b(((C16617b) interfaceC28670t2.getValue()).f63937a), AbstractC13976s0.f49840b, new C16617b(AbstractC13976s0.f49841c), 8);
                    c28655q3.m87172p0(objM87133R4);
                }
                C11344e c11344e = (C11344e) objM87133R4;
                boolean zM87157i = c28655q3.m87157i(c11344e);
                Object objM87133R5 = c28655q3.m87133R();
                if (zM87157i || objM87133R5 == c28676v1) {
                    objM87133R5 = new C0109h(interfaceC28670t2, c11344e, (InterfaceC30057d) null, 22);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                C11376m c11376m = c11344e.f36343c;
                Function1 function1 = (Function1) this.f37097y;
                boolean zM87153g2 = c28655q3.m87153g(c11376m);
                Object objM87133R6 = c28655q3.m87133R();
                if (zM87153g2 || objM87133R6 == c28676v1) {
                    objM87133R6 = new C33241t(c11376m, 2);
                    c28655q3.m87172p0(objM87133R6);
                }
                Modifier modifier = (Modifier) function1.invoke((InterfaceC4339a) objM87133R6);
                c28655q3.m87173q(false);
                return modifier;
            case 2:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C28655q c28655q4 = (C28655q) composer2;
                if (c28655q4.m87135U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objM87133R7 = c28655q4.m87133R();
                    if (objM87133R7 == C28635l.f115821a) {
                        objM87133R7 = new C14927d();
                        c28655q4.m87172p0(objM87133R7);
                    }
                    C14927d c14927d = (C14927d) objM87133R7;
                    Function1 function2 = (Function1) this.f37096x;
                    C14926c c14926c = (C14926c) this.f37097y;
                    c14927d.f55628a.clear();
                    function2.invoke(c14927d);
                    c14927d.m43022a(c14926c, c28655q4, 0);
                } else {
                    c28655q4.m87138X();
                }
                return C23454a0.f92919a;
            case 3:
                InterfaceC22997s1 Button = (InterfaceC22997s1) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(Button, "$this$Button");
                if ((iIntValue3 & 17) == 16) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        AbstractC16517n0.m46675d((EnumC16519o0) this.f37096x, (String) this.f37097y, composer3, 0);
                    }
                } else {
                    AbstractC16517n0.m46675d((EnumC16519o0) this.f37096x, (String) this.f37097y, composer3, 0);
                }
                return C23454a0.f92919a;
            case 4:
                InterfaceC23013y InputAddressScreen = (InterfaceC23013y) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                C25126d c25126d = (C25126d) this.f37097y;
                AbstractC22676k.m65750j(InputAddressScreen, "$this$InputAddressScreen");
                if ((iIntValue4 & 17) == 16) {
                    C28655q c28655q6 = (C28655q) composer4;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        c28655q = (C28655q) composer4;
                        c28655q.m87150e0(365272737);
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC3269g.m9493Z(C25235a0.f99113w);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC13037f2 interfaceC13037f2 = (InterfaceC13037f2) objM87133R;
                        c28655q.m87173q(false);
                        C13045h2 c13045h2 = ((C17954j1) this.f37096x).f69753N;
                        List list = (List) c25126d.f98479E;
                        c28655q.m87150e0(365277831);
                        zM87153g = c28655q.m87153g(list);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC3269g.m9493Z((List) c25126d.f98479E);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC32131l.m100069a(interfaceC13037f2, c13045h2, (InterfaceC13037f2) objM87133R2, (C26318e) c25126d.f98482H, null, c28655q, 0);
                    }
                } else {
                    c28655q = (C28655q) composer4;
                    c28655q.m87150e0(365272737);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC3269g.m9493Z(C25235a0.f99113w);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC13037f2 interfaceC13037f3 = (InterfaceC13037f2) objM87133R;
                    c28655q.m87173q(false);
                    C13045h2 c13045h3 = ((C17954j1) this.f37096x).f69753N;
                    List list2 = (List) c25126d.f98479E;
                    c28655q.m87150e0(365277831);
                    zM87153g = c28655q.m87153g(list2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = AbstractC3269g.m9493Z((List) c25126d.f98479E);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = AbstractC3269g.m9493Z((List) c25126d.f98479E);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC32131l.m100069a(interfaceC13037f3, c13045h3, (InterfaceC13037f2) objM87133R2, (C26318e) c25126d.f98482H, null, c28655q, 0);
                }
                return C23454a0.f92919a;
            case 5:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer5 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                String str = ((C26075c) this.f37096x).f103265h;
                if (str == null) {
                    str = "";
                }
                AbstractC32411b.m101093f(str, (Function1) this.f37097y, composer5, 0);
                return C23454a0.f92919a;
            case 6:
                String it = (String) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                C28826a c28826a = (C28826a) this.f37097y;
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue5 & 17) == 16) {
                    C28655q c28655q7 = (C28655q) composer6;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        AbstractC29125c.m88522c((AbstractC26165a) this.f37096x, AbstractC30060g.m92103Y(composer6, c28826a.f116698b), null, null, null, 0.0f, c28826a.f116699c, composer6, 0, 60);
                    }
                } else {
                    AbstractC29125c.m88522c((AbstractC26165a) this.f37096x, AbstractC30060g.m92103Y(composer6, c28826a.f116698b), null, null, null, 0.0f, c28826a.f116699c, composer6, 0, 60);
                }
                return C23454a0.f92919a;
            case 7:
                ((Number) obj3).intValue();
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) this.f37097y;
                C28655q c28655q8 = (C28655q) ((Composer) obj2);
                c28655q8.m87150e0(-102778667);
                Object objM87133R8 = c28655q8.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (objM87133R8 == c28676v2) {
                    objM87133R8 = AbstractC28683x.m87262p(c28655q8);
                    c28655q8.m87172p0(objM87133R8);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R8;
                Object objM87133R9 = c28655q8.m87133R();
                if (objM87133R9 == c28676v2) {
                    objM87133R9 = AbstractC28683x.m87272z(null);
                    c28655q8.m87172p0(objM87133R9);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R9;
                InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F((Function1) this.f37096x, c28655q8);
                boolean zM87153g3 = c28655q8.m87153g(interfaceC21083i);
                Object objM87133R10 = c28655q8.m87133R();
                if (zM87153g3 || objM87133R10 == c28676v2) {
                    objM87133R10 = new C32469t(20, interfaceC28601c1, interfaceC21083i);
                    c28655q8.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87251e(interfaceC21083i, (Function1) objM87133R10, c28655q8);
                boolean zM87157i2 = c28655q8.m87157i(interfaceC2994c0) | c28655q8.m87153g(interfaceC21083i) | c28655q8.m87153g(interfaceC28601c1M87238F);
                Object objM87133R11 = c28655q8.m87133R();
                if (zM87157i2 || objM87133R11 == c28676v2) {
                    objM87133R11 = new C34331k1(interfaceC2994c0, interfaceC28601c1, interfaceC21083i, interfaceC28601c1M87238F);
                    c28655q8.m87172p0(objM87133R11);
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(C2314t.f9131w, interfaceC21083i, (PointerInputEventHandler) objM87133R11);
                c28655q8.m87173q(false);
                return modifierM108903b;
            default:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue6 & 17) == 16) {
                    C28655q c28655q9 = (C28655q) composer7;
                    if (c28655q9.m87121F()) {
                        c28655q9.m87138X();
                    } else {
                        AbstractC15011f9.m43114b((String) this.f37096x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (C23285v0) this.f37097y, composer7, 0, 0, 65534);
                    }
                } else {
                    AbstractC15011f9.m43114b((String) this.f37096x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (C23285v0) this.f37097y, composer7, 0, 0, 65534);
                }
                return C23454a0.f92919a;
        }
    }
}
