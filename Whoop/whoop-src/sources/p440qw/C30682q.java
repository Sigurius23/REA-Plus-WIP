package p440qw;

import java.lang.reflect.Method;
import p133f1.C13968p1;

/* JADX INFO: renamed from: qw.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C30682q extends AbstractC30685t {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f126247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f126248c;

    public C30682q(Method method, int i13) {
        this.f126247b = method;
        this.f126248c = i13;
    }

    @Override // p440qw.AbstractC30685t
    /* JADX INFO: renamed from: a */
    public final Object mo94285a(Class cls) {
        String strM39746e = C13968p1.m39746e(cls);
        if (strM39746e != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM39746e));
        }
        return this.f126247b.invoke(null, cls, Integer.valueOf(this.f126248c));
    }
}
