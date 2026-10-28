package io.getstream.chat.android.p226ui.common.utils;

import d93.InterfaceC11820a;
import ih0.AbstractC18489d0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\u0016\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0005H\u0096\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020\u0007H\u0096\u0001J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0096\u0003J\u0016\u0010&\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\"J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0001J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001e\u001a\u00020\u0005H\u0096\u0001J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0096\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010.\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010\u000f¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/ExpandableList;", "T", "", "items", "minimumVisibleItems", "", "isCollapsed", "", "<init>", "(Ljava/util/List;IZ)V", "()Z", "canExpand", "getCanExpand", "collapsedCount", "getCollapsedCount", "()I", "component1", "component2", "component3", "copy", "contains", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "size", "getSize", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ExpandableList<T> implements List<T>, InterfaceC11820a {
    public static final int $stable = 8;
    private final /* synthetic */ List<T> $$delegate_0;
    private final boolean canExpand;
    private final int collapsedCount;
    private final boolean isCollapsed;
    private final List<T> items;
    private final int minimumVisibleItems;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableList(List<? extends T> items, int i13, boolean z4) {
        AbstractC22676k.m65750j(items, "items");
        this.$$delegate_0 = ExpandableListKt.visibleItems(items, i13, z4);
        this.items = items;
        this.minimumVisibleItems = i13;
        this.isCollapsed = z4;
        boolean zCanExpand = ExpandableListKt.canExpand(items, i13);
        this.canExpand = zCanExpand;
        this.collapsedCount = (z4 && zCanExpand) ? items.size() - i13 : 0;
    }

    private final List<T> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final int getMinimumVisibleItems() {
        return this.minimumVisibleItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableList copy$default(ExpandableList expandableList, List list, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = expandableList.items;
        }
        if ((i14 & 2) != 0) {
            i13 = expandableList.minimumVisibleItems;
        }
        if ((i14 & 4) != 0) {
            z4 = expandableList.isCollapsed;
        }
        return expandableList.copy(list, i13, z4);
    }

    @Override // java.util.List
    public final void add(int i13, T t14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(T t14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(T t14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object element) {
        return this.$$delegate_0.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.$$delegate_0.containsAll(elements);
    }

    public final ExpandableList<T> copy(List<? extends T> items, int minimumVisibleItems, boolean isCollapsed) {
        AbstractC22676k.m65750j(items, "items");
        return new ExpandableList<>(items, minimumVisibleItems, isCollapsed);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableList)) {
            return false;
        }
        ExpandableList expandableList = (ExpandableList) other;
        return AbstractC22676k.m65745e(this.items, expandableList.items) && this.minimumVisibleItems == expandableList.minimumVisibleItems && this.isCollapsed == expandableList.isCollapsed;
    }

    @Override // java.util.List
    public final T get(int index) {
        return this.$$delegate_0.get(index);
    }

    public final boolean getCanExpand() {
        return this.canExpand;
    }

    public final int getCollapsedCount() {
        return this.collapsedCount;
    }

    public final int getSize() {
        return this.$$delegate_0.size();
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return Boolean.hashCode(this.isCollapsed) + AbstractC11266d.m30448b(this.minimumVisibleItems, this.items.hashCode() * 31, 31);
    }

    @Override // java.util.List
    public final int indexOf(Object element) {
        return this.$$delegate_0.indexOf(element);
    }

    public final boolean isCollapsed() {
        return this.isCollapsed;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.$$delegate_0.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object element) {
        return this.$$delegate_0.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    public final T remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i13, T t14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.$$delegate_0.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<T> subList(int fromIndex, int toIndex) {
        return this.$$delegate_0.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        List<T> list = this.items;
        int i13 = this.minimumVisibleItems;
        boolean z4 = this.isCollapsed;
        StringBuilder sb4 = new StringBuilder("ExpandableList(items=");
        sb4.append(list);
        sb4.append(", minimumVisibleItems=");
        sb4.append(i13);
        sb4.append(", isCollapsed=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int index) {
        return this.$$delegate_0.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        AbstractC22676k.m65750j(array, "array");
        return (T[]) AbstractC22676k.m65759s(this, array);
    }

    public /* synthetic */ ExpandableList(List list, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i14 & 2) != 0 ? list.size() : i13, (i14 & 4) != 0 ? true : z4);
    }
}
