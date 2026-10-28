package io.getstream.chat.android.models.querysort.internal;

import io.getstream.chat.android.models.querysort.SortDirection;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m65681d2 = {"compare", "", "first", "", "", "second", "sortDirection", "Lio/getstream/chat/android/models/querysort/SortDirection;", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ComparationsKt {
    public static final int compare(Comparable<Object> comparable, Comparable<Object> comparable2, SortDirection sortDirection) {
        AbstractC22676k.m65750j(sortDirection, "sortDirection");
        if (comparable == null && comparable2 == null) {
            return 0;
        }
        if (comparable == null && comparable2 != null) {
            return sortDirection.getValue() * (-1);
        }
        if (comparable != null && comparable2 == null) {
            return sortDirection.getValue();
        }
        if (comparable == null || comparable2 == null) {
            throw new IllegalStateException("Impossible case!");
        }
        return sortDirection.getValue() * comparable.compareTo(comparable2);
    }
}
