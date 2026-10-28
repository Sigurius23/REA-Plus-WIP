package p440qw;

import java.lang.reflect.Method;
import p133f1.C13968p1;

/* JADX INFO: renamed from: qw.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C30683r extends AbstractC30685t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f126249b;

    public C30683r(Method method) {
        this.f126249b = method;
    }

    @Override // p440qw.AbstractC30685t
    /* JADX INFO: renamed from: a */
    public final Object mo94285a(Class cls) {
        String strM39746e = C13968p1.m39746e(cls);
        if (strM39746e != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM39746e));
        }
        return this.f126249b.invoke(null, cls, Object.class);
    }
}
