package hv2;

import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hv2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17684f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68588w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f68589x;

    public /* synthetic */ C17684f(Object obj, int i13) {
        this.f68588w = i13;
        this.f68589x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68588w) {
            case 0:
                return AbstractC17687i.m50462H0((Function1) this.f68589x, obj);
            case 1:
                return AbstractC17687i.m50482Y((Function1) this.f68589x, (String) obj);
            case 2:
                return AbstractC17687i.m50483Z((Function1) this.f68589x, (String) obj);
            default:
                return AbstractC17687i.m50503j0((InterfaceC28601c1) this.f68589x, (InterfaceC39147y) obj);
        }
    }
}
