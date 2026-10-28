package p440qw;

import java.lang.reflect.Method;
import p133f1.C13968p1;

/* JADX INFO: renamed from: qw.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C30681p extends AbstractC30685t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f126245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f126246c;

    public C30681p(Method method, Object obj) {
        this.f126245b = method;
        this.f126246c = obj;
    }

    @Override // p440qw.AbstractC30685t
    /* JADX INFO: renamed from: a */
    public final Object mo94285a(Class cls) {
        String strM39746e = C13968p1.m39746e(cls);
        if (strM39746e != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM39746e));
        }
        return this.f126245b.invoke(this.f126246c, cls);
    }
}
