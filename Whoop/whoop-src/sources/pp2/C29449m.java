package pp2;

import p164g2.InterfaceC15237i;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pp2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29449m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119584w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f119585x;

    public /* synthetic */ C29449m(Object obj, int i13) {
        this.f119584w = i13;
        this.f119585x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119584w) {
            case 0:
                return AbstractC29450n.a.m89906b((InterfaceC15237i) this.f119585x, (C16617b) obj);
            default:
                return AbstractC29441e.m89841p((InterfaceC28601c1) this.f119585x, (String) obj);
        }
    }
}
