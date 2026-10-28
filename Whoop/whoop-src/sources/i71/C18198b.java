package i71;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Li71/b;", "", "<init>", "()V", "Li71/e;", "type", "Li71/g;", "a", "(Li71/e;)Li71/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18198b {
    /* JADX INFO: renamed from: a */
    public final InterfaceC18203g m52258a(InterfaceC18201e type) {
        AbstractC22676k.m65750j(type, "type");
        if (type.equals(InterfaceC18201e.c.f70708a)) {
            return new C18205i();
        }
        if (type instanceof InterfaceC18201e.b) {
            return new C18202f(((InterfaceC18201e.b) type).getWindowSize());
        }
        if (type.equals(InterfaceC18201e.a.f70706a)) {
            return new C18197a(0, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
