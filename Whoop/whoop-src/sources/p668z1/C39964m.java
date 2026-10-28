package p668z1;

import d93.InterfaceC11820a;
import d93.InterfaceC11823d;
import d93.InterfaceC11825f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p476s1.InterfaceC32055b;
import p476s1.InterfaceC32056c;
import p476s1.InterfaceC32057d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C39964m implements Set, InterfaceC11825f {

    /* JADX INFO: renamed from: w */
    public final C39970s f172471w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f172472x;

    public C39964m(C39970s c39970s, int i13) {
        this.f172472x = i13;
        this.f172471w = c39970s;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m128184a(Collection collection) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        Set setM74103I1 = AbstractC25265s.m74103I1(collection);
        C39970s c39970s = this.f172471w;
        boolean z4 = false;
        do {
            synchronized (AbstractC39971t.f172481a) {
                C39969r c39969r = c39970s.f172477w;
                AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                interfaceC32057d = c39969r2.f172475c;
                i13 = c39969r2.f172476d;
            }
            AbstractC22676k.m65747g(interfaceC32057d);
            InterfaceC32056c interfaceC32056cBuilder = interfaceC32057d.builder();
            Iterator it = c39970s.f172478x.iterator();
            while (((C39976y) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C39976y) it).next();
                if (!setM74103I1.contains(entry.getKey())) {
                    interfaceC32056cBuilder.remove(entry.getKey());
                    z4 = true;
                }
            }
            InterfaceC32057d interfaceC32057dBuild = interfaceC32056cBuilder.build();
            if (AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                break;
            }
            C39969r c39969r3 = c39970s.f172477w;
            AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128193a = C39970s.m128193a(c39970s, (C39969r) AbstractC39963l.m128183w(c39969r3, c39970s, abstractC39957fM128171k), i13, interfaceC32057dBuild);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, c39970s);
        } while (!zM128193a);
        return z4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f172472x) {
            case 0:
                AbstractC39971t.m128195a();
                throw null;
            case 1:
                AbstractC39971t.m128195a();
                throw null;
            default:
                AbstractC39971t.m128195a();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f172472x) {
            case 0:
                AbstractC39971t.m128195a();
                throw null;
            case 1:
                AbstractC39971t.m128195a();
                throw null;
            default:
                AbstractC39971t.m128195a();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f172471w.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f172472x) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC11820a) && !(obj instanceof InterfaceC11823d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC22676k.m65745e(this.f172471w.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f172471w.containsKey(obj);
            default:
                return this.f172471w.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f172472x) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection3.iterator();
                while (it3.hasNext()) {
                    if (!this.f172471w.containsKey(it3.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it4 = collection4.iterator();
                while (it4.hasNext()) {
                    if (!this.f172471w.containsValue(it4.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f172471w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f172472x) {
            case 0:
                C39970s c39970s = this.f172471w;
                return new C39976y(c39970s, ((InterfaceC32055b) c39970s.m128194b().f172475c.entrySet()).iterator(), 0);
            case 1:
                C39970s c39970s2 = this.f172471w;
                return new C39976y(c39970s2, ((InterfaceC32055b) c39970s2.m128194b().f172475c.entrySet()).iterator(), 1);
            default:
                C39970s c39970s3 = this.f172471w;
                return new C39976y(c39970s3, ((InterfaceC32055b) c39970s3.m128194b().f172475c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[ORIG_RETURN, RETURN] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 java.lang.Object, still in use, count: 2, list:
          (r2v8 java.lang.Object) from 0x002c: PHI (r2 I:??) = (r2v3 java.lang.Object), (r2v8 java.lang.Object) binds: [B:10:0x002b, B:32:0x002c] A[DONT_GENERATE, DONT_INLINE]
          (r2v8 java.lang.Object) from 0x001e: CHECK_CAST (java.util.Map$Entry) (r2v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f172472x
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3b;
                default: goto L5;
            }
        L5:
            z1.s r0 = r4.f172471w
            z1.m r1 = r0.f172478x
            java.util.Iterator r1 = r1.iterator()
        Ld:
            r2 = r1
            z1.y r2 = (p668z1.C39976y) r2
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L2b
            r2 = r1
            z1.y r2 = (p668z1.C39976y) r2
            java.lang.Object r2 = r2.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r3, r5)
            if (r3 == 0) goto Ld
            goto L2c
        L2b:
            r2 = 0
        L2c:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L39
            java.lang.Object r5 = r2.getKey()
            r0.remove(r5)
            r5 = 1
            goto L3a
        L39:
            r5 = 0
        L3a:
            return r5
        L3b:
            z1.s r0 = r4.f172471w
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            return r5
        L47:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L63
            boolean r0 = r5 instanceof d93.InterfaceC11820a
            if (r0 == 0) goto L54
            boolean r0 = r5 instanceof d93.InterfaceC11823d
            if (r0 == 0) goto L63
        L54:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            z1.s r0 = r4.f172471w
            java.lang.Object r5 = r5.getKey()
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L63
            r1 = 1
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p668z1.C39964m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        switch (this.f172472x) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (this.f172471w.remove(((Map.Entry) it.next()).getKey()) != null || z4) {
                            z4 = true;
                        }
                    }
                    return z4;
                }
            case 1:
                Iterator it3 = collection.iterator();
                while (true) {
                    boolean z13 = false;
                    while (it3.hasNext()) {
                        if (this.f172471w.remove(it3.next()) != null || z13) {
                            z13 = true;
                        }
                    }
                    return z13;
                }
            default:
                Set setM74103I1 = AbstractC25265s.m74103I1(collection);
                C39970s c39970s = this.f172471w;
                boolean z14 = false;
                do {
                    synchronized (AbstractC39971t.f172481a) {
                        C39969r c39969r = c39970s.f172477w;
                        AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                        interfaceC32057d = c39969r2.f172475c;
                        i13 = c39969r2.f172476d;
                    }
                    AbstractC22676k.m65747g(interfaceC32057d);
                    InterfaceC32056c interfaceC32056cBuilder = interfaceC32057d.builder();
                    Iterator it4 = c39970s.f172478x.iterator();
                    while (((C39976y) it4).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C39976y) it4).next();
                        if (setM74103I1.contains(entry.getValue())) {
                            interfaceC32056cBuilder.remove(entry.getKey());
                            z14 = true;
                        }
                    }
                    InterfaceC32057d interfaceC32057dBuild = interfaceC32056cBuilder.build();
                    if (!AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                        C39969r c39969r3 = c39970s.f172477w;
                        AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC39963l.f172462c) {
                            abstractC39957fM128171k = AbstractC39963l.m128171k();
                            zM128193a = C39970s.m128193a(c39970s, (C39969r) AbstractC39963l.m128183w(c39969r3, c39970s, abstractC39957fM128171k), i13, interfaceC32057dBuild);
                        }
                        AbstractC39963l.m128174n(abstractC39957fM128171k, c39970s);
                    }
                    return z14;
                } while (!zM128193a);
                return z14;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC32057d interfaceC32057d;
        int i13;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128193a;
        InterfaceC32057d interfaceC32057d2;
        int i14;
        AbstractC39957f abstractC39957fM128171k2;
        boolean zM128193a2;
        switch (this.f172472x) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection2, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C39970s c39970s = this.f172471w;
                boolean z4 = false;
                do {
                    synchronized (AbstractC39971t.f172481a) {
                        C39969r c39969r = c39970s.f172477w;
                        AbstractC22676k.m65748h(c39969r, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C39969r c39969r2 = (C39969r) AbstractC39963l.m128169i(c39969r);
                        interfaceC32057d = c39969r2.f172475c;
                        i13 = c39969r2.f172476d;
                    }
                    AbstractC22676k.m65747g(interfaceC32057d);
                    InterfaceC32056c interfaceC32056cBuilder = interfaceC32057d.builder();
                    Iterator it = c39970s.f172478x.iterator();
                    while (((C39976y) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C39976y) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC22676k.m65745e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            interfaceC32056cBuilder.remove(entry2.getKey());
                            z4 = true;
                        }
                    }
                    InterfaceC32057d interfaceC32057dBuild = interfaceC32056cBuilder.build();
                    if (!AbstractC22676k.m65745e(interfaceC32057dBuild, interfaceC32057d)) {
                        C39969r c39969r3 = c39970s.f172477w;
                        AbstractC22676k.m65748h(c39969r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC39963l.f172462c) {
                            abstractC39957fM128171k = AbstractC39963l.m128171k();
                            zM128193a = C39970s.m128193a(c39970s, (C39969r) AbstractC39963l.m128183w(c39969r3, c39970s, abstractC39957fM128171k), i13, interfaceC32057dBuild);
                        }
                        AbstractC39963l.m128174n(abstractC39957fM128171k, c39970s);
                    }
                    return z4;
                } while (!zM128193a);
                return z4;
            case 1:
                return m128184a(collection);
            default:
                Set setM74103I1 = AbstractC25265s.m74103I1(collection);
                C39970s c39970s2 = this.f172471w;
                boolean z13 = false;
                do {
                    synchronized (AbstractC39971t.f172481a) {
                        C39969r c39969r4 = c39970s2.f172477w;
                        AbstractC22676k.m65748h(c39969r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C39969r c39969r5 = (C39969r) AbstractC39963l.m128169i(c39969r4);
                        interfaceC32057d2 = c39969r5.f172475c;
                        i14 = c39969r5.f172476d;
                    }
                    AbstractC22676k.m65747g(interfaceC32057d2);
                    InterfaceC32056c interfaceC32056cBuilder2 = interfaceC32057d2.builder();
                    Iterator it3 = c39970s2.f172478x.iterator();
                    while (((C39976y) it3).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C39976y) it3).next();
                        if (!setM74103I1.contains(entry3.getValue())) {
                            interfaceC32056cBuilder2.remove(entry3.getKey());
                            z13 = true;
                        }
                    }
                    InterfaceC32057d interfaceC32057dBuild2 = interfaceC32056cBuilder2.build();
                    if (!AbstractC22676k.m65745e(interfaceC32057dBuild2, interfaceC32057d2)) {
                        C39969r c39969r6 = c39970s2.f172477w;
                        AbstractC22676k.m65748h(c39969r6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC39963l.f172462c) {
                            abstractC39957fM128171k2 = AbstractC39963l.m128171k();
                            zM128193a2 = C39970s.m128193a(c39970s2, (C39969r) AbstractC39963l.m128183w(c39969r6, c39970s2, abstractC39957fM128171k2), i14, interfaceC32057dBuild2);
                        }
                        AbstractC39963l.m128174n(abstractC39957fM128171k2, c39970s2);
                    }
                    return z13;
                } while (!zM128193a2);
                return z13;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f172471w.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }
}
