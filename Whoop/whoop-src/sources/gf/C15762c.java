package gf;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15762c implements InterfaceC15771l {

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f59424w;

    public C15762c(InterfaceC15761b seed) {
        AbstractC22676k.m65750j(seed, "seed");
        this.f59424w = new LinkedHashMap();
        AbstractC21598x.m60675c0(this, seed);
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: a */
    public final Set mo33081a() {
        return this.f59424w.keySet();
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: b */
    public final Object mo33082b(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f59424w.get(key);
    }

    @Override // gf.InterfaceC15771l
    /* JADX INFO: renamed from: c */
    public final void mo33083c(C15760a key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f59424w.put(key, value);
    }

    @Override // gf.InterfaceC15761b
    /* JADX INFO: renamed from: d */
    public final boolean mo33084d(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f59424w.containsKey(key);
    }

    /* JADX INFO: renamed from: e */
    public final void m44476e(C15760a key) {
        AbstractC22676k.m65750j(key, "key");
        this.f59424w.remove(key);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC15761b)) {
            return false;
        }
        LinkedHashMap linkedHashMap = this.f59424w;
        InterfaceC15761b interfaceC15761b = (InterfaceC15761b) obj;
        if (linkedHashMap.keySet().size() != interfaceC15761b.mo33081a().size()) {
            return false;
        }
        Set<C15760a> setKeySet = linkedHashMap.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return true;
        }
        for (C15760a c15760a : setKeySet) {
            if (!mo33084d(c15760a) || !AbstractC22676k.m65745e(mo33082b(c15760a), interfaceC15761b.mo33082b(c15760a))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f59424w.hashCode();
    }

    @Override // gf.InterfaceC15761b
    public final boolean isEmpty() {
        return this.f59424w.isEmpty();
    }

    public final String toString() {
        return this.f59424w.toString();
    }

    public C15762c() {
        this(C15768i.f59433w);
    }
}
