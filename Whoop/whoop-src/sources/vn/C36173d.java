package vn;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: vn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36173d extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
