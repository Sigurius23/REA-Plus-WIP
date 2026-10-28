package pg3;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import l83.C23454a0;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;

/* JADX INFO: renamed from: pg3.b */
/* JADX INFO: loaded from: classes5.dex */
public class C29173b implements InterfaceC29201n {

    /* JADX INFO: renamed from: x */
    public static final C29173b f118133x = new C29173b(0);

    /* JADX INFO: renamed from: y */
    public static final C29173b f118134y = new C29173b(1);

    /* JADX INFO: renamed from: z */
    public static final C29173b f118135z = new C29173b(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118136w;

    public /* synthetic */ C29173b(int i13) {
        this.f118136w = i13;
    }

    /* JADX INFO: renamed from: a */
    public List mo88667a(Executor executor) {
        return Collections.singletonList(new C29209r(executor));
    }

    /* JADX INFO: renamed from: b */
    public List mo88668b() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: c */
    public String mo88669c(Method method, int i13) {
        return "parameter #" + (i13 + 1);
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        switch (this.f118136w) {
            case 0:
                return (AbstractC34846v0) obj;
            case 1:
                return obj.toString();
            default:
                ((AbstractC34799a1) obj).close();
                return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public Object mo88670d(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo88671e(Method method) {
        return false;
    }
}
