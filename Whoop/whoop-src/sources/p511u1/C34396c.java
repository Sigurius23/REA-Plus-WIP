package p511u1;

import bd3.C3143v;
import m83.AbstractC25244f;
import p476s1.InterfaceC32057d;
import p540v1.C35523a;

/* JADX INFO: renamed from: u1.c */
/* JADX INFO: loaded from: classes.dex */
public class C34396c extends AbstractC25244f implements InterfaceC32057d {

    /* JADX INFO: renamed from: y */
    public static final C34396c f144601y = new C34396c(C34408o.f144623e, 0);

    /* JADX INFO: renamed from: w */
    public final C34408o f144602w;

    /* JADX INFO: renamed from: x */
    public final int f144603x;

    public C34396c(C34408o c34408o, int i13) {
        this.f144602w = c34408o;
        this.f144603x = i13;
    }

    @Override // p476s1.InterfaceC32057d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C34398e builder() {
        return new C34398e(this);
    }

    /* JADX INFO: renamed from: b */
    public final C34396c m108760b(Object obj, C35523a c35523a) {
        C3143v c3143vM108786u = this.f144602w.m108786u(obj, obj != null ? obj.hashCode() : 0, c35523a, 0);
        return c3143vM108786u == null ? this : new C34396c((C34408o) c3143vM108786u.f12311y, this.f144603x + c3143vM108786u.f12310x);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f144602w.m108770d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f144602w.m108773g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
