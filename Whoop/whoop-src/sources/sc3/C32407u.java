package sc3;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc3.C30256l0;

/* JADX INFO: renamed from: sc3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C32407u extends AbstractC32387a {

    /* JADX INFO: renamed from: a */
    public final C32404r f134153a;

    /* JADX INFO: renamed from: b */
    public final String f134154b;

    /* JADX INFO: renamed from: c */
    public final Integer f134155c;

    /* JADX INFO: renamed from: d */
    public final C30256l0 f134156d;

    /* JADX INFO: renamed from: e */
    public final int f134157e;

    public C32407u(C32404r c32404r, int i13, C30256l0 c30256l0, int i14) {
        int i15;
        String name = c32404r.f134149b;
        Integer num = (i14 & 16) != 0 ? null : 0;
        c30256l0 = (i14 & 32) != 0 ? null : c30256l0;
        AbstractC22676k.m65750j(name, "name");
        this.f134153a = c32404r;
        this.f134154b = name;
        this.f134155c = num;
        this.f134156d = c30256l0;
        if (i13 < 10) {
            i15 = 1;
        } else if (i13 < 100) {
            i15 = 2;
        } else {
            if (i13 >= 1000) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Max value ", " is too large"));
            }
            i15 = 3;
        }
        this.f134157e = i15;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: a */
    public final C32404r mo100962a() {
        return this.f134153a;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: b */
    public final Object mo100963b() {
        return this.f134155c;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: c */
    public final String mo100964c() {
        return this.f134154b;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: d */
    public final C30256l0 mo100965d() {
        return this.f134156d;
    }
}
