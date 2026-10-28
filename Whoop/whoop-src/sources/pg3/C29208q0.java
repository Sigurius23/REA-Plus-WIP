package pg3;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: pg3.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29208q0 extends C29173b {
    public C29208q0() {
        super(4);
    }

    @Override // pg3.C29173b
    /* JADX INFO: renamed from: c */
    public final String mo88669c(Method method, int i13) {
        Parameter parameter = method.getParameters()[i13];
        if (!parameter.isNamePresent()) {
            return super.mo88669c(method, i13);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // pg3.C29173b
    /* JADX INFO: renamed from: d */
    public final Object mo88670d(Method method, Class cls, Object obj, Object[] objArr) {
        return AbstractC34870c0.m109988Y(method, cls, obj, objArr);
    }

    @Override // pg3.C29173b
    /* JADX INFO: renamed from: e */
    public final boolean mo88671e(Method method) {
        return method.isDefault();
    }
}
