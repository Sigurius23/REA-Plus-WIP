package io.getstream.chat.android.models.querysort;

import c93.InterfaceC4351m;
import j93.InterfaceC21490w;
import java.util.Comparator;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.getstream.chat.android.models.querysort.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19467a implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73973w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73974x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73975y;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C19467a(InterfaceC4351m interfaceC4351m, Comparator comparator) {
        this.f73973w = 2;
        this.f73975y = (AbstractC22680m) interfaceC4351m;
        this.f73974x = comparator;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [c93.m, kotlin.jvm.internal.m] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f73973w) {
            case 0:
                return QuerySortByField.comparator$lambda$0((String) this.f73975y, (SortDirection) this.f73974x, (ComparableFieldProvider) obj, (ComparableFieldProvider) obj2);
            case 1:
                return QuerySortByReflection.comparator$lambda$1$lambda$0((InterfaceC21490w) this.f73975y, (SortDirection) this.f73974x, obj, obj2);
            default:
                ?? r10 = (AbstractC22680m) this.f73975y;
                Comparator comparator = (Comparator) this.f73974x;
                if (((Boolean) r10.invoke(obj, obj2)).booleanValue()) {
                    return comparator.compare(obj, obj2);
                }
                return 0;
        }
    }

    public /* synthetic */ C19467a(Object obj, SortDirection sortDirection, int i13) {
        this.f73973w = i13;
        this.f73975y = obj;
        this.f73974x = sortDirection;
    }
}
