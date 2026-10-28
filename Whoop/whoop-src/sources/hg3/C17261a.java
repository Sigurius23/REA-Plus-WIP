package hg3;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: hg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17261a extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
