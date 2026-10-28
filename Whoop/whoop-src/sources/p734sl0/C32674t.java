package p734sl0;

import bc3.InterfaceC2994c0;
import nl0.AbstractC26802d;
import p027b3.InterfaceC2355b3;
import p163g1.C15199y3;
import p181h2.C16617b;
import p294l3.C23254g;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32674t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135570w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135571x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135572y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f135573z;

    public /* synthetic */ C32674t(InterfaceC2994c0 interfaceC2994c0, C32659q c32659q, C15199y3 c15199y3) {
        this.f135570w = 1;
        this.f135571x = interfaceC2994c0;
        this.f135572y = c32659q;
        this.f135573z = c15199y3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135570w) {
            case 0:
                return AbstractC32686w.m102510P((InterfaceC2994c0) this.f135571x, (C15199y3) this.f135573z, (C32659q) this.f135572y, (AbstractC26802d) obj);
            case 1:
                return AbstractC32686w.m102511Q((InterfaceC2994c0) this.f135571x, (C32659q) this.f135572y, (C15199y3) this.f135573z, (AbstractC26802d) obj);
            default:
                return AbstractC32637l2.b.m101990b((InterfaceC28601c1) this.f135571x, (C23254g) this.f135573z, (InterfaceC2355b3) this.f135572y, (C16617b) obj);
        }
    }

    public /* synthetic */ C32674t(Object obj, Object obj2, Object obj3, int i13) {
        this.f135570w = i13;
        this.f135571x = obj;
        this.f135573z = obj2;
        this.f135572y = obj3;
    }
}
