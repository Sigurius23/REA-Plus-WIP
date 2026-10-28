package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.models.ThreadParticipant;
import java.util.Comparator;
import java.util.Date;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadKt$special$$inlined$compareByDescending$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t14, T t15) {
        Date lastThreadMessageAt = ((ThreadParticipant) t15).getLastThreadMessageAt();
        Long lValueOf = lastThreadMessageAt != null ? Long.valueOf(lastThreadMessageAt.getTime()) : Long.MIN_VALUE;
        Date lastThreadMessageAt2 = ((ThreadParticipant) t14).getLastThreadMessageAt();
        return AbstractC30060g.m92127q(lValueOf, lastThreadMessageAt2 != null ? Long.valueOf(lastThreadMessageAt2.getTime()) : Long.MIN_VALUE);
    }
}
