package p690zr;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: zr.j */
/* JADX INFO: loaded from: classes6.dex */
public class C41031j extends C41016e implements SortedSet {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41052s0 f177005y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41031j(C41052s0 c41052s0, SortedMap sortedMap) {
        super(c41052s0, sortedMap);
        this.f177005y = c41052s0;
    }

    /* JADX INFO: renamed from: a */
    public SortedMap mo133248a() {
        return (SortedMap) this.f176984w;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo133248a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo133248a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C41031j(this.f177005y, mo133248a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo133248a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C41031j(this.f177005y, mo133248a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C41031j(this.f177005y, mo133248a().tailMap(obj));
    }
}
