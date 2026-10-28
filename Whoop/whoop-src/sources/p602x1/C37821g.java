package p602x1;

import bd3.C3143v;
import p390p1.AbstractC28669t1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28682w2;
import p476s1.InterfaceC32056c;
import p511u1.C34396c;
import p511u1.C34398e;
import p511u1.C34408o;

/* JADX INFO: renamed from: x1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C37821g extends C34396c implements InterfaceC28653p1 {

    /* JADX INFO: renamed from: z */
    public static final C37821g f161967z = new C37821g(C34408o.f144623e, 0);

    @Override // p511u1.C34396c
    /* JADX INFO: renamed from: a */
    public final C34398e builder() {
        C37820f c37820f = new C37820f(this);
        c37820f.f161966G = this;
        return c37820f;
    }

    @Override // p511u1.C34396c, p476s1.InterfaceC32057d
    public final InterfaceC32056c builder() {
        C37820f c37820f = new C37820f(this);
        c37820f.f161966G = this;
        return c37820f;
    }

    /* JADX INFO: renamed from: c */
    public final C37821g m121348c(AbstractC28669t1 abstractC28669t1, InterfaceC28682w2 interfaceC28682w2) {
        C3143v c3143vM108786u = this.f144602w.m108786u(abstractC28669t1, abstractC28669t1.hashCode(), interfaceC28682w2, 0);
        return c3143vM108786u == null ? this : new C37821g((C34408o) c3143vM108786u.f12311y, this.f144603x + c3143vM108786u.f12310x);
    }

    @Override // p511u1.C34396c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC28669t1) {
            return super.containsKey((AbstractC28669t1) obj);
        }
        return false;
    }

    @Override // m83.AbstractC25244f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC28682w2) {
            return super.containsValue((InterfaceC28682w2) obj);
        }
        return false;
    }

    @Override // p511u1.C34396c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC28669t1) {
            return (InterfaceC28682w2) super.get((AbstractC28669t1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC28669t1) ? obj2 : (InterfaceC28682w2) super.getOrDefault((AbstractC28669t1) obj, (InterfaceC28682w2) obj2);
    }
}
