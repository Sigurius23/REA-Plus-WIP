package lb3;

import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23798r0 extends AbstractC23800s0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f94189c;

    public C23798r0(Map map) {
        this.f94189c = map;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: a */
    public final boolean mo69899a() {
        return false;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: e */
    public final boolean mo69908e() {
        return this.f94189c.isEmpty();
    }

    @Override // lb3.AbstractC23800s0
    /* JADX INFO: renamed from: g */
    public final AbstractC23804u0 mo69873g(InterfaceC23796q0 key) {
        AbstractC22676k.m65750j(key, "key");
        return (AbstractC23804u0) this.f94189c.get(key);
    }
}
