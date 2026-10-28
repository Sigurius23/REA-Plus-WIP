package pg3;

import g40.C15331c1;
import java.lang.reflect.Method;
import java.util.Map;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: pg3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29186f0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f118163c;

    /* JADX INFO: renamed from: d */
    public final Method f118164d;

    /* JADX INFO: renamed from: e */
    public final int f118165e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC29201n f118166f;

    /* JADX INFO: renamed from: g */
    public final boolean f118167g;

    public /* synthetic */ C29186f0(Method method, int i13, InterfaceC29201n interfaceC29201n, boolean z4, int i14) {
        this.f118163c = i14;
        this.f118164d = method;
        this.f118165e = i13;
        this.f118166f = interfaceC29201n;
        this.f118167g = z4;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        switch (this.f118163c) {
            case 0:
                Map map = (Map) obj;
                int i13 = this.f118165e;
                Method method = this.f118164d;
                if (map == null) {
                    throw AbstractC29184e1.m88692n(method, i13, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC29184e1.m88692n(method, i13, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC29184e1.m88692n(method, i13, AbstractC11895b.m31996o("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    InterfaceC29201n interfaceC29201n = this.f118166f;
                    String str2 = (String) interfaceC29201n.convert(value);
                    if (str2 == null) {
                        throw AbstractC29184e1.m88692n(method, i13, "Field map value '" + value + "' converted to null by " + interfaceC29201n.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    C15331c1 c15331c1 = c29212s0.f118223j;
                    if (this.f118167g) {
                        c15331c1.m43542b(str, str2);
                    } else {
                        c15331c1.m43541a(str, str2);
                    }
                }
                return;
            default:
                Map map2 = (Map) obj;
                int i14 = this.f118165e;
                Method method2 = this.f118164d;
                if (map2 == null) {
                    throw AbstractC29184e1.m88692n(method2, i14, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw AbstractC29184e1.m88692n(method2, i14, "Query map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC29184e1.m88692n(method2, i14, AbstractC11895b.m31996o("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    InterfaceC29201n interfaceC29201n2 = this.f118166f;
                    String str4 = (String) interfaceC29201n2.convert(value2);
                    if (str4 == null) {
                        throw AbstractC29184e1.m88692n(method2, i14, "Query map value '" + value2 + "' converted to null by " + interfaceC29201n2.getClass().getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c29212s0.m88718b(str3, str4, this.f118167g);
                }
                return;
        }
    }
}
