package p272k4;

import java.util.Iterator;
import p108e4.C12685s;
import p242j4.C21302b;
import p242j4.C21307g;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22177a extends C21307g {

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ int f86000n0;

    /* JADX INFO: renamed from: o0 */
    public final float f86001o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22177a(C12685s c12685s, int i13) {
        super(c12685s, 4);
        this.f86000n0 = i13;
        this.f86001o0 = 0.5f;
    }

    @Override // p242j4.C21307g, p242j4.C21302b, p242j4.InterfaceC21308h
    public final void apply() {
        switch (this.f86000n0) {
            case 0:
                Iterator it = this.f81472m0.iterator();
                while (it.hasNext()) {
                    C21302b c21302bM35492b = this.f81470k0.m35492b(it.next());
                    c21302bM35492b.m59815g();
                    Object obj = this.f81400N;
                    if (obj != null) {
                        c21302bM35492b.m59823o(obj);
                    } else {
                        Object obj2 = this.f81401O;
                        if (obj2 != null) {
                            c21302bM35492b.f81432j0 = 6;
                            c21302bM35492b.f81401O = obj2;
                        } else {
                            c21302bM35492b.m59823o(0);
                        }
                    }
                    Object obj3 = this.f81402P;
                    if (obj3 != null) {
                        c21302bM35492b.f81432j0 = 7;
                        c21302bM35492b.f81402P = obj3;
                    } else {
                        Object obj4 = this.f81403Q;
                        if (obj4 != null) {
                            c21302bM35492b.m59817i(obj4);
                        } else {
                            c21302bM35492b.m59817i(0);
                        }
                    }
                    float f13 = this.f86001o0;
                    if (f13 != 0.5f) {
                        c21302bM35492b.f81427h = f13;
                    }
                }
                break;
            default:
                Iterator it3 = this.f81472m0.iterator();
                while (it3.hasNext()) {
                    C21302b c21302bM35492b2 = this.f81470k0.m35492b(it3.next());
                    c21302bM35492b2.m59816h();
                    Object obj5 = this.f81404R;
                    if (obj5 != null) {
                        c21302bM35492b2.m59824p(obj5);
                    } else {
                        Object obj6 = this.f81405S;
                        if (obj6 != null) {
                            c21302bM35492b2.f81432j0 = 10;
                            c21302bM35492b2.f81405S = obj6;
                        } else {
                            c21302bM35492b2.m59824p(0);
                        }
                    }
                    Object obj7 = this.f81407U;
                    if (obj7 != null) {
                        c21302bM35492b2.f81432j0 = 12;
                        c21302bM35492b2.f81407U = obj7;
                    } else {
                        Object obj8 = this.f81408V;
                        if (obj8 != null) {
                            c21302bM35492b2.m59813e(obj8);
                        } else {
                            c21302bM35492b2.m59813e(0);
                        }
                    }
                    float f14 = this.f86001o0;
                    if (f14 != 0.5f) {
                        c21302bM35492b2.f81429i = f14;
                    }
                }
                break;
        }
    }
}
