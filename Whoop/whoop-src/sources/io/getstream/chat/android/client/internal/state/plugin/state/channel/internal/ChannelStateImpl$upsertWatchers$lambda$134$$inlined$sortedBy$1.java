package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import io.getstream.chat.android.models.User;
import java.util.Comparator;
import p715kotlin.Metadata;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelStateImpl$upsertWatchers$lambda$134$$inlined$sortedBy$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t14, T t15) {
        return AbstractC30060g.m92127q(((User) t14).getCreatedAt(), ((User) t15).getCreatedAt());
    }
}
