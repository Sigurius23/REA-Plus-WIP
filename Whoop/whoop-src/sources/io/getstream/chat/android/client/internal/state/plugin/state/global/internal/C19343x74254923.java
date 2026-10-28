package io.getstream.chat.android.client.internal.state.plugin.state.global.internal;

import io.getstream.chat.android.models.Location;
import java.util.Comparator;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState$addLiveLocations$lambda$14$$inlined$sortedBy$1 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19343x74254923<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t14, T t15) {
        return AbstractC30060g.m92127q(((Location) t14).getMessageId(), ((Location) t15).getMessageId());
    }
}
