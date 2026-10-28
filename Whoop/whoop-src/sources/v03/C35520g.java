package v03;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: v03.g */
/* JADX INFO: loaded from: classes11.dex */
public final class C35520g extends AbstractC35514a {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f151139x = 0;

    static {
        C35518e.m112679a(Collections.EMPTY_MAP);
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        Map map = this.f151131w;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((InterfaceC35521h) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
