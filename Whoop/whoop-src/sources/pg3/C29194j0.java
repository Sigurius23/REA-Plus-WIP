package pg3;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p088dc.AbstractC11895b;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: pg3.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29194j0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f118183c = 1;

    /* JADX INFO: renamed from: d */
    public final Method f118184d;

    /* JADX INFO: renamed from: e */
    public final int f118185e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC29201n f118186f;

    /* JADX INFO: renamed from: g */
    public final Object f118187g;

    public C29194j0(Method method, int i13, InterfaceC29201n interfaceC29201n, String str) {
        this.f118184d = method;
        this.f118185e = i13;
        this.f118186f = interfaceC29201n;
        this.f118187g = str;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        int i13 = this.f118183c;
        InterfaceC29201n interfaceC29201n = this.f118186f;
        Object obj2 = this.f118187g;
        Method method = this.f118184d;
        int i14 = this.f118185e;
        switch (i13) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    AbstractC34846v0 abstractC34846v0 = (AbstractC34846v0) interfaceC29201n.convert(obj);
                    c29212s0.f118222i.m91559e((C34807d0) obj2, abstractC34846v0);
                    return;
                } catch (IOException e5) {
                    throw AbstractC29184e1.m88692n(method, i14, AbstractC18489d0.m53369j(obj, "Unable to convert ", " to RequestBody"), e5);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC29184e1.m88692n(method, i14, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC29184e1.m88692n(method, i14, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC29184e1.m88692n(method, i14, AbstractC11895b.m31996o("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", AbstractC11895b.m31996o("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    C34807d0 c34807d0 = C34807d0.f146547x;
                    c29212s0.f118222i.m91559e(AbstractC37056f.m118965R(strArr), (AbstractC34846v0) interfaceC29201n.convert(value));
                }
                return;
        }
    }

    public C29194j0(Method method, int i13, C34807d0 c34807d0, InterfaceC29201n interfaceC29201n) {
        this.f118184d = method;
        this.f118185e = i13;
        this.f118187g = c34807d0;
        this.f118186f = interfaceC29201n;
    }
}
