package io.getstream.chat.android.client.internal.state.utils.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import p002a0.C0008b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aQ\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00028\u00002\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\r2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\r2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ac\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m65681d2 = {"T", "", "Lkotlin/Function1;", "", "filter", "update", "updateIf", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "element", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "insertSorted", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "ID", "idSelector", "upsertSorted", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "maxSize", "upsertSortedBounded", "(Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "other", "", "mergeSorted", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;)Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ListKt {
    public static final <T> List<T> insertSorted(List<T> list, T t14, Comparator<? super T> comparator) {
        int i13;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(comparator, "comparator");
        int size = list.size();
        AbstractC37056f.m118971Z(list.size(), size);
        int i14 = size - 1;
        int i15 = 0;
        while (true) {
            if (i15 > i14) {
                i13 = -(i15 + 1);
                break;
            }
            i13 = (i15 + i14) >>> 1;
            int iCompare = comparator.compare(list.get(i13), t14);
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i14 = i13 - 1;
            } else {
                i15 = i13 + 1;
            }
        }
        list.add(i13 >= 0 ? i13 + 1 : -(i13 + 1), t14);
        return AbstractC25265s.m74093D1(list);
    }

    public static final <T> List<T> mergeSorted(List<? extends T> list, List<? extends T> other, Function1 idSelector, Comparator<? super T> comparator) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(other, "other");
        AbstractC22676k.m65750j(idSelector, "idSelector");
        AbstractC22676k.m65750j(comparator, "comparator");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = other.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(idSelector.invoke(it.next()));
        }
        ArrayList arrayList = new ArrayList();
        for (T t14 : list) {
            if (!linkedHashSet.contains(idSelector.invoke(t14))) {
                arrayList.add(t14);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (i13 < arrayList.size() && i14 < other.size()) {
            C0008b0 c0008b0 = (Object) arrayList.get(i13);
            T t15 = other.get(i14);
            if (comparator.compare(c0008b0, t15) <= 0) {
                arrayList2.add(c0008b0);
                i13++;
            } else {
                arrayList2.add(t15);
                i14++;
            }
        }
        while (i13 < arrayList.size()) {
            arrayList2.add(arrayList.get(i13));
            i13++;
        }
        while (i14 < other.size()) {
            arrayList2.add(other.get(i14));
            i14++;
        }
        return AbstractC25265s.m74093D1(arrayList2);
    }

    private static final <T> List<T> toImmutableList(List<T> list) {
        return AbstractC25265s.m74093D1(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> updateIf(List<? extends T> list, Function1 filter, Function1 update) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(update, "update");
        List<? extends T> list2 = list;
        int size = list2.size();
        ArrayList arrayListM74097F1 = null;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) filter.invoke(obj)).booleanValue()) {
                if (arrayListM74097F1 == null) {
                    arrayListM74097F1 = AbstractC25265s.m74097F1(list2);
                }
                arrayListM74097F1.set(i13, update.invoke(obj));
            }
        }
        return arrayListM74097F1 == null ? list : arrayListM74097F1;
    }

    public static final <T, ID> List<T> upsertSorted(List<? extends T> list, T t14, Function1 idSelector, Comparator<? super T> comparator, Function1 update) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(idSelector, "idSelector");
        AbstractC22676k.m65750j(comparator, "comparator");
        AbstractC22676k.m65750j(update, "update");
        Object objInvoke = idSelector.invoke(t14);
        Iterator<? extends T> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(idSelector.invoke(it.next()), objInvoke)) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            return insertSorted(AbstractC25265s.m74097F1(list), t14, comparator);
        }
        Object objInvoke2 = update.invoke(list.get(i13));
        if (comparator.compare(list.get(i13), objInvoke2) == 0) {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
            arrayListM74097F1.set(i13, objInvoke2);
            return arrayListM74097F1;
        }
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(list);
        arrayListM74097F2.remove(i13);
        return insertSorted(arrayListM74097F2, objInvoke2, comparator);
    }

    public static /* synthetic */ List upsertSorted$default(List list, Object obj, Function1 function1, Comparator comparator, Function1 function2, int i13, Object obj2) {
        if ((i13 & 8) != 0) {
            function2 = new C19381d(obj, 0);
        }
        return upsertSorted(list, obj, function1, comparator, function2);
    }

    private static final Object upsertSorted$lambda$0(Object obj, Object obj2) {
        return obj;
    }

    public static final <T, ID> List<T> upsertSortedBounded(List<? extends T> list, T t14, int i13, Function1 idSelector, Comparator<? super T> comparator, Function1 update) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(idSelector, "idSelector");
        AbstractC22676k.m65750j(comparator, "comparator");
        AbstractC22676k.m65750j(update, "update");
        List<T> listUpsertSorted = upsertSorted(list, t14, idSelector, comparator, update);
        return listUpsertSorted.size() > i13 ? AbstractC25265s.m74158x1(i13, listUpsertSorted) : listUpsertSorted;
    }

    public static /* synthetic */ List upsertSortedBounded$default(List list, Object obj, int i13, Function1 function1, Comparator comparator, Function1 function2, int i14, Object obj2) {
        if ((i14 & 16) != 0) {
            function2 = new C19381d(obj, 0);
        }
        return upsertSortedBounded(list, obj, i13, function1, comparator, function2);
    }

    private static final Object upsertSortedBounded$lambda$4(Object obj, Object obj2) {
        return obj;
    }
}
