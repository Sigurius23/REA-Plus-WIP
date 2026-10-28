package p138f6;

import ad3.C0783z;
import f41.C14068f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14129a extends AbstractC14134f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f50833a;

    /* JADX INFO: renamed from: b */
    public final C0783z f50834b;

    public C14129a(LinkedHashMap linkedHashMap, boolean z4) {
        this.f50833a = linkedHashMap;
        this.f50834b = new C0783z(z4);
    }

    @Override // p138f6.AbstractC14134f
    /* JADX INFO: renamed from: a */
    public final Map mo40226a() {
        C23465k c23465k;
        Set<Map.Entry> setEntrySet = this.f50833a.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                c23465k = new C23465k(key, bArrCopyOf);
            } else {
                c23465k = new C23465k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c23465k.f92937w, c23465k.f92938x);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    @Override // p138f6.AbstractC14134f
    /* JADX INFO: renamed from: b */
    public final Object mo40227b(C14132d key) {
        AbstractC22676k.m65750j(key, "key");
        Object obj = this.f50833a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: e */
    public final void m40228e() {
        if (((AtomicBoolean) this.f50834b.f2818x).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zM65745e;
        if (obj instanceof C14129a) {
            LinkedHashMap linkedHashMap = ((C14129a) obj).f50833a;
            LinkedHashMap linkedHashMap2 = this.f50833a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zM65745e = AbstractC22676k.m65745e(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zM65745e = true;
                                } else {
                                    zM65745e = false;
                                }
                            } else {
                                zM65745e = false;
                            }
                            if (!zM65745e) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m40229f(C14132d key) {
        AbstractC22676k.m65750j(key, "key");
        m40228e();
        this.f50833a.remove(key);
    }

    /* JADX INFO: renamed from: g */
    public final void m40230g(C14132d key, Object obj) {
        AbstractC22676k.m65750j(key, "key");
        m40231h(key, obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m40231h(C14132d key, Object obj) {
        AbstractC22676k.m65750j(key, "key");
        m40228e();
        if (obj == null) {
            m40229f(key);
            return;
        }
        boolean z4 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f50833a;
        if (z4) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC25265s.m74103I1((Set) obj));
            AbstractC22676k.m65749i(setUnmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f50833a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return AbstractC25265s.m74110N0(this.f50833a.entrySet(), ",\n", "{\n", "\n}", new C14068f(3), 24);
    }

    public /* synthetic */ C14129a(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
