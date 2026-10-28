package o63;

import androidx.room.C1832u;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;
import z53.C40109a;

/* JADX INFO: renamed from: o63.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C27620k extends LinkedHashMap {

    /* JADX INFO: renamed from: w */
    public final C1832u f111156w;

    /* JADX INFO: renamed from: x */
    public final C40109a f111157x;

    /* JADX INFO: renamed from: y */
    public final int f111158y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27620k(C1832u c1832u, int i13) {
        super(10, 0.75f, true);
        C40109a c40109a = C40109a.f173132y;
        this.f111156w = c1832u;
        this.f111157x = c40109a;
        this.f111158y = i13;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f111158y == 0) {
            return this.f111156w.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.f111156w.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        AbstractC22676k.m65750j(eldest, "eldest");
        boolean z4 = super.size() > this.f111158y;
        if (z4) {
            this.f111157x.invoke(eldest.getValue());
        }
        return z4;
    }
}
