package io.sentry.android.replay;

import io.sentry.C20315e;
import io.sentry.util.network.C20597e;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.android.replay.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20181b extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof C20315e) {
            return super.containsKey((C20315e) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof C20597e) {
            return super.containsValue((C20597e) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof C20315e) {
            return (C20597e) super.get((C20315e) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof C20315e) ? obj2 : (C20597e) super.getOrDefault((C20315e) obj, (C20597e) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof C20315e) {
            return (C20597e) super.remove((C20315e) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof C20315e) && (obj2 instanceof C20597e)) {
            return super.remove((C20315e) obj, (C20597e) obj2);
        }
        return false;
    }
}
