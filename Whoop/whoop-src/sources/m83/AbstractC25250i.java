package m83;

import d93.InterfaceC11824e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: m83.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25250i extends AbstractMap implements Map, InterfaceC11824e {
    /* JADX INFO: renamed from: a */
    public abstract Set mo74009a();

    /* JADX INFO: renamed from: b */
    public /* bridge */ Set mo74010b() {
        return super.keySet();
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ int mo74011c() {
        return super.size();
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ Collection mo74012d() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo74009a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return mo74010b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo74011c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return mo74012d();
    }
}
