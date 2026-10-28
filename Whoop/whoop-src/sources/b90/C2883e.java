package b90;

import kw1.AbstractC22859j;
import l83.C23454a0;
import lw1.C24773i;
import m80.AbstractC25222d;
import p294l3.C23254g;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w80.AbstractC36941b;

/* JADX INFO: renamed from: b90.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2883e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f11470x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f11471y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f11472z;

    public /* synthetic */ C2883e(int i13, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f11469w = i13;
        this.f11470x = function1;
        this.f11471y = interfaceC28601c1;
        this.f11472z = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11469w) {
            case 0:
                return AbstractC2884f.m8375w(this.f11470x, this.f11471y, this.f11472z, (String) obj);
            case 1:
                return AbstractC12123j.m33528B(this.f11470x, this.f11471y, this.f11472z, obj);
            case 2:
                return AbstractC22859j.m66387w(this.f11470x, this.f11471y, this.f11472z, (C24773i) obj);
            case 3:
                return AbstractC25222d.m73900y(this.f11470x, this.f11471y, this.f11472z, (String) obj);
            case 4:
                C29891y c29891y = (C29891y) obj;
                this.f11471y.setValue(c29891y);
                InterfaceC28601c1 interfaceC28601c1 = this.f11472z;
                boolean zM65745e = AbstractC22676k.m65745e((String) interfaceC28601c1.getValue(), c29891y.f122125a.f92135x);
                C23254g c23254g = c29891y.f122125a;
                interfaceC28601c1.setValue(c23254g.f92135x);
                if (!zM65745e) {
                    this.f11470x.invoke(c23254g.f92135x);
                }
                return C23454a0.f92919a;
            default:
                return AbstractC36941b.m118556A(this.f11470x, this.f11471y, this.f11472z, (String) obj);
        }
    }
}
