package oa3;

import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oa3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27758a implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C27758a f111937x = new C27758a(0);

    /* JADX INFO: renamed from: y */
    public static final C27758a f111938y = new C27758a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111939w;

    public /* synthetic */ C27758a(int i13) {
        this.f111939w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C27761d loadConstantFromProperty = (C27761d) obj;
        C27775r it = (C27775r) obj2;
        switch (this.f111939w) {
            case 0:
                AbstractC22676k.m65750j(loadConstantFromProperty, "$this$loadConstantFromProperty");
                AbstractC22676k.m65750j(it, "it");
                return loadConstantFromProperty.f111947c.get(it);
            default:
                AbstractC22676k.m65750j(loadConstantFromProperty, "$this$loadConstantFromProperty");
                AbstractC22676k.m65750j(it, "it");
                return loadConstantFromProperty.f111946b.get(it);
        }
    }
}
