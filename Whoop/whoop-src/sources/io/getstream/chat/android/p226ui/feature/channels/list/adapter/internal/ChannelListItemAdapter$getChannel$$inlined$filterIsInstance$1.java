package io.getstream.chat.android.p226ui.feature.channels.list.adapter.internal;

import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1 implements Function1 {
    public static final ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1 INSTANCE = new ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1();

    @Override // p715kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof ChannelListItem.ChannelItem);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof ChannelListItem.ChannelItem);
    }
}
