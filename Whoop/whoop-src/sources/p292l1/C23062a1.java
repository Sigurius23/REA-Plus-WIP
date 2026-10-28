package p292l1;

import am2.C1008b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import i93.C18284j;
import id2.C18434s;
import kx1.C22881b;
import l83.C23454a0;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.C11362i1;
import p077d0.C11413x;
import p180h0.InterfaceC16439p3;
import p206i0.AbstractC17833k;
import p206i0.C17824b;
import p206i0.C17829g;
import p206i0.C17835m;
import p209i3.AbstractC18032n;
import p316m1.AbstractC24917o;
import p316m1.C24916n;
import p316m1.C24920r;
import p329n0.C26068u;
import p354o1.EnumC27375n;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p62.C28947h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import q00.C29720i0;
import se.AbstractC32417h;

/* JADX INFO: renamed from: l1.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23062a1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f90940E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f90941F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f90942G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f90943H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f90944I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f90945J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f90946K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90947w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f90948x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f90949y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f90950z;

    public C23062a1(C26068u c26068u, C18284j c18284j, AbstractC24917o abstractC24917o, C24920r c24920r, Function1 function1, C24916n c24916n, Long l7, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y) {
        this.f90949y = c26068u;
        this.f90950z = c18284j;
        this.f90940E = abstractC24917o;
        this.f90941F = c24920r;
        this.f90948x = function1;
        this.f90942G = c24916n;
        this.f90943H = l7;
        this.f90944I = c23085e0;
        this.f90945J = interfaceC23142n3;
        this.f90946K = c23204y;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0094  */
    /* JADX WARN: Code duplicated, block: B:17:0x00be  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        boolean zM87153g;
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        Function1 function5;
        Object objM87133R;
        boolean zM87153g2;
        Object objM87133R2;
        int i13 = this.f90947w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f90949y;
        C28676v0 c28676v0 = C28635l.f115821a;
        Object obj4 = this.f90945J;
        Object obj5 = this.f90942G;
        Object obj6 = this.f90946K;
        Object obj7 = this.f90940E;
        Object obj8 = this.f90944I;
        Object obj9 = this.f90943H;
        Object obj10 = this.f90941F;
        Object obj11 = this.f90950z;
        switch (i13) {
            case 0:
                C24916n c24916n = (C24916n) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer;
                if (!c28655q2.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c28655q2.m87138X();
                } else {
                    Object objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22881b(13);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R3);
                    C26068u c26068u = (C26068u) obj3;
                    C23067b0 c23067b0 = C23067b0.f90984a;
                    C11413x c11413xM30567o = AbstractC11348f.m30567o();
                    C11362i1 c11362i1M67109m = AbstractC23124k3.m67109m(EnumC27375n.f109950y, c28655q2);
                    boolean zM87153g3 = c28655q2.m87153g(c11413xM30567o) | c28655q2.m87153g(c26068u);
                    Object objM87133R4 = c28655q2.m87133R();
                    if (zM87153g3 || objM87133R4 == c28676v0) {
                        C23061a0 c23061a0 = new C23061a0(new C17824b(c26068u, C17835m.f69347b));
                        float f13 = AbstractC17833k.f69346a;
                        C17829g c17829g = new C17829g(c23061a0, c11413xM30567o, c11362i1M67109m);
                        c28655q2.m87172p0(c17829g);
                        objM87133R4 = c17829g;
                    }
                    InterfaceC16439p3 interfaceC16439p3 = (InterfaceC16439p3) objM87133R4;
                    boolean zM87157i = c28655q2.m87157i((C18284j) obj11) | c28655q2.m87157i((AbstractC24917o) obj7) | c28655q2.m87153g((C24920r) obj10) | c28655q2.m87153g(this.f90948x) | c28655q2.m87153g(c24916n) | c28655q2.m87153g((Long) obj9) | c28655q2.m87157i((C23085e0) obj8) | c28655q2.m87153g((InterfaceC23142n3) obj4) | c28655q2.m87153g((C23204y) obj6);
                    C18284j c18284j = (C18284j) obj11;
                    AbstractC24917o abstractC24917o = (AbstractC24917o) obj7;
                    C24920r c24920r = (C24920r) obj10;
                    Long l7 = (Long) obj9;
                    C23085e0 c23085e0 = (C23085e0) obj8;
                    InterfaceC23142n3 interfaceC23142n3 = (InterfaceC23142n3) obj4;
                    C23204y c23204y = (C23204y) obj6;
                    Object objM87133R5 = c28655q2.m87133R();
                    if (zM87157i || objM87133R5 == c28676v0) {
                        C18434s c18434s = new C18434s(c18284j, abstractC24917o, c24920r, this.f90948x, c24916n, l7, c23085e0, interfaceC23142n3, c23204y);
                        c28655q2.m87172p0(c18434s);
                        objM87133R5 = c18434s;
                    }
                    AbstractC22674j.m65718d(modifierM51775c, c26068u, null, null, null, interfaceC16439p3, false, null, (Function1) objM87133R5, c28655q2, 0, 444);
                }
                break;
            default:
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj7;
                Composer composer2 = (Composer) obj;
                Function1 function6 = (Function1) obj6;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C29720i0 c29720i0 = (C29720i0) obj3;
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(-2036458147);
                    zM87153g = c28655q.m87153g((Function1) obj11) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i((Function1) obj10) | c28655q.m87153g((Function1) obj5) | c28655q.m87153g((Function1) obj9) | c28655q.m87153g((Function1) obj8);
                    function1 = (Function1) obj11;
                    function2 = (Function1) obj10;
                    function3 = (Function1) obj5;
                    function4 = (Function1) obj9;
                    function5 = (Function1) obj8;
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        C1008b c1008b = new C1008b(function1, interfaceC2994c0, function2, function3, function4, function5, 19);
                        c28655q.m87172p0(c1008b);
                        objM87133R = c1008b;
                    } else {
                        C1008b c1008b2 = new C1008b(function1, interfaceC2994c0, function2, function3, function4, function5, 19);
                        c28655q.m87172p0(c1008b2);
                        objM87133R = c1008b2;
                    }
                    Function1 function7 = (Function1) objM87133R;
                    c28655q.m87173q(false);
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj4;
                    c28655q.m87150e0(-2036418855);
                    zM87153g2 = c28655q.m87153g(function6);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new C28947h(function6, 16);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C28947h(function6, 16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC32417h.m101200i(c29720i0, this.f90948x, function7, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0);
                } else {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (!c28655q3.m87121F()) {
                        C29720i0 c29720i1 = (C29720i0) obj3;
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(-2036458147);
                        zM87153g = c28655q.m87153g((Function1) obj11) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i((Function1) obj10) | c28655q.m87153g((Function1) obj5) | c28655q.m87153g((Function1) obj9) | c28655q.m87153g((Function1) obj8);
                        function1 = (Function1) obj11;
                        function2 = (Function1) obj10;
                        function3 = (Function1) obj5;
                        function4 = (Function1) obj9;
                        function5 = (Function1) obj8;
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == c28676v0) {
                            C1008b c1008b3 = new C1008b(function1, interfaceC2994c0, function2, function3, function4, function5, 19);
                            c28655q.m87172p0(c1008b3);
                            objM87133R = c1008b3;
                        }
                        Function1 function8 = (Function1) objM87133R;
                        c28655q.m87173q(false);
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj4;
                        c28655q.m87150e0(-2036418855);
                        zM87153g2 = c28655q.m87153g(function6);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C28947h(function6, 16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC32417h.m101200i(c29720i1, this.f90948x, function8, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }

    public C23062a1(C29720i0 c29720i0, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, Function1 function3, Function1 function4, Function1 function5, Function1 function6, InterfaceC4339a interfaceC4339a, Function1 function7) {
        this.f90949y = c29720i0;
        this.f90948x = function1;
        this.f90950z = function2;
        this.f90940E = interfaceC2994c0;
        this.f90941F = function3;
        this.f90942G = function4;
        this.f90943H = function5;
        this.f90944I = function6;
        this.f90945J = interfaceC4339a;
        this.f90946K = function7;
    }
}
