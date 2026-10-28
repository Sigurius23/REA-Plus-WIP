package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1213f0 {
    /* JADX INFO: renamed from: a */
    public static AbstractC1200b m3801a(long j7, Object obj) {
        AbstractC1200b abstractC1200b = (AbstractC1200b) ((InterfaceC1201b0) AbstractC1235m1.f5433c.m3883h(j7, obj));
        if (abstractC1200b.m3777c()) {
            return abstractC1200b;
        }
        C1266x0 c1266x0 = (C1266x0) abstractC1200b;
        int size = c1266x0.size();
        C1266x0 c1266x0M4018g = c1266x0.m4018g(size == 0 ? 10 : size * 2);
        AbstractC1235m1.m3929o(j7, obj, c1266x0M4018g);
        return c1266x0M4018g;
    }
}
