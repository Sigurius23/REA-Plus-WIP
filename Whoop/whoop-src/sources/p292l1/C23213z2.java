package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.runtime.Composer;
import b01.C2185f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d40.C11662g;
import d40.C11671p;
import h20.AbstractC16736t0;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p026b2.C2320z;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.C22976l1;
import p291l0.InterfaceC23004v;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p412q3.InterfaceC29873g0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l1.z2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23213z2 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91905E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91906F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f91907G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f91908H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f91909I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91910w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f91911x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f91912y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f91913z;

    public C23213z2(String str, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, C23089e4 c23089e4) {
        this.f91911x = str;
        this.f91912y = z4;
        this.f91913z = z13;
        this.f91905E = interfaceC29873g0;
        this.f91906F = interfaceC21083i;
        this.f91907G = interfaceC4351m;
        this.f91908H = interfaceC17869a1;
        this.f91909I = c23089e4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x0114  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fM3403d;
        C28655q c28655q;
        boolean zM87147d;
        Object objM87133R;
        final float f13;
        float f14;
        float f15;
        float f16;
        boolean zM87155h;
        final AbstractC16736t0 abstractC16736t0;
        final InterfaceC4339a interfaceC4339a;
        final Function1 function1;
        final Function1 function2;
        Object objM87133R2;
        switch (this.f91910w) {
            case 0:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87157i(interfaceC4351m) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i13 = iIntValue;
                    C23177t2 c23177t2 = C23177t2.f91688a;
                    String str = (String) this.f91911x;
                    InterfaceC29873g0 interfaceC29873g0 = (InterfaceC29873g0) this.f91905E;
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) this.f91906F;
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) this.f91907G;
                    C23089e4 c23089e4 = (C23089e4) this.f91909I;
                    InterfaceC17869a1 interfaceC17869a1 = (InterfaceC17869a1) this.f91908H;
                    boolean z4 = this.f91912y;
                    c23177t2.m67141b(str, interfaceC4351m, z4, this.f91913z, interfaceC29873g0, interfaceC21083i, false, null, interfaceC4351m2, null, c23089e4, null, AbstractC37817c.m121344e(-656940872, c28655q2, new C23207y2(z4, interfaceC21083i, c23089e4, interfaceC17869a1, 0)), c28655q2, (i13 << 3) & 112);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 1:
                InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87157i(interfaceC4351m3) ? 4 : 2;
                }
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C23107h4.f91269a.m67089b((String) this.f91911x, interfaceC4351m3, this.f91912y, this.f91913z, (InterfaceC29873g0) this.f91905E, (InterfaceC21083i) this.f91906F, (InterfaceC4351m) this.f91907G, (InterfaceC17869a1) this.f91908H, (C23089e4) this.f91909I, null, null, c28655q3, (iIntValue2 << 3) & 112);
                } else {
                    c28655q3.m87138X();
                }
                break;
            default:
                final List list = (List) this.f91905E;
                InterfaceC23004v BoxWithConstraints = (InterfaceC23004v) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87153g(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    C28655q c28655q4 = (C28655q) composer3;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        fM3403d = ((C1101c) BoxWithConstraints).m3403d();
                        c28655q = (C28655q) composer3;
                        c28655q.m87150e0(-1122512013);
                        c28655q.m87150e0(697188603);
                        zM87147d = c28655q.m87147d(fM3403d);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87147d || objM87133R == c28676v0) {
                            float f17 = 2;
                            float f18 = fM3403d - (17 * f17);
                            objM87133R = new C39174f(f18 / (((int) ((f17 * f18) / ((6 * f17) + 100))) / 2.0f));
                            c28655q.m87172p0(objM87133R);
                        }
                        f13 = ((C39174f) objM87133R).f168413w;
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        boolean z13 = this.f91912y;
                        boolean z14 = !z13;
                        C11662g c11662g = C11671p.f37685f;
                        float f19 = 3;
                        f14 = c11662g.f37644a - f19;
                        f15 = 0;
                        if (f14 < f15) {
                            f14 = f15;
                        }
                        f16 = c11662g.f37646c - f19;
                        if (f16 >= f15) {
                            f15 = f16;
                        }
                        C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f14, 0.0f, f15, 0.0f, 10);
                        C26068u c26068u = (C26068u) this.f91911x;
                        c28655q.m87150e0(-261168515);
                        zM87155h = c28655q.m87155h(z13) | c28655q.m87157i(list) | c28655q.m87155h(this.f91913z) | c28655q.m87153g((AbstractC16736t0) this.f91906F) | c28655q.m87147d(f13) | c28655q.m87153g((InterfaceC4339a) this.f91907G) | c28655q.m87153g((Function1) this.f91909I) | c28655q.m87153g((Function1) this.f91908H);
                        abstractC16736t0 = (AbstractC16736t0) this.f91906F;
                        interfaceC4339a = (InterfaceC4339a) this.f91907G;
                        function1 = (Function1) this.f91909I;
                        function2 = (Function1) this.f91908H;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87155h || objM87133R2 == c28676v0) {
                            final boolean z15 = this.f91912y;
                            final boolean z16 = this.f91913z;
                            Function1 function3 = new Function1() { // from class: b30.l5
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                                    AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                                    C2185f c2185f = new C2185f(22);
                                    List list2 = list;
                                    ((C26053f) LazyRow).m77529r(list2.size(), new C2320z(4, c2185f, list2), new C2485b2(list2, 1), new C37816b(new C2584n5(list2, z15, z16, abstractC16736t0, f13, interfaceC4339a, function1, function2), true, -632812321));
                                    return C23454a0.f92919a;
                                }
                            };
                            c28655q.m87172p0(function3);
                            objM87133R2 = function3;
                        }
                        c28655q.m87173q(false);
                        AbstractC22674j.m65719e(null, c26068u, c22976l1M3381c, null, null, null, z14, (Function1) objM87133R2, c28655q, 0, 121);
                    }
                } else {
                    fM3403d = ((C1101c) BoxWithConstraints).m3403d();
                    c28655q = (C28655q) composer3;
                    c28655q.m87150e0(-1122512013);
                    c28655q.m87150e0(697188603);
                    zM87147d = c28655q.m87147d(fM3403d);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87147d) {
                        float f110 = 2;
                        float f111 = fM3403d - (17 * f110);
                        objM87133R = new C39174f(f111 / (((int) ((f110 * f111) / ((6 * f110) + 100))) / 2.0f));
                        c28655q.m87172p0(objM87133R);
                    } else {
                        float f112 = 2;
                        float f113 = fM3403d - (17 * f112);
                        objM87133R = new C39174f(f113 / (((int) ((f112 * f113) / ((6 * f112) + 100))) / 2.0f));
                        c28655q.m87172p0(objM87133R);
                    }
                    f13 = ((C39174f) objM87133R).f168413w;
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    boolean z17 = this.f91912y;
                    boolean z18 = !z17;
                    C11662g c11662g2 = C11671p.f37685f;
                    float f114 = 3;
                    f14 = c11662g2.f37644a - f114;
                    f15 = 0;
                    if (f14 < f15) {
                        f14 = f15;
                    }
                    f16 = c11662g2.f37646c - f114;
                    if (f16 >= f15) {
                        f15 = f16;
                    }
                    C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(f14, 0.0f, f15, 0.0f, 10);
                    C26068u c26068u2 = (C26068u) this.f91911x;
                    c28655q.m87150e0(-261168515);
                    zM87155h = c28655q.m87155h(z17) | c28655q.m87157i(list) | c28655q.m87155h(this.f91913z) | c28655q.m87153g((AbstractC16736t0) this.f91906F) | c28655q.m87147d(f13) | c28655q.m87153g((InterfaceC4339a) this.f91907G) | c28655q.m87153g((Function1) this.f91909I) | c28655q.m87153g((Function1) this.f91908H);
                    abstractC16736t0 = (AbstractC16736t0) this.f91906F;
                    interfaceC4339a = (InterfaceC4339a) this.f91907G;
                    function1 = (Function1) this.f91909I;
                    function2 = (Function1) this.f91908H;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87155h) {
                        final boolean z19 = this.f91912y;
                        final boolean z110 = this.f91913z;
                        Function1 function4 = new Function1() { // from class: b30.l5
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                                AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                                C2185f c2185f = new C2185f(22);
                                List list2 = list;
                                ((C26053f) LazyRow).m77529r(list2.size(), new C2320z(4, c2185f, list2), new C2485b2(list2, 1), new C37816b(new C2584n5(list2, z19, z110, abstractC16736t0, f13, interfaceC4339a, function1, function2), true, -632812321));
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(function4);
                        objM87133R2 = function4;
                    } else {
                        final boolean z111 = this.f91912y;
                        final boolean z112 = this.f91913z;
                        Function1 function5 = new Function1() { // from class: b30.l5
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                InterfaceC26064q LazyRow = (InterfaceC26064q) obj4;
                                AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
                                C2185f c2185f = new C2185f(22);
                                List list2 = list;
                                ((C26053f) LazyRow).m77529r(list2.size(), new C2320z(4, c2185f, list2), new C2485b2(list2, 1), new C37816b(new C2584n5(list2, z111, z112, abstractC16736t0, f13, interfaceC4339a, function1, function2), true, -632812321));
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(function5);
                        objM87133R2 = function5;
                    }
                    c28655q.m87173q(false);
                    AbstractC22674j.m65719e(null, c26068u2, c22976l1M3381c2, null, null, null, z18, (Function1) objM87133R2, c28655q, 0, 121);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C23213z2(String str, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1) {
        this.f91911x = str;
        this.f91912y = z4;
        this.f91913z = z13;
        this.f91905E = interfaceC29873g0;
        this.f91906F = interfaceC21083i;
        this.f91907G = interfaceC4351m;
        this.f91909I = c23089e4;
        this.f91908H = interfaceC17869a1;
    }

    public C23213z2(boolean z4, C26068u c26068u, List list, boolean z13, AbstractC16736t0 abstractC16736t0, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2) {
        this.f91912y = z4;
        this.f91911x = c26068u;
        this.f91905E = list;
        this.f91913z = z13;
        this.f91906F = abstractC16736t0;
        this.f91907G = interfaceC4339a;
        this.f91909I = function1;
        this.f91908H = function2;
    }
}
