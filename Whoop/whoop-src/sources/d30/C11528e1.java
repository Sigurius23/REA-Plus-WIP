package d30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d00.C11433l;
import h20.C16687l;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import l83.C23454a0;
import no0.C26954j0;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p078d1.C11453f;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23013y;
import p294l3.C23254g;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p477s2.AbstractC32073e;
import p507tx.AbstractC34235f;
import p510u0.C34354s0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29440d;
import q00.C29720i0;
import sz.C33151q;

/* JADX INFO: renamed from: d30.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11528e1 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f37141E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37142w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f37143x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37144y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f37145z;

    public C11528e1(C11433l c11433l, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1) {
        this.f37142w = 1;
        this.f37145z = c11433l;
        this.f37143x = interfaceC4339a;
        this.f37141E = interfaceC4339a2;
        this.f37144y = function1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0207  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        C28655q c28655q2;
        boolean zM87153g2;
        Object objM87133R2;
        Object objM3480c;
        switch (this.f37142w) {
            case 0:
                InterfaceC22997s1 SavedPaymentMethodRowButton = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                C16687l c16687l = (C16687l) this.f37141E;
                Function1 function1 = (Function1) this.f37144y;
                AbstractC22676k.m65750j(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        EnumC11553o0 enumC11553o0 = (EnumC11553o0) this.f37145z;
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f37143x;
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-2113785596);
                        zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c16687l);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            objM87133R = new C11516a1(function1, c16687l, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC32073e.m99743f(false, enumC11553o0, interfaceC4339a, (InterfaceC4339a) objM87133R, c28655q, 0);
                    }
                } else {
                    EnumC11553o0 enumC11553o1 = (EnumC11553o0) this.f37145z;
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f37143x;
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-2113785596);
                    zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c16687l);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C11516a1(function1, c16687l, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11516a1(function1, c16687l, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC32073e.m99743f(false, enumC11553o1, interfaceC4339a2, (InterfaceC4339a) objM87133R, c28655q, 0);
                }
                return C23454a0.f92919a;
            case 1:
                InterfaceC23001u MinScreenHeightBox = (InterfaceC23001u) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(MinScreenHeightBox, "$this$MinScreenHeightBox");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC34235f.m108228n((C11433l) this.f37145z, (InterfaceC4339a) this.f37143x, (InterfaceC4339a) this.f37141E, (Function1) this.f37144y, composer2, 0);
                    }
                } else {
                    AbstractC34235f.m108228n((C11433l) this.f37145z, (InterfaceC4339a) this.f37143x, (InterfaceC4339a) this.f37141E, (Function1) this.f37144y, composer2, 0);
                }
                return C23454a0.f92919a;
            case 2:
                InterfaceC23013y showBottomSheetContent = (InterfaceC23013y) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                Function1 function2 = (Function1) this.f37141E;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f37143x;
                Function1 function3 = (Function1) this.f37144y;
                AbstractC22676k.m65750j(showBottomSheetContent, "$this$showBottomSheetContent");
                if ((iIntValue3 & 17) == 16) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_add_payment_method_sheet");
                        List list = ((C29720i0) this.f37145z).f121548m;
                        c28655q2 = (C28655q) composer3;
                        c28655q2.m87150e0(1967700482);
                        zM87153g2 = c28655q2.m87153g(function3) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function2);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R2 == C28635l.f115821a) {
                            objM87133R2 = new C26954j0((Object) function3, (Object) interfaceC2994c0, (Object) function2, 16);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q2.m87173q(false);
                        AbstractC20301a.m56328a(modifierM3599a, list, (Function1) objM87133R2, c28655q2, 6);
                    }
                } else {
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_add_payment_method_sheet");
                    List list2 = ((C29720i0) this.f37145z).f121548m;
                    c28655q2 = (C28655q) composer3;
                    c28655q2.m87150e0(1967700482);
                    zM87153g2 = c28655q2.m87153g(function3) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(function2);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new C26954j0((Object) function3, (Object) interfaceC2994c0, (Object) function2, 16);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C26954j0((Object) function3, (Object) interfaceC2994c0, (Object) function2, 16);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q2.m87173q(false);
                    AbstractC20301a.m56328a(modifierM3599a2, list2, (Function1) objM87133R2, c28655q2, 6);
                }
                return C23454a0.f92919a;
            default:
                Modifier modifier = (Modifier) obj;
                ((Number) obj3).intValue();
                C34354s0 c34354s0 = (C34354s0) this.f37143x;
                AbstractC17911t abstractC17911t = (AbstractC17911t) this.f37145z;
                C29891y c29891y = (C29891y) this.f37144y;
                C28655q c28655q6 = (C28655q) ((Composer) obj2);
                c28655q6.m87150e0(-84507373);
                boolean zBooleanValue = ((Boolean) c28655q6.m87161k(AbstractC2453v1.f9584w)).booleanValue();
                boolean zM87155h = c28655q6.m87155h(zBooleanValue);
                Object objM87133R3 = c28655q6.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87155h || objM87133R3 == c28676v0) {
                    objM87133R3 = new C11453f(zBooleanValue);
                    c28655q6.m87172p0(objM87133R3);
                }
                C11453f c11453f = (C11453f) objM87133R3;
                boolean z4 = ((abstractC17911t instanceof C17875c1) && ((C17875c1) abstractC17911t).f69559c == 16) ? false : true;
                if (((Boolean) ((C2414n2) ((InterfaceC2410m3) c28655q6.m87161k(AbstractC2453v1.f9581t))).f9470c.getValue()).booleanValue() && c34354s0.m108660b() && C23283u0.m67357c(c29891y.f122126b) && z4) {
                    c28655q6.m87150e0(-707487962);
                    C23254g c23254g = c29891y.f122125a;
                    C23283u0 c23283u0 = new C23283u0(c29891y.f122126b);
                    boolean zM87157i = c28655q6.m87157i(c11453f);
                    Object objM87133R4 = c28655q6.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new C33151q(c11453f, null, 7);
                        c28655q6.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(c23254g, c23283u0, (InterfaceC4351m) objM87133R4, c28655q6);
                    boolean zM87153g3 = c28655q6.m87153g(abstractC17911t) | c28655q6.m87153g(c29891y) | c28655q6.m87157i(c11453f) | c28655q6.m87157i((InterfaceC29884r) this.f37141E) | c28655q6.m87157i(c34354s0);
                    InterfaceC29884r interfaceC29884r = (InterfaceC29884r) this.f37141E;
                    C29891y c29891y2 = (C29891y) this.f37144y;
                    AbstractC17911t abstractC17911t2 = (AbstractC17911t) this.f37145z;
                    Object objM87133R5 = c28655q6.m87133R();
                    if (zM87153g3 || objM87133R5 == c28676v0) {
                        C29440d c29440d = new C29440d(c11453f, interfaceC29884r, c29891y2, c34354s0, abstractC17911t2, 5);
                        c28655q6.m87172p0(c29440d);
                        objM87133R5 = c29440d;
                    }
                    objM3480c = AbstractC1125a.m3480c(modifier, (Function1) objM87133R5);
                    c28655q6.m87173q(false);
                } else {
                    c28655q6.m87150e0(-705473241);
                    c28655q6.m87173q(false);
                    objM3480c = C2314t.f9131w;
                }
                c28655q6.m87173q(false);
                return objM3480c;
        }
    }

    public /* synthetic */ C11528e1(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f37142w = i13;
        this.f37145z = obj;
        this.f37143x = obj2;
        this.f37144y = obj3;
        this.f37141E = obj4;
    }

    public C11528e1(C29720i0 c29720i0, Function1 function1, InterfaceC2994c0 interfaceC2994c0, Function1 function2) {
        this.f37142w = 2;
        this.f37145z = c29720i0;
        this.f37144y = function1;
        this.f37143x = interfaceC2994c0;
        this.f37141E = function2;
    }
}
