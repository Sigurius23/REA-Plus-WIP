package pg3;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.lang.reflect.Method;
import ud3.AbstractC34846v0;

/* JADX INFO: renamed from: pg3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29180d0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final Method f118153c;

    /* JADX INFO: renamed from: d */
    public final int f118154d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29201n f118155e;

    public C29180d0(Method method, int i13, InterfaceC29201n interfaceC29201n) {
        this.f118153c = method;
        this.f118154d = i13;
        this.f118155e = interfaceC29201n;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        int i13 = this.f118154d;
        Method method = this.f118153c;
        if (obj == null) {
            throw AbstractC29184e1.m88692n(method, i13, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c29212s0.f118224k = (AbstractC34846v0) this.f118155e.convert(obj);
        } catch (IOException e5) {
            throw AbstractC29184e1.m88693o(method, e5, i13, AbstractC18489d0.m53369j(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
