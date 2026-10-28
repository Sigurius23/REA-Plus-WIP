package pg3;

import java.lang.reflect.Method;
import p715kotlin.jvm.internal.C22677k0;
import ud3.C34807d0;
import va3.AbstractC35844b;

/* JADX INFO: renamed from: pg3.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29192i0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f118178c;

    /* JADX INFO: renamed from: d */
    public final Method f118179d;

    /* JADX INFO: renamed from: e */
    public final int f118180e;

    public /* synthetic */ C29192i0(Method method, int i13, int i14) {
        this.f118178c = i14;
        this.f118179d = method;
        this.f118180e = i13;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        switch (this.f118178c) {
            case 0:
                C34807d0 c34807d0 = (C34807d0) obj;
                if (c34807d0 == null) {
                    throw AbstractC29184e1.m88692n(this.f118179d, this.f118180e, "Headers parameter must not be null.", new Object[0]);
                }
                C22677k0 c22677k0 = c29212s0.f118219f;
                c22677k0.getClass();
                int size = c34807d0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC35844b.m113761b(c22677k0, c34807d0.m109864c(i13), c34807d0.m109867g(i13));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC29184e1.m88692n(this.f118179d, this.f118180e, "@Url parameter is null.", new Object[0]);
                }
                c29212s0.f118216c = obj.toString();
                return;
        }
    }
}
