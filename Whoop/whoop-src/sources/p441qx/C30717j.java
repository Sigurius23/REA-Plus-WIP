package p441qx;

import java.lang.reflect.Method;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: qx.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C30717j extends AbstractC34235f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f126487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f126488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f126489c;

    public C30717j(Method method, Class cls, int i13) {
        this.f126487a = method;
        this.f126488b = cls;
        this.f126489c = i13;
    }

    @Override // p507tx.AbstractC34235f
    /* JADX INFO: renamed from: U */
    public final Object mo94384U() {
        return this.f126487a.invoke(null, this.f126488b, Integer.valueOf(this.f126489c));
    }

    public final String toString() {
        return this.f126488b.getName();
    }
}
