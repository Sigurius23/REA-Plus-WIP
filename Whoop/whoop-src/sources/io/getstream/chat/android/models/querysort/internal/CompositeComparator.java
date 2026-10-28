package io.getstream.chat.android.models.querysort.internal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B%\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fR$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/models/querysort/internal/CompositeComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparators", "", "<init>", "(Ljava/util/List;)V", "compare", "", "o1", "o2", "(Ljava/lang/Object;Ljava/lang/Object;)I", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CompositeComparator<T> implements Comparator<T> {
    private final List<Comparator<T>> comparators;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeComparator(List<? extends Comparator<T>> comparators) {
        AbstractC22676k.m65750j(comparators, "comparators");
        this.comparators = comparators;
    }

    @Override // java.util.Comparator
    public int compare(T o5, T o13) {
        Iterator<T> it = this.comparators.iterator();
        int iCompare = 0;
        while (it.hasNext()) {
            Comparator comparator = (Comparator) it.next();
            if (iCompare == 0) {
                iCompare = comparator.compare(o5, o13);
            }
        }
        return iCompare;
    }
}
