package aa3;

import ca3.C4384k;
import ca3.InterfaceC4385l;
import ea3.C12933d;
import ea3.C12936g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0606b1 {

    /* JADX INFO: renamed from: a */
    public int f2152a;

    /* JADX INFO: renamed from: b */
    public AbstractC0650r0 f2153b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2154c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public C0606b1 f2155d;

    /* JADX INFO: renamed from: e */
    public C0606b1 f2156e;

    /* JADX INFO: renamed from: f */
    public C0662x0 f2157f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2158g;

    public C0606b1(int i13) {
        this.f2152a = i13;
        InterfaceC4385l.f17711a.getClass();
        List listM13764a = C4384k.m13764a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM13764a, 10));
        Iterator it = listM13764a.iterator();
        while (it.hasNext()) {
            ((C12933d) ((InterfaceC4385l) it.next())).getClass();
            arrayList.add(new C12936g());
        }
        this.f2158g = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0650r0 m1615a() {
        AbstractC0650r0 abstractC0650r0 = this.f2153b;
        if (abstractC0650r0 != null) {
            return abstractC0650r0;
        }
        AbstractC22676k.m65757q("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0606b1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
        C0606b1 c0606b1 = (C0606b1) obj;
        return this.f2152a == c0606b1.f2152a && m1615a().equals(c0606b1.m1615a()) && AbstractC22676k.m65745e(this.f2154c, c0606b1.f2154c) && AbstractC22676k.m65745e(this.f2156e, c0606b1.f2156e) && AbstractC22676k.m65745e(this.f2155d, c0606b1.f2155d) && AbstractC22676k.m65745e(this.f2157f, c0606b1.f2157f) && AbstractC22676k.m65745e(this.f2158g, c0606b1.f2158g);
    }

    public final int hashCode() {
        return this.f2154c.hashCode() + ((m1615a().hashCode() + (this.f2152a * 31)) * 31);
    }
}
