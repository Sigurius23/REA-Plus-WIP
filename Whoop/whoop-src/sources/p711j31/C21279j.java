package p711j31;

import c93.InterfaceC4351m;
import java.util.List;
import p181h2.C16617b;
import p512u2.C34472r;

/* JADX INFO: renamed from: j31.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21279j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81265w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC21282m f81266x;

    public /* synthetic */ C21279j(AbstractC21282m abstractC21282m, int i13) {
        this.f81265w = i13;
        this.f81266x = abstractC21282m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f81265w) {
            case 0:
                return AbstractC21277h.b.a.m59714m(this.f81266x, (C34472r) obj, (C16617b) obj2);
            default:
                return Boolean.valueOf(AbstractC21282m.m59753Y(this.f81266x, (List) obj, (List) obj2));
        }
    }
}
