package pg3;

import java.lang.reflect.Method;
import java.util.Map;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: pg3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29190h0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final Method f118172c;

    /* JADX INFO: renamed from: d */
    public final int f118173d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29201n f118174e;

    /* JADX INFO: renamed from: f */
    public final boolean f118175f;

    public C29190h0(Method method, int i13, InterfaceC29201n interfaceC29201n, boolean z4) {
        this.f118172c = method;
        this.f118173d = i13;
        this.f118174e = interfaceC29201n;
        this.f118175f = z4;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        Map map = (Map) obj;
        int i13 = this.f118173d;
        Method method = this.f118172c;
        if (map == null) {
            throw AbstractC29184e1.m88692n(method, i13, "Header map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw AbstractC29184e1.m88692n(method, i13, "Header map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw AbstractC29184e1.m88692n(method, i13, AbstractC11895b.m31996o("Header map contained null value for key '", str, "'."), new Object[0]);
            }
            c29212s0.m88717a(str, (String) this.f118174e.convert(value), this.f118175f);
        }
    }
}
