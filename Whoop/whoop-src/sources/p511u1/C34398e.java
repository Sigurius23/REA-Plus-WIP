package p511u1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25250i;
import p476s1.InterfaceC32056c;
import p569w1.C36687a;
import p569w1.C36688b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u1.e */
/* JADX INFO: loaded from: classes.dex */
public class C34398e extends AbstractC25250i implements InterfaceC32056c {

    /* JADX INFO: renamed from: E */
    public int f144607E;

    /* JADX INFO: renamed from: F */
    public int f144608F;

    /* JADX INFO: renamed from: w */
    public C34396c f144609w;

    /* JADX INFO: renamed from: x */
    public C36688b f144610x = new C36688b();

    /* JADX INFO: renamed from: y */
    public C34408o f144611y;

    /* JADX INFO: renamed from: z */
    public Object f144612z;

    public C34398e(C34396c c34396c) {
        this.f144609w = c34396c;
        this.f144611y = c34396c.f144602w;
        this.f144608F = c34396c.f144603x;
    }

    @Override // m83.AbstractC25250i
    /* JADX INFO: renamed from: a */
    public final Set mo74009a() {
        return new C34400g(this, 0);
    }

    @Override // m83.AbstractC25250i
    /* JADX INFO: renamed from: b */
    public final Set mo74010b() {
        return new C34400g(this, 1);
    }

    @Override // m83.AbstractC25250i
    /* JADX INFO: renamed from: c */
    public final int mo74011c() {
        return this.f144608F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f144611y = C34408o.f144623e;
        m108764g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f144611y.m108770d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // m83.AbstractC25250i
    /* JADX INFO: renamed from: d */
    public final Collection mo74012d() {
        return new C34402i(this);
    }

    @Override // p476s1.InterfaceC32056c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C34396c build() {
        C34408o c34408o = this.f144611y;
        C34396c c34396c = this.f144609w;
        if (c34408o != c34396c.f144602w) {
            this.f144610x = new C36688b();
            c34396c = new C34396c(this.f144611y, mo74011c());
        }
        this.f144609w = c34396c;
        return c34396c;
    }

    /* JADX INFO: renamed from: g */
    public final void m108764g(int i13) {
        this.f144608F = i13;
        this.f144607E++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f144611y.m108773g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f144612z = null;
        this.f144611y = this.f144611y.m108777l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f144612z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C34396c c34396cBuild = null;
        C34396c c34396c = map instanceof C34396c ? (C34396c) map : null;
        if (c34396c == null) {
            C34398e c34398e = map instanceof C34398e ? (C34398e) map : null;
            if (c34398e != null) {
                c34396cBuild = c34398e.build();
            }
        } else {
            c34396cBuild = c34396c;
        }
        if (c34396cBuild == null) {
            super.putAll(map);
            return;
        }
        C36687a c36687a = new C36687a();
        c36687a.f157124a = 0;
        int i13 = this.f144608F;
        C34408o c34408o = this.f144611y;
        C34408o c34408o2 = c34396cBuild.f144602w;
        AbstractC22676k.m65748h(c34408o2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f144611y = c34408o.m108778m(c34408o2, 0, c36687a, this);
        int i14 = (c34396cBuild.f144603x + i13) - c36687a.f157124a;
        if (i13 != i14) {
            m108764g(i14);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iMo74011c = mo74011c();
        C34408o c34408oM108780o = this.f144611y.m108780o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c34408oM108780o == null) {
            c34408oM108780o = C34408o.f144623e;
        }
        this.f144611y = c34408oM108780o;
        return iMo74011c != mo74011c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f144612z = null;
        C34408o c34408oM108779n = this.f144611y.m108779n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c34408oM108779n == null) {
            c34408oM108779n = C34408o.f144623e;
        }
        this.f144611y = c34408oM108779n;
        return this.f144612z;
    }
}
