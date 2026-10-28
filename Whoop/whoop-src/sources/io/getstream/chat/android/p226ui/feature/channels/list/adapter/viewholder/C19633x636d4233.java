package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainerImpl$Companion$moreOptionsDefault$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19633x636d4233 implements ChannelListView.ChannelOptionVisibilityPredicate {
    public static final C19633x636d4233 INSTANCE = new C19633x636d4233();

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
