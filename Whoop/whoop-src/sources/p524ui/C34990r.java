package p524ui;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p426qi.C30387i;

/* JADX INFO: renamed from: ui.r */
/* JADX INFO: loaded from: classes.dex */
public final class C34990r implements InterfaceC34988p {

    /* JADX INFO: renamed from: E */
    public final C28612f0 f148045E;

    /* JADX INFO: renamed from: F */
    public final C28612f0 f148046F;

    /* JADX INFO: renamed from: w */
    public final C3058t f148047w = AbstractC3006f0.m8707a();

    /* JADX INFO: renamed from: x */
    public final C28633k1 f148048x = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: y */
    public final C28633k1 f148049y = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: z */
    public final C28612f0 f148050z;

    public C34990r() {
        AbstractC28683x.m87264r(new C34989q(this, 2));
        this.f148050z = AbstractC28683x.m87264r(new C34989q(this, 0));
        this.f148045E = AbstractC28683x.m87264r(new C34989q(this, 1));
        this.f148046F = AbstractC28683x.m87264r(new C34989q(this, 3));
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return (C30387i) this.f148048x.getValue();
    }
}
