package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import go1.C16016a;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p000.AbstractC30802r;
import p026b2.C2314t;
import p114eb.C12991u0;
import p133f1.C13921a0;
import p292l1.AbstractC23124k3;
import p355o2.C27430e;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h00.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16499e0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f63415E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f63416F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63417w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f63418x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f63419y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63420z;

    public C16499e0(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, C27430e c27430e, String str) {
        this.f63420z = interfaceC4339a;
        this.f63415E = modifier;
        this.f63418x = z4;
        this.f63416F = c27430e;
        this.f63419y = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        Function1 function1;
        Object objM87133R3;
        Object objM94759h;
        switch (this.f63417w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(1647448970);
                        interfaceC28601c1 = (InterfaceC28601c1) this.f63416F;
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = new C13921a0(16, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        Modifier modifierM3502b = AbstractC1132b.m3502b(C2314t.f9131w, (Function1) objM87133R);
                        c28655q.m87150e0(1647472411);
                        if (this.f63418x) {
                            function1 = null;
                        } else {
                            c28655q.m87150e0(1647474877);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16016a(26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function1 = (Function1) objM87133R2;
                            c28655q.m87173q(false);
                        }
                        Function1 function2 = function1;
                        c28655q.m87173q(false);
                        C12991u0 c12991u0 = (C12991u0) this.f63420z;
                        c28655q.m87150e0(1647453570);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C16016a(27);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function3 = (Function1) objM87133R3;
                        objM94759h = AbstractC30802r.m94759h(1647455938, c28655q, false);
                        if (objM94759h == c28676v0) {
                            objM94759h = new C16016a(28);
                            c28655q.m87172p0(objM94759h);
                        }
                        c28655q.m87173q(false);
                        AbstractC17269i.m48886d(c12991u0, this.f63419y, modifierM3502b, null, function3, (Function1) objM94759h, null, null, function2, (Function1) this.f63415E, c28655q, 1769472, 408);
                    }
                } else {
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(1647448970);
                    interfaceC28601c1 = (InterfaceC28601c1) this.f63416F;
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C13921a0(16, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3502b2 = AbstractC1132b.m3502b(C2314t.f9131w, (Function1) objM87133R);
                    c28655q.m87150e0(1647472411);
                    if (this.f63418x) {
                        function1 = null;
                    } else {
                        c28655q.m87150e0(1647474877);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16016a(26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function1 = (Function1) objM87133R2;
                        c28655q.m87173q(false);
                    }
                    Function1 function4 = function1;
                    c28655q.m87173q(false);
                    C12991u0 c12991u1 = (C12991u0) this.f63420z;
                    c28655q.m87150e0(1647453570);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C16016a(27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function5 = (Function1) objM87133R3;
                    objM94759h = AbstractC30802r.m94759h(1647455938, c28655q, false);
                    if (objM94759h == c28676v0) {
                        objM94759h = new C16016a(28);
                        c28655q.m87172p0(objM94759h);
                    }
                    c28655q.m87173q(false);
                    AbstractC17269i.m48886d(c12991u1, this.f63419y, modifierM3502b2, null, function5, (Function1) objM94759h, null, null, function4, (Function1) this.f63415E, c28655q, 1769472, 408);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC23124k3.m67101e((InterfaceC4339a) this.f63420z, (Modifier) this.f63415E, this.f63418x, null, null, AbstractC37817c.m121344e(-1301085432, c28655q3, new C2647w2(18, (C27430e) this.f63416F, this.f63419y)), c28655q3, 1572864, 56);
                } else {
                    c28655q3.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C16499e0(boolean z4, C12991u0 c12991u0, String str, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f63418x = z4;
        this.f63420z = c12991u0;
        this.f63419y = str;
        this.f63415E = function1;
        this.f63416F = interfaceC28601c1;
    }
}
