package p114eb;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: eb.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12999y0 {

    /* JADX INFO: renamed from: b */
    public boolean f44915b;

    /* JADX INFO: renamed from: c */
    public boolean f44916c;

    /* JADX INFO: renamed from: e */
    public String f44918e;

    /* JADX INFO: renamed from: f */
    public boolean f44919f;

    /* JADX INFO: renamed from: g */
    public boolean f44920g;

    /* JADX INFO: renamed from: a */
    public final C12995w0 f44914a = new C12995w0();

    /* JADX INFO: renamed from: d */
    public int f44917d = -1;

    /* JADX INFO: renamed from: a */
    public final void m36509a(int i13, Function1 function1) {
        this.f44917d = i13;
        this.f44919f = false;
        C12970k1 c12970k1 = new C12970k1();
        function1.invoke(c12970k1);
        this.f44919f = c12970k1.f44796a;
        this.f44920g = c12970k1.f44797b;
    }

    /* JADX INFO: renamed from: b */
    public final void m36510b(String route, Function1 function1) {
        AbstractC22676k.m65750j(route, "route");
        if (AbstractC39414r.m125890i0(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f44918e = route;
        this.f44917d = -1;
        this.f44919f = false;
        C12970k1 c12970k1 = new C12970k1();
        function1.invoke(c12970k1);
        this.f44919f = c12970k1.f44796a;
        this.f44920g = c12970k1.f44797b;
    }
}
