package sn;

import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31552m1;
import p465rm.C31555n1;

/* JADX INFO: renamed from: sn.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C32749o extends AbstractC32741k {

    /* JADX INFO: renamed from: E */
    public static final Object f136190E = new Object();

    /* JADX INFO: renamed from: y */
    public final Object f136191y;

    /* JADX INFO: renamed from: z */
    public final Object f136192z;

    public C32749o(AbstractC31558o1 abstractC31558o1, Object obj, Object obj2) {
        super(abstractC31558o1);
        this.f136191y = obj;
        this.f136192z = obj2;
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: b */
    public final int mo97128b(Object obj) {
        Object obj2;
        if (f136190E.equals(obj) && (obj2 = this.f136192z) != null) {
            obj = obj2;
        }
        return this.f136120x.mo97128b(obj);
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: f */
    public final C31552m1 mo97131f(int i13, C31552m1 c31552m1, boolean z4) {
        this.f136120x.mo97131f(i13, c31552m1, z4);
        if (AbstractC24567y.m71670a(c31552m1.f130285x, this.f136192z) && z4) {
            c31552m1.f130285x = f136190E;
        }
        return c31552m1;
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: l */
    public final Object mo97135l(int i13) {
        Object objMo97135l = this.f136120x.mo97135l(i13);
        return AbstractC24567y.m71670a(objMo97135l, this.f136192z) ? f136190E : objMo97135l;
    }

    @Override // sn.AbstractC32741k, p465rm.AbstractC31558o1
    /* JADX INFO: renamed from: m */
    public final C31555n1 mo97136m(int i13, C31555n1 c31555n1, long j7) {
        this.f136120x.mo97136m(i13, c31555n1, j7);
        if (AbstractC24567y.m71670a(c31555n1.f130322w, this.f136191y)) {
            c31555n1.f130322w = C31555n1.f130306R;
        }
        return c31555n1;
    }
}
