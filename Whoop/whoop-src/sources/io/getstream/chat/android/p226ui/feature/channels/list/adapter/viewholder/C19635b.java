package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.ChannelListFragment;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19635b implements ChannelListView.ChannelClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74484b;

    public /* synthetic */ C19635b(Object obj, int i13) {
        this.f74483a = i13;
        this.f74484b = obj;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelClickListener
    public final void onClick(Channel channel) {
        switch (this.f74483a) {
            case 0:
                ChannelListListenerContainerImpl.deleteClickListener_delegate$lambda$5$lambda$4((InterfaceC4339a) this.f74484b, channel);
                break;
            case 1:
                ChannelListListenerContainerImpl.channelClickListener_delegate$lambda$1$lambda$0((InterfaceC4339a) this.f74484b, channel);
                break;
            case 2:
                ChannelListListenerContainerImpl.moreOptionsClickListener_delegate$lambda$7$lambda$6((InterfaceC4339a) this.f74484b, channel);
                break;
            default:
                ChannelListFragment.setupChannelList$lambda$11$lambda$10((ChannelListFragment) this.f74484b, channel);
                break;
        }
    }
}
