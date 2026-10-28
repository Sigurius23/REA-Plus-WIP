package lb3;

import p715kotlin.jvm.internal.AbstractC22676k;
import s93.InterfaceC32307i;

/* JADX INFO: renamed from: lb3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C23793p extends AbstractC23812y0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC23812y0 f94176b;

    /* JADX INFO: renamed from: c */
    public final AbstractC23812y0 f94177c;

    public C23793p(AbstractC23812y0 abstractC23812y0, AbstractC23812y0 abstractC23812y1) {
        this.f94176b = abstractC23812y0;
        this.f94177c = abstractC23812y1;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: a */
    public final boolean mo69899a() {
        return this.f94176b.mo69899a() || this.f94177c.mo69899a();
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: b */
    public final boolean mo69900b() {
        return this.f94176b.mo69900b() || this.f94177c.mo69900b();
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: c */
    public final InterfaceC32307i mo69901c(InterfaceC32307i annotations) {
        AbstractC22676k.m65750j(annotations, "annotations");
        return this.f94177c.mo69901c(this.f94176b.mo69901c(annotations));
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo64119d(AbstractC23811y abstractC23811y) {
        AbstractC23804u0 abstractC23804u0Mo64119d = this.f94176b.mo64119d(abstractC23811y);
        return abstractC23804u0Mo64119d == null ? this.f94177c.mo64119d(abstractC23811y) : abstractC23804u0Mo64119d;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: f */
    public final AbstractC23811y mo69902f(AbstractC23811y topLevelType, EnumC23776g1 position) {
        AbstractC22676k.m65750j(topLevelType, "topLevelType");
        AbstractC22676k.m65750j(position, "position");
        return this.f94177c.mo69902f(this.f94176b.mo69902f(topLevelType, position), position);
    }
}
