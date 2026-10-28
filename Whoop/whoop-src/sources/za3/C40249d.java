package za3;

import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import lb3.EnumC23776g1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s93.InterfaceC32307i;
import va3.AbstractC35844b;

/* JADX INFO: renamed from: za3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C40249d extends AbstractC23812y0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC23812y0 f174041b;

    public C40249d(AbstractC23812y0 abstractC23812y0) {
        this.f174041b = abstractC23812y0;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: a */
    public final boolean mo69899a() {
        return this.f174041b.mo69899a();
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: b */
    public final boolean mo69900b() {
        return true;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: c */
    public final InterfaceC32307i mo69901c(InterfaceC32307i annotations) {
        AbstractC22676k.m65750j(annotations, "annotations");
        return this.f174041b.mo69901c(annotations);
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo64119d(AbstractC23811y abstractC23811y) {
        AbstractC23804u0 abstractC23804u0Mo64119d = this.f174041b.mo64119d(abstractC23811y);
        if (abstractC23804u0Mo64119d == null) {
            return null;
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        return AbstractC35844b.m113762c(abstractC23804u0Mo64119d, interfaceC31126hMo1784d instanceof InterfaceC31165x0 ? (InterfaceC31165x0) interfaceC31126hMo1784d : null);
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: e */
    public final boolean mo69908e() {
        return this.f174041b.mo69908e();
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: f */
    public final AbstractC23811y mo69902f(AbstractC23811y topLevelType, EnumC23776g1 position) {
        AbstractC22676k.m65750j(topLevelType, "topLevelType");
        AbstractC22676k.m65750j(position, "position");
        return this.f174041b.mo69902f(topLevelType, position);
    }
}
