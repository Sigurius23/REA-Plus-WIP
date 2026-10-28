package p690zr;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: zr.i */
/* JADX INFO: loaded from: classes6.dex */
public class C41028i extends C41013d implements SortedMap {

    /* JADX INFO: renamed from: E */
    public SortedSet f177002E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C41052s0 f177003F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41028i(C41052s0 c41052s0, SortedMap sortedMap) {
        super(c41052s0, sortedMap);
        this.f177003F = c41052s0;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo133242b() {
        return new C41031j(this.f177003F, mo133244d());
    }

    @Override // p690zr.C41013d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f177002E;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo133242b = mo133242b();
        this.f177002E = sortedSetMo133242b;
        return sortedSetMo133242b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo133244d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo133244d() {
        return (SortedMap) this.f176981y;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo133244d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C41028i(this.f177003F, mo133244d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo133244d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C41028i(this.f177003F, mo133244d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C41028i(this.f177003F, mo133244d().tailMap(obj));
    }
}
