package p077d0;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import h01.AbstractC16549p;
import h01.AbstractC16559z;
import h01.C16534a0;
import h01.C16550q;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p411q2.InterfaceC29805a;
import p715kotlin.jvm.functions.Function1;
import p741vn1.AbstractC36203g;
import un1.AbstractC35101g;

/* JADX INFO: renamed from: d0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11377m0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36474E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36475w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36476x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36477y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36478z;

    public /* synthetic */ C11377m0(Number number, C11365j0 c11365j0, Number number2, C11361i0 c11361i0) {
        this.f36475w = 0;
        this.f36476x = number;
        this.f36478z = c11365j0;
        this.f36477y = number2;
        this.f36474E = c11361i0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f36475w) {
            case 0:
                Number number = (Number) this.f36476x;
                C11365j0 c11365j0 = (C11365j0) this.f36478z;
                Number number2 = (Number) this.f36477y;
                C11361i0 c11361i0 = (C11361i0) this.f36474E;
                if (!number.equals(c11365j0.f36430w) || !number2.equals(c11365j0.f36431x)) {
                    c11365j0.f36430w = number;
                    c11365j0.f36431x = number2;
                    c11365j0.f36425E = new C11390p1(c11361i0, c11365j0.f36432y, number, number2, null);
                    c11365j0.f36429I.f36454b.setValue(Boolean.TRUE);
                    c11365j0.f36426F = false;
                    c11365j0.f36427G = true;
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC16549p.m46758L((Function1) this.f36476x, (C16550q) this.f36477y, (String) this.f36478z, (InterfaceC28601c1) this.f36474E);
            case 2:
                return AbstractC16559z.m46876r((Function1) this.f36476x, (C16534a0) this.f36477y, (String) this.f36478z, (InterfaceC28601c1) this.f36474E);
            default:
                return AbstractC35101g.m111018A((AbstractC36203g.c) this.f36476x, (Function1) this.f36477y, (InterfaceC4351m) this.f36478z, (InterfaceC29805a) this.f36474E);
        }
    }

    public /* synthetic */ C11377m0(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f36475w = i13;
        this.f36476x = obj;
        this.f36477y = obj2;
        this.f36478z = obj3;
        this.f36474E = obj4;
    }
}
