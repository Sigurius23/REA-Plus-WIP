package mb3;

import lb3.AbstractC23763c0;
import lb3.AbstractC23790n0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23794p0;
import lb3.EnumC23776g1;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C25384a extends AbstractC23790n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC25385b f99470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C23758a1 f99471b;

    public C25384a(InterfaceC25385b interfaceC25385b, C23758a1 c23758a1) {
        this.f99470a = interfaceC25385b;
        this.f99471b = c23758a1;
    }

    @Override // p477s2.AbstractC32073e
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC27798h mo69898i0(C23794p0 state, InterfaceC27797g type) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(type, "type");
        InterfaceC25385b interfaceC25385b = this.f99470a;
        AbstractC23763c0 abstractC23763c0Mo74456L = interfaceC25385b.mo74456L(this.f99471b.m69822g((AbstractC23811y) interfaceC25385b.mo74557f(type), EnumC23776g1.INVARIANT));
        AbstractC22676k.m65747g(abstractC23763c0Mo74456L);
        return abstractC23763c0Mo74456L;
    }
}
