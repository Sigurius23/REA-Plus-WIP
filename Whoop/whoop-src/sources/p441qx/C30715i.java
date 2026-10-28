package p441qx;

import java.lang.reflect.Method;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: qx.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C30715i extends AbstractC34235f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f126482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f126483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f126484c;

    public C30715i(Method method, Object obj, Class cls) {
        this.f126482a = method;
        this.f126483b = obj;
        this.f126484c = cls;
    }

    @Override // p507tx.AbstractC34235f
    /* JADX INFO: renamed from: U */
    public final Object mo94384U() {
        return this.f126482a.invoke(this.f126483b, this.f126484c);
    }

    public final String toString() {
        return this.f126484c.getName();
    }
}
