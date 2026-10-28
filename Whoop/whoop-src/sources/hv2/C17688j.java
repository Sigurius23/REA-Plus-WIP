package hv2;

import c93.InterfaceC4339a;
import p027b3.InterfaceC2464x2;
import p329n0.C26068u;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: hv2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17688j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f68626x;

    public /* synthetic */ C17688j(Object obj, int i13) {
        this.f68625w = i13;
        this.f68626x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f68625w) {
            case 0:
                return Boolean.valueOf(AbstractC17687i.k.m50545h((C26068u) this.f68626x));
            case 1:
                return AbstractC17687i.m50477T((InterfaceC4339a) this.f68626x);
            case 2:
                return AbstractC17687i.m50471N((C17679a) this.f68626x);
            case 3:
                return AbstractC17687i.m50529w0((InterfaceC2464x2) this.f68626x);
            default:
                return AbstractC17687i.m50509m0((InterfaceC28601c1) this.f68626x);
        }
    }
}
