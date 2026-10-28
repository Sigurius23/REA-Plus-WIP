package p668z1;

import d93.InterfaceC11824e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p476s1.InterfaceC32056c;
import p476s1.InterfaceC32057d;
import p511u1.C34396c;
import p511u1.C34398e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C39970s implements InterfaceC39977z, Map, InterfaceC11824e {

    /* JADX INFO: renamed from: w */
    public C39969r f172477w;

    /* JADX INFO: renamed from: x */
    public final C39964m f172478x;

    /* JADX INFO: renamed from: y */
    public final C39964m f172479y;

    /* JADX INFO: renamed from: z */
    public final C39964m f172480z;

    public C39970s() {
        C34396c c34396c = C34396c.f144601y;
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        C39969r c39969r = new C39969r(abstractC39957fM128171k.mo128147g(), c34396c);
        if (!(abstractC39957fM128171k instanceof C39947a)) {
            c39969r.f172420b = new C39969r(1, c34396c);
        }
        this.f172477w = c39969r;
        this.f172478x = new C39964m(this, 0);
        this.f172479y = new C39964m(this, 1);
        this.f172480z = new C39964m(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m128193a(C39970s c39970s, C39969r c39969r, int i13, InterfaceC32057d interfaceC32057d) {
        boolean z4;
        synchronized (AbstractC39971t.f172481a) {
            int i14 = c39969r.f172476d;
            if (i14 == i13) {
                c39969r.f172475c = interfaceC32057d;
                z4 = true;
                c39969r.f172476d = i14 + 1;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f172477w;
    }

    /* JADX INFO: renamed from: b */
    public final C39969r m128194b() {
        C39969r c39969r = this.f172477w;
        AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C39969r) AbstractC39963l.m128180t(c39969r, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC39957f abstractC39957fM128171k;
        C39969r c39969r = this.f172477w;
        AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
        C34396c c34396c = C34396c.f144601y;
        if (c34396c != c39969r2.f172475c) {
            C39969r c39969r3 = this.f172477w;
            AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                C39969r c39969r4 = (C39969r) AbstractC39963l.m128183w(c39969r3, this, abstractC39957fM128171k);
                synchronized (AbstractC39971t.f172481a) {
                    c39969r4.f172475c = c34396c;
                    c39969r4.f172476d++;
                }
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m128194b().f172475c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m128194b().f172475c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f172478x;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m128194b().f172475c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m128194b().f172475c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f172479y;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f172477w = (C39969r) abstractC39950b0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        Object objPut;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        do {
            synchronized (AbstractC39971t.f172481a) {
                C39969r c39969r = this.f172477w;
                AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                interfaceC32057d = c39969r2.f172475c;
                i13 = c39969r2.f172476d;
            }
            AbstractC22676k.m65747g(interfaceC32057d);
            C34398e c34398e = (C34398e) interfaceC32057d.builder();
            objPut = c34398e.put(obj, obj2);
            InterfaceC32057d interfaceC32057dBuild = c34398e.build();
            if (AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                break;
            }
            C39969r c39969r3 = this.f172477w;
            AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128193a = m128193a(this, (C39969r) AbstractC39963l.m128183w(c39969r3, this, abstractC39957fM128171k), i13, interfaceC32057dBuild);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128193a);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        do {
            synchronized (AbstractC39971t.f172481a) {
                C39969r c39969r = this.f172477w;
                AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                interfaceC32057d = c39969r2.f172475c;
                i13 = c39969r2.f172476d;
            }
            AbstractC22676k.m65747g(interfaceC32057d);
            C34398e c34398e = (C34398e) interfaceC32057d.builder();
            c34398e.putAll(map);
            InterfaceC32057d interfaceC32057dBuild = c34398e.build();
            if (AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                return;
            }
            C39969r c39969r3 = this.f172477w;
            AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128193a = m128193a(this, (C39969r) AbstractC39963l.m128183w(c39969r3, this, abstractC39957fM128171k), i13, interfaceC32057dBuild);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128193a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        Object objRemove;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        do {
            synchronized (AbstractC39971t.f172481a) {
                C39969r c39969r = this.f172477w;
                AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                interfaceC32057d = c39969r2.f172475c;
                i13 = c39969r2.f172476d;
            }
            AbstractC22676k.m65747g(interfaceC32057d);
            InterfaceC32056c interfaceC32056cBuilder = interfaceC32057d.builder();
            objRemove = interfaceC32056cBuilder.remove(obj);
            InterfaceC32057d interfaceC32057dBuild = interfaceC32056cBuilder.build();
            if (AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                break;
            }
            C39969r c39969r3 = this.f172477w;
            AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128193a = m128193a(this, (C39969r) AbstractC39963l.m128183w(c39969r3, this, abstractC39957fM128171k), i13, interfaceC32057dBuild);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128193a);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return m128194b().f172475c.size();
    }

    public final String toString() {
        C39969r c39969r = this.f172477w;
        AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C39969r) AbstractC39963l.m128169i(c39969r)).f172475c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f172480z;
    }
}
