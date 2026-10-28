package p476s1;

import java.util.List;
import m83.AbstractC25242e;
import p491t1.AbstractC33272c;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: s1.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C32054a extends AbstractC25242e {

    /* JADX INFO: renamed from: w */
    public final AbstractC33272c f132951w;

    /* JADX INFO: renamed from: x */
    public final int f132952x;

    /* JADX INFO: renamed from: y */
    public final int f132953y;

    public C32054a(AbstractC33272c abstractC33272c, int i13, int i14) {
        this.f132951w = abstractC33272c;
        this.f132952x = i13;
        AbstractC35744b.m113231d(i13, i14, abstractC33272c.mo73980a());
        this.f132953y = i14 - i13;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f132953y;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC35744b.m113229b(i13, this.f132953y);
        return this.f132951w.get(this.f132952x + i13);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final List subList(int i13, int i14) {
        AbstractC35744b.m113231d(i13, i14, this.f132953y);
        int i15 = this.f132952x;
        return new C32054a(this.f132951w, i13 + i15, i15 + i14);
    }
}
