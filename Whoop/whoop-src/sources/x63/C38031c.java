package x63;

import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: renamed from: x63.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C38031c extends C22686q {

    /* JADX INFO: renamed from: w */
    public static final C38031c f162934w = new C38031c(AbstractC38032d.class, "top", "getTop()J", 0);

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21490w
    public final Object get(Object obj) {
        return Long.valueOf(((AbstractC38032d) obj).top);
    }

    @Override // p715kotlin.jvm.internal.C22686q, j93.InterfaceC21477l
    public final void set(Object obj, Object obj2) {
        ((AbstractC38032d) obj).top = ((Number) obj2).longValue();
    }
}
