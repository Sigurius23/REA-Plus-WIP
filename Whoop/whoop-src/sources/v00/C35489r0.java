package v00;

import java.util.Comparator;
import java.util.LinkedHashMap;
import p318m3.C24977g;

/* JADX INFO: renamed from: v00.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35489r0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C24977g f151069w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LinkedHashMap f151070x;

    public C35489r0(C24977g c24977g, LinkedHashMap linkedHashMap) {
        this.f151069w = c24977g;
        this.f151070x = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f151070x;
        return this.f151069w.compare((Integer) linkedHashMap.get((EnumC35491s0) obj), (Integer) linkedHashMap.get((EnumC35491s0) obj2));
    }
}
