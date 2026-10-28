package io.getstream.chat.android.p226ui.feature.channels.list;

import io.getstream.chat.android.models.Channel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.ChannelListView$ChannelOptionVisibilityPredicate$Companion$DEFAULT$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19628xd6a51b7d implements ChannelListView.ChannelOptionVisibilityPredicate {
    public static final C19628xd6a51b7d INSTANCE = new C19628xd6a51b7d();

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionVisibilityPredicate, p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Channel) obj);
        return Boolean.TRUE;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionVisibilityPredicate
    public final Boolean invoke(Channel it) {
        AbstractC22676k.m65750j(it, "it");
        return Boolean.TRUE;
    }
}
