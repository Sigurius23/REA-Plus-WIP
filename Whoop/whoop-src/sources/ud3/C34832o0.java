package ud3;

import j93.InterfaceC21461d;
import l83.C23465k;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import wd3.C37167a;

/* JADX INFO: renamed from: ud3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34832o0 {

    /* JADX INFO: renamed from: a */
    public final C34810e0 f146712a;

    /* JADX INFO: renamed from: b */
    public final String f146713b;

    /* JADX INFO: renamed from: c */
    public final C34807d0 f146714c;

    /* JADX INFO: renamed from: d */
    public final AbstractC34846v0 f146715d;

    /* JADX INFO: renamed from: e */
    public final AbstractC35745c f146716e;

    /* JADX INFO: renamed from: f */
    public C34817h f146717f;

    public C34832o0(C34830n0 builder) {
        AbstractC22676k.m65750j(builder, "builder");
        C34810e0 c34810e0 = builder.f146687a;
        if (c34810e0 == null) {
            throw new IllegalStateException("url == null");
        }
        this.f146712a = c34810e0;
        this.f146713b = builder.f146688b;
        this.f146714c = builder.f146689c.m65766g();
        this.f146715d = builder.f146690d;
        this.f146716e = builder.f146691e;
    }

    /* JADX INFO: renamed from: a */
    public final C34817h m109906a() {
        C34817h c34817h = this.f146717f;
        if (c34817h != null) {
            return c34817h;
        }
        C34817h c34817h2 = C34817h.f146574n;
        C34817h c34817hM92093O = AbstractC30060g.m92093O(this.f146714c);
        this.f146717f = c34817hM92093O;
        return c34817hM92093O;
    }

    /* JADX INFO: renamed from: b */
    public final C34830n0 m109907b() {
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.f146687a = this.f146712a;
        c34830n0.f146688b = this.f146713b;
        c34830n0.f146690d = this.f146715d;
        c34830n0.f146691e = this.f146716e;
        c34830n0.f146689c = this.f146714c.m109865d();
        return c34830n0;
    }

    /* JADX INFO: renamed from: c */
    public final Object m109908c(Class cls) {
        InterfaceC21461d type = AbstractC21598x.m60666V(cls);
        AbstractC22676k.m65750j(type, "type");
        return AbstractC21598x.m60663S(type).cast(this.f146716e.mo113252d(type));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(32);
        sb4.append("Request{method=");
        sb4.append(this.f146713b);
        sb4.append(", url=");
        sb4.append(this.f146712a);
        C34807d0 c34807d0 = this.f146714c;
        if (c34807d0.size() != 0) {
            sb4.append(", headers=[");
            int i13 = 0;
            for (Object obj : c34807d0) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C23465k c23465k = (C23465k) obj;
                String str = (String) c23465k.f92937w;
                String str2 = (String) c23465k.f92938x;
                if (i13 > 0) {
                    sb4.append(", ");
                }
                sb4.append(str);
                sb4.append(':');
                if (AbstractC37172f.m119128m(str)) {
                    str2 = "██";
                }
                sb4.append(str2);
                i13 = i14;
            }
            sb4.append(']');
        }
        C37167a c37167a = C37167a.f158950a;
        AbstractC35745c abstractC35745c = this.f146716e;
        if (!AbstractC22676k.m65745e(abstractC35745c, c37167a)) {
            sb4.append(", tags=");
            sb4.append(abstractC35745c);
        }
        sb4.append('}');
        return sb4.toString();
    }
}
